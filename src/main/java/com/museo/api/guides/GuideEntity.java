package com.museo.api.guides;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "guides") // Se guardará en la tabla de guías
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GuideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // El identificador obligatorio para JPA

    @Column(nullable = false)
    private String name; // Coincide con 'name' en el CONFIG de tu index.html

    @Column(nullable = false)
    private String specialty; // Coincide con 'specialty' en el CONFIG de tu index.html
}

