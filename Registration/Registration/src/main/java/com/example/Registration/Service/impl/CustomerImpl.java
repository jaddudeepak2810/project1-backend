package com.example.Registration.Service.impl;
import com.example.Registration.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registration.Dto.CustomerDto;
import com.example.Registration.Repo.CustomerRepo;
import com.example.Registration.Service.CustomerService;



@Service
public class CustomerImpl implements CustomerService{

@Autowired
	private CustomerRepo customerRepo;
public String addCustomer(CustomerDto customerDto){
Customer customer=new Customer(
			customerDto.getCustomerid(),
			customerDto.getCustomername(),
			customerDto.getAddress(),
			customerDto.getMobile());
	customerRepo.save(customer);
	
	return customer.getCustomername();
}
}