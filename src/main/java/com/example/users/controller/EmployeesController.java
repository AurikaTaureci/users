package com.example.users.controller;

import com.example.users.model.Employee;
import com.example.users.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeesController {

  private final EmployeeService employeeService;

    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/allUsers")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
}
