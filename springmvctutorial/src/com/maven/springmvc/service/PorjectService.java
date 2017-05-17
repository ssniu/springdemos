package com.maven.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.springmvc.dao.Porject;
import com.maven.springmvc.dao.PorjectDAO;

import java.util.List;


@Service ("porjectService")// equlas to component
public class PorjectService {

	
	private PorjectDAO porjectDao;
	
	
	public PorjectDAO getPorjectDao() {
		return porjectDao;
	}

	@Autowired
	public void setPorjectDao(PorjectDAO porjectDao) {
		this.porjectDao = porjectDao;
	}


	public List<Porject> getCurrent(){
		return porjectDao.getPorject();
	}
}
