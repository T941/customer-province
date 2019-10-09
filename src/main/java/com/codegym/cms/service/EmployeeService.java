package com.codegym.cms.service;

import com.codegym.cms.model.Employee;

public interface EmployeeService {
    Iterable<Employee> findAll();

    Employee findById(Long id);

    void save(Employee employee);

    void remove(Long id);

}
