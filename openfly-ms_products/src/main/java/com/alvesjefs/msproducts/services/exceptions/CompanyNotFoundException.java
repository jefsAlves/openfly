package com.alvesjefs.msproducts.services.exceptions;

import java.io.Serializable;

public class CompanyNotFoundException extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;

	public CompanyNotFoundException() {
	}

	public CompanyNotFoundException(String msg) {
		super(msg);
	}

}
