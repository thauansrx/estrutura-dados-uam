/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalineardojo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thauan
 */
public class ListaInteirosTest {
    
    public ListaInteirosTest() {
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
     * Test of inserir method, of class ListaInteiros.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        int valor = 50;
        ListaInteiros instance = new ListaInteiros(10);
        
        assertEquals(0, instance.tamanho());
        
        //TESTE INSERIR
        boolean expResult = true;
        boolean result = instance.inserir(valor);
        assertEquals(expResult, result);
        
        
        assertEquals(1, instance.tamanho());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of remover method, of class ListaInteiros.
     */
    @Test
    public void testRemover() {
        System.out.println("remover");
        int indice = 0;
        ListaInteiros instance = new ListaInteiros(10);
        assertEquals(0, instance.tamanho());
        
        
        boolean retorno = instance.inserir(30);
        
        assertEquals(true, retorno);
        
        int remove = instance.remover(0);
        assertEquals(30, remove);
        
        assertEquals(0, instance.listaTamanho);
        
        
        
       
        
        
    }

    /**
     * Test of substituir method, of class ListaInteiros.
     */
    @Test
    public void testSubstituir() {
        System.out.println("substituir");
        int novoValor = 0;
        int posicao = 0;
        ListaInteiros instance = new ListaInteiros(10);
        assertEquals(0,instance.tamanho());
        boolean result = instance.inserir(5);
        assertEquals(true,result);
        assertEquals(1,instance.tamanho());
        
        int sub = instance.substituir(10, 0);
        assertEquals(5,sub);
        assertEquals(1,instance.tamanho());
        
        }

    /**
     * Test of tamanho method, of class ListaInteiros.
     */
    @Test
    public void testTamanhoListaVazia() {
        System.out.println("Inicio do teste de Lista Vazia");
        ListaInteiros instance = new ListaInteiros(10);
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals("Acerto mizeravi",expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testTamanhoListaContem1() {
        System.out.println("Inicio do teste de Lista Vazia");
        ListaInteiros instance = new ListaInteiros(10);
        int expResult = 0;
        int result = instance.tamanho();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    
    /**
     * Test of listaVazia method, of class ListaInteiros.
     */
    /*@Test
    public void testListaVazia() {
        System.out.println("listaVazia");
        ListaInteiros instance = new ListaInteiros();
        boolean expResult = false;
        boolean result = instance.listaVazia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of listaCheia method, of class ListaInteiros.
     */
    /*@Test
    public void testListaCheia() {
        System.out.println("listaCheia");
        ListaInteiros instance = new ListaInteiros();
        boolean expResult = false;
        boolean result = instance.listaCheia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
