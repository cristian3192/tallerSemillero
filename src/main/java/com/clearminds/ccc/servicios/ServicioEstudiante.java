package com.clearminds.ccc.servicios;

import java.sql.*;

import com.clearminds.ccc.dtos.Estudiante;
import com.clearminds.ccc.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {

	public void insertarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Insertando Estudiante: " + estudiante);
		Statement stmt = null;
		try {
			stmt = getConexion().createStatement();

			String sql = "insert into estudiantes(nombre, apellido, edad) values('"+
					estudiante.getNombre()+"','"+estudiante.getApellido()+"',"+estudiante.getEdad()+")";
			System.out.println("Script: " + sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}

	}

	public void actualizarEstudiante(Estudiante estudiante) throws BDDException {
		abrirConexion();
		System.out.println("Actualizando Estudiante: " + estudiante);
		Statement stmt = null;

		try {
			stmt = getConexion().createStatement();
			String sql = "update estudiantes set nombre='"+estudiante.getNombre()+"', apellido='"+
					estudiante.getApellido()+"', edad="+estudiante.getEdad()+" where id="+estudiante.getId();

			System.out.println("Script: " + sql);

			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al actualizar estudiante");
		}
	}
}