package com.sample.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sample.domain.City;
import com.sample.utility.DBUtility;


public class StateService {
	
	private Connection connection;

	public StateService() {
		connection = DBUtility.getConnection();
	}
	
	//this method would extract all the cities from database for the State passed as parameter 
	public List<City> getAllCities(int stateId) {
		List<City> cities = new ArrayList<City>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from city where stateId=?");
			// Parameters start with 1			
			preparedStatement.setInt(1, stateId);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				City city = new City();
				city.setId(rs.getInt("id"));
				city.setName(rs.getString("name"));
				city.setStateId(rs.getInt("stateId"));		
				
				cities.add(city);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cities;
	}

}

