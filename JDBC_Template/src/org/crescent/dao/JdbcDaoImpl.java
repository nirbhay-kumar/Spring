package org.crescent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.crescent.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component    // to mark this as spring bean  with id jdbcDaoImpl(j in small letter)
public class JdbcDaoImpl {
	@Autowired                      //2 delete it
	private DataSource dataSource; //with 100 dao classes u can use dataSource
	
	JdbcTemplate jdbcTemplate = new JdbcTemplate();   //is this ideal place to create object of JdbceTemplate
	/*public Circle getCircle(int circleId)
	{
		
		Connection conn=null;
		try{
	//	Class.forName("oracle.jdbc.OracleDriver");
		
	//	conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","password");
			
		conn=dataSource.getConnection();//does not create connection pooling            // 2 will fail as it is not initialized 
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
*/
	public int getCircleCount()
	{
		//String sql="Select count(*) from Circle";  
		jdbcTemplate.setDataSource(getDataSource());    //2 delete it//is this ideal place to set datasource
		return jdbcTemplate.queryForInt("Select count(*) from Circle");
	}
	public DataSource getDataSource() {
		return dataSource;
	}

	//2
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		//2 
		//this.jdbcTemplate=new JdbcTemplate(dataSource);
	}

}
