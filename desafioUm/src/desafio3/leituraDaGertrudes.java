package desafio3;
import java.util.Scanner;

public class leituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        

        int diaLeitura = paginas / paginasLidas;

        System.out.println(diaLeitura + " dias");

        leitor.close();
        

    }
    
}
