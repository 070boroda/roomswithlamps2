package by.zelenko.roomswithlamps2.Controller;


import by.zelenko.roomswithlamps2.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/rooms")
public class RoomController {

    private final List<Room> rooms;
    @Autowired
    public RoomController(List<Room> rooms) {
        this.rooms = rooms;
    }

    @GetMapping()
    public ResponseEntity<List<Room>> getAllRooms(){
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOne(@PathVariable Long id){
        for(Room room : rooms) {
            if (room.getId() == id)
                return new ResponseEntity<>(room, HttpStatus.OK);
        }
            return new ResponseEntity<>("Not found " + id, HttpStatus.NOT_FOUND);
        }
    }



