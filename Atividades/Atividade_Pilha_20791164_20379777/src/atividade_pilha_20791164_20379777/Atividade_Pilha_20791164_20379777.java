package atividade_pilha_20791164_20379777;

import java.util.Scanner;

public class Atividade_Pilha_20791164_20379777 {

    public static void main(String[] args) {
        String saida = null;
        int i;
        pilha_class pilha = new pilha_class(80);
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite uma expressao infixa: ");
        String conta = "(5-2)*1"; //ab-c* <- expressão pós fixa

        for (i = 0; i < conta.length(); i++) {
            char letra = conta.charAt(i);
            switch (letra) {
                case '+': //P1
                case '-':
                    
                    break;
                case '*': //P2
                case '/':
                    
                    break;
                case '(':
                    
                    break;
                case ')':
                        
                    break;
                default:
                    saida = saida + letra;
                    break;
            }
        }
        while (pilha.pilhaVazia()== false) {
			saida = saida + pilha.pop();
        }
        
        
        
        
        
    }
}
