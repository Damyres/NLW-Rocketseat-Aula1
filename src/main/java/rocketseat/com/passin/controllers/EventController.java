package rocketseat.com.passin.controllers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rocketseat.com.passin.domain.event.Event;
@RestController
@RequestMapping("/events")
public class EventController{
    @GetMapping
    public ResponseEntity<String> getTeste(){
        return ResponseEntity.ok("Sucesso!");
    }
}
