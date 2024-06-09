package com.example.customer.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: Theekshana De Silva,
 * @Runtime version: 11.0.11+9-b1341.60amd64
 **/
@Data
@Setter
@Getter
public class CustomerDTO {
    private String name;
    private int age;
    private int contactNo;
}
