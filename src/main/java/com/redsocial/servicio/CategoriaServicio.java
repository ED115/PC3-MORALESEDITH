package com.redsocial.servicio;

import java.util.List;

import com.redsocial.entidad.Categoria;

public interface CategoriaServicio {


	
	public List<Categoria> listaCategoria();
	public List<Categoria> listaCategoriaPorNombre(String nom);
	public static List<Categoria> listaCategoria(int idCategoria) {
		// TODO Auto-generated method stub
		return null;
	}

}
