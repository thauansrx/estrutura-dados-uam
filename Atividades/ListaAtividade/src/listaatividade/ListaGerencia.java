package listaatividade;

public class ListaGerencia implements ListaInteiros {

    private int lista[] = new int[10];
    private int cont = 0;

    @Override
    public void inserir(int valor) {
        if (isEmpty()) {

        } else {
            lista[cont] = valor;
            cont++;

        }
    }

    @Override
    public int remover(int indice) {
        int aux = 0;
        if (isEmpty()) {
            System.out.println("Lista vazia!");
            return 0;

        } else {
            lista[aux] = lista[indice];
            lista[indice] = 0;
            cont--;
            
            for (int i = indice; i < lista.length; i++) {
                lista[i++] = lista[i];
            }
            return lista[aux];

        }
    }

    @Override
    public int substituir(int novoValor, int posicao) {
        int aux = 0;
        lista[aux] = lista[posicao];
        lista[posicao] = novoValor;
        return lista[aux];
    }

    @Override
    public int tamanho() {
        return cont;
    }

    @Override
    public boolean isEmpty() {
        return (lista[0] == -1);
    }

    @Override
    public boolean isFull() {
        return (cont == lista.length);
    }

}
