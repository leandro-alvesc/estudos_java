package programamedia;

import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("\nDigite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("\nDigite a segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.print("\nSua média é " + m + ".");
        if (m >= 9) {
            System.out.print(" Parabéns! Você foi muito bem!\n");
        } else if (m > 6){
            System.out.print(" Aprovado!\n");
        }
    }
    
}
