package org.example;


import org.example.model.Employees;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(value = {"/employees"})
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;


    @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
    public Collection<Employees> fetchAllEmployees() {
        return employeeService.listEmployees();
    }

}
