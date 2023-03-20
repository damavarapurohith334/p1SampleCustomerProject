package com.example.demo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CustomerDetailsDTO;
import com.example.demo.entity.CustomerDetailsEntityclass;
import com.example.demo.repository.UserRepo;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public CustomerDetailsEntityclass creatCustomer(CustomerDetailsEntityclass customerDetailsEntityclass) {

		customerDetailsEntityclass.setFailCount(0);
		customerDetailsEntityclass.setStatus("active");
		
		return userRepo.save(customerDetailsEntityclass);
		
		
	}

	@Override
	public CustomerDetailsDTO showerUser(int id) {
		CustomerDetailsEntityclass customerDetailsEntityclass = userRepo.findById(id).get();
		CustomerDetailsDTO customerDetailsDTO = new CustomerDetailsDTO();
		BeanUtils.copyProperties(customerDetailsEntityclass,customerDetailsDTO);
		return customerDetailsDTO;
	}

	

}
