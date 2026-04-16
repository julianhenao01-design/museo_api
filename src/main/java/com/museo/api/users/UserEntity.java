package com.museo.api.users;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users", schema = "users_schema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id // <-- ESTO ES LO QUE FALTA
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <-- Y ESTO TAMBIÉN
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, unique = true, length = 100)
    private String email;
}
