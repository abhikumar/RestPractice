package com.service.pkg;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class BikeVoList {
	@XmlElement
	List<BikeVO> list;

	public List<BikeVO> getList() {
		return list;
	}

	public void setList(List<BikeVO> list) {
		this.list = list;
	}

}
