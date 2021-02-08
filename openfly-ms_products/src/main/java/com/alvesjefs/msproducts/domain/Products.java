package com.alvesjefs.msproducts.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUCTS")
public class Products implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String company;
	private String travelOrigin;
	private String travelDestination;
	private Instant exitDate;
	private Instant arrivalDate;
	private Double price;
	private Integer quantity;

	public Products() {
	}

	public Products(Long id, String company, Instant exitDate, Instant arrivalDate, String travelOrigin,
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

	public Double getSubTotal() {
		return quantity * price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Products [id=");
		builder.append(id);
		builder.append(", company=");
		builder.append(company);
		builder.append(", travelOrigin=");
		builder.append(travelOrigin);
		builder.append(", travelDestination=");
		builder.append(travelDestination);
		builder.append(", exitDate=");
		builder.append(exitDate);
		builder.append(", arrivalDate=");
		builder.append(arrivalDate);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
