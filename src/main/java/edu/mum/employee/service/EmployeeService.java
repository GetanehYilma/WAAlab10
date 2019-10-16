package edu.mum.employee.service;

import edu.mum.employee.domain.Employee;

import java.util.List;

public interface EmployeeService {

    public void save(Employee employee);
    public List<Employee> findAll();
//    public Employee findByEmployeeNumber(Long employeeId);
}
