package rest;

import domain.City;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CityService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityController {
    private final CityService cityService;
    @PostMapping("/city")
    public ResponseEntity<Void> save (@RequestBody City city){
        cityService.save(city);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/city")
    public ResponseEntity<List<City>> findAll(){
        return ResponseEntity.ok(cityService.findAll());
    }

    @GetMapping("/city/{id}")
    public ResponseEntity<City> findById (@PathVariable Integer id){
        return cityService.findById(id)
                .map(ResponseEntity :: ok)
                .orElse(ResponseEntity.notFound().build());

    }
}
