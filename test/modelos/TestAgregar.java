package modelos;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {

    public TestAgregar() {
    }

    @Test
    public void TestAgregar() {
        System.out.println("Agregar");
        Dato d = new Dato("id", "data");
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.agregar(d);
        Assert.assertEquals(esperado, obtenido);
    }

}
