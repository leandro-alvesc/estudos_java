package aula10;
public class Pessoa {
    // Atributos
    private String nome, sexo;
    private int idade;
    //Metodos Especiais
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
    // Metodos 
    public void fazerAnive(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "\nPESSOA\n" + "Nome:" + nome + "\nSexo=" + sexo + "\nIdade=" + idade;
    }
    
}
