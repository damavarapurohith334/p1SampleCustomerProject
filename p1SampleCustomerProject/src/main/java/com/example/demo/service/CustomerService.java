package com.example.demo.service;

import com.example.demo.dto.CustomerDetailsDTO;
import com.example.demo.entity.CustomerDetailsEntityclass;

public interface CustomerService {


	CustomerDetailsEntityclass creatCustomer(CustomerDetailsEntityclass customerDetailsEntityclass);

	CustomerDetailsDTO showerUser(int id);

}
