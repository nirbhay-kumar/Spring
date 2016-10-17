package com.bmc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Employee {
	private int empNo;
	private String name;
	private String designation;
	
	@Autowired
	private MessageSource messageSource;//to make MessageSource instance available //messageSource
	//it is interface which has diff implementations(ResourceBundleMessageSource...)
	

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		System.out.println("setter of messagesource");
		this.messageSource = messageSource;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setter name");
		this.name = name;
	}
    
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void showMessage()
	{
		System.out.println(this.messageSource.getMessage("greeting", null,"default string",null));
		System.out.println(this.messageSource.getMessage("details", new Object[]{getName(),getDesignation()},"default",null));
		System.out.println(name+designation);
	
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	
	
	
}
