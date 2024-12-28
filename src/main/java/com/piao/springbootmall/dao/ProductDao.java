package com.piao.springbootmall.dao;

import com.piao.springbootmall.dto.ProductRequest;
import com.piao.springbootmall.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
