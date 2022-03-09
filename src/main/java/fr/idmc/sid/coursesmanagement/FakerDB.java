package fr.idmc.sid.coursesmanagement;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import fr.idmc.sid.coursesmanagement.entities.Course;
import fr.idmc.sid.coursesmanagement.entities.Student;
import fr.idmc.sid.coursesmanagement.entities.Teacher;
import fr.idmc.sid.coursesmanagement.repositories.CourseRepository;
import fr.idmc.sid.coursesmanagement.repositories.StudentRepository;
import fr.idmc.sid.coursesmanagement.repositories.TeacherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Locale;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class FakerDB {
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;

    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("fr-FR"), new RandomService());
    Faker faker1 = new Faker(new Random(24));

    @PostConstruct
    public void main(){
        var i = 10;
        while(i-- != 0){

            //Generating Students
            var student = new Student();
            student.setFirstname(faker1.name().firstName());
            student.setLastname(faker1.name().lastName());
            student.setMail(fakeValuesService.bothify("????##@gmail.com"));
            studentRepository.save(student);

            var course = new Course();
        }
    }
}
