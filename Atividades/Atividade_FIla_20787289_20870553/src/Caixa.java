
/**
 *
 * @author thauan
 */
public class Caixa {

    private int caixa[] = {0, 0, 0}; //iniciando 3 caixas com valor 0 = desocupado, 1 = ocupado. 
    private int aux[] = {0, 0, 0};  //vetor auxiliar para informar em qual 'segundo' o caixa entrou em operacao 
    private int cont = 0; //Contador de clientes atendidos
    private int contSaque, contPay, contDep;

    //Metodo para verificar qual caixa esta vazio, retorna a posição do vetor correspondente ao caixa vazio
    public int CaixaLivre() {
        int pos = -1;
        for (int i = 0; i < caixa.length; i++) {
            if (caixa[i] == 0) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    //Metodo para veririfcar se o caixa esta ocupado, retorna true se existir pelo menos 1 em operacao
    public boolean Ocupado() {
        int pos = -1;
        for (int i = 0; i < caixa.length; i++) {
            if (caixa[i] != 0) {
                pos = 1;
                break;
            }
        }
        return pos != -1;
    }

    //metodo que irá receber o valor correspondente ao caixa vazio para coloca-lo em operacao, 
    // a operacao que o caixa ira fazer e o momento que o cliente entrou
    public void Operacao(int i, int j, int k) {
        aux[i] = k;

        this.cont++;
        try {
            switch (j) {
                case 2:
                    caixa[i] = 120;
                    this.contPay++;
                    break;
                case 1:
                    caixa[i] = 90;
                    this.contDep++;
                    break;
                case 0:
                    caixa[i] = 60;
                    this.contSaque++;
                    break;
                default:
                    break;
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Caixa inexistente");
        }

    }

//Metodo que verifica se o tempo que o caixa esta em operacao corresponde ao tempo da transacao, 
    //ele recebe o valor correspondente ao caixa e o 'segundo' no momento em que foi chamado
    // e faz a diferenca  entre o tempo atual o tempo em que o caixa entrou em operacao
    // para saber se o valor é igual a o valor do 'caixa' onde tem a informacao da operacao. Se true, o caixa é liberado. 
    public boolean tempoOperacao(int i, int j) {
        int total = j - aux[i];
        return total == caixa[i];

    }

    //Set caixa e vetor auxiliar, liberando para o proximo cliente da fila
    public void LiberaCaixa(int i) {
        caixa[i] = 0;
        aux[i] = 0;
    }

    
     //verificar o tempo que o caixa esta em operacao para poder liberar. 
    public void TempoDecorrido(int i) {
        for (int j = 0; j < 3; j++) {
            switch (getCaixa(j)) {
                case 120:
                    if (tempoOperacao(j, i)) {
                        LiberaCaixa(j);
                        System.out.println("Caixa[" + j + "] livre, no tempo: " + i+"s");
                    }
                    break;
                case 90:
                    if (tempoOperacao(j, i)) {
                        LiberaCaixa(j);
                        System.out.println("Caixa[" + j + "] livre, no tempo: " + i+"s");
                    }
                    break;
                case 60:
                    if (tempoOperacao(j, i)) {
                        LiberaCaixa(j);
                        System.out.println("Caixa[" + j + "] livre, no tempo: " + i+"s");
                    }
                    break;
                default:
                    break;
            }
        }
    }

    public int getCont() {
        return cont;
    }

    public int getContSaque() {
        return contSaque;
    }

    public int getContPay() {
        return contPay;
    }

    public int getContDep() {
        return contDep;
    }

    public int getCaixa(int i) {
        return caixa[i];
    }

}
