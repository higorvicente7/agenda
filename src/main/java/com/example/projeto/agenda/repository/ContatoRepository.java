package com.example.projeto.agenda.repository;

import com.example.projeto.agenda.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
}
