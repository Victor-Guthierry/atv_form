package com.ifpe.atv_form.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifpe.atv_form.models.BatismoModel;
import com.ifpe.atv_form.service.BatismoService;

@Controller
public class BatismoController {

	@Autowired
	private BatismoService batismoService;

	@GetMapping("/batismo")
	public String batismoPage() {
		return "batismo";
	}

	@GetMapping("/")
	public String listaDeBatismo(Model model) {
		List<BatismoModel> listaBatismos = this.batismoService.listaBatismos();
		model.addAttribute("batismos", listaBatismos);
		return "listaBatismo";
	}

	@PostMapping("/batismo")
	public String providerToString(Model model, BatismoModel batismoModel) {
		this.batismoService.cadastrarBatismo(batismoModel);
		return listaDeBatismo(model);
	}

}
