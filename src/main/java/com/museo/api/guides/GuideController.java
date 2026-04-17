@RestController
@RequestMapping("/api/guide")
@CrossOrigin(origins = "*") // Permite que el HTML se comunique con el servidor
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

    // NUEVO: Método para eliminar un guía por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        guideRepository.deleteById(id);
        return ResponseEntity.ok("Guía eliminado con éxito");
    }
} 
    
