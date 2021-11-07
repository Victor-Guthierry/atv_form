package com.ifpe.atv_form.models;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BatismoDAO extends JpaRepository<BatismoModel, Integer>{
	/*	
	public BatismoModel findByNome(String nomeCrianca);
	public BatismoModel findByNomePai(String nomePai);
	public BatismoModel findByNomeMae(String nomeMae);
	public BatismoModel findByDataNascimento(LocalDate dataNascimento);
	public BatismoModel findByDataBatismo(LocalDate dataBatismo);
	*/
}
