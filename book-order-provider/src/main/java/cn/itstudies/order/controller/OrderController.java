package cn.itstudies.order.controller;

import cn.itstudies.order.mapper.OrdersMapper;
import cn.itstudies.order.pojo.Orders;
import cn.itstudies.order.pojo.OrdersExample;
import cn.itstudies.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 14:37
 */
@RestController
public class OrderController implements OrderService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> findAll() {
        return ordersMapper.selectByExample(new OrdersExample());
    }
}
