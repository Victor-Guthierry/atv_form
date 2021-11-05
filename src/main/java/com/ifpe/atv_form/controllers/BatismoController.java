package com.ifpe.atv_form.controllers;
import com.ifpe.atv_form.models.*;
import com.ifpe.atv_form.service.BatismoService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BatismoController {
	
	private List<BatismoModel> lista = new ArrayList<BatismoModel>();
	
	@Autowired
	private BatismoDAO batismoDAO;
	
	@Autowired
	private BatismoService batismoService;
	
	@ModelAttribute("batismos")
	public List<BatismoModel> getLista(){
		return this.batismoDAO.findAll();
	}
	
    @GetMapping("/batismo")
    public String batismoPage(){
        return "batismo";
    }
    
    @PostMapping("/batismo")
    public String providerToString(BatismoModel batismoModel){
    	this.lista.add(batismoModel);
        System.out.println(batismoModel.toString());
  //      this.batismoDAO.save(batismoModel);
        this.batismoService.cadastrarBatismo(batismoModel);
        return "batismo";
    }
    
    @GetMapping("/")
    public String home(){
        return "batismo";
    }
    
    @GetMapping("/listaBatismos")
    public String listaDeBatismo(){
        return "listaBatismo";
    }
}
