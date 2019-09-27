
public class GerenciaFila implements FilaInter {

    private int[] fila = new int[7];
    private int inicio = -1;
    private int fim = -1;

    @Override
    public void enqueue(int value) { //adiciona na fila
        if (isEmpty()) {
            fila[inicio + 1] = value;
            inicio = inicio + 1;
            fim = inicio + 1;

            

        } else {
            fila[fim] = value;
            fim++;

        }
    }

    @Override
    public int denqueue() { // retira o primeiro da fila
        int aux;
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            fim--;
            aux = fila[inicio];
            for (int i = inicio; i < fila[fim]; i++) {
                fila[i] = fila[i + 1];
                
            }
            
            return aux;

        }
        return 0;
    }

    @Override
    public int front() {
        return fila[inicio];
    }

    @Override
    public boolean isEmpty() {
        if (fim == inicio) {

            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean isFull() {
        if (fim == fila.length) {
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        int tamanho = fim - inicio;
        return tamanho;
    }

}
