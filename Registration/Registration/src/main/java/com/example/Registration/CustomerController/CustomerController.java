package com.example.Registration.CustomerController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.Dto.CustomerDto;
import com.example.Registration.Service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerservice;

@PostMapping("/save")
	public String saveCustomer(@RequestBody CustomerDto customerDto)
	{
		String id=customerservice.addCustomer(customerDto);
	return id;	
}
}
