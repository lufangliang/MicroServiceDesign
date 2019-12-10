package cn.itstudies.consumer.service;

import cn.itstudies.trade.pojo.Trade;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:43
 */
@FeignClient(value = "book-trade-provider",fallbackFactory = ConsumerTradeServiceFallback.class)
public interface ConsumerTradeService {
    @PostMapping("/trade/findAll")
    List<Trade> findAll();
}
