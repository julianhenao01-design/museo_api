package com.museo.api.exhibition;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/exhibitions")
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
}
