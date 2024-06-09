package com.example.item.service.api;

import com.example.item.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Vishal Sandakelum,
 * @Runtime version: 11.0.11+9-b1341.60 amd64
 **/

@RestController
@RequestMapping("api/v0/item")
public class ItemController {
    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("getItem")
    public String getItem(){
        return "Item .....";
    }
    @PostMapping("saveItem")
    public void saveItem(@RequestBody CustomerDTO customerDTO){
        restTemplate.postForObject("http://customer-service/api/v0/customers/saveCustomer",customerDTO,CustomerDTO.class);
    }
}
