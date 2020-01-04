package org.example.service;

import org.example.dao.EmployeeRepository;
import org.example.model.Employees;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    private Employees employees;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Collection<Employees> listEmployees() {
        return (Collection<Employees>) employeeRepository.findAll();
    }

    @Override
    public Optional<Employees> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employees save(Employees employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(Long id) {
         employeeRepository.deleteById(id);
    }

    @Override
    public List<Employees> findByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }


}
