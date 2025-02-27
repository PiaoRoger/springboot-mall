package com.piao.springbootmall.dao;

import com.piao.springbootmall.dto.ProductQueryParams;
import com.piao.springbootmall.dto.ProductRequest;
import com.piao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {
    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
    void updateStock(Integer productId, Integer stock);
}
