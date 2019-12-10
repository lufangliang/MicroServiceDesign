package cn.itstudies.trade.controller;

import cn.itstudies.trade.mapper.TradeMapper;
import cn.itstudies.trade.pojo.Trade;
import cn.itstudies.trade.pojo.TradeExample;
import cn.itstudies.trade.service.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:06
 */
@RestController
public class TradeController implements TradeService {
    @Autowired
    private TradeMapper tradeMapper;

    @Override
    public List<Trade> findAll() {
        return tradeMapper.selectByExample(new TradeExample());
    }
}
