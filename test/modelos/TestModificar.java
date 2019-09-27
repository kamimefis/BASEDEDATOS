package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {

    public TestModificar() {
    }
    
    @Test
    public void TestModificar(){
        System.out.println("Modificar");
        Dato d= new Dato("id", "data");
        BaseDeDatos instance= new BaseDeDatos();  
        instance.agregar(d);
        boolean esperado= true;
        d= new Dato("id", "data");
        boolean obtenido= instance.modificar(d);
        Assert.assertEquals(esperado, obtenido); 
    }
    
    
}
