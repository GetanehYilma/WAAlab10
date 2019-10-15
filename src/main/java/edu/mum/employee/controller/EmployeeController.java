package edu.mum.employee.controller;

import edu.mum.employee.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeController employeeController;

    @GetMapping("/")
    public String display(@ModelAttribute("employee")Employee employee){
        return "employeeForm";
    }


}
