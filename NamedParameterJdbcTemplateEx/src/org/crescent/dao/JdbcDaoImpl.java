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
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component    // to mark this as spring bean  with id jdbcDaoImpl(j in small letter)
public class JdbcDaoImpl {
	//@Autowired                      //2 delete it
	private DataSource dataSource; //with 100 dao classes u can use dataSource
	
	//JdbcTemplate jdbcTemplate = new JdbcTemplate(); now in setter method 
	JdbcTemplate jdbcTemplate;
    NamedParameterJdbcTemplate namedParameterJdbceTemplate;
	public DataSource getDataSource() {
		return dataSource;
	}

	//2
	@Autowired
	public void setDataSource(DataSource dataSource) {
	//	this.dataSource = dataSource;
		//2 
		this.jdbcTemplate=new JdbcTemplate(dataSource);
		this.namedParameterJdbceTemplate=new NamedParameterJdbcTemplate(dataSource);
		System.out.println("  setdatasource  ");
		
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
			circle.setId(resultSet.getInt("Id"));
			circle.setName(resultSet.getString("name"));
			
			return circle;
		}
		
	}
	
	public void insertCircle(Circle circle)
	{
		String sql="insert into circle values(:id,:name)";
		
	SqlParameterSource paramSource=new MapSqlParameterSource("id",circle.getId())
	                                   .addValue("name", circle.getName());
	namedParameterJdbceTemplate.update(sql, paramSource);
		
	}
	
	

}
