package org.example;

import objetos.*;

/**
 * Hello world!
 *
 */
public class App 
{

    /*
         PARA CREAR UN MAVEN PROJECT :  FILE , NEW PROJECT Y NEW ARTCHTYPE, COLOCAMOS EL NOMBRE
         Y EN LA SECCION DE OPCIONES PONEMOS LA QUE AL FINAL DICE QUICKSTART Y CREATE.
         En pom.xml tendre las dependencias, ahi debo instalar la de junit
		 * A partir de ahora mis proyectos en maven voy a empezar a crear las clases
		 * o paquetes dentro de maven-proyecto(o el nombre q tenga mi proyecto maven)
		 * y src/main/java(dentro de esta carpeta main iran todos mis archivos)
		 *
		 * En la carpeta src/test/java estara mi test
		 *
		 * Para realizar un testing necesitamos una dependencia(MAVEN en este caso)
		 *
		 * TESTING :
		 * Verificacion dinamica de la adecuacion del Sistema a los requerimientos/
		 * requisitos.
		 *
		 * Es una actividad en la cual un Sistema o componente de software es
		 * ejecutado, bajo condiciones especificas, para que los resultados de dicha
		 * ejecucion sean observados y registrados.
		 *
		 * ● El testing busca encontrar fallas en el producto.
           ● Busca hacerlo lo más rápido y barato posible (busca la eficiencia).
           ● Busca encontrar la mayor cantidad de fallas.
           ● Intenta no detectar fallas que en realidad no lo son.
           ● Pretende encontrar las fallas más importantes.

           Una prueba es exitosa si encuentra fallas
           Nosotros utilizaremos las pruebas Unitarias
           Estos tests se realizan sobre unidades de codigo claramente definidas
           Se recomienda hacer un test por cada metodo o para cada funcion
           para probar que parte aislada funcion de forma correcta


           jUnite es un framework de testing unitario para Java

           Instalarmos el framework de jUnite como dependencia en nuestro archivo
           xml

             <dependencies>
           <dependency>
	         <groupId>org.junit.jupiter</groupId>
	         <artifactId>junit-jupiter-api</artifactId>
	         <version>5.9.2</version>
	         <scope>test</scope>
             </dependency>
               </dependencies>



		 *
		 TESTING EN INTELIJ IDEA
		 Vamos a la carpeta test, borramos la appTest
         Creo un package con el nombrepackageTest
         y luego las clases que quiero testear
         por ejemplo PersonaTest
		 */
    public static void main( String[] args )
    {

        /*
         * Las clases generan un nuevo tipo de dato complejo, y son considerados
         * complejos...En este caso estoy generando un tipo de dato Persona
         */

        //EL CONSTRUCTOR ME OBLIGA A PASARLE DOS PARAMETROS:NOMBRE Y APELLIDO
       // Persona unaPersona = new Persona("Gonzalito","Haag"); //ESTOY INSTANCIANDO LA CLASE PERSONA



        /*
         * Ahora con los atributos en privado debo modificar el nombre en
         * setNombre y mostrarlo con getNombre
         */
        //unaPersona.setTipoDocumento(TipoDocumento.DNI);/*Utilizando el enum TipoDocumento*/
        //unaPersona.tipoDocumento = tipoDocumento.DNI; >>YA NO SE USA


        //unaPersona.setTipoDocumento(TipoDocumento.DNI); //Estoy accediendo a DNI y lo asigno a tipoDocumento

        /*
         * Ahora estoy asignando valores a esos atributos de la clase Persona
         *  en particular...
         */


        /*Si no tendria los parametros en el constructor, tendria que llamar asi:
		 * unaPersona.nombre = "Gonzalito";
		unaPersona.apellido = "Haag";*/


        /*
         * Ahora quiero llamar al metodo presentate de la clase Persona
         * NombreDel obejeto.nombreMetodo() --> Recordar que puedo enviarle parametros
         * como una funcion
         *
         * El operador . nos permite acceder a los atributos y metodos de una clase
         */

        //System.out.println(unaPersona.presentate());

        //EL CONSTRUCTOR ME OBLIGA A PASARLE DOS PARAMETROS:NOMBRE Y APELLIDO
        //Persona otraPersona = new Persona("Sofia","Peralta");

        //System.out.println(otraPersona.presentate());


        //Persona unaPersonaMas = new Persona ("LUCAS","BRISSIO");

        //unaPersonaMas.setNumeroDocumento("321213321213312"); //Le cambio el valor
        //unaPersonaMas.getNumeroDocumento(); //Muestro el valor


        //AQUI COMIENZA EL EJERCICIO DEL CARRITO - Creo 2 productos pasandole los parametros solicitados(3 si o si)


        //Producto cepillo = new Producto("Cepillo de dientes", "7890", 550.0);
        //Producto pastaDientes = new Producto("Pasta de dientes","8000", 625.0);

        //ItemDeCarrito cepillos = new ItemDeCarrito(cepillo,5); //Le paso el producto y la cantidad
        //ItemDeCarrito pastasDeDientes = new ItemDeCarrito(pastaDientes,3);


        //CarritoDeCompra carritoDeLalo = new CarritoDeCompra();

        //carritoDeLalo.setComprador(unaPersona); //Una persona tiene guardado gonzalito haag

        //carritoDeLalo.setItem1(cepillos); //modifican el valor, le guardo los cepillos y la cantidad
        //carritoDeLalo.setItem2(pastasDeDientes);

        //System.out.println("Precio final del carrito: " + carritoDeLalo.precioBase());
        CarritoDeCompra carrito = new CarritoDeCompra();
        Producto alfajor = new Producto("Alfajor de chocolate","7532231",200.0);
        alfajor.setStock(1);
        ItemDeCarrito item = new ItemDeCarrito(alfajor,2);
        carrito.setItem1(item);

        try{
            double precioDelCarrito = carrito.precioBaseSeguro();
            System.out.println(precioDelCarrito);
        }
        catch(SinStockException e) {
            System.out.println("No tenes stock suficiente");
        }

        double precioDelCarrito = carrito.precioBase();
        /*
        Aca ocurre una excepcion, pero nunca la trate, no
        estoy obligado a poner try catch, pero no es
        buena practica porque sigue compilando

         */
        System.out.println(precioDelCarrito);

    }
}
