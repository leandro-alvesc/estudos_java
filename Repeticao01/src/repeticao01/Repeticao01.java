package repeticao01;

import java.util.Scanner;

public class Repeticao01 {
    public static void main(String[] args) {
        int n, s = 0;
        int c = 1;
        String res;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Digite o " + c + "o número a ser somado: ");
            n = scanner.nextInt();
            s += n;
            c++;
            System.out.print("Deseja adicionar o " + c + "o número? [s/n] ");
            res = scanner.next();
        } while (res.equals("s"));
        System.out.println("O resultado da soma é: " + s);
    }
    
}
