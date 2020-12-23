package testeswitch;

import java.util.Scanner;

public class TesteSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas){
            case 1:
                tipo = "Saci.";
                break;
            case 2:
                tipo = "Bípede.";
                break;
            case 3:
                tipo = "Tripé.";
                break;
            case 4:
                tipo = "Quadrúpede.";
                break;
            case 6, 8:
                tipo = "Aranha.";
                break;
            case 100:
                tipo = "Centopéia.";
                break;
            default:
                tipo = "ET.";
                break;
        }
        System.out.println("É do tipo " + tipo);
    }
    
}
