package by.zelenko.roomswithlamps2.Exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(Long id) {
        super("Could not find " + id);
    }
}
