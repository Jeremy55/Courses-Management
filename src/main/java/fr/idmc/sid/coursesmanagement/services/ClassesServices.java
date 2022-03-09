package fr.idmc.sid.coursesmanagement.services;

import fr.idmc.sid.coursesmanagement.repositories.ClassesRepository;
import fr.idmc.sid.coursesmanagement.entities.Course;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClassesServices {
    @Autowired
    private final ClassesRepository classesRepository;

    public List<Course> getAll(){
        return classesRepository.findAll();
    }

    public Course save(Course c){
        return classesRepository.save(c);
    }
}
