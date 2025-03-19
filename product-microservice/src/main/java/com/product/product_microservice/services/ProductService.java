package com.product.product_microservice.services;

import java.util.List;

import com.product.product_microservice.model.Product;

public interface ProductService {
    List<Product> getAllProducts(); // Retrieve all products
    Product getProductById(Long id); // Retrieve product by ID
    Product createProduct(Product product); // Add a new product
    Product updateProduct(Long id, Product product); // Update product details
    void deleteProduct(Long id); // Delete a product
}
