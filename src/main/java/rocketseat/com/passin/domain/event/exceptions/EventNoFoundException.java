package rocketseat.com.passin.domain.event.exceptions;

public class EventNoFoundException extends RuntimeException {
    public EventNoFoundException(String message){
        super(message);
    }
}
