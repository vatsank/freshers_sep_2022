package com.example.demo.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.demo.utils.ConnectionFactory;
import com.training.exceptions.ElementNotFoundException;
import com.training.ifaces.CrudRepository;
import com.training.model.Restaurant;

public class RestaurantRepository implements CrudRepository<Restaurant> {

	private Connection con;
	
	
	public RestaurantRepository() {
		super();
          con = ConnectionFactory.getMySqlConnection(); 

	}

	public RestaurantRepository(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public boolean save(Restaurant obj) {

		String sql = "insert into lumen_restaurant values(?,?,?,?)";
		
		int rowAdded =0;

		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			
			pstmt.setInt(1, obj.getId());
			pstmt.setString(2, obj.getRestaurantName());
			pstmt.setLong(3, obj.getPinCode());
			pstmt.setString(4, obj.getCuisine());

			
			rowAdded = pstmt.executeUpdate();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return rowAdded==1?true:false;
	}

	@Override
	public Collection<Restaurant> findAll() {

		List<Restaurant> studList = new ArrayList<>();
		
		String sql = "select * from lumen_restaurant";

		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
		
			
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Restaurant obj =mapRowToObject(rs);
				
				studList.add(obj);
				
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return studList;
	}

	@Override
	public boolean delete(Restaurant obj) throws ElementNotFoundException {
		
		return false;
		
	}

	@Override
	public boolean deleteById(int key) throws ElementNotFoundException {
		
		
		int rowDeleted=0;

			
		return rowDeleted==1?true:false;

	}

	@Override
	public Restaurant findById(int key) throws ElementNotFoundException {

		String sql = "select * from lumen_restaurant where id=?";

		Restaurant Restaurant=null;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
		
			pstmt.setInt(1, key);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				Restaurant =mapRowToObject(rs);
				
				
			}
			
			if(Restaurant==null) {
				throw new ElementNotFoundException("ERR-102","Element with Given Id "+ key+" Not Found");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return Restaurant;
		
	}

	private Restaurant mapRowToObject(ResultSet rs) throws SQLException {
	
		int id = rs.getInt("id");
		String restaurantName = rs.getString("restaurantName");
		long pinCode = rs.getLong("pincode");
		String cuisine = rs.getString("cuisine");
		
		
		
		return  new Restaurant(id, restaurantName, pinCode, cuisine);

	}

	@Override
	public int update(Restaurant obj) {

		
		  
		return 0;
	}

}
