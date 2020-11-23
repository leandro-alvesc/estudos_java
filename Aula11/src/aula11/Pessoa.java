package aula11;
public abstract class Pessoa {
    // Atributos
    protected String nome, sexo;
    protected int idade;
    // Metodos Getters e Setters
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
    // Métodos
    public void fazerAniv(){
        this.idade = idade++;
    }

    @Override
    public String toString() {
        return "\nDADOS:" + "\nNome: " + nome + "\nSexo: " + sexo + 
                "\nIdade:" + idade;
    }
    
}
