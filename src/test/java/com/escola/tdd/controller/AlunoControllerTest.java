package com.escola.tdd.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.escola.tdd.model.Aluno;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
public class AlunoControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	public void testarListarTudo() throws Exception {
		mockMvc.perform(get("/aluno"))
		.andExpect(status().isOk());
	}
	
	@Test
	public void testaradicionar() throws JsonProcessingException, Exception{
		Aluno aluno=new Aluno("1","Clayton",10,10,10);
		mockMvc.perform(post("/aluno")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(aluno)))
				.andExpect(status().isOk());
	}
}