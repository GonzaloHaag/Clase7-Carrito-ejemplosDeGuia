package Clase8_Herencia_Descuentos;

public abstract class Descuento {

    /*
    Los metodos abstractos solo pueden ser definidos
    en las clases abstractas
    Una clase abstracta es una clase que no puede
    ser instanciada, solamente heredada
     */

    protected Double valor; //Atributo valor
    /*
    Metodo protejido, para poder utilizarlo
     */

    /*
    Los metodos abstractos en las clases abstractas
    no llevan cuerpo {}
     */
    public abstract Double valorFinal(Double valorInicial); //Metodo abstracto

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void metodoC() {

    }
}
