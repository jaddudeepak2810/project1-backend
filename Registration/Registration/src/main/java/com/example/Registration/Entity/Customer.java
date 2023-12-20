package com.example.Registration.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	@Column(name="Customer_id",length = 45)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Customerid;
	
	@Column(name="Customer_name",length = 255)
	private String customername;
	
	@Column(name="address",length = 255)
	private String address;
	
	@Column(name="mobile",length = 20)
	private long mobile;

	
	

	public Customer(int customerid, String customername, String address, long mobile) {
		
		Customerid = customerid;
		this.customername = customername;
		this.address = address;
		this.mobile = mobile;
	}

	public int getCustomerid() {
		return Customerid;
	}

	public void setCustomerid(int customerid) {
		Customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}
