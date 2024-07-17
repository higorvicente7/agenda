package com.example.projeto.agenda.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Contato {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @Column(name = "nome")
    private String nome;

    private String telefone;
    private String email;
    private String vinculo;


}
