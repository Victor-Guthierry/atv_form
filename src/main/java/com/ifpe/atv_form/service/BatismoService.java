package com.ifpe.atv_form.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpe.atv_form.models.BatismoDAO;
import com.ifpe.atv_form.models.BatismoModel;


@Service
public class BatismoService {
	
	@Autowired
	private BatismoDAO batismoDAO;
	
	public void cadastrarBatismo(BatismoModel batismoModel) {
		
		this.batismoDAO.save(batismoModel);
	}
}
