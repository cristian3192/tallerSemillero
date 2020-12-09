package com.clearminds.ccc.servicios;

import java.sql.Connection;
import java.sql.SQLException;

import com.clearminds.ccc.bdd.ConexionBDD;
import com.clearminds.ccc.excepciones.BDDException;

public class ServicioBase {

	Connection conexion = null;

	public void abrirConexion() throws BDDException {
		conexion = ConexionBDD.obtenerConexion();
	}

	public void cerrarConexion() {

		try {
			if (conexion != null) {
				conexion.close();
				System.out.println("Conexión Cerrada");
			} 
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexión");
		}
	}

	public Connection getConexion() {
		return conexion;
	}

	public void setConexion(Connection conexion) {
		this.conexion = conexion;
	}
	
	

}
