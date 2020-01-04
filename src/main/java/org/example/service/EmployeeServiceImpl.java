package org.example.service;

import org.example.dao.EmployeeRepository;
import org.example.model.Employees;

import java.util.Collection;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Collection<Employees> listEmployees() {
        return (Collection<Employees>) employeeRepository.findAll();
    }
}
