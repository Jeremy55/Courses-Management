package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Student extends User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
}
