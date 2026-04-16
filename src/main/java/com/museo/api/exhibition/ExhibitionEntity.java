package com.museo.api.exhibition;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "exhibitions", schema = "exhibition_schema") // Se guarda en su propio esquema
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExhibitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(nullable = false)
    private String location; // Ejemplo: "Sala A", "Pabellón Norte"


}

