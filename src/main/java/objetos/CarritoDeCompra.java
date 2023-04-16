package objetos;

import Clase8_Herencia_Descuentos.Descuento;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompra {
    /*
     * Atributo que va a ser la persona que esta comprando
     *
     * Mi atributo se va a llamar comprador y es de tipo Persona
     */
    private Persona comprador;

    private ItemDeCarrito item1;
    private ItemDeCarrito item2;
    private ItemDeCarrito item3;

    //UTILIZANDO COLECCIONES PARA PERMITIR MUCHOS ITEMS
    /*
    Ahora tengo una coleccion que se llama items
    que va a ser una coleccion List de ItemDeCarrito
    List es una interface, no una clase
    Siempre que tengo una coleccion como atributo de una
    clase la debo inicializar en el CONSTRUCTOR
     */
    private List<ItemDeCarrito> items;
    /*Siempre que tengo una coleccion como atributo de una
    clase la debo inicializar en el CONSTRUCTOR*/
    public CarritoDeCompra() {
        //La coleccion esta inicializada
        this.items = new ArrayList<>();

    }

    //Metodo para permitir agregar items a la coleccion
    public void agregarItem(ItemDeCarrito item) {
        /*
        Ahora quiero agregar el item que me llega por
        parametro a mi coleccion: utilizamos el .add
         */
        this.items.add(item);
    }
    //Metodo para eliminar item
    public void eliminarItem(ItemDeCarrito item) {
        /*
        Ahora para remover el item que me llega por
        parametro, utilizamos el .remove
         */
        this.items.remove(item);
    }
    //Metodo para saber si el item esta en la coleccion
    public boolean tenesItemDeCarrito(ItemDeCarrito item) {
        return this.items.contains(item);
        /*
        Devuelve true si esta en la coleccion, false si no
        esta
         */
    }
    //Metodo para saber la cantidad de items que tiene mi carrit
    public int cantDeItems() {
        //Devuelve un entero, utilizamos el .size();
        return this.items.size();
    }

    private Descuento descuento;





    public Persona getComprador() {
        return comprador;
    }

    public void setComprador(Persona comprador) {
        this.comprador = comprador;
    }

    public ItemDeCarrito getItem1() {
        return item1;
    }

    public void setItem1(ItemDeCarrito item1) {
        this.item1 = item1;
    }

    public ItemDeCarrito getItem2() {
        return item2;
    }

    public void setItem2(ItemDeCarrito item2) {
        this.item2 = item2;
    }

    public ItemDeCarrito getItem3() {
        return item3;
    }

    public void setItem3(ItemDeCarrito item3) {
        this.item3 = item3;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }
     /*
     TRABAJANDO CON LA COLECCION
      */
    public double precioBaseList() {
        double precio = 0.0;
        for(ItemDeCarrito item:this.items) {
            /*
            A cada item de mi coleccion le voy a pedir
            el precio
             */
            precio += item.precioDelItem();

            /*
            El metodo mapToDouble transforma la coleccion
            Por ejemplo si quiero una nueva coleccion
            pero solo con los precios de los items
            precio = this.items.stream().mapToDouble(item->item.precioDelItem()).sum();
            [500.0,800.0,7.0] coleccion de double, el .sum lo que hace
            es sumar los componentes de esa coleccion
            Esto se llama expresiones landan, se usan
            mucho en javascript. Son una forma
            acotada de escribir un metodo
             */
        }
        return precio;

    }

    //Usaremos el metodo mapToDouble
    //Crea una coleccion de numeros double(precios)
    public double precioBaseList2() {
        double precio = 0.0;
        precio = this.items.stream().mapToDouble(item->item.precioDelItem()).sum();
        /*
        Creara una nueva coleccion con los precios de los
        items y los sumara
        [500.0,800.0,7.0]....
         */
        return precio;
    }


    /*
     * CALCULAR PRECIO FINAL DEL CARRITO
     */

    /*
  Clase 9, excepciones y colecciones
   */
    public double precioBaseSeguro() throws SinStockException {
        double precio = 0.0;
        if(this.item1!=null) {
            precio += this.item1.precioDelItemSeguro();
        }
        if(this.item2!=null) {
            precio += this.item2.precioDelItemSeguro();
        }
        if(this.item3!=null) {
            precio += this.item3.precioDelItemSeguro();
        }
        return precio;
    }
    public double precioBase() {

        double precio = 0.0;
        if(this.item1 != null) { //Si tiene algun valor guardado

            /*
             * Estoy sumando en la variable precio lo que tengo
             * en precioDel item, que lo calcule en ItemDeCarrito
             */
            precio += this.item1.precioDelItem();



        }
        if(this.item2 != null) { //Si tiene algun valor guardado

            /*
             * Estoy sumando en la variable precio lo que tengo
             * en precioDel item, que lo calcule en ItemDeCarrito
             */
            precio += this.item2.precioDelItem();

        }
        if(this.item3 != null) { //Si tiene algun valor guardado

            /*
             * Estoy sumando en la variable precio lo que tengo
             * en precioDel item, que lo calcule en ItemDeCarrito
             */
            precio += this.item3.precioDelItem();

            //Al item3 no llegara porque es nulo, no le asignamos nada

        }

        return precio;
    }
    public double precioFinal() {
        if (this.descuento == null) {
            return this.precioBase();
        } else {
            /*
            POLIMORFISMO
            Dos o mas objetos son polimorficos para un
            tercero cuando este los utiliza de forma
            indistinta
             */
            return this.descuento.valorFinal(this.precioBase());
        }
    }
    public List<String> nombresDeProductos() {
        /*
        Quiero los nombres de todos los items involucrados
        utilizaremos un map generico
         */
        List<String> nombres = this.items.stream().map(i->i.getProducto().getNombre()).toList();
        return nombres;
    }
    /*
    Metodo filter
     */
    public List<ItemDeCarrito> itemsConMasDe(int cant) {
        /*
            Quiero quedarme con los items que sean mayor
            a la cantidad que me llega por parametro

            Filter evalua la condicion sobre cada uno de
            los elementos, y solamente se queda con los elementos
            que se dan true, y descarta a los que dan false
         */
        return this.items.stream().filter(i->i.getCantidad() > cant).toList();


    }

    public boolean todosLosItemsTienenMasDe(int cant) {
        /*
        all match funciona como el operador &&
        debe reducirse a algo que devuelve un booleano
        Cuando el allMatch encuentra un false, termina
        la ejecucion y sale del flujo.
        Lo que hace es fijarse si todos los elementos
        cumplen con esa condicion, si uno no cumple es
        false
        */
        return this.items.stream().allMatch(item -> item.getCantidad() > cant);
    }
    public boolean algunItemTienenMasDe(int cant) {
        /*
        El metodo anyMatch solo devuelve true si
        encuentra al menos uno verdadero. Si va encontrando
        todos falsos va a ir evaluando hasta el final.
         */
        return this.items.stream().anyMatch(item->item.getCantidad() > cant);
    }


}
