package listacircular;

public class ListaCircular {

    private static class No {

        public No prox; // próximo nó na lista
        public int valor; // elemento (valor) armazenado na lista 

        public No(int val) { //construtor do nó da lista
            valor = val;
            prox = null;
        }
    }

    private No fim; //atributo que representa o início da lista
    private int size; // tamanho da lista circular

    public ListaCircular() {   // construtor da lista
        fim = null;
        size = 0;
    }

    public boolean isEmpty() {
        return fim == null;
    }

    public boolean search(int elem) {
        No nodo = fim.prox;
        for (int i = 0; i < size; i++) {
            if (elem == nodo.valor) {
                System.out.println("Valor encontrado: " + nodo.valor);
                return true; //encontrou o elemento
            }
            nodo = nodo.prox;
        }
        System.out.println("Valor não encontrado.");
        return false;                            // não encontrou o elemento
    }

    public void insereInicio(int elem) { //insere no início da lista
        No novoNo = new No(elem);

        if (isEmpty()) // lista vazia
        {
            fim = novoNo; // o fim e o início da lista são o novo nó.
        } else // a lista já possui elementos
        {
            novoNo.prox = fim.prox; // o novo nó aponta para o antigo início
        }
        fim.prox = novoNo; // o nó final aponta para o novo início

        size++;
    }

    public int removeInicio() { //elimina o primiro item da lista

        No del;

        if (isEmpty()) {
            System.out.println("Lista Vazia!");
            return -1;
        }
        del = fim.prox; // del aponta para o primeiro elemento

        if (del == fim) // a lista só tem um elemento
        {
            fim = null;
        } else {
            fim.prox = del.prox; // atualiza o início da lista
        }
        size--;
        return del.valor;
    }

    public String exibeLista() {
        if (isEmpty()) {
            return "Lista vazia\n"; //teste de lista vazia
        }
        String str = "Lista Encadeada: ";
        No nodo = fim.prox;

        for (int i = 0; i < size; i++) {
            str += " " + nodo.valor;
            nodo = nodo.prox;
        }
        return str + "\n";
    }

}
