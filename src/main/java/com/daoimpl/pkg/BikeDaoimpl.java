package com.daoimpl.pkg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dao.entity.pkg.BikeEntity;
import com.dao.pkg.IBike;
import com.query.pkg.BikeQuery;

@Repository("BikeDaoimpl") // The @Repository annotation is a marker for any
							// class that fulfills the role or stereotype of a
							// repository (also known as Data Access Object or
							// DAO).
@Scope("singleton")

public class BikeDaoimpl implements IBike {

	@Autowired // @Autowired. Marks a constructor, field, setter method or
				// config method as to be autowired by Spring's dependency
				// injection facilities.
	@Qualifier("bikeJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public List<BikeEntity> findBikes() {

		// query method to fetch more than one records
		List<BikeEntity> bikes = jdbcTemplate.query(BikeQuery.FIND_NEW_BIKES,
				new BeanPropertyRowMapper(BikeEntity.class));
		return bikes;

	}

}
