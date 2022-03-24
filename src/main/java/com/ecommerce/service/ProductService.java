package com.ecommerce.service;

import com.ecommerce.exception.UserNotFoundException;
import com.ecommerce.model.Products;
import com.ecommerce.repo.ProductsRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductsRepo productsRepo;

    public ProductService(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }

    public Products addProduct(Products products) {
        return productsRepo.save(products);
    }

    public List<Products> findAllProducts() {
        return productsRepo.findAll();
    }

    public Products updateProduct(Products products) {
        return productsRepo.save(products);
    }

    public Products findProductsById(Long id) {
        return productsRepo.findProductsById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found!"));
    }
    public void deleteProduct(Long id) {
        productsRepo.deleteProductById(id);
    }
}
