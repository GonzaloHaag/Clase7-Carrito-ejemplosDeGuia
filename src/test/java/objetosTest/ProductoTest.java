package objetosTest;

import Clase8_Herencia_Descuentos.EjemploInterfazComprable;
import objetos.Producto;
import org.junit.jupiter.api.Assertions;

public class ProductoTest {

    public void productoAStringMuestraLeyendaCorrecta() {
        Producto alfajor = new Producto("Alfajor","AADD",150.0);
        Assertions.assertEquals("Alfajor; AADD; 150.0",alfajor.toString());
    }
    public void precioDelAlfajorEsDe200() {
        EjemploInterfazComprable alfajor = new Producto("Alfajor","AADD",150.0);
        alfajor.precioBase(); //Solo voy a poder ver este metodo ya que esta en la interfaz
    }
}
