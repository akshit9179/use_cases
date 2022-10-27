package com.country.crud;

import java.util.List;

import org.junit.Assert;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceTest {

	@Autowired
	private EmployeeServiceTest emp;

	@Test
	public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
		List<EmployeeEntity> employ =emp.getSample();

		Assert.assertEquals(employ.size(), 5);
	}

	private List<EmployeeEntity> getSample() {
		// TODO Auto-generated method stub
		return null;
	}
}

