package org.example;


import org.example.model.Employees;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = {"/employees"})
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;



    @RequestMapping(value = {"/all"}, method = RequestMethod.GET)
    public Collection<Employees> fetchAllEmployees() {
        return employeeService.listEmployees();
    }

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public Optional<Employees> findById(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @RequestMapping(value = {"/search/{firstName}"}, method = RequestMethod.GET)
    public List<Employees> findByFirstName(@PathVariable("firstName") String  firstName){
        return employeeService.findByFirstName(firstName);
    }

    @RequestMapping(value = {"/search/{id}/{lastName}"}, method = RequestMethod.GET)
    public List<Employees> findByIdAndLastName(@PathVariable("id") Long id,@PathVariable("lastName") String lastName){
        return employeeService.findByIdAndLastName(id, lastName);
    }

    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public Employees createEmployee(@RequestBody Employees employee){
        return employeeService.save(employee);
    }

    @RequestMapping(value = "/editEmployee", method = RequestMethod.PUT)
    public Employees editEmployee(@RequestBody Employees employee){
        return employeeService.save(employee);
    }

    @RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteById(id);
    }

}
