package com.gourmetdelights.api.user;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="user_id", nullable = false)
    private UUID userId;
    
    @Column(name="username", unique = true)
    private String username;
    
    @Column(name="password", nullable = false)
    private String password;

    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

    @Column(name="date_of_birth", nullable = false)
    private LocalDate LocalDate;
}
