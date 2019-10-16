package edu.mum.employee.controller;

import edu.mum.employee.domain.Employee;
import edu.mum.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String display(@ModelAttribute("employee") Employee employee){
        return "employeeForm";
    }

    @PostMapping("/addEmployee")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee emp, BindingResult res, Model model){

        if(res.hasErrors()){
            model.addAttribute("error", "Input Error");
            return "employeeForm";
        }
        employeeService.save(emp);

        return "redirect:/displayList";
    }

    @GetMapping("displayList")
    public String displayList(Model model){

        List<Employee> employees = (List<Employee>) employeeService.findAll();
        model.addAttribute("employeeList", employees);
        return "employeeList";
    }


}
