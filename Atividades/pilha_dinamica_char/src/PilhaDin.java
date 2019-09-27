
public class PilhaDin {

    public class No {

        public char dado;
        public No next;

        public No(char dd) {
            dado = dd;
            next = null;
        }

        public void displayNo() {
            System.out.println(dado);
        }
    }

    private No topo;

    public PilhaDin() {
        topo = null;      //Pilha vazia
    }

    public boolean isEmpty() {
        // true se a lista está vazia
        return (topo == null);
    }

    public void push(char dd) {
        // insere no topo da pilha (empilha)
        No newNo = new No(dd);

        newNo.next = topo;
        topo = newNo;
    }

    public char pop() {     // remove do topo -> desempiha

        if (isEmpty()) //se estiver vazia retorna -1
        {
            char saida = '\0';
            return saida;
        }

        No temp = topo;            // utilizado para retornar o dado
        topo = topo.next;         // move o topo para o prox nó
        return temp.dado;
        // retorna o dado
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha vazia.");
        } else {
            No atual = topo;            // inicia do topo
            while (atual != null) {      // até do final
                atual.displayNo();        // exibe a informação don
                atual = atual.next;     // move para o proximo nó
            }
            System.out.println();
        }
    }

}
