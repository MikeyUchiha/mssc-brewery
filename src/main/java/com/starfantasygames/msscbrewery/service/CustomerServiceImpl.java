package com.starfantasygames.msscbrewery.service;

import com.starfantasygames.msscbrewery.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Override
    public CustomerDto getCustomerById(UUID id)
    {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Mark").build();
    }
}
