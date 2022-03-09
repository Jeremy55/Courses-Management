package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Homework {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String deadline;
    private String label;
    @OneToOne(optional = true)
    private Work work;
}
