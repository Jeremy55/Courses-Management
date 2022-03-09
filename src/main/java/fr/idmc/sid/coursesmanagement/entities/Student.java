package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Student extends User {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private Set<Work> works;
    @ManyToMany
    private Set<Course> courses;
}
