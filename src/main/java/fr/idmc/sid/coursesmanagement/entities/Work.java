package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.File;
import java.util.Date;

@Entity
@Getter
@Setter
public class Work{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private Date date;
    @ManyToOne
    private Student student;
    @OneToOne
    private Homework homework;
    private Byte[] file;
}
