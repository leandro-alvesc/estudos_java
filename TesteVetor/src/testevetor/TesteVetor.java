package testevetor;

import java.util.Scanner;

public class TesteVetor {
    public static void main(String[] args) {
        int valor;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite quantos nomes quer adicionar: ");
        valor = scan.nextInt();
        
        String nomes[] = new String[valor];
        
        for (int c=0; c<=valor-1; c++){
            System.out.print("Digite o " + (c + 1) + "o nome: ");
            nomes[c] = scan.next();
        }
        
        System.out.println("Total de nomes: " + nomes.length);
        
        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
