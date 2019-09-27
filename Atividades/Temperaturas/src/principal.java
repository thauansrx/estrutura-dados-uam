import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar;
        
        do{
        double temp[] = new double[7];
        double media = -9999;
        double soma = 0;
        for (int i = 0; i < temp.length; i++) {
            System.out.println("Insira a temperatura do dia " +(i+1));
            temp[i] = teclado.nextDouble();
            soma = soma + temp[i];            
        }
        media = soma/temp.length;
        System.out.println("A media de temperaturas eh: "+media);
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > media) {
            count++;
                System.out.println("A temperatura no dia "+(i+1)+" foi "+ (temp[i]-media) + " graus acima da média" );}
        }
        System.out.println("Houveram "+ count +" dias com temperatura acima da média de " + media + " graus");
            
        //Repetir?
            System.out.println("Deseja continuar? 1 - Sim // 2 - Não");
            int cont = teclado.nextInt();   
            if(cont == 1){
                continuar = true;
            } else{
                continuar = false;
            }
        } while (continuar == true);

    }    
}
