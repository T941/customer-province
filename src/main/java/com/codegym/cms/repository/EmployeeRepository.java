package com.codegym.cms.repository;

import com.codegym.cms.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee ,Long> {
}
