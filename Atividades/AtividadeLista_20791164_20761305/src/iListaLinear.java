
public interface iListaLinear {
    		boolean inserir(int valor);
		int remover(int indice);
		int substituir(int novoValor, int posicao);
		int tamanho();
		boolean listaVazia();
		boolean listaCheia();
}
