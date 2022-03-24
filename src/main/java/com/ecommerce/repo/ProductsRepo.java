package com.ecommerce.repo;

import com.ecommerce.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductsRepo extends JpaRepository<Products, Long> {

    void deleteProductById(Long id);

    Optional<Products> findProductsById(Long id);
}
