package com.country.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation. GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
@Autowired
private EmployeeRepo er;

@GetMapping(" /sample")
   public List<EmployeeEntity> getSample() {
   ArrayList<EmployeeEntity> transformedvalues = new ArrayList<EmployeeEntity>();
for (EmployeeEntity emt : er.findAll()) {
EmployeeEntity temp = new EmployeeEntity();
temp. srtId(emt .getId());
if (emt.grtEmployee_name().contains("$")) {
temp. setEmployee_name(emt.grtEmployee_name() .replaceAll("\\$", ""));
}
transformedvalues.add(temp);

}

return transformedvalues;
}

}