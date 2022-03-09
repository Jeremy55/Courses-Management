package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Class {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    @ManyToOne
    private Room room;
    @ManyToMany
    private Collection<Professor> professors;
    @ManyToMany
    private Collection<Student> students;
}
