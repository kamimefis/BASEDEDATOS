/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Lila
 */
public class TestEliminar {

    public TestEliminar() {
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String id= "id1";
        Dato d= new Dato("id1", "data");
        BaseDeDatos instance= new BaseDeDatos();  
        instance.agregar(d);
        boolean esperado= true;
        boolean obtenido= instance.eliminar(id);
        Assert.assertEquals(esperado, obtenido); 
    }
    
}
