package com.museo.api.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    // Solo nos comunicamos con el Service
    @Autowired
    private UserService userService;

    // LISTAR TODOS
    @GetMapping
    public List<UserEntity> getAll() {
        return userService.listarTodos();
    }

    // CREAR USUARIO
    @PostMapping
    public UserEntity create(@RequestBody UserEntity user) {
        return userService.guardar(user);
    }

    // ELIMINAR USUARIO (El nuevo botón rojo en Swagger)
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        userService.eliminar(id);
        return ResponseEntity.ok("Usuario con ID " + id + " eliminado con éxito");
    }
}
