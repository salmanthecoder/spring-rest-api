package com.restapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employeesList= new ArrayList<Employee>(); ;
    public List<Employee> getEmployee()
    {
        return employeesList;
    }

    public void addEmployee()
    {
        if(employeesList != null) {
            employeesList.add(new Employee(employeesList.size()+ 1,"Salman","Saifi","howtodoinjava@gmail.com"));
        } else {
            employeesList = new ArrayList<Employee>();
            employeesList.add(new Employee(1,"Salman","Saifi","howtodoinjava@gmail.com"));
        }

    }
}
