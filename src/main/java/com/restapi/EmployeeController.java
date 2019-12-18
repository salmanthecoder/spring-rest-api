package com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.management.ExtendedPlatformComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/employees")
    public List<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @RequestMapping("/employees/{id}")
    public Optional<Employee> getAllEmployee(@PathVariable String id)
    {
        return employeeService.getEmployee(id);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/employees")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employees")
    public void updateEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/employees/{id}")
    public void deleteEmployee(@PathVariable String id)
    {
        employeeService.deleteEmployee(id);
    }

}
