package dto;

import lombok.Builder;

import java.util.List;

@Builder
public class CountryDto {
    private int id;
    private String name;
    private String capital;
    private List<String> cityName;
}
