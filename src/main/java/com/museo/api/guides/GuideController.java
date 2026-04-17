package com.museo.api.guides;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/guide")
public class GuideController {

    private final GuideRepository guideRepository;

    public GuideController(GuideRepository guideRepository) {
        this.guideRepository = guideRepository;
    }

    @GetMapping
    public List<GuideEntity> getAll() {
        return (List<GuideEntity>) guideRepository.findAll();
    }

    @PostMapping
    public GuideEntity create(@RequestBody GuideEntity guide) {
        return guideRepository.save(guide);
    }
    @DeleteMapping("/{id}")
    public org.springframework.http.ResponseEntity<String> delete(@PathVariable Long id) {
        guideRepository.deleteById(id);
        return org.springframework.http.ResponseEntity.ok("Guía eliminado");
    }
}
