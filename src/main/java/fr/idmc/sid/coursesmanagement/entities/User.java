package fr.idmc.sid.coursesmanagement.entities;

import lombok.Data;

@Data
public class User {
    private String lastname;
    private String firstname;
    private String mail;
    private String password;
}
