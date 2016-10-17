package org.crescent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.crescent.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component    // to mark this as spring bean  with id jdbcDaoImple(j in small letter)
public class JdbcDaoImpl {
	@Autowired
	private DataSource dataSource; //with 100 dao classes u can use dataSource
	
	public Circle getCircle(int circleId)
	{
		
		Connection conn=null;
		try{
	//	Class.forName("oracle.jdbc.OracleDriver");
		
	//	conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","password");
			
		conn=dataSource.getConnection();//does not create connection pooling
		//datasource class org.apache.commons.dbcp.BasicDataSource"
		
		PreparedStatement ps=conn.prepareStatement("select * from circle where id=?");
		
		ps.setInt(1,circleId);
		
		Circle circle=null;
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			circle=new Circle(circleId,rs.getString("name"));
		}
		
		rs.close();
		ps.close();
		return circle;
		}catch(Exception e)
		{
			
			System.out.println(e.getMessage());
			throw new RuntimeException(e);
		}
		finally
		{
		   try{	
			conn.close();// must be in finally block, if connection not close leakage problem
		   }catch(SQLException obj)
		   {
			   System.out.println("Database error");
		   }
		}
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
