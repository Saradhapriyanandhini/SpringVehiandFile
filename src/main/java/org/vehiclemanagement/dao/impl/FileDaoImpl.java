package org.vehiclemanagement.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.vehiclemanagement.dao.FileDao;
import org.vehiclemanagement.model.Order;
@Repository
public class FileDaoImpl implements FileDao{
	@Autowired
	SessionFactory sessionFactory;
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	@Override

	public List<Order> getAll() {

		return jdbcTemplate.query("select * from orderdetails1",new ResultSetExtractor<List<Order>>() {

			@Override  
		     public List<Order> extractData(ResultSet rs) throws SQLException,  
		            DataAccessException {  
		      
		        List<Order> list=new ArrayList<Order>();  
		        while(rs.next()){  
			        Order order=new Order();  
			        order.setOrder_No(rs.getString("order_no"));

			        order.setOrder_Name( rs.getString("order_name"));

			        order.setUser_Name(rs.getString("user_name"));

			        order.setMobile_No(rs.getString("mobile_no"));

			        order.setPlace(rs.getString("place"));
			        
			        list.add(order);  
			        
		        }
		        rs.close();
		        return list;  
		        }  
		    });  
	}

}
