
package com.codegym.cms.controller;


import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Employee;

import com.codegym.cms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping("/create-employee")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/create-employee")
    public ModelAndView saveCustomer(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);

        ModelAndView modelAndView = new ModelAndView("/employee/create");
        modelAndView.addObject("employee", new Employee());
        modelAndView.addObject("message", "New employee created successfully");
        return modelAndView;
    }
    //list
    @GetMapping("/list")
    public ModelAndView listCustomers(){
        Iterable<Employee> employee = employeeService.findAll();
        ModelAndView modelAndView = new ModelAndView("/employee/list");
        modelAndView.addObject("employee", employee);
        return modelAndView;
    }

    //update
    @GetMapping("/edit-employee/{id}")
    public ModelAndView showEditForm(@PathVariable Long id){
        Employee employee = employeeService.findById(id);
        if(employee != null) {
            ModelAndView modelAndView = new ModelAndView("/employee/edit");
            modelAndView.addObject("employee", employee);
            return modelAndView;

        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit-employee")
    public ModelAndView updateCustomer(@ModelAttribute Employee customer){
        employeeService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/employee/edit");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer updated successfully");
        return modelAndView;
    }



}