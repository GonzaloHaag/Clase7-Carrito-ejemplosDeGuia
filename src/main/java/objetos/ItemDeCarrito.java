package objetos;

public class ItemDeCarrito {
    private Producto producto;
    private int cantidad;

    public ItemDeCarrito(Producto producto,int cantidad) {

        /*
         * Estoy obligando que en el constructor me llegue el producto y la
         * cantidad
         */
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
      /*
    Clase 9, excepciones y colecciones
     */
    public double precioDelItemSeguro() throws SinStockException {

        if(!this.producto.hayStockSuficiente(this.cantidad)){
            //Si no hay stock suficiente para cubrir la cantidad
            throw  new SinStockException(); //Largo la exepcion

        }
        return this.producto.getPrecio() * this.cantidad;

    }

    //Para obtener el precio de un item

    public double precioDelItem () {

        /*
         * Estoy accediendo al precio del producto y lo multiplico por la cantidad
         *
         */
        if(!this.producto.hayStockSuficiente(this.cantidad)){
            throw  new SinStockException2(); //Es una excpecion no chequeada, no estoy obligado a usar try catch
        }
        return this.producto.getPrecio() * this.cantidad;
    }

}
