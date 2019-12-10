package cn.itstudies.product.controller;

import cn.itstudies.product.mapper.ProductMapper;
import cn.itstudies.product.pojo.Product;
import cn.itstudies.product.pojo.ProductExample;
import cn.itstudies.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Farewell is well
 * @date 2019-12-10 13:21
 */
@RestController
public class ProductController implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll() {
        return productMapper.selectByExample(new ProductExample());
    }
}
