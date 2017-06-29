package com.dao.pkg;

import java.util.List;

import com.dao.entity.pkg.BikeEntity;



public interface IBike {
	public List<BikeEntity> findBikes();
}
