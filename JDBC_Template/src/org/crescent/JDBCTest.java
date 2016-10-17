package org.crescent;

import org.crescent.dao.JdbcDaoImpl;
import org.crescent.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl",JdbcDaoImpl.class);
		//Circle circle=new JdbcDaoImpl().getCircle(1);
		try{
		//Circle circle=dao.getCircle(1);
		//System.out.println(circle.getName());
			
			System.out.println(dao.getCircleCount());
			
		}catch(Exception obj){
			System.out.println(obj.getMessage());
		}
	}

}
/*"jdbc:odbc:sqlserver://localhost:3306/myfirstdb";
Connection con = DriverManager.getConnection(url, "root", "1234");
*/