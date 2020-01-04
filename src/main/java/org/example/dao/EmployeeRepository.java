package org.example.dao;

import org.example.model.Employees;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employees, Long> {
    
}
