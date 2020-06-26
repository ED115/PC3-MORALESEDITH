package com.redsocial.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.repositorio.CategoriaRepositorio;

@Controller
public class CategoriaCrudController {
	
	private CategoriaCrudController repositorio;

	@RequestMapping("/verCrudCategoria")
	public String ver() {
		return "crudCategoria";
	}
	
}

