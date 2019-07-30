package com.starfantasygames.msscbrewery.service;

import com.starfantasygames.msscbrewery.dto.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService
{
    @Override
    public BeerDto getBeerById(UUID id)
    {
        return BeerDto.builder().id(UUID.randomUUID()).name("Galaxy Cat").style("Pale Ale").build();
    }
}
