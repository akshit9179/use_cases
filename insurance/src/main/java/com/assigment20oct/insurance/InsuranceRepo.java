package com.assigment20oct.insurance;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InsuranceRepo extends JpaRepository<InsuranceEntity,Integer>{
	
	@Query(value="select * from Insurance_Table t where Id= ?1;",nativeQuery=true)
	public List<InsuranceEntity> getjoin(Integer a);

}

