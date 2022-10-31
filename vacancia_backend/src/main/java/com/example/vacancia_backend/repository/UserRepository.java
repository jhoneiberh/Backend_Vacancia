package com.example.vacancia_backend.repository;

import com.example.vacancia_backend.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Usuario, Long>
{

}


