#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId};

import java.sql.Connection;

import servicios.ConexionBaseDatosPostgresqlImplementacion;
import servicios.ConexionBaseDatosPostgresqlInterfaz;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

    	ConexionBaseDatosPostgresqlInterfaz cpi = new ConexionBaseDatosPostgresqlImplementacion();
    	
		try {
			Connection conexion = cpi.generaConexion();
			
			if(conexion != null) {
				System.out.println("CONEXION ESTABLECIDA");

				}
			
			
		} catch (Exception e) {
			System.err.println("[ERROR-Main] Se ha producido un error al ejecutar la aplicación: " + e);
		}
			
    }
}
