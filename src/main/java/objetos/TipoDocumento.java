package objetos;

public enum TipoDocumento {
    /*
	 * Los enumerados contienen valores fijos y finitos.
	 * Esto sirve para los documentos, ya que es poco probable que cambien el DNI
	 * o pasaporte..
	 *
	 * Los enumerados van en mayuscula y separados por coma(,)
	 *
	 * Si tienen dos palabras van separadas por_
	 *
	 * Para utilizar el enum tipoDocumento:
	   public TipoDocumento tipoDocumento;
	 */

    DNI,
    CEDULA,
    LIBRETA_ENROLAMIENTO,
    PASAPORTE,
    CUIT_CUIL
}
