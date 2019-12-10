package cn.itstudies.consumer.service;

import cn.itstudies.order.pojo.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 16:57
 */
@FeignClient(value = "book-order-provider",fallbackFactory = ConsumerOrderServiceFallback.class)
public interface ConsumerOrderService {
    @PostMapping("/order/findAll")
    List<Orders> findAll();
}
