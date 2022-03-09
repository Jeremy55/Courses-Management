package fr.idmc.sid.coursesmanagement.services;

import fr.idmc.sid.coursesmanagement.repositories.CourseRepository;
import fr.idmc.sid.coursesmanagement.entities.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    @Autowired
    private final StudentService studentService;
}
