package com.example.vacancia_backend.controller;

import com.example.vacancia_backend.model.Usuario;
import com.example.vacancia_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService service;

    @GetMapping("/consultarporid/")
    public ResponseEntity<?> filtrar(@Param("{id}") Long id)
    {
        return ResponseEntity.ok(service.findByUser(id));
    }


    @GetMapping("/consultarAll")
    public ResponseEntity<?> consultarByUser(){

        return ResponseEntity.ok(service.buscarTdoso());
    }


    // create user rest api
    @PostMapping("/guardaruser" )
    public Usuario createUser(@RequestBody Usuario usuario)
    {
        return service.guardarUser(usuario);
    }

}
