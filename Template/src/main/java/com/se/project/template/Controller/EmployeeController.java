package com.se.project.template.Controller;

import com.se.project.template.Model.Employees;
import com.se.project.template.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee/register")
    public String getRegisterPage(Model model){
        model.addAttribute("employee", new Employees());
        return "Employee/employeeForm";
    }
    @PostMapping("/employee/register")
    public String register(@ModelAttribute Employees Employee){
        employeeService.saveEmployee(Employee);
        return "redirect:/employee/list";
    }

    @RequestMapping(path = {"/employee/list", "/employee"}, method = RequestMethod.GET)
    public String getEmployeesList(Model model){
        model.addAttribute("employees", employeeService.findAll());
        return "Employee/employeeList";
    }

    @GetMapping("/employee/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model){
        Employees employee = employeeService.findEmployeeById(id);
        model.addAttribute("employee", employee);
        return "Employee/employeeForm";
    }

    @PostMapping("employee/delete/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
        return "redirect:/employee";
    }
}
