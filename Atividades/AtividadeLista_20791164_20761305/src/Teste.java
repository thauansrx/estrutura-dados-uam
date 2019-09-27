
import java.util.Random;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        ListaEncadeada lista1 = new ListaEncadeada();
        ListaEncadeada lista2 = new ListaEncadeada();
        ListaEncadeada lista3 = new ListaEncadeada();
        listaLinear listaLinear = new listaLinear();
        listaLinear listaLinear2 = new listaLinear();
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Exercicio 1");
        System.out.println("Suas duas listas são:");
        int num1 = 5;
        int num2 = 3;
        listaLinear.NovaListaLinear(num1, num2);
        listaLinear.popularLista();
        listaLinear.concatenarListas();
        System.out.print("\nLista concatenada: ");
        listaLinear.imprime();
              
        
        //Exercicio 2
        System.out.println("\n\nExercicio 2");
        int num3 = 8;
        lista1.insereInicio(num3);
        for(int i = 0; i < num3-1; i++){
            lista1.insere(i, 0);
        }
        System.out.print("Sua lista é essa: ");
        lista1.imprime();
        
        System.out.println("\nDigite um número inteiro para remoção");
        int numInt = teclado.nextInt();
        
        if(numInt > lista1.getFim()){
            System.out.println("Numero excede indice da lista");          
        }else{
            if(numInt == lista1.getFim()){             
                System.out.print("Numero igual ao indice, ");
                lista1.zerar();
                lista1.imprime();
            }else{
                for(int i = 0; i < numInt;i++){
                   lista1.removeInicio();
                }
                System.out.print("Sua lista após a remoção: ");
                lista1.imprime();
                
            }
        }
      
        //Exercicio 3
        System.out.println("\n\nExercicio 3");
        System.out.print("Sua lista é: ");
        int num4 = 15;
        lista2.insereInicio(num4);
        for(int i = 0; i < num4-1; i++){
            int rand = random.nextInt(20);
            lista2.insere(rand, 0);
        }
        lista2.imprime();
        System.out.print("\nA lista invertida: ");
            for(int i = 0; i < 15; i++){
                lista2.removeFim();
            }
                lista2.imprimeVetor();
                System.out.println("");
            for(int i = 0; i < 15; i++){
                lista2.removeFim();
            }            
            
            //Exercicio 4
            System.out.println("\nExercicio 4");
            System.out.println("Não fizemos, sorry");
            
            
            
            //Exercicio 5
            System.out.println("\nExercicio 5");
            System.out.println("Suas duas listas são:");
            int num5 = 8;
            int num6 = 6;
            listaLinear2.novaListaInter(num5, num6);
            listaLinear2.popularLista2();
            System.out.print("\nIntersecção: ");
            listaLinear2.inter();
            

         
 
        
        
    }

}
