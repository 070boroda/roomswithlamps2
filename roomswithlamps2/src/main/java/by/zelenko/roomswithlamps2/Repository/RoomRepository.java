package by.zelenko.roomswithlamps2.Repository;

import by.zelenko.roomswithlamps2.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
