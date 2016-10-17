package com.bmc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import com.mkyong.core.SchedulerBo;
 
@Configuration
public class SchedulerConfig {
 
	@Bean(name="schedular")
	public Schedular suchedulerBo(){
 
		return new Schedular();
 
	}
 
}