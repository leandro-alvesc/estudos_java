package aula12;
public class Mamifero extends Animal {
    // Atributo
    protected String corPelo;
    // Metodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Correndo...");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando...");
    }
    @Override
    public void emitirSom() {
        System.out.println("Rosnando...");
    }
    // Metodos getters e setters
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    // Metodo toString()
    @Override
    public String toString() {
        return "DADOS\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " 
                + membros + "\nCor do Pelo: " + corPelo;
    }
}
