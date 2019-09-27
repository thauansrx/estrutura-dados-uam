public class FilaInteiro implements FilaInt {
    
    private static int[] vetorEstrutura;
    private int quantidade;
    private int inicio;
    private int fim;
    
    /*
        Construtor usado para efetuar o SETUP da instanciação da FILA.
    */
    public FilaInteiro(int tamanhoFila){
        vetorEstrutura = new int[tamanhoFila];
        quantidade = 0;
        inicio = -1;
        fim = -1;
    }
    
    @Override
    public void enqueue(int value) {        
        
        //Se está vazia
        if (isEmpty()) {
            inicio++;
            fim++;
            vetorEstrutura[inicio] = value;
            quantidade++;
        }
        else{
            if (!isFull()) { //Se não estiver cheia
                fim++;
                vetorEstrutura[fim] = value;
                quantidade++;
            }
            else{
                //Poderíamos lançar uma exception caso ela estivesse cheia ou mudar o método para 
                //retornar TRUE ou FALSE, TRUE caso conseguisse inserir e FALSE caso não fosse possível.
            }
        }
    }       

    @Override
    public int dequeue() {
        int valorRetorno = 0; //O NetBeans obriga a declarar com algum valor esta variável, isso não significa que esse valor desta linha
        //será retornado em algum momento, pois se a Fila estiver vazia, podemos retornar algum erro e o return ao final do método
        //só será alcançado se a fila não for vazia.
        
        if (isEmpty()) {
            //Poderiamos retornar uma exception para indicar que já está vazia
        }
        else{
            //Obtendo o primeiro da fila para que seja retornado.
            valorRetorno = vetorEstrutura[inicio];            
            //inicio == fim => há apenas 1 valor na fila, também pode ser quantidade == 1;            
            if (inicio == fim) {
                //Se há apenas um elemento na fila zerar tudo.
                inicio = -1;
                fim = -1;
                quantidade--;
            }
            else{
                //Caso contrário incrementar o valor da variável inicio e reorganizar a fila (trazer o segundo para o primeiro e assim por diante)
                inicio++;
                Reorganizar();
            }
        }
        return valorRetorno;
    }

    @Override
    public int front() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        //se inicio == -1 então está vazia, esta forma verifica e retorna o valor booleano da operação.
        return inicio == -1;
    }

    @Override
    public boolean isFull() {
        return fim == vetorEstrutura.length - 1;
    }

    @Override
    public int size() {
        return quantidade;
    }

    //Criei este método fora da interface, mas dentro da classe que a implementa para reorganizar o vetor após um DEQUEUE
    private void Reorganizar() {
        for (int i = inicio; i <= fim; i++) {
            vetorEstrutura[i-1] = vetorEstrutura[i];
        }
        //Como todos os valores foram uma casa para a esquerda, os ponteiros também devem ser corrigidos.
        inicio--;
        fim--;
    }
    
    //Método extra para exibir o estado da fila;
    public void ExibirFila(){
        if (!isEmpty()) {
             for (int i = inicio; i <= fim; i++) {
                System.out.print(vetorEstrutura[i] + " ");
            }
        }    
        System.out.println("");
    }
    
}