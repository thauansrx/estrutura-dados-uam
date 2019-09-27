import java.util.Random;
public class listaLinear implements iListaLinear {
   int listaTamanho = 0;
   int inicio = -1,fim = -1;
   int vetor[] = null;
   private int vetor1[];
   private int vetor2[];
   private int vetor3[];
   private int vetor4[];
   private int vetorResultado[];
   private int vetorResultado2[];
   public listaLinear(){
       
   }
   public listaLinear(int tamanhoVetor){
   
       vetor= new int [tamanhoVetor];
   }
   public void NovaListaLinear(int num1, int num2){
       this.vetor1 = new int[num1];
       this.vetor2 = new int[num2];
   }
   
   public void novaListaInter(int num5, int num6){
       this.vetor3 = new int[num5];
       this.vetor4 = new int[num6];
       
   }
   
   public void inter(){
       vetorResultado2 = new int[vetor3.length + vetor4.length];
       for(int k = 0; k < vetor3.length; k++){
           for(int l = 0; l < vetor4.length; l++){
               if(vetor3[k] == vetor4[l]){
                   vetorResultado2[k] = vetor3[k];
                   System.out.print(vetorResultado2[k] + " ");
               }
           }         
       }
   }
   
   public void popularLista(){
       Random random = new Random();
       System.out.print("Lista 1: ");
       for(int i=0; i < vetor1.length; i++){
           vetor1[i]= random.nextInt(10);
           System.out.print(vetor1[i] + " ");
       }
       System.out.print("\nLista 2: ");
        for(int i=0; i < vetor2.length; i++){
           vetor2[i]= random.nextInt(10);
           System.out.print(vetor2[i] + " ");
       }
    }
   
   public void popularLista2(){
       Random random = new Random();
       System.out.print("Lista 1: ");
       for(int i=0; i < vetor3.length; i++){
           vetor3[i]= random.nextInt(10);
           System.out.print(vetor3[i] + " ");
       }
       System.out.print("\nLista 2: ");
        for(int i=0; i < vetor4.length; i++){
           vetor4[i]= random.nextInt(10);
           System.out.print(vetor4[i] + " ");
       }
    }
   
   public void concatenarListas(){
       int tamanho = vetor1.length + vetor2.length;
       vetorResultado = new int[tamanho];
       
       for(int i = 0; i < vetor1.length; i++){
           vetorResultado[i] = vetor1[i];
       }
       for(int i = 0; i < vetor2.length; i++){
           vetorResultado[vetor1.length+i] = vetor2[i];
       }
       
   }
    public void imprime(){
         for(int i = 0; i < vetorResultado.length; i++){
             System.out.print(vetorResultado[i] + " ");
         }           
       }
       
   
   
    @Override
    public boolean inserir(int valor) {
        if (listaCheia()) {
            return false;
        } else {
            if (listaVazia()) {
                inicio++;
                vetor[inicio] = valor;
                fim = inicio;
                listaTamanho++;
            }
        }
        return true;  
    }

    @Override
    public int remover(int indice) {
        int aux = 0;
        if(listaVazia()){
            return -1;
        }else{
            if(indice < listaTamanho){
                aux = vetor[indice];
                for(int i = indice; i < listaTamanho; i++){
                    vetor[indice] = vetor[indice+1];                         
                }
                fim--;
                listaTamanho--;
                return aux;                
            }
            else{
                return -1;
            }
        }
    }

    @Override
    public int substituir(int novoValor, int posicao) {
        int aux =0;
        if(listaVazia()){
            return -1;
        }else{
            if(posicao < listaTamanho && posicao>=0){
                aux = vetor[posicao];
                vetor[posicao]=novoValor;
                
                return aux;                
            }
            else{
                return -1;
            }
        }
        
        
    }

    @Override
    public int tamanho() {
      return listaTamanho;
    }

    @Override
    public boolean listaVazia() {
        return listaTamanho == 0;
    }

    @Override
    public boolean listaCheia() {
        return vetor.length == listaTamanho;
    }

    
    
}
