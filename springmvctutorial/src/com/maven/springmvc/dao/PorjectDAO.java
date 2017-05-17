package com.maven.springmvc.dao;

import java.util.List;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

@Component("porjectDao")
public class PorjectDAO {
	
	//private JdbcTemplate jdbc;
	
	
	/*
	 * @Autowired
	
	//This setter will use the DataSource bean
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new JdbcTemplate(jdbc);
	}
 */
   //use NamedParameterJdbcTemplate
	private NamedParameterJdbcTemplate jdbc;
	
	
	@Autowired
	public void setDataSource(DataSource jdbc){
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Porject> getPorject(){
		
		
		 return jdbc.query("select * from book", new RowMapper<Porject>(){
			
			 public Porject mapRow(ResultSet rs, int rowNum) throws SQLException{
				// return null;
				 Porject p = new Porject();
				 p.setId(rs.getInt("id"));
				 p.setName(rs.getString("name"));
				 p.setNo(rs.getInt("no"));
				 return p;
			 }
		});
		 
	}
	//create batch data operation
	public int[] create(List<Porject> porjects){
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(porjects.toArray());
		
		return jdbc.batchUpdate("insert into book (id,name,no) values (:id, :name, :no)", params);
		
	}
	
	
	
	//update the existed data in database
	public boolean update(Porject porject){
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(porject);
		return jdbc.update("update book set id= :id, name=:name, no=:no where id=:id", params) == 1;
	}
	
	
	// create objects 
	public boolean create (Porject porject){
		//create spaces to hold the bean
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(porject);
		return jdbc.update("insert into book (id,name,no) values (:id, :name, :no)", params) == 1;
		
	}
	//delete data 
	public boolean delete(int id){
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		
		return jdbc.update("delete from book where id = :id", params) == 1;
	}
}
