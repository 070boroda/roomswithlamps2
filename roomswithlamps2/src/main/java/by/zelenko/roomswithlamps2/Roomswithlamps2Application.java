package by.zelenko.roomswithlamps2;

import by.zelenko.roomswithlamps2.entities.Room;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class Roomswithlamps2Application {

	public static void main(String[] args) {
		SpringApplication.run(Roomswithlamps2Application.class, args);
	}

	@Bean
	public List<Room> createRooms(){
		List<Room> rooms = new LinkedList<>();
		rooms.add(new Room( 1L,true));
		rooms.add(new Room( 2L,true));
		rooms.add(new Room( 3L,true));
		rooms.add(new Room( 4L,true));
		rooms.add(new Room( 5L,true));
		return rooms;
	}
}
