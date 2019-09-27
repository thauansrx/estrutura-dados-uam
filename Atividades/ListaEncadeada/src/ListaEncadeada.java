/*
@author Thauan

*/

public class ListaEncadeada {

    private No inicio, fim;
    private int quant;

    public ListaEncadeada() {
        inicio = fim = null;
        quant = 0;
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
            System.out.println(aux.dado);
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
            return retorno.dado;
        }
    }

    public int remove(int indice) {
        throw new UnsupportedOperationException("Para implementar");
    }
}
