
public class principal {
    public static void main(String[] args) {
      PilhaDin pil = new PilhaDin();

            pil.push(10);
            pil.push(20);
            pil.push(30);

            System.out.println ("Pilha:");
            pil.display();

            while (!pil.isEmpty())
                System.out.println ("Desempilhando " + pil.pop( ) );

  
        
        
    } 
}
