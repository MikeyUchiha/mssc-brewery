package com.starfantasygames.msscbrewery.service;

import com.starfantasygames.msscbrewery.dto.CustomerDto;

import java.util.UUID;

public interface CustomerService
{
    CustomerDto getCustomerById(UUID id);
}
