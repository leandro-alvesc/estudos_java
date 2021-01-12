package exrepita;

import javax.swing.JOptionPane;

public class ExRepita {
    public static void main(String[] args) {
        int n, c = -1, par = -1, imp = 0, cem = 0, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Insira"
                    + " um número:<br><em>(0 para interromper)</em></html>", 
                    "Entrada de Valores", JOptionPane.INFORMATION_MESSAGE));
            s += n;
            c++;
            if (n % 2 == 0) {
                par++;
            } else {
                imp++;
            }
            if (n > 100) cem++;
            
        } while (n != 0);
        
        double media = (double) s / c;
        String mf = String.format("%.2f", media);
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br>" + "Total da"
                + "Soma: " + s +"<br>Total de valores: " + c + "<br> Total de "
                + "Pares: " + par + "<br>Total de Ímpares:  " + imp + 
                "<br>Acima de 100: " + cem + "<br>Média dos Valores: " + mf +
                "</html>", "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
