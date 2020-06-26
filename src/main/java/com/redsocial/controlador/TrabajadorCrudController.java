package com.redsocial.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Trabajador;
import com.redsocial.servicio.TrabajadorServicio;

@Controller
public class TrabajadorCrudController {


	@Autowired
	private TrabajadorController servicio;
	
	@RequestMapping("/verCrudTrabajador")
	public String ver() {
		return "crudTrabajador";
	}
	
	

}
