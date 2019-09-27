
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thauan
 */
public class Cliente {

    private int op;
    private int entrada;
    private int espera;
    protected Random rand = new Random();

    //construtor de cliente que recebe como parametro o momento em que ele entrou no banco.  
    public Cliente(int i) {
        this.op = rand.nextInt(3);
        this.entrada = i;
    }

    public int getOp() {
        return op;
    }

    //calcula o tempo de espera, recebe como parametro a hora de entrada do cliente e faz a diferenca 
    // com o tempo que ele foi atendido.
    public int TempoEspera(int i) {
        return i - entrada;
    }

    public int getEspera() {
        return espera;
    }

}
