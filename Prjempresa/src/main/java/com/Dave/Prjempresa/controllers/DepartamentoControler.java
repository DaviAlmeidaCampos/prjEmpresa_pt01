package com.Dave.Prjempresa.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dave.Prjempresa.entities.Departamento;
import com.Dave.Prjempresa.services.DepartamentoService;

@RestController
@RequestMapping("/departamento")

public class DepartamentoControler{
	
public final DepartamentoService departamentoService;

@GetMapping("/home")
public String paginaInicial() {
	return "index";
}

public (DepartamentoService departamentoSerice) {
	this.departamentoService = departamentoService;
}

@GetMapping("/{depCodigo}")
public ResponseEntity<Departamento> getDepartamento(@PathVariable Long depCodigo) {
	Departamento departamento = departamentoService.getDepartamentoById(depCodigo);
	if (departamento != null) {
		return ResponseEntity.ok(departamento);
	} else {
		return ResponseEntity.notFound().build();
	}
}
@PostMapping
public Departamento createDepartamento(@RequestBody Departamento departamento) {
	return departamentoService.saveDepartamento(departamento);
}

public List<Departamento> getAllDepartamento() {
	return departamentoService.getAllDepartamento();
}

@DeleteMapping("/{depCodigo}")
public void deleteDepartamento(@PathVariable Long depCodigo) {
	departamentoService.deleteDepartamento(depCodigo);
}

	@GetMapping
	public ResponseEntity<List<Departamento>> getAllDepartamento(RequestEntity<Void> requestEntity) {
		String method = requestEntity.getMethod().name();
		String contentType = requestEntity.getHeaders().getContentType().toString();
		List<Departamento> departamento = departamentoService.getAllDepartamento();
		return ResponseEntity.status(HttpStatus.OK).header("Method", method).header("Content-Type", contentType)
				.body(departamento);
	}
	
	@PutMapping("/{depCodigo}")
	public Departamento updateDepartamento(@PathVariable Long depCodigo, @RequestBody Departamento departamento) {
	    return departamentoService.updateDepartamento(depCodigo, departamento);
	}

	}
