package com.Dave.Prjempresa.entities;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;


@Entity
@Table(name = "db_Fucionario")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Funcodigo;
	
	public long getFuncodigo() {
		return Funcodigo;
	}

	public void setFuncodigo(long funcodigo) {
		Funcodigo = funcodigo;
	}

	public String getFunnome() {
		return Funnome;
	}

	public void setFunnome(String funnome) {
		Funnome = funnome;
	}

	public LocalDate getFunnascimento() {
		return funnascimento;
	}

	public void setFunnascimento(LocalDate funnascimento) {
		this.funnascimento = funnascimento;
	}

	public Long getFunsalario() {
		return Funsalario;
	}

	public void setFunsalario(Long funsalario) {
		Funsalario = funsalario;
	}

	@Size(max = 100)
	private String Funnome;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	   private LocalDate funnascimento;
	
	private Long Funsalario;
	}
