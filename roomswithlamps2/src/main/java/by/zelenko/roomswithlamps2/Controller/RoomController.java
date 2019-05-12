package by.zelenko.roomswithlamps2.Controller;


import by.zelenko.roomswithlamps2.Exception.NotFoundException;
import by.zelenko.roomswithlamps2.Repository.RoomRepository;
import by.zelenko.roomswithlamps2.entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/rooms")
public class RoomController {

    @Autowired
    RoomRepository roomRepository;

    @GetMapping()
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> rooms = roomRepository.findAll();
        return new ResponseEntity<>(rooms, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findOne(@PathVariable Long id){
        Optional<Room> room = roomRepository.findById(id);
        if(room == null){
            return new ResponseEntity<>(new NotFoundException(id), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(room,HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<?> updateRoom(@PathVariable Long id,@RequestBody Room room){
        Optional<Room> roomFromDB = roomRepository.findById(id);
        if(roomFromDB == null){
            return new ResponseEntity<>(new NotFoundException(id), HttpStatus.NOT_FOUND);
        }
        if(roomFromDB.get().getIsStatusOn() == true) {
            room.setIsStatusOn(false);
            roomRepository.save(room);
        }else{
            room.setIsStatusOn(true);
            roomRepository.save(room);
        }
        return new ResponseEntity<>(roomRepository.findAll(), HttpStatus.OK);
    }

}
