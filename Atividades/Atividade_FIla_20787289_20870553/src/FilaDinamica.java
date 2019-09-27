/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thauan
 */
public class FilaDinamica {

    private No inicio, fim;
    private int size;

    public FilaDinamica() {
        inicio = null;      //Fila vazia
        fim = null;
        size = 0;
    }

    public boolean isEmpty() {
        // true se a Fila está vazia
        return (inicio == null);
    }

    public void enqueue(Cliente dd) {
        No newNo = new No(dd);
        if (inicio == null) {
            inicio = newNo;
            fim = inicio;
        } else {
            fim.next = newNo;
            fim = newNo;
        }
        size++;

    }

    public void dequeue() {      // remove do inicio da fila                         
        if (!isEmpty()) { //se estiver vazia retorna -1

            No temp = inicio;
            // move o topo para o prox nó
            inicio = inicio.next;
            if (inicio == null) {
                fim = null;
            }
            size--;
        }

    }

    public void display() {
        if (isEmpty()) {
            System.out.print("Fila vazia.");
        } else {
            No atual = inicio;            // do inicio
            while (atual != null) {      // até o final
                // exibe a informação do nó
                atual.displayNo();
                // move para o proximo nó     
                atual = atual.next;
            }
            System.out.println();
        }
    }

    // utilizado para retornar o primeiro da fila, retorna o objeto cliente para poder utilizar os metodos. 
    public Cliente next() {
        No temp = inicio;
        if (inicio == null) {
            fim = null;
        }
        return temp.dado;
    }

    //retorna o tamanho da fila 
    public int getSize() {
        return size;
    }

}
