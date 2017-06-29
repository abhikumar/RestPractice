package com.service.pkg;

import java.util.List;

import com.dao.entity.pkg.BikeEntity;

public interface IBikeService {
	public List<BikeVO> findBikes();
}
