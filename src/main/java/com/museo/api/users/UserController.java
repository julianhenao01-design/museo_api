package com.museo.api.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
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

    @DeleteMapping("/{id}")
    public org.springframework.http.ResponseEntity<String> delete(@PathVariable Long id) {
        userService.eliminar(id);
        return org.springframework.http.ResponseEntity.ok("Usuario eliminado con éxito");
    }
}


