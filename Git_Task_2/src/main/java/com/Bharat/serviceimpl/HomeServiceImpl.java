package com.Bharat.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bharat.model.Employee;
import com.Bharat.repository.HomeRepository;
import com.Bharat.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Employee e) {

		hr.save(e);

	}

	@Override
	public List<Employee> getAllData() {
		
		List<Employee> findAll = hr.findAll();
		return findAll;
	}
}
