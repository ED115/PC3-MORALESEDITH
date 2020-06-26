package com.redsocial.entidad;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/*
 * @Table--->Tabla
 * @Id------>Primary key
 * @Column-->Columna
 * GenerationType.IDENTITY-->Base de datos genera la pk
 */

@Entity
@Table(name = "Trabajador")
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "Trabajador")
	private int idTrabajador;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "sueldo")
	private String sueldo;
	
	
	@Column(name = "correo")
	private String correo;
	
	@Column(name = "fechaSalida")
	private String fechaSalida;
	
	
	
	@Column(name = "idcategoria")
	private String categoria;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fechaSalida")
	@DateTimeFormat(pattern = "yyyy-MM-dd") 
	private Date fechaSalidaDate;

	
	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getFechaSalidaDate() {
		return fechaSalidaDate;
	}

	public void setFechaSalidaDate(Date fechaSalidaDate) {
		this.fechaSalidaDate = fechaSalidaDate;
	}

	
	
	


		
	
}
