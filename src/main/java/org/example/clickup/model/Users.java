package org.example.clickup.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String full_name;
    @Column(nullable = false ,unique = true)
    private String email;
    @Column(nullable = false , unique = true)
    private String password;
    @Column(nullable = false)
    private String collor;
    @Column(nullable = false)
    private String inital_letter;
    @ManyToMany
    List<attachmet>attachmet;

}
