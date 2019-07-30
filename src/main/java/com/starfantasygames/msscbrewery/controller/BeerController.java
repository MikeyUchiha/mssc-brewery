package com.starfantasygames.msscbrewery.controller;

import com.starfantasygames.msscbrewery.dto.BeerDto;
import com.starfantasygames.msscbrewery.service.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController
{
    private final BeerService beerService;

    public BeerController(BeerService beerService)
    {
        this.beerService = beerService;
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("id") UUID id)
    {
        return new ResponseEntity<>(beerService.getBeerById(id), HttpStatus.OK);
    }
}
