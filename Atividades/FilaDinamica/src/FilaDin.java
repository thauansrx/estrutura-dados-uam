
public class FilaDin {

    public class No {

        public int dado;
        public No next;

        public No(int dd) {
            dado = dd;
            next = null;
        }

        public void displayNo() {
            System.out.print(dado);
        }
    }
    private No inicio, fim;
    private int size;

    public FilaDin() {
        inicio = null;      //Fila vazia
        fim = null;
        size = 0;
    }

    public boolean isEmpty() {
        // true se a Fila está vazia
        return (inicio == null);
    }

    public void enqueue(int dd) {
        No newNo = new No(dd);
        if (inicio == null) {
            inicio = newNo;
            fim = inicio;
        } else {
            fim.next = newNo;
            fim = newNo;
        }
        size++;
    }

    public int dequeue() {      // remove do inicio da fila                         
        if (isEmpty()) //se estiver vazia retorna -1
        {
            return -1;
        }

        // utilizado para retornar o dado
        No temp = inicio;
        // move o topo para o prox nó
        inicio = inicio.next;
        if (inicio == null) {
            fim = null;
        }
        size--;
        return temp.dado;        // retorna o dado
    }

    public void display() {
        if (isEmpty()) {
            System.out.print("Fila vazia.");
        } else {
            No atual = inicio;            // do inicio
            while (atual != null) {      // até o final
                // exibe a informação do nó
                atual.displayNo();
                // move para o proximo nó     
                atual = atual.next;
            }
            System.out.println();
        }
    }

}
