package aula12;
public class Peixe extends Animal {
    // Atributo
    protected String corEscama;
    // Metodo
    public void soltarBolha(){
        System.out.println("Glub... Glub...");
    }
    // Metodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo ração...");
    }
    @Override
    public void emitirSom() {
        System.out.println("...");
    }
    // Metodo toString()
    @Override
    public String toString() {
        return "DADOS\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " 
                + membros + "\nCor da Escama: " + corEscama;
    }
}
