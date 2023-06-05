package service;

import domain.City;
import dto.CityDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CityRepository;
import repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CityService {
    private final CityRepository cityRepository;
    public final CountryRepository countryRepository;

    public void save(City city){
        cityRepository.save(city);
    }

    public List<City> findAll(){
        return cityRepository.findAll();
    }

    public Optional<City> findById (Integer id){
        return cityRepository.findById(id);
    }
}
