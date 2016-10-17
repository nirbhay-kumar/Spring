package org.crescent;

import org.crescent.dao.JdbcDaoImpl;
import org.crescent.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		
		try{
			
			dao.insertCircle(new Circle(4,"fourth circle"));
			System.out.println(dao.getAllCircles().size());
			
		}catch(Exception obj){
			System.out.println(obj.getMessage());
		}
		
		
	}

}
