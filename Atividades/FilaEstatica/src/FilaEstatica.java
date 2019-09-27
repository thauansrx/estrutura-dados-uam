/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lab202ap2
 */
public class FilaEstatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                FilaInteiro fila = new FilaInteiro(10);
               
        fila.enqueue(10);
        fila.ExibirFila();
        
        fila.dequeue();
        fila.ExibirFila();
        
        fila.enqueue(103);
        fila.ExibirFila();
        fila.enqueue(120);
        fila.ExibirFila();
        fila.enqueue(150);
        fila.ExibirFila();
        fila.dequeue(); //SAI O 103;
        fila.enqueue(110);
        fila.ExibirFila();
    }
    
}
