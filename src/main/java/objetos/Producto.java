package objetos;

import Clase8_Herencia_Descuentos.EjemploInterfazComprable;

public class Producto implements EjemploInterfazComprable {
    /*
    Estamos diciendo que la clase producto implementa
    la interfaz. Esta obligada a tener los metodos que
    se encuentran dentro de esa interfaz
    Una clase puede implementar 0 , 1 o muchas interfaces.

     */
    private String nombre;
    private String codigo;
    private double precio;

    /*
    Clase 9, excepciones y colecciones
     */
    private int stock;


    //Metodo constructor

    public Producto(String nombre, String codigo, double precio) {
        //Significa que cuando lo vamos a instanciar tendremos que pasarle estas 3 variables

        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }



    //Generamos los metodos setters y getters para cada uno:

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
      /*
    Clase 9, excepciones y colecciones
     */
    public boolean hayStockSuficiente(int cantidad) {

        /*
        Voy a verificar si mi stock es mayor o igual
        a la cantidad que me estan pidiendo
         */
        return this.stock >= cantidad;
    }

    @Override
    public String toString() {
        /*
        Estamos redefiniendo el metodo toString,
        asi se debe hacer
         */
        return this.nombre + "; " + this.codigo + "; " + this.precio;
    }

    @Override
    public Double precioBase() {
        return null;
    }
}
