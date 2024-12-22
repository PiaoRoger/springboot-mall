package com.piao.springbootmall.service;

import com.piao.springbootmall.dto.ProductRequest;
import com.piao.springbootmall.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
}
