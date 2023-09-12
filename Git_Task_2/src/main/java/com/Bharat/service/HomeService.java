package com.Bharat.service;

import java.util.List;

import com.Bharat.model.Employee;

public interface HomeService {

	void saveData(Employee e);

	List<Employee> getAllData();

}
