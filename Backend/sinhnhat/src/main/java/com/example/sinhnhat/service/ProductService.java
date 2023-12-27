package com.example.sinhnhat.service;

import java.util.List;

import com.example.sinhnhat.entity.Product;
import com.example.sinhnhat.model.request.CreateProductRequest;

public interface ProductService {
    
    List<Product> getList();

    List<Product> getListNewst(int number);

    List<Product> getListByPrice();

    List<Product> findRelatedProduct(long id);

    List<Product> getListProductByCategory(long id);

    List<Product> getListByPriceRange(long id,int min, int max);

    List<Product> searchProduct(String keyword);

    Product getProduct(long id);

    Product createProduct(CreateProductRequest request);

    Product updateProduct(long id, CreateProductRequest request);

    void deleteProduct(long id);

}
