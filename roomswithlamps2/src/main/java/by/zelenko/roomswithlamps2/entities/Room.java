package by.zelenko.roomswithlamps2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {

    private Long id;
    private Boolean isStatusOn;

}
