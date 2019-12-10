package cn.itstudies.consumer.service;

import cn.itstudies.product.pojo.Product;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:47
 */
@Component
public class ConsumerProductServiceFallback implements FallbackFactory<ConsumerProductService> {
    Logger logger = LoggerFactory.getLogger(ConsumerProductServiceFallback.class);
    @Override
    public ConsumerProductService create(Throwable cause) {
        return new ConsumerProductService() {
            @Override
            public List<Product> findAll() {
                logger.warn("Failed to call remote service, service is downgraded",cause);
                return null;
            }
        };
    }
}
