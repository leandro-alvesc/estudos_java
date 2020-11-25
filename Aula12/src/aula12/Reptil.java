package aula12;
public class Reptil extends Animal {
    // Atributo
    protected String corEscama;
    // Metodos Sobrepostos
    @Override
    public void locomover() {
        System.out.println("Rastejando...");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo carne...");
    }
    @Override
    public void emitirSom() {
        System.out.println("Grunhindo...");
    }
    // Metodo getter e setter
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    // Metodo toString()
    @Override
    public String toString() {
        return "DADOS\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " 
                + membros + "\nCor da Escama: " + corEscama;
    }
}
