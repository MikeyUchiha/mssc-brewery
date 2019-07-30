package com.starfantasygames.msscbrewery.service;

import com.starfantasygames.msscbrewery.dto.BeerDto;

import java.util.UUID;

public interface BeerService
{
    BeerDto getBeerById(UUID id);
}
