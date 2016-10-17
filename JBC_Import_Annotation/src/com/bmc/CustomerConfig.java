package com.bmc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
//import com.mkyong.core.CustomerBo;
 
@Configuration
public class CustomerConfig {
 
	@Bean(name="customer")
	public Customer customerBo(){
 
		return new Customer();
 
	}
}