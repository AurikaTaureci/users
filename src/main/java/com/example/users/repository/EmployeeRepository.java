package com.example.users.repository;

import com.example.users.model.Employee;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee,Integer>, QueryByExampleExecutor<Employee> {

        @Query("SELECT * FROM employee")
         List<Employee> getAllEmployees();

        List<Employee> findAllByUsername(String username);

    }

