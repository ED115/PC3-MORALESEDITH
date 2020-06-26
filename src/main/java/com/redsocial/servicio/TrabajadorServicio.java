package com.redsocial.servicio;

import java.util.List;
import java.util.Optional;

import com.redsocial.entidad.Trabajador;

public interface TrabajadorServicio  {

	
	public Optional<Trabajador> buscarAlumnoPorId(int id);
    public List<Trabajador> listaAlumno();
	public List<Trabajador> listaAlumnoPorNombre(String nom);

}
