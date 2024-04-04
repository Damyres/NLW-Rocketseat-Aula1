package rocketseat.com.passin.dto.event;
public record EventDetailDTO(
        String id,
        String tilte,
        String details,
        String slug,
        Integer maximumAttendees,
        Integer attendeesAmout) {
}

