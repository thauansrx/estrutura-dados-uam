/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Racional;

/**
 *
 * @author Thauan Trindade

public class RacionalPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Racional a = new Racional(2, 3);
        Racional b = new Racional(2, 4);

        System.out.println(a.multiplicar2(b).toString());  // chama o metodo multiplicar 
        a.multiplicar(b);  // altera o valor do objeto A 

        System.out.println(a.multiplicar2(b).toString()); // chama o metodo multiplicar com o novo valor de A

        Racional c = new Racional(2, 3);
        Racional d = new Racional(2, 4);
        System.out.println(c.soma(d).toString());   
        System.out.println(c.subtrair(d).toString());

    }

}
