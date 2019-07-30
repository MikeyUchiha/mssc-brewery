package com.starfantasygames.msscbrewery.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto
{
    private UUID id;
    private String name;
    private String style;
    private String upc;
}
