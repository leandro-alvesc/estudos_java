package aula12;
public class Ave extends Animal {
    // Atributos
    protected String corPena;
    // Metodo
    public void fazerNinho(){
        System.out.println("Fazendo ninho...");
    }
    // Metodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Voando...");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo minhoca...");
    }
    @Override
    public void emitirSom() {
        System.out.println("Cantando...");
    }
    // Metodo toString()
    @Override
    public String toString() {
        return "DADOS\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " 
                + membros + "\nCor das Penas: " + corPena;
    }
}
