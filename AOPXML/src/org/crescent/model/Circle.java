package org.crescent.model;
// model or dto class

public class Circle {
	
	private String name;

	public String getName() {
		//System.out.println("From getter");
		
		return name;
	}

	public void setName(String name) {
		System.out.println("From circle setter");
		this.name = name;
		//throw new RuntimeException();//from spring.xml remove property initializaiton of name
	}
	
	public String setNameandReturn(String name) {
		System.out.println("From circle setter");
		this.name = name;
		return name;
	}


}
