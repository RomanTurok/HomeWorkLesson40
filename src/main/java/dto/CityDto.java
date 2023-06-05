package dto;

import lombok.Builder;

@Builder
public class CityDto {
    private int id;
    private String name;
    private Long population;
    private String countryName;
}
