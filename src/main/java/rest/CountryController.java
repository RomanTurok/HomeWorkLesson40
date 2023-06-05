package rest;

import domain.Country;
import lombok.RequiredArgsConstructor;
import org.hibernate.dialect.function.CoalesceIfnullEmulation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController {
    public final CountryController countryController;

    @PostMapping("/country")
    public ResponseEntity<Void> save (@RequestBody Country country){
        countryController.save(country);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @GetMapping("/country")
    public List<Country> findAll(){
        return countryController.findAll();
    }

}
