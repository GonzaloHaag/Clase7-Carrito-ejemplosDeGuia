package objetosTest;

import objetos.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonaTest {

    /*
    Tenemos un metodo de presentate, vamos a querer
    testear que efectivamente diga Hola soy tal
    al presentarse
     */
    //LOS METODOS DE LOS TEST SIEMPRE VAN A SER PUBLICOS Y TIPO VOID
    @Test //Significa que el metodo de abajo es de testeo
    public void juanPerezSePresentaDeFormaCorrecta() {
        /*
        Cuando yo lo ejecuto, lo ejecutara jUnit
         */
        Persona UnaPersona = new Persona("Juan"," Perez"); //Recibe dos parametros

        /*
        El assertEquals acepta dos parametros: Lo que
        yo quiero que pase y lo que realmente esta pasando
        Lo que realmente esta pasando esta en el metodo
        presentate()
         */
        Assertions.assertEquals("Mi nombre es Juan Perez",UnaPersona.presentate());



    }

}
