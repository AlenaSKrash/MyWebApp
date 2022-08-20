package com.alena.controller;

import com.alena.dao.EmployeeDao;
import com.alena.entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmpController {

    private EmployeeDao employeeDao;

    @RequestMapping("/")
    public String showAllEmp(Model model){
        List<Employee> allEmployees
                = employeeDao.getAllEmployees();
        model.addAttribute("allEmps", allEmployees);
        return "allEmployees";
    }

}
