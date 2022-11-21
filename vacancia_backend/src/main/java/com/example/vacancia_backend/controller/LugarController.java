package com.example.vacancia_backend.controller;

import com.example.vacancia_backend.model.Lugar;
import com.example.vacancia_backend.model.Usuario;
import com.example.vacancia_backend.service.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class LugarController
{
    @Autowired
    private LugarService service;


    @GetMapping("/consultarAllLugares")
    public ResponseEntity<?> consultarAll()
    {
        return ResponseEntity.ok(service.buscarTodo());
    }


}
