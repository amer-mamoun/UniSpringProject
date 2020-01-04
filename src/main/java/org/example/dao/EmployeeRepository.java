package org.example.dao;

import org.example.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "employees", path = "employees")
public interface EmployeeRepository extends CrudRepository<Employees, Long> {
    public List<Employees> findByFirstName(String firstName);
}
