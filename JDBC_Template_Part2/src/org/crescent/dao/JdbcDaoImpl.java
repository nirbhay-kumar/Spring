package org.crescent.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.crescent.model.Circle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component    // to mark this as spring bean  with id jdbcDaoImpl(j in small letter)
public class JdbcDaoImpl {
	//@Autowired                      //2 delete it
	private DataSource dataSource; //with 100 dao classes u can use dataSource
	
	//JdbcTemplate jdbcTemplate = new JdbcTemplate(); now in setter method 
	JdbcTemplate jdbcTemplate;
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
		String sql="Select count(*) from Circle";
		//jdbcTemplate.setDataSource(getDataSource());    //2 delete it
		return jdbcTemplate.queryForInt(sql);
	}
	
	public String getCircleName(int circleId)
	{
		String sql="select name from circle where id=?";
		return jdbcTemplate.queryForObject(sql,new Object[]{circleId},String.class);
		//jdbcTemplate.queryforob
		
		
		//3 parameters 1-query,2-parameter list,in this case only one parameter,3-parameter type
	}
	
	
	public Circle getCircleforId(int circleId)
	{
		String sql="select * from circle where id=? ";
		return jdbcTemplate.queryForObject(sql,new Object[]{circleId},new CircleMapper());
		/*In hibernate mapping happens automatically but here we need to tell spring explicity about mapping of id and name*/
				
	}
	
	public List<Circle> getAllCircles()
	{
		String sql="select * from circle";
		return jdbcTemplate.query(sql,new CircleMapper());//no second parameter as objets[] as we r not passing anything
	}
	private static final class CircleMapper implements RowMapper<Circle>
	{

		@Override
		public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			// If there 10 rows resultset is going to be same but rownum changes everytime
			
			Circle circle=new Circle();
			circle.setUserId(resultSet.getInt("Id"));
			circle.setName(resultSet.getString("name"));
			
			return circle;
		}
		
	}
	public DataSource getDataSource() {
		return dataSource;
	}

	//2
	@Autowired
	public void setDataSource(DataSource dataSource) {
	//	this.dataSource = dataSource;
		//2 
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		System.out.println("  setdatasource  ");
		
	}
	
	public void insertCircle(Circle circle)
	{
		String sql="insert into circle values(?,?)";
		
		jdbcTemplate.update(sql,new Object[]{circle.getUserId(),circle.getName()}); //same update method for delete,update...also stored procedure
		
	}
	
	//rarely find requirement of creating table in yr project
	public void createTriangleTable()
	{
		String sql="create table triangle (id number,name varchar(50))";
		jdbcTemplate.execute(sql); 
	}

}
