package com.alena.dao;

import com.alena.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();
}