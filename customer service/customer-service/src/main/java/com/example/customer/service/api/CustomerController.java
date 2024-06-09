package com.example.customer.service.api;

import com.example.customer.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@RestController
@RequestMapping("api/v0/customers")
public class CustomerController {
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/getCustomer")
    public String getCustomer(){
        return restTemplate.getForObject("http://item-service/api/v0/item/getItem", String.class);
    }

    @PostMapping("/saveCustomer")
    public void saveCustomer(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO);
    }
}
