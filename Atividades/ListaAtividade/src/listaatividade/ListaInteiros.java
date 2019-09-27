package listaatividade;

public interface ListaInteiros {

    void inserir(int valor);
    int remover(int indice);
    int substituir(int novoValor, int posicao);
    int tamanho();
    boolean isEmpty();
    boolean isFull();

}
