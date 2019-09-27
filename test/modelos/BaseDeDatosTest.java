
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lila
 */
public class BaseDeDatosTest {
    
    public BaseDeDatosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Listar method, of class BaseDeDatos.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        BaseDeDatos instance = new BaseDeDatos();
        ArrayList<Dato> esperado = new ArrayList<Dato>();
        ArrayList<Dato> obtenido = instance.Listar();
        Assert.assertEquals(esperado, obtenido);
        
    }

    /**
     * Test of agregar method, of class BaseDeDatos.
     */
    @Test
    public void testAgregar() {
         System.out.println("Agregar");
        Dato d = new Dato("id", "data");
        BaseDeDatos instance = new BaseDeDatos();
        boolean esperado = true;
        boolean obtenido = instance.agregar(d);
        Assert.assertEquals(esperado, obtenido);
        
    }

    /**
     * Test of modificar method, of class BaseDeDatos.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato d= new Dato("id", "data");
        BaseDeDatos instance= new BaseDeDatos();  
        instance.agregar(d);
        boolean esperado= true;
        d= new Dato("id", "data");
        boolean obtenido= instance.modificar(d);
        Assert.assertEquals(esperado, obtenido);
        
    }

    /**
     * Test of eliminar method, of class BaseDeDatos.
     */
    @Test
    public void testEliminar() {
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
