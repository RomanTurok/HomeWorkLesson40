package service;

import domain.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.CountryRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CountryService {
    private final CountryRepository countryRepository;

    public void save(Country country){
        countryRepository.save(country);
    }

    public List<Country> findAll(){
        return countryRepository.findAll();
    }

    public Optional<Country> findById(Integer id){
        return countryRepository.findById(id);
    }
}
