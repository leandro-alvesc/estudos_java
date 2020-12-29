package contador01;

import java.util.Scanner;

public class Contador01 {
    public static void main(String[] args) {
        int c = 1;
        int soma = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Quantas números você quer somar? ");
        int qt = scan.nextInt();
        
        while (c <= qt) {
            System.out.format("Digite o %do número: ", c);
            int num = scan.nextInt();
            soma += num;
            c++;
        }
        System.out.println("A soma entre os números acima é: " + soma);
    }
    
}
