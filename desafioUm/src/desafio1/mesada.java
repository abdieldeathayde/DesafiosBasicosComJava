package desafio1;

import java.util.Scanner;

public class mesada{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        int valorFinal = entrada * mesada;

        leitor.close();

        
        System.out.println(valorFinal);
        

    }
}