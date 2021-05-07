package com.escola.tdd.builders;

import com.escola.tdd.model.Aluno;

public class AlunoBuilder {
	private Aluno aluno;
	
	private AlunoBuilder() {}
	
	public static AlunoBuilder umAluno() {
		AlunoBuilder builder=new AlunoBuilder();
		builder.aluno=new Aluno();
		builder.aluno.setMatricula("1");
		builder.aluno.setNome("Joao");
		return builder;
	}
	public Aluno agora() {
		return aluno;
	}
}
