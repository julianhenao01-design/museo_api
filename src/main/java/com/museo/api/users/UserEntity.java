package com.museo.api.users;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users", schema = "users_schema") // Esto lo manda a tu esquema de Railway
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String username;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role; // Ejemplo: ADMIN, GUIDE, VISITOR

}
