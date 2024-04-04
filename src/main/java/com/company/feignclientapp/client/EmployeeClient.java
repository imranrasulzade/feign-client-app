package com.company.feignclientapp.client;

import com.company.feignclientapp.model.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "employee-service", url = "http://localhost:8081") //another host and api
public interface EmployeeClient {

    @GetMapping("employee/all") //another api
    EmployeeDTO getEmployees();

    @GetMapping("employee/hello") //another api
    String getHello();

}
