package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Course {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String subject;
    private String label;
    @ManyToOne
    private Teacher teacher;
    @ManyToMany
    private Set<Student> student;
}
