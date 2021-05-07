package com.escola.tdd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.tdd.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

}
