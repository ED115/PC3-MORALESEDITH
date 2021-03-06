package com.redsocial.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.redsocial.entidad.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>  {

	
	@Query("select p from Modalidad p where p.nombre like :param")
	public abstract List<Categoria> buscaPorNombre(@Param("param")String filtro);

	@Query("select p from Modalidad p where p.deporte.idDeporte= :p1 and p.nombre like :p2 and  p.edadMinima<= :p3 and p.edadMaxima>= :p3")                                 
	public abstract List<Categoria> listaMoldalidad(@Param("p1")int idDeporte, @Param("p2")String nombre, @Param("p3")int edad);
}
