package com.alvesjefs.msproducts.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.msproducts.dto.ProductsDTO;
import com.alvesjefs.msproducts.services.ProductsService;

@RestController
@RequestMapping(value = "/api/products")
public class ProductsResource {

	@Autowired
	private ProductsService productsService;

	@GetMapping(value = "/searchCompany")
	public ResponseEntity<List<ProductsDTO>> findByCompany(@RequestParam String name) {
		List<ProductsDTO> findCompany = productsService.findByCompany(name);
		return ResponseEntity.ok().body(findCompany);
	}

	@GetMapping(value = "/search")
	public ResponseEntity<Page<ProductsDTO>> findByOrder(
		@RequestParam(value = "page", defaultValue = "0") Integer page,
		@RequestParam(value = "linesPerPage", defaultValue = "4") Integer linesPerPage,
		@RequestParam(value = "direction", defaultValue = "DESC") String direction,
		@RequestParam(value = "orderBy", defaultValue = "exitDate") String orderBy) {
		Page<ProductsDTO> findPage = productsService.findPage(page, linesPerPage, direction, orderBy);
		return ResponseEntity.ok().body(findPage);
	}
}
