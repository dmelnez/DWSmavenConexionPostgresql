package servicios;

import java.sql.Connection;

public interface ConexionBaseDatosPostgresqlInterfaz {
	public Connection generaConexion();
}
