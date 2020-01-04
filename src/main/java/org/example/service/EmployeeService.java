package org.example.service;

import org.example.model.Employees;

import java.util.Collection;

import java.util.Optional;

public interface EmployeeService {
    public Collection<Employees> listEmployees();

    public Optional<Employees> findById(Long id);

    public Employees save(Employees employee);

    public void deleteById(Long id);


}
