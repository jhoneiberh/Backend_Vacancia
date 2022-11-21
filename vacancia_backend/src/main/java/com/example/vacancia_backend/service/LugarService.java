package com.example.vacancia_backend.service;

import com.example.vacancia_backend.model.Lugar;
import com.example.vacancia_backend.model.Usuario;
import com.example.vacancia_backend.repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarService
{
    @Autowired
    private LugarRepository repository;

    public List<Lugar> buscarTodo()
    {
        return(List<Lugar>) repository.findAll();
    }

    public Lugar guardarLugar(Lugar lugar){

        return repository.save (lugar);

    }
}
