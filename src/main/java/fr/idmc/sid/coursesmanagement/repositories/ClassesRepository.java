package fr.idmc.sid.coursesmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.idmc.sid.coursesmanagement.entities.Course;

public interface ClassesRepository extends JpaRepository<Course,Long> {

}
