package modelos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {

    @Test
    public void TestListar() {
        System.out.println("Listar");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList<Dato> esperado = new ArrayList<Dato>();
        ArrayList<Dato> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
    }

}
