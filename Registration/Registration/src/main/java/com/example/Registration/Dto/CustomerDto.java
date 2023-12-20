package com.example.Registration.Dto;


public class CustomerDto {
	
	private int Customerid;
	private String customername;
	private String address;
	private int mobile;
	public CustomerDto(int customerid, String customername, String address, int mobile) {
		super();
		Customerid = customerid;
		this.customername = customername;
		this.address = address;
		this.mobile = mobile;
	}
	
public CustomerDto(){
	
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

public int getMobile() {
	return mobile;
}

public void setMobile(int mobile) {
	this.mobile = mobile;
}

@Override
public String toString() {
	return "CustomerDto [Customerid=" + Customerid + ", customername=" + customername + ", address=" + address
			+ ", mobile=" + mobile + "]";
}



}
