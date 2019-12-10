package cn.itstudies.trade.service;

import cn.itstudies.trade.pojo.Trade;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:05
 */
public interface TradeService {
    @PostMapping("/trade/findAll")
    List<Trade> findAll();
}
