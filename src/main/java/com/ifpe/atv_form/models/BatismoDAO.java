package com.ifpe.atv_form.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatismoDAO extends JpaRepository<BatismoModel, Integer>{

}
