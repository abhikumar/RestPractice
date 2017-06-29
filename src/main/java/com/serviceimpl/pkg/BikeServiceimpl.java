package com.serviceimpl.pkg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dao.entity.pkg.BikeEntity;
import com.dao.pkg.IBike;
import com.service.pkg.BikeVO;
import com.service.pkg.IBikeService;

@Service("BikeServiceimpl")

public class BikeServiceimpl implements IBikeService {

	@Autowired
	@Qualifier("BikeDaoimpl")
	private IBike ibikes;

	public List<BikeVO> findBikes() {
		List<BikeVO> bikeList = new ArrayList<BikeVO>();
		List<BikeEntity> bikeEntityList = ibikes.findBikes();
		for (BikeEntity be : bikeEntityList) {
			BikeVO bv = new BikeVO();
			BeanUtils.copyProperties(be, bv);
			bikeList.add(bv);
		}
		return bikeList;

	}

}
