package com.sms.mall.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.mall.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
