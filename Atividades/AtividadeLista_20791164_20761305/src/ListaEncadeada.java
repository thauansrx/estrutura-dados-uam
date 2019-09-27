public class ListaEncadeada {

    private No inicio, fim;
    private int quant;
    int vetor[]=new int[15];
    int vetor1[]=new int[15];
    int i=0;

    public ListaEncadeada() {
        inicio = fim = null;
        quant = 0;
    }
    public int getFim(){
        return quant;
    }
    
    public void zerar(){
        inicio = null;
        fim = null;
        System.out.println("lista foi zerada");
    }
    public void insereInicio(int novoElemento) {
        No novo = new No(novoElemento);
        if (inicio == null) {
            fim = novo;
        } else {
            novo.Next = inicio;
        }
        inicio = novo;
        quant++;
    }

    public void insereFim(int novoElemento) {
        No novo = new No(novoElemento);
        if (inicio == null) {
            inicio = novo;
        } else {
            fim.Next = novo;
        }
        fim = novo;
        quant++;
    }

    public void imprime() {
        No aux = inicio;
        while (aux != null) {
            System.out.print(aux.dado + " ");
            aux = aux.Next;
        }
    }
    

    public void insere(int novoElemento, int indice) {
        if (indice < 0 || indice > quant) {
            System.out.println("Índice é inválido");
        } else {
            No novo = new No(novoElemento);
            if (indice == 0) {
                if (inicio == null) {
                    fim = novo;
                } else {
                    novo.Next = inicio;
                }
                inicio = novo;
            } else {
                No aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.Next;
                }
                novo.Next = aux.Next;
                aux.Next = novo;
                if (novo.Next == null) {
                    fim = novo;
                }
            }
            quant++;
        }
    }

    public int removeInicio() {
        if (inicio == null) {
            return -1;
        } else {
            No aux = inicio;
            inicio = inicio.Next;
            aux.Next = null;
            if (inicio == null) {
                fim = null;
            }
            quant--;
            vetor1[i]=aux.dado;
            i++;
            return aux.dado;
        }
    }

    public int removeFim() {
        if (inicio == null) {
            return -1;
        } else {
            No retorno = fim;
            quant--;
            if (inicio.Next == null) {
                inicio = null;
                fim = null;
            } else {
                No aux = inicio;
                while (aux.Next != fim) {
                    aux = aux.Next;
                }
                fim = aux;
                fim.Next = null;
            }
            vetor[i]=retorno.dado;           
            i++;
            return retorno.dado;
        }
    }

    public int remove(int indice) {
        if (getFim() != 0) {
            int aux;
                      
        }return 0;
    }
    public void imprimeVetor(){
        for(int j = 0; j < vetor.length; j++){
        System.out.print(vetor[j] + " ");
        }
    }
    public void imprimeVetor1(){
        for(int j=0;j< vetor.length;j++){
            for(int k=1;k< vetor.length;k++){
                if(vetor[j] == vetor[k]){
                    vetor[k]=0;
                }
            }
        }
        
        for(int j = vetor.length-1; j >= 0; j--){
            System.out.print(vetor[j] + " ");
        }
    }


}
