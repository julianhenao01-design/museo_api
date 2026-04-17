package com.museo.api.exhibition;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/exhibition")
@CrossOrigin(origins = "*") // Para evitar problemas de conexión
public class ExhibitionController {

    private final ExhibitionRepository exhibitionRepository;

    public ExhibitionController(ExhibitionRepository exhibitionRepository) {
        this.exhibitionRepository = exhibitionRepository;
    }

    @GetMapping
    public List<ExhibitionEntity> getAll() {
        return (List<ExhibitionEntity>) exhibitionRepository.findAll();
    }

    @PostMapping
    public ExhibitionEntity create(@RequestBody ExhibitionEntity exhibition) {
        return exhibitionRepository.save(exhibition);
    }

    // NUEVO: Método para eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        exhibitionRepository.deleteById(id);
        return ResponseEntity.ok("Exhibición eliminada");
    }
}

