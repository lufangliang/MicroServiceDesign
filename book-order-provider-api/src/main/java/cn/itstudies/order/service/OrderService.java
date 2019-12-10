package cn.itstudies.order.service;

import cn.itstudies.order.pojo.Orders;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 14:35
 */
public interface OrderService {
    @PostMapping("/order/findAll")
    List<Orders> findAll();
}
