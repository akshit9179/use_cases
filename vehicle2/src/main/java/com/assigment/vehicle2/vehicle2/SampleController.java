package com.assigment.vehicle2.vehicle2;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController 
{
	@Autowired
	private CarJpa cr;
//	@GetMapping("/car") 
//	public List<CarEntity> getSample(){
//		ArrayList<CarEntity> transformedvalues=new ArrayList<CarEntity>();
//		
//    	for(TruckEntity emt: cr.findAll()) {
//    		CarEntity temp=new CarEntity();
//    		
//    		temp.setCar_id(emt.getTruck_id());
//    		temp.setCar_name(emt.getTruck_name());
//    		temp.setNo_of_types(emt.getNo_of_tyres());
//    		
//    		transformedvalues.add(temp);
//    	}
//    	return transformedvalues;
//	}
	
	@Autowired
	private BikeJpa br;
	@GetMapping("/bike") 

	public List<BikeEntity> joinbike(){
		return br.getjoinbike();
	}
}
