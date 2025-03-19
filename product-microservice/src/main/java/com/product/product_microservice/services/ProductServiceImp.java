package com.product.product_microservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.product_microservice.model.Product;
import com.product.product_microservice.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        // Fetch all products
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        // Fetch product by ID
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        // Create a new product
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        // Update existing product
        Product existingProduct = productRepository.findById(id).orElse(null);
        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setStock(product.getStock());
            return productRepository.save(existingProduct);
        }
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        // Delete product by ID
        productRepository.deleteById(id);
    }
}
