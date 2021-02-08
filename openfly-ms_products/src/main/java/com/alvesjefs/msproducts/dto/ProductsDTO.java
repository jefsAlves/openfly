package com.alvesjefs.msproducts.dto;

import java.io.Serializable;
import java.time.Instant;

import com.alvesjefs.msproducts.domain.Products;

public class ProductsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String company;
	private Instant exitDate;
	private Instant arrivalDate;
	private String travelOrigin;
	private String travelDestination;
	private Double price;
	private Integer quantity;

	public ProductsDTO() {
	}

	public ProductsDTO(Long id, String company, Instant exitDate, Instant arrivalDate, String travelOrigin,
			String travelDestination, Double price, Integer quantity) {
		this.id = id;
		this.company = company;
		this.exitDate = exitDate;
		this.arrivalDate = arrivalDate;
		this.travelOrigin = travelOrigin;
		this.travelDestination = travelDestination;
		this.price = price;
		this.quantity = quantity;
	}

	public ProductsDTO(Products products) {
		id = products.getId();
		company = products.getCompany();
		exitDate = products.getExitDate();
		arrivalDate = products.getArrivalDate();
		travelOrigin = products.getTravelOrigin();
		travelDestination = products.getTravelDestination();
		price = products.getPrice();
		quantity = products.getQuantity();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Instant getExitDate() {
		return exitDate;
	}

	public void setExitDate(Instant exitDate) {
		this.exitDate = exitDate;
	}

	public Instant getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Instant arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getTravelOrigin() {
		return travelOrigin;
	}

	public void setTravelOrigin(String travelOrigin) {
		this.travelOrigin = travelOrigin;
	}

	public String getTravelDestination() {
		return travelDestination;
	}

	public void setTravelDestination(String travelDestination) {
		this.travelDestination = travelDestination;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotal() {
		return quantity * price;
	}

}
