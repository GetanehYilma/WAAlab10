package edu.mum.employee.serviceImpl;

import edu.mum.employee.domain.Employee;
import edu.mum.employee.repository.EmployeeRepository;
import edu.mum.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploreeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        return employees;
    }

//    @Override
//    public Employee findByEmployeeNumber(Long employeeId) {
//        Employee employee = employeeRepository.findAllById(employeeId);
//        return null;
//    }
}
