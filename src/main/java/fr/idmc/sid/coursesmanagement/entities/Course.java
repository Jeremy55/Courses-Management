package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String subject;
    private String label;
    @ManyToOne
    private Teacher teacher;
    @ManyToMany
    private List<Student> student;
}
