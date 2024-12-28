package com.piao.springbootmall.service.impl;

import com.piao.springbootmall.dao.ProductDao;
import com.piao.springbootmall.dto.ProductRequest;
import com.piao.springbootmall.model.Product;
import com.piao.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }
    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}
