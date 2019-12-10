package cn.itstudies.product.service;

import cn.itstudies.product.pojo.Product;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 13:20
 */
public interface ProductService {
    @PostMapping("/product/findAll")
    List<Product> findAll();
}
