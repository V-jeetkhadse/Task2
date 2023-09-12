package com.Bharat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bharat.model.Employee;

public interface HomeRepository extends JpaRepository<Employee,Integer>{

}
