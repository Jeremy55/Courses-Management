package fr.idmc.sid.coursesmanagement.controllers;

import fr.idmc.sid.coursesmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students")
public class StudentController {

    private StudentService studentService;

    @GetMapping("/courses")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>("test", HttpStatus.OK);
    }
}
