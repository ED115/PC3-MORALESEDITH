package com.redsocial.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.redsocial.repositorio.CategoriaRepositorio;

@Service
public class Categoria implements CategoriaServicio{

	@Autowired
	private CategoriaRepositorio repositorio;


	public List<com.redsocial.entidad.Categoria> listaCategoria() {
		return repositorio.findAll();
	}

	public List<com.redsocial.entidad.Categoria> listaCategoriaPorNombre(String nom) {
		return repositorio.buscaPorNombre(nom);
	}

	


}


