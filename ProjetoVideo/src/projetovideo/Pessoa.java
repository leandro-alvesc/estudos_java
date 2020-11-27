package projetovideo;
public abstract class Pessoa {
    // Atributos
    protected String nome, sexo;
    protected int idade;
    protected double exp;
    // Construtor
    public Pessoa(String nome, String sexo, int idade) {
        this.exp = 0;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    // Metodos
    protected void ganharExp(double n){
        this.exp += n;
    }
    // Metodo toString()
    @Override
    public String toString() {
        return "\nDados Pessoais: " + "\nNome: " + nome + "\nSexo: " + sexo + 
                "\nIdade: " + idade + "\nExperiência: " + exp;
    }
}
