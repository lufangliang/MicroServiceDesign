package cn.itstudies.consumer.service;

import cn.itstudies.user.pojo.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:48
 */
@Component
public class ConsumerUserServiceFallback implements FallbackFactory<ConsumerUserService> {
    Logger logger = LoggerFactory.getLogger(ConsumerUserServiceFallback.class);
    @Override
    public ConsumerUserService create(Throwable cause) {
        return new ConsumerUserService() {
            @Override
            public User userLogin(String username, String password) {
                logger.warn("Failed to call remote service, service is downgraded",cause);
                return null;
            }
        };
    }
}
