package aula12;
public class Aula12 {
    public static void main(String[] args) {
        // Teste Polimorfismo
        Mamifero m1 = new Mamifero();
        Reptil r1 = new Reptil();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();
        Goldfish g1 = new Goldfish();
        Cobra c1 = new Cobra();
        
        m1.setCorPelo("Marrom");
        m1.setIdade(2);
        m1.setMembros(4);
        m1.setPeso(5.50);
        System.out.println(m1.toString());
        System.out.println("");
        
        m1.emitirSom();
        r1.emitirSom();
        p1.emitirSom();
        a1.emitirSom();
        g1.emitirSom();
        c1.emitirSom();
    }
    
}
