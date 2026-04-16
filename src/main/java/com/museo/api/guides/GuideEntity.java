package com.museo.api.guides;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "guides", schema = "guides_schema") // Su propio esquema en Railway
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(length = 100)
    private String specialization; // Ejemplo: Pintura Barroca, Arqueología

    @Column(length = 50)
    private String language; // Ejemplo: Español, Inglés, Francés

    @Column(name = "years_experience")
    private Integer yearsOfExperience;
}
