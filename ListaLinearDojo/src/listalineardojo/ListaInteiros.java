/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listalineardojo;

/**
 *
 * @author profpa2
 */
public class ListaInteiros implements IListaInteiros {

    int listaTamanho = 0;
    int inicio = -1, fim = -1;
    int vetor[] = null;

    public ListaInteiros(int tamanhoVetor) {

        vetor = new int[tamanhoVetor];
    }
    
    public int[] getLista(){
        return vetor;
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
        if (listaVazia()) {
            return -1;
        } else {
            if (indice < listaTamanho) {
                aux = vetor[indice];
                for (int i = indice; i < listaTamanho; i++) {
                    vetor[indice] = vetor[indice + 1];
                }
                fim--;
                listaTamanho--;
                return aux;
            } else {
                return -1;
            }
        }
    }

    @Override
    public int substituir(int novoValor, int posicao) {
        int aux = 0;
        if (listaVazia()) {
            return -1;
        } else {
            if (posicao < listaTamanho && posicao >= 0) {
                aux = vetor[posicao];
                vetor[posicao] = novoValor;

                return aux;
            } else {
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
