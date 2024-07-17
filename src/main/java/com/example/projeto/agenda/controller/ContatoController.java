package com.example.projeto.agenda.controller;

import com.example.projeto.agenda.entity.Contato;
import com.example.projeto.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContatoController {

    @Autowired
    ContatoRepository contatoRepository;

    @GetMapping(value = "/")
    public List<Contato> listarTodos(){
        return contatoRepository.findAll();
    }
    @GetMapping(value = "/{id}")
    public Contato listarID(@PathVariable long id){
        return contatoRepository.findById(id).get();
    }

    @PostMapping(value = "/")
    public Contato salvarContato(@RequestBody Contato contato){
        return contatoRepository.save(contato);
    }
    

    @DeleteMapping(value = {"/{id}"})
    public void deleteContato(@PathVariable long id){
        contatoRepository.deleteById(id);
    }
}
