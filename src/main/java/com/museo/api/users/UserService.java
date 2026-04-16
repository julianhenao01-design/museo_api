package com.museo.api.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Método para obtener todos (lo usaremos en el Controller)
    public List<UserEntity> listarTodos() {
        return userRepository.findAll();
    }

    // Método para guardar
    public UserEntity guardar(UserEntity user) {
        return userRepository.save(user);
    }

    // EL MÉTODO NUEVO: Eliminar
    public void eliminar(Long id) {
        userRepository.deleteById(id);
    }
}
