/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab202ap2
 */
public class lista {

    private No inicio, fim;
    private int size;

    public lista() {
        this.inicio = null;
        this.fim = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return inicio == null;
    }

    public void enqueue(int dado) {
        No newNo = new No(dado);
        if (inicio == null) {
            inicio = newNo;
            fim = inicio;
        } else {
            fim.next = newNo;
            fim = newNo;

        }

        size++;
    }

    public int remover(int dado) {
        if (isEmpty()) {
            return -1;
        }
        
        No no = inicio;
        No anterior= inicio;

        while (no !=null) {            
             if (no.dado==dado) {
                anterior= no.next;
            }
            
            anterior=no;
            no= no.next;
        }
        

        return no.dado;        // retorna o dado​
    }

}
