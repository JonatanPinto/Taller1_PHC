package hibernate.principal;

import hibernate.conexion.CrearConexion;

public class Principal {

	public static void main(String[] args) {
		CrearConexion.closeSessionFactory();
	}

}