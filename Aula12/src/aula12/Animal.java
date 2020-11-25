package aula12;
public abstract class Animal {
    // Atributos de Animal
    protected double peso;
    protected int idade, membros;
    // Metodos Abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    //Metodos getters e setters
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMembros() {
        return membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    // Método toString()
    @Override
    public String toString() {
        return "DADOS\n" + "Peso: " + peso + "\nIdade: " + idade + "\nMembros: " 
                + membros;
    }
}
