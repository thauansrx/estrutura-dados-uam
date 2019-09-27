
public class principal {
    public static void main(String[] args) {
      PilhaDin pil = new PilhaDin();

            pil.push('a');
            pil.push('s');
            pil.push('v');

            System.out.println ("Pilha:");
            pil.display();

            while (!pil.isEmpty())
                System.out.println ("Desempilhando " + pil.pop( ) );

  
        
        
    } 
}
