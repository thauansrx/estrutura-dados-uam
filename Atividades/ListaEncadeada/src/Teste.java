/*
@author Thauan

*/

public class Teste {

    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();
        
        
        lista1.insereInicio(1);
        lista1.insere(2, 1);
        lista1.insere(3, 2);
        lista1.imprime();
        System.out.println("------------------");
        
        lista2.insereInicio(1);
        lista2.insere(2, 1);
        lista2.insere(3, 2);
        lista2.imprime();
        System.out.println("------------------");
     
    }
    
}
