package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Student extends User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private Set<Work> works;
    @ManyToMany
    private Set<Course> courses;
}
