package objetosTest;

import objetos.CarritoDeCompra;
import objetos.ItemDeCarrito;
import objetos.Producto;
import objetos.SinStockException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarritoDeCompraTest {

    @Test
    public void carritoConUnItemNoTieneStock() throws SinStockException {
        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto alfajor = new Producto("Alfajor chocolate","73272",200.0);
        alfajor.setStock(1);
        ItemDeCarrito item = new ItemDeCarrito(alfajor,2);
        carrito.setItem1(item);

        /*
        Yo quiero ejecutar el metodo precioBaseSeguro
        Este test va a pasar si la excepcion es arrojada,
        si no es arrojada el test NO va a pasar
         */
        Assertions.assertThrowsExactly(SinStockException.class,() -> carrito.precioBaseSeguro());

    }

    @Test
    public void carritoConUnItemVale400() {
        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto alfajor = new Producto("Alfajor chocolate","73272",200.0);
        ItemDeCarrito item = new ItemDeCarrito(alfajor,2);
        carrito.setItem1(item);
        Assertions.assertEquals(400.0,carrito.precioBase());
    }

    @Test
    public void carritoConDosItemsVale500Collection() {
        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto alfajor = new Producto("Alfajor de chocolate","7488",200.0);
        alfajor.setStock(2); //Para ponerle un stock, si no no funciona

        ItemDeCarrito item = new ItemDeCarrito(alfajor,2);

        carrito.agregarItem(item);//Lo estoy agregando a la coleccion de carrito

        Producto gaseosa = new Producto("Gaseosa 1L","8989",100.0);

        gaseosa.setStock(1);

        ItemDeCarrito itemGaseosa = new ItemDeCarrito(gaseosa,1);

        carrito.agregarItem(itemGaseosa); //Lo estoy agregando a la coleccion de carrito

        Assertions.assertEquals(500.0,carrito.precioBaseList());

    }

    @Test
    public void carritoDeComprasConItemsDeCantMayorA2() {
        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto alfajor = new Producto("Alfajor de chocolate","7488",200.0);
        alfajor.setStock(3); //Para ponerle un stock, si no no funciona

        ItemDeCarrito item = new ItemDeCarrito(alfajor,3);

        carrito.agregarItem(item);//Lo estoy agregando a la coleccion de carrito

        Producto gaseosa = new Producto("Gaseosa 1L","8989",100.0);

        gaseosa.setStock(5);

        ItemDeCarrito itemGaseosa = new ItemDeCarrito(gaseosa,4);

        carrito.agregarItem(itemGaseosa); //Lo estoy agregando a la coleccion de carrito

        /*
        Ahora quiero probar el metodos de todosLosItemsTienenMasDe(int cant)
        en este caso 2...Dara true ya que el stock es 3 y 5
         */
        Assertions.assertTrue(carrito.todosLosItemsTienenMasDe(2));
        Assertions.assertTrue(carrito.algunItemTienenMasDe(3));
        Assertions.assertFalse(carrito.algunItemTienenMasDe(4)); //NINGUN ITEM TIENE MAS DE 4
        /*
        SI ALGUNA ASSERTIONS NO SE CUMPLE, EL TEST DEBERIA
        FALLAR
         */
    }
}
