package com.redsocial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redsocial.entidad.Categoria;
@Controller
public class CategoriaController{

	@Autowired
	private CategoriaController CategoriaServicio;
	
	

	@RequestMapping("/verCategoria")
	public String ver() {
		return "registraCategoria";
	}
	
	@RequestMapping("/cargaCategoria")
	@ResponseBody
	public List<Categoria> listaCategoria() {
		return CategoriaServicio.listaCategoria();
	}
	



	
	
}
