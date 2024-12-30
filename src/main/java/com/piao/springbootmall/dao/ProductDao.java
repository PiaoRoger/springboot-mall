package com.piao.springbootmall.dao;

import com.piao.springbootmall.constant.ProductCategory;
import com.piao.springbootmall.dto.ProductRequest;
import com.piao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
