package Clase8_Herencia_Descuentos;

public class DescuentoFijo extends Descuento {
    /*
   Esta clase esta obligada a tener el metodo
   valorFinal ya que esta marcado como metdoo abstracto ,
    si no no compila
    */
    @Override //Anotaciones
    public Double valorFinal(Double valorInicial) {
        return valorInicial - super.valor;
        /*
        Pàra acceder a un atributo que esta definido
        en la super clase Descuento vamos a tener que
        llamarlo como super.nombreAtributo. En este caso
        valor esta definido en Descuento como protected
         */
    }
    public void metodoA() {

    }

}
