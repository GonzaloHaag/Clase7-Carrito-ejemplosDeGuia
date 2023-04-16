package objetosTest;

import Clase8_Herencia_Descuentos.Descuento;
import Clase8_Herencia_Descuentos.DescuentoFijo;
import Clase8_Herencia_Descuentos.DescuentoPorcentual;
import objetos.Producto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DescuentoTest {
    @Test
    public void productoAplicadoConDescuentoFijoVale100() {
        Producto alfajor = new Producto("Alfajor","AADD",150.0);
        /*
        Hay metodos que nunca defini pero son heredados
        de la clase object de java. Por ejemplo el
        toString o el equals
        alfajor.toString()
        */
        Descuento descuentoFijoDe50 = new DescuentoFijo();


        descuentoFijoDe50.setValor(50.0);

        Assertions.assertEquals(100.0,descuentoFijoDe50.valorFinal(alfajor.getPrecio()));



    }
    @Test
    public void productoConDescuentoPorcentualAplicadoVale100() {
        Producto alfajor = new Producto("Alfajor","ADDD",110.0);

        Descuento descuentoPorcentual10 = new DescuentoPorcentual();
        descuentoPorcentual10.setValor(0.1);
        Assertions.assertEquals(99.0,descuentoPorcentual10.valorFinal(alfajor.getPrecio()));

    }
}
