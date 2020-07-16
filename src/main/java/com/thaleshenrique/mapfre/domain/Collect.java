package com.thaleshenrique.mapfre.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Collect implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Address address;
	private Dealer dealer;
	private Product product;
	private String flag;
	private Date dateCollect;
	
	public Collect(Integer id, Address address, Dealer dealer, Product product, String flag, Date dateCollect) {
		super();
		this.id = id;
		this.address = address;
		this.dealer = dealer;
		this.product = product;
		this.flag = flag;
		this.dateCollect = dateCollect;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Date getDateCollect() {
		return dateCollect;
	}

	public void setDateCollect(Date dateCollect) {
		this.dateCollect = dateCollect;
	}
}
