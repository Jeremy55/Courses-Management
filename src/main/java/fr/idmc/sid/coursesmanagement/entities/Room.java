package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Data
@Entity
public class Room {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private  int number;
    private int floor;
    private int capacity;
    public void bookRoom(int number){
        return;
    }
}
