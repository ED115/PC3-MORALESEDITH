package com.redsocial.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.entidad.Trabajador;
import com.redsocial.repositorio.TrabajadorRepositorio;

@Service
public class TrabajadorServicioImpl implements TrabajadorServicio{

	@Autowired
	private TrabajadorRepositorio repositorio; 
	
	
	public Optional<Trabajador> buscarTrabajadorPorId(int id) {
		return repositorio.findById(id);
	}

  public List<Trabajador> listaTrabajador() {
		return repositorio.findAll();
	}

	public List<Trabajador> listaTrabajadorPorNombre(String nom) {
		return repositorio.buscaPorNombre(nom);
	}

	@Override
	public Optional<Trabajador> buscarAlumnoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trabajador> listaAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trabajador> listaAlumnoPorNombre(String nom) {
		// TODO Auto-generated method stub
		return null;
	}


}


