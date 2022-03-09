package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Teacher extends User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToMany
    private Set<Course> courses;
}
