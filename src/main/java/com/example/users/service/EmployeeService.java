package com.example.users.service;

import com.example.users.model.Employee;
import com.example.users.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService  implements CommandLineRunner {

    private final EmployeeRepository  employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.getAllEmployees();

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(employeeRepository.findAllByUsername("user1"));
    }
}
