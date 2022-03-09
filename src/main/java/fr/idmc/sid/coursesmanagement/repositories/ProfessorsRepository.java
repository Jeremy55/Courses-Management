package fr.idmc.sid.coursesmanagement.repositories;

import fr.idmc.sid.coursesmanagement.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorsRepository extends JpaRepository<Professor,Long> {
}
