package com.escola.tdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.tdd.model.Aluno;
import com.escola.tdd.repository.AlunoRepository;

@RestController
@RequestMapping(path = "/aluno")
public class AlunoController {
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public List<Aluno> listar() {
		return repository.findAll();
	}
	
	@PostMapping
	public Aluno adicionar(@RequestBody Aluno aluno) {
		return repository.save(aluno);
	}
}
