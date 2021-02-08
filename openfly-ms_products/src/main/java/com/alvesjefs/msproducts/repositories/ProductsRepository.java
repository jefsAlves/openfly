package com.alvesjefs.msproducts.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alvesjefs.msproducts.domain.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

	List<Products> findByCompany(String name);

}
