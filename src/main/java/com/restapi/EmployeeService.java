package com.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees()
    {
        List<Employee> employeesList= new ArrayList<>(); ;
        employeeRepository.findAll().forEach(employeesList ::add);
        return employeesList;
    }

    public Optional<Employee> getEmployee(String id)
    {
        return employeeRepository.findById(id);

    }

    public void addEmployee(Employee employee)
    {
        employeeRepository.save(employee);
    }

    public void updateEmployee(String id, Employee employee)
    {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(String id)
    {
        employeeRepository.deleteById(id);
    }
}
