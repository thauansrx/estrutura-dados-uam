import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author thauan
 */
public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        FilaDinamica queue = new FilaDinamica();
        Cliente cliente = null;
        Caixa aux = new Caixa();

        int sorteio = -1;  //variavel que irá receber o valor aleatorio para verificar se chegou cliente
        int pos = -1;  //variavel para obter a posicao do caixa que esta livre, -1 é igual a nenhum caixa disponivel
        int i = 0; //contador de tempo de funcionamento
        int espera = 0; //variavel que ira armazenar o tempo de espera de todos clientes
        
        int constante = 21600; //variavel para teste, alterar segundos de trabalho

        
        for (i = 0; i < constante; i++) {
            sorteio = rand.nextInt(30);

            if (sorteio == 0) { //se chegar algum cliente, adiciona ele na fila
                cliente = new Cliente(i); //inicia cliente com a posicao (tempo) que ele entrou na fila.
                queue.enqueue(cliente);
                pos = aux.CaixaLivre();
                if (!queue.isEmpty() && pos != -1) {
                    aux.Operacao(aux.CaixaLivre(), queue.next().getOp(), i);
                    espera += queue.next().TempoEspera(i); //obtem o tempo de espera do cliente e soma com todos os outros.
                    System.out.println("caixa[" + pos + "]: " + " op " + queue.next().getOp() + " entrada: " + i);
                    queue.dequeue();
                }
            }

            pos = aux.CaixaLivre();
            if (pos == -1 && !queue.isEmpty()) {
//                System.out.println("Caixas ocupados, aguarde na fila");
            }

            if (pos != -1 && !queue.isEmpty()) {
                aux.Operacao(aux.CaixaLivre(), queue.next().getOp(), i);
                espera += queue.next().TempoEspera(i);
                System.out.println("caixa[" + pos + "]: " + " op " + queue.next().getOp() + " entrada: " + i);
                queue.dequeue();
            }

            //verificar o tempo que o caixa esta em operacao para poder liberar. 
            aux.TempoDecorrido(i);

        }

        System.out.println("\nFim do horario de funcionamento, ainda existem: " + queue.getSize() + " cliente(s) na fila.\n");

        // Se ainda existir clientes na fila ou se os caixas ainda estiverem ocupados.
        while (!queue.isEmpty() || aux.Ocupado()) {

            pos = aux.CaixaLivre();

            if (pos != -1 && !queue.isEmpty()) {
                aux.Operacao(aux.CaixaLivre(), queue.next().getOp(), i);
                espera += queue.next().TempoEspera(i);
                System.out.println("caixa[" + pos + "]: " + " op " + queue.next().getOp() + " entrada: " + i);

                queue.dequeue();
            } else if (pos == -1 && !queue.isEmpty()) {
//                    System.out.println("Caixas ocupados, aguarde na fila");
            }

            //verificar o tempo que o caixa esta em operacao para poder liberar. 
            aux.TempoDecorrido(i);

            i++; //incrementa em i para verificar o tempo extra trabalhado

        }

        //FIM DO PROGRAMA - IMPRIMIR RELATORIO CALCULANDO VALORES NECESSARIOS
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        double horarioTrabalho = (constante / 60) / 60; //converte segundos de trabalho em horas.
        int tempoExtra = (i - constante) / 60; //converte segundos extras em minutos
        espera = ((espera / aux.getCont()) / 60);  //obtem todos valores de espera de todos clientes, divide pelo total de clientes atendidos e converte em minutos

        String msg = "\n-----------------------------------------------------------  "
                + "\n                BANCO FILA DINAMICA               "
                + "\n                                    " + formatador.format(data)
                + "\nHoras trabalhadas: " + horarioTrabalho + "H"
                + "\nHorario extra de funcionamento: " + tempoExtra + " minutos"
                + "\nQuantidade de clientes atendidos hoje: " + aux.getCont()
                + "\nQuantidade de operacao Saque: " + aux.getContSaque()
                + "\nQuantidade de operacao Deposito: " + aux.getContDep()
                + "\nQuantidade de operacao Pagamento: " + aux.getContPay()
                + "\nTempo medio fila de espera: " + espera + " minutos."
                + "\n-----------------------------------------------------------  ";

        JOptionPane.showMessageDialog(null, msg);
        System.out.println(msg);
    }
}
// as três ultimas linhas devem conter a informação de que os caixas estão disponiveis. O tempo de trabalho é o total de segundos trabalhados