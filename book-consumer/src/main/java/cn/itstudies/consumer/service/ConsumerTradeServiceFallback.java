package cn.itstudies.consumer.service;

import cn.itstudies.trade.pojo.Trade;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:48
 */
@Component
public class ConsumerTradeServiceFallback implements FallbackFactory<ConsumerTradeService> {
    Logger logger = LoggerFactory.getLogger(ConsumerTradeServiceFallback.class);
    @Override
    public ConsumerTradeService create(Throwable cause) {
        return new ConsumerTradeService() {
            @Override
            public List<Trade> findAll() {
                logger.warn("Failed to call remote service, service is downgraded",cause);
                return null;
            }
        };
    }
}
