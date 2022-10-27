package com.assigment20oct.insurance;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class SampleController {

	@Autowired
	private InsuranceRepo ir;
	@GetMapping("/C1")
	public List<InsuranceEntity> joinco() {

		return ir.getjoin(1);
	}
	
	
	@GetMapping("/C2")
	public List<InsuranceEntity> joincol(){
		
		return ir.getjoin(2);
	}
}

