package com.company.feignclientapp.model;

import lombok.Data;

@Data
public class EmployeeDTO {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
}
