package com.alvesjefs.msproducts.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alvesjefs.msproducts.domain.Products;
import com.alvesjefs.msproducts.dto.ProductsDTO;
import com.alvesjefs.msproducts.repositories.ProductsRepository;
import com.alvesjefs.msproducts.services.exceptions.CompanyNotFoundException;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	@Transactional(readOnly = true)
	public List<ProductsDTO> findByCompany(String name) {
		List<Products> findCompany = productsRepository.findByCompany(name);
		if (findCompany == null) {
			throw new CompanyNotFoundException("Company not found!");
		}
		return findCompany.stream().map(x -> new ProductsDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Page<ProductsDTO> findPage(Integer page, Integer linesPerPage, String direction, String orderBy) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<Products> findPage = productsRepository.findAll(pageRequest);
		return findPage.map(x -> new ProductsDTO(x));
	}
}
