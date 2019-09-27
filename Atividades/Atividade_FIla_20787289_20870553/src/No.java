/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thauan
 */
public class No {

    public Cliente dado;
    public No next;

    public No(Cliente dd) {
        dado = dd;
        next = null;
    }

    public void displayNo() {
        System.out.print(dado);
    }

}
