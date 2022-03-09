package fr.idmc.sid.coursesmanagement.repositories;

import fr.idmc.sid.coursesmanagement.entities.Student;
import fr.idmc.sid.coursesmanagement.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
}
