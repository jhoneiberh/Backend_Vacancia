package com.example.vacancia_backend.service;

import com.example.vacancia_backend.model.Usuario;
import com.example.vacancia_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    private UserRepository repository;


    public Optional<Usuario> findByUser(Long id)
    {
        return repository.findById(id);
    }


    public List<Usuario> buscarTdoso(){

        return (List<Usuario>) repository.findAll();

    }

    public Usuario guardarUser(Usuario usuario){

        return repository.save (usuario);

    }





}
