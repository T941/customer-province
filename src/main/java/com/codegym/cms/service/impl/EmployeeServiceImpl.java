package com.codegym.cms.service.impl;


import com.codegym.cms.model.Employee;
import com.codegym.cms.repository.EmployeeRepository;
import com.codegym.cms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {

@Autowired
private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public void save(Employee employee) {
employeeRepository.save(employee);
    }

    @Override
    public void remove(Long id) {
employeeRepository.delete(id);
    }
}
