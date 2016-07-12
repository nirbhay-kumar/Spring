package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.repository.CustomerRepository;
import com.capgemini.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	//CustomerRepository customerRepository=new CustomerRepositoryImpl();
	CustomerRepository customerRepository;
	
	
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}



	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}



	/* (non-Javadoc)
	 * @see com.capgemini.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		return customerRepository.findAll();
	}

}
