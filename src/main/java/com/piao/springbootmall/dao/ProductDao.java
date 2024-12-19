package com.piao.springbootmall.dao;

import com.piao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
