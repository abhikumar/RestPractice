package com.controller.pkg;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Bike.ApplicationConstant.pkg.ApplicationConstant;
import com.service.pkg.BikeVO;
import com.service.pkg.BikeVoList;
import com.service.pkg.IBikeService;

@RestController
@RequestMapping(ApplicationConstant.REST_VERSION)

public class BikeController {
	private static final Log logger = LogFactory.getLog(BikeController.class);

	public BikeController() {
		
		System.out.println("BikeController....................");
		if (logger.isInfoEnabled())
			logger.info("########BikeController is ready now############");

	}

	@Autowired
	@Qualifier("BikeServiceimpl")
	private IBikeService ibikeService;

	@RequestMapping(value = "/findBikes", method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE })
	//@ResponseBody
	public BikeVoList findBikes() {
		BikeVO bikeVO=new BikeVO();
		bikeVO.setColor("co");
		bikeVO.setEmail("email");
		bikeVO.setId("id");
		bikeVO.setName("name");
		bikeVO.setPrice(2);
		BikeVO bikeVO2=new BikeVO();
		bikeVO2.setColor("co");
		bikeVO2.setEmail("email");
		bikeVO2.setId("id");
		bikeVO2.setName("name");
		bikeVO2.setPrice(2);
		BikeVoList bikeVoList=new BikeVoList();
		//List<BikeVO> bikeVO = ibikeService.findBikes();
		List<BikeVO> bikeVOList=new ArrayList<BikeVO>();
		bikeVoList.setList(bikeVOList);
		bikeVOList.add(bikeVO);
		bikeVOList.add(bikeVO2);
		return bikeVoList;
	}
//craet posT service,@requestbody,request paream,pathvariable,put request, delete.
	
}
