
import java.util.Stack;

/*
 *Escreva um programa que leia uma expressão contendo parênteses ( ),
colchetes [ ] e chaves { }, e verifique se a quantidade e ordem dos 
parênteses e chaves estão corretos na frase. 
Exemplos:  (  a  )  b ( [ c ] d )	 correto 
( a ( b )   incorreto, falta parênteses 
( a  [ c ) d ]	  incorreto, ordem errada

 */
/**
 *
 * @author Thauan Trindade
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stack = new Stack();
        String correta = "(  a  )  b ( [ c ] d )";
        String errada = "( a  [ c ) d ]";

        char[] vtr = correta.toCharArray();     // Testar String Correta
//      char[] vtr = errada.toCharArray();   //Testar String Errada 

        for (int i = 0; i < vtr.length; i++) {

            if (vtr[i] == '(' || vtr[i] == '[' || vtr[i] == '{') {
                stack.push(vtr[i]);
            }

            if (vtr[i] == ')' || vtr[i] == ']' || vtr[i] == '}') {
                if (stack.peek().equals('(') && vtr[i] == ')') {
                    System.out.println(stack.peek() + " " + vtr[i]);
                    stack.pop();
                } else if (stack.peek().equals('[') && vtr[i] == ']') {
                    System.out.println(stack.peek() + " " + vtr[i]);
                    stack.pop();

                } else if (stack.peek().equals('{') && vtr[i] == '}') {
                    System.out.println(stack.peek() + " " + vtr[i]);
                    stack.pop();
                } else {
                    System.out.println("incorreto");
                    break;
                }
                    System.out.println("Correto");
            } 
        }

    }

}
