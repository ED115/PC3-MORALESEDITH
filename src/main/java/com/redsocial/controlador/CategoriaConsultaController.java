package com.redsocial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Categoria;
import com.redsocial.servicio.CategoriaServicio;

@Controller
public class CategoriaConsultaController {

	
	
	@RequestMapping("/verConsultaCategoria")
	public String ver() {
		return "consultaCategoria";
	}
	

}
