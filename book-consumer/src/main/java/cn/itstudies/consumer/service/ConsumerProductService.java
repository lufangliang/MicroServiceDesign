package cn.itstudies.consumer.service;

import cn.itstudies.product.pojo.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 15:38
 */
@FeignClient(value = "book-product-provider",fallbackFactory = ConsumerProductServiceFallback.class)
public interface ConsumerProductService {
    @PostMapping("/product/findAll")
    List<Product> findAll();
}
