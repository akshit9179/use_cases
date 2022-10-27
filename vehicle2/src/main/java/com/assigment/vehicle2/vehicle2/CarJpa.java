package com.assigment.vehicle2.vehicle2;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarJpa extends JpaRepository<CarEntity,Integer>{

	List<CarEntity> findAll1();



}
