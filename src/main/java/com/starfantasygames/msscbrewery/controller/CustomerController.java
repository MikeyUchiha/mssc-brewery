package com.starfantasygames.msscbrewery.controller;

import com.starfantasygames.msscbrewery.dto.CustomerDto;
import com.starfantasygames.msscbrewery.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController
{
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService)
    {
        this.customerService = customerService;
    }

    @GetMapping({"/{id}"})
    ResponseEntity<CustomerDto> getCustomer(@PathVariable("id") UUID id)
    {
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }
}
