package com.redsocial.controlador;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.redsocial.entidad.Trabajador;
import com.redsocial.servicio.TrabajadorServicio;

@Controller
public class TrabajadorController {

	@Autowired
	private Trabajador trabajador;

	
	@RequestMapping("/verTrabajador")
	public String ver() {
		return "registraTrabajador";
	}
	


	
	
}
