package com.alena.controller;

import com.alena.entity.Employee;
import com.alena.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmpController {

    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmp(Model model){
        List<Employee> allEmployees
                = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "allEmployees";
    }

    @RequestMapping("/")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/";
    }

    @RequestMapping("/")
    public String updateEmployee(@RequestParam("empid") int id, Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee", employee);
        return "employee-info";
    }

    @RequestMapping("/")
    public String deleteEmployee(@RequestParam("empid") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}