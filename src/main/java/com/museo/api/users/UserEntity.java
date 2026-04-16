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

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

}

