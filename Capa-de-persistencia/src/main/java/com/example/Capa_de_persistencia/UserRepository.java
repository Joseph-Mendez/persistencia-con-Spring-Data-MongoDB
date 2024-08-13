package com.example.Capa_de_persistencia;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    // Encuentra un usuario por su nombre
    List<User> findByName(String name);

    // Encuentra un usuario por su correo electrónico
    User findByEmail(String email);

    // Encuentra usuarios cuyo nombre contiene una cadena específica
    List<User> findByNameContaining(String partOfName);

    // Encuentra usuarios cuyo nombre comienza con una cadena específica
    List<User> findByNameStartingWith(String prefix);

    // Encuentra usuarios cuyo nombre termina con una cadena específica
    List<User> findByNameEndingWith(String suffix);

    // Encuentra usuarios por una lista de IDs
    List<User> findByIdIn(List<String> ids);

    // Encuentra usuarios con nombre en una lista específica
    List<User> findByNameIn(List<String> names);
}
