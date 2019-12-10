package cn.itstudies.consumer.service;

import cn.itstudies.order.pojo.Orders;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 16:58
 */
@Component
public class ConsumerOrderServiceFallback implements FallbackFactory<ConsumerOrderService> {
    Logger logger = LoggerFactory.getLogger(ConsumerOrderServiceFallback.class);
    @Override
    public ConsumerOrderService create(Throwable cause) {
        return new ConsumerOrderService() {
            @Override
            public List<Orders> findAll() {
                logger.warn("Failed to call remote service, service is downgraded",cause);
                return null;
            }
        };
    }
}
