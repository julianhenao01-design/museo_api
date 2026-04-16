package com.museo.api.exhibition;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "exhibitions") // Nombre de la tabla en tu base de datos
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExhibitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;  // Coincide con 'title' en el CONFIG del HTML

    @Column(nullable = false)
    private String artist; // Coincide con 'artist' en el CONFIG del HTML

    @Column(nullable = false)
    private String year;   // Coincide con 'year' en el CONFIG del HTML
}

