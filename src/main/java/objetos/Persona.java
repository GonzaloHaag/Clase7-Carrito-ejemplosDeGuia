package objetos;

public class Persona {
    /*Sentencia para crear una clase: public class NombreClase
    Las clases van en singular: Persona y primer letra en Mayuscula
    ACA SOLO SE ESCRIBE EL MOLDE, LA CLASE LA VAMOS A INSTANCIAR EN TEORIA, QUE ES
    MI FUNCION PRINCIPAL(MAIN)
     */

    /*
    ATRIBUTOS DE LA CLASE PERSONA :
    Si yo pondria private String nombre; ese Atributo solo lo podria
    utilizar en la clase Persona y no en las otras clases
    Siempre los atributos van en PRIVADOS(private)
     */
    private String nombre;
    private String apellido;

    private int cantDiasPresentes;
    private TipoDocumento tipoDocumento; //enum de tipoDocumento
    private String numeroDocumento;
    public String setNumeroDocumento;

    /*
    Metodo CONSTRUCTOR de la clase Persona:
    con parametros
     */
    public Persona(String nombre,String apellido) { //Recibe el nombre y apellido
        //Lleva exactamente el nombre de la clase
        /*
        En el metodo constructor se escriben los CODIGOS DE INICIALIZACION
		 DE LAS VARIABLES DE UN OBJETO
         */
        this.cantDiasPresentes = 0;
        this.nombre = nombre;
        this.apellido = apellido;
        //Edad no, porque varia todos los años
    }

    /*
    METODOS DE LA CLASE PERSONA
     */
    public String presentate() {
        //Siempre es un verbo..devuelve un string, es como una funcion
        /*
         * La palabra this hace referencia a todos los atributos que tiene la
         * clase Persona. Hace referencia al objeto al momento de la ejecucion
         *
         * Al poner this estamos haciendo referencia al atributo
         */
        return "Mi nombre es " + this.nombre + "" + this.apellido;
    }
    /*
     * Ahora al tener mis atributos en privado, necesito dos metodos: los setters
     * y getters
     *
     * Vamos a source y generar getters and setters:
     */

    public String getNombre() {

        /*
         * Los get retorna el valor que tiene el atributo nombre o apellido o lo
         * que sea
         */
        return nombre;
    }


    public void setNombre(String nombre) {

        /*
         * Los metodos setters no devuelven nada, reciben un valor
         * y se los asigna a su atributo (nombre en este caso)
         */
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNumeroDocumento() {
        return numeroDocumento;
    }


    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    public int getCantDiasPresentes() {
        return cantDiasPresentes;
    }


    public void setCantDiasPresentes(int cantDiasPresentes) {
        this.cantDiasPresentes = cantDiasPresentes;
    }


    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }


    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


}
