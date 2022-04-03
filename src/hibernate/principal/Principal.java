package hibernate.principal;

import java.util.List;

import hibernate.conexion.CrearConexion;

public class Principal {

	public static void main(String[] args) {
		CrearConexion.closeSessionFactory();
	}

}