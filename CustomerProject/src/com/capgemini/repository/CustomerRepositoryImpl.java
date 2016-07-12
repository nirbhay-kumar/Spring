package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.capgemini.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll()
	{
		List<Customer> customers=new ArrayList<>();
		
		Customer customer =new Customer();
		
		customer.setFirstName("Sachin");
		customer.setLastName("Goyal");;
		
		customers.add(customer);
		
		return customers;
	}

}
