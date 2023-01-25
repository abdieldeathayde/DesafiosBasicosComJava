package desafio5;
import java.util.Scanner;

public class downloadDePacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        
        
        while (tamanho > 0) {
            System.out.print("/");
            tamanho--;
        }

        leitor.close();
        

    }
    
}
