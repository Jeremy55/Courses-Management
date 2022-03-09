package fr.idmc.sid.coursesmanagement;

import fr.idmc.sid.coursesmanagement.entities.Class;
import fr.idmc.sid.coursesmanagement.entities.Professor;
import fr.idmc.sid.coursesmanagement.entities.Room;
import fr.idmc.sid.coursesmanagement.entities.Student;
import fr.idmc.sid.coursesmanagement.repositories.ProfessorsRepository;
import fr.idmc.sid.coursesmanagement.repositories.RoomsRepository;
import fr.idmc.sid.coursesmanagement.repositories.StudentsRepository;
import fr.idmc.sid.coursesmanagement.services.ClassesServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CoursesManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursesManagementApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ClassesServices classesServices, ProfessorsRepository professorsRepository, RoomsRepository roomsRepository, StudentsRepository studentsRepository) {
        return args -> {
        };
    }

    /**
     * Given that I'm a student
     * When I am logged
     * And I click on a specific course
     * Then I'll see the potential homework renders for this course
     * And I can give my homework
     */

    /**
     * Given that I'm a student registered in the system
     * When I open the courses page
     * And I provide my login/password
     * Then the system will log me in
     * And I will see a list of all available courses for me
     * And I will be able to click on "register" for any of them
     * And the system will register me for this class.
     *
     * En tant qu'étudiant
     * Quand j'ouvre la page de mes cours
     * Et que je m'authentifie avec mon email et mon mot de passe
     * Alors je veux voir mes cours avec la salle et quel professeur
     *
     * As a student, I want to be able to see my courses and know where they take place with which professors, so that I can keep track of important information.
     */

    /**
     *
     *      Create :
     *
     *      Given the creation of a new class
     *      When the class is being created
     *      And a professor is provided
     *      And a list of students is provided
     *      And a room is provided
     *      Then the system must save this new class with those attributes.
     *
     *      Given the creation of a teacher
     *      When the teacher information are provided
     *      Then the system must save the professor with those attributes.
     *
     *      Given creation of a student
     *      When the student data is provided
     *      Then the system must save the student with those attributes.
     *
     *      Given creation of a room
     *      When the room data is provided
     *      Then the system must save the room with those attributes.
     *
     *      Read :
     *
     *      Given I want to see all the classes that a teacher is giving
     *      When I provide the ID of a professor
     *      Then the system should return a list of the classes of this professor.
     *
     *      Given I want to see all the classes that a student is attending
     *      When I provide the ID of a student
     *      Then the system should return a list of the classes attended by the student.
     *
     *      Given I want to see which classes are given in a room
     *      When I give a room ID
     *      Then the system should return a list of all the classes given in this room.
     *
     *      Delete :
     *
     *      Given I want to delete a class
     *      When I provide a class ID to the system
     *      Then the system should delete it
     *
     *      Update :
     *
     *      Given I want to replace a professor that is giving a class
     *      When a professor ID is provided
     *      And a class ID is provided
     *      Then the system must replace the current professor with the new one.
     *
     *      Given I want to add students to a class
     *      When a list of student is provided
     *      And a class ID is provided
     *      Then the system must add those students to the current student list.
     *
     *      Given I want to replace the room of a class
     *      And a room ID is provided
     *      And a class ID is provided
     *      Then the system must replace the current room with the new one.
     */

}
