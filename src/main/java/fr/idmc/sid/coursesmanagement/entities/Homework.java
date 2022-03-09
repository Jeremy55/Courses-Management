package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Homework {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String deadline;
    private String label;
    @OneToOne(optional = true)
    private Work work;
}
