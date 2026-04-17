package com.museo.api.products;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    // Inyección por constructor (mejor práctica)
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // LISTAR TODOS
    @GetMapping
    public ResponseEntity<List<ProductEntity>> getAll() {
        return ResponseEntity.ok(productService.listarTodos());
    }

    // OBTENER POR ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getById(@PathVariable Long id) {
        ProductEntity product = productService.buscarPorId(id);

        if (product != null) {
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // CREAR PRODUCTO
    @PostMapping
    public ResponseEntity<ProductEntity> create(@RequestBody ProductEntity product) {
        return ResponseEntity.ok(productService.guardar(product));
    }

    // ACTUALIZAR PRODUCTO
    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> update(@PathVariable Long id, @RequestBody ProductEntity product) {
        ProductEntity actualizado = productService.actualizar(id, product);

        if (actualizado != null) {
            return ResponseEntity.ok(actualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // ELIMINAR PRODUCTO
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        boolean eliminado = productService.eliminar(id);

        if (eliminado) {
            return ResponseEntity.ok("Producto con ID " + id + " eliminado con éxito");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
