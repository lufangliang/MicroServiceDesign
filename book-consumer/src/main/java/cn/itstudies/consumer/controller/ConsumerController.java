package cn.itstudies.consumer.controller;

import cn.itstudies.consumer.service.ConsumerOrderService;
import cn.itstudies.consumer.service.ConsumerProductService;
import cn.itstudies.consumer.service.ConsumerTradeService;
import cn.itstudies.consumer.service.ConsumerUserService;
import cn.itstudies.order.pojo.Orders;
import cn.itstudies.product.pojo.Product;
import cn.itstudies.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:33
 */
@RestController
public class ConsumerController {
    @Autowired
    private ConsumerProductService consumerProductService;
    @Autowired
    private ConsumerUserService consumerUserService;
    @Autowired
    private ConsumerTradeService consumerTradeService;
    @Autowired
    private ConsumerOrderService consumerOrderService;

    @RequestMapping("/create")
    List<Orders> createOrder() {
        Integer userId = login();
        System.out.println("userId = " + userId);
        List<Orders> list = null;
        if (userId != null) {
            list = consumerOrderService.findAll();
            List<Product> products = consumerProductService.findAll();
            for (Product product : products) {
                System.out.println(product);
            }
        }
        return list;
    }

    private Integer login() {
        String username = "admin";
        String password = "admin";
        User user = consumerUserService.userLogin(username, password);
        return user != null?user.getId():null;
    }

}
