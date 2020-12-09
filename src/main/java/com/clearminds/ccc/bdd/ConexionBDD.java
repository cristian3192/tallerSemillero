package com.clearminds.ccc.bdd;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.clearminds.ccc.excepciones.BDDException;

public class ConexionBDD {

	public static String leerPropiedad(String propiedad) {

		Properties p = new Properties();
		try {
			p.load(new FileReader("conexion.properties"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return p.getProperty(propiedad);
	}

	public static Connection obtenerConexion() throws BDDException {
		Connection con = null;
		String user = leerPropiedad("usuario");
		String password = leerPropiedad("password");
		String url = leerPropiedad("urlConexion");
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}
		return con;
	}

}
