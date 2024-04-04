package rocketseat.com.passin.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import rocketseat.com.passin.domain.attendee.Attendee;
import rocketseat.com.passin.services.AttendeeService;

@RestController
@RequestMapping("/attendees")
@RequiredArgsConstructor
public class AttendeeController {

    private final AttendeeService attendeeService;

    @GetMapping
    public ResponseEntity<String> getTeste(){
        return ResponseEntity.ok("Sucesso!");
    }

    @PostMapping
    public ResponseEntity<Attendee> insert(@RequestBody Attendee attendee, UriComponentsBuilder uriComponentsBuilder){
        final var newAttendee = attendeeService.insert(attendee);
        var uri = uriComponentsBuilder.path("/attendees/{id}").buildAndExpand(newAttendee.getId()).toUri();
        return ResponseEntity.created(uri).body(newAttendee);
    }
}
