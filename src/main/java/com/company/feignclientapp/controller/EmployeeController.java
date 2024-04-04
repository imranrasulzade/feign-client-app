package com.company.feignclientapp.controller;


import com.company.feignclientapp.client.EmployeeClient;
import com.company.feignclientapp.model.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeClient employeeClient;

    @GetMapping("/view")
    public EmployeeDTO getAll() {
        return employeeClient.getEmployees();
    }

    @GetMapping("/hello")
    public String getHello() {
        return employeeClient.getHello();
    }

}
