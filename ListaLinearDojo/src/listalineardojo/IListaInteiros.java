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
public interface IListaInteiros{
		boolean inserir(int valor);
		int remover(int indice);
		int substituir(int novoValor, int posicao);
		int tamanho();
		boolean listaVazia();
		boolean listaCheia();
}

