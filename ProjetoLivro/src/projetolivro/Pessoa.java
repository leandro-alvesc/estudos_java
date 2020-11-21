package projetolivro;
public class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade;
    //Metodos Especiais
    public Pessoa(String no, String sx, int id) {
        this.nome = no;
        this.sexo = sx;
        this.idade = id;
    }
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
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
        System.out.println("Parabéns, você fez " + this.getIdade() + " anos!");
    }
    public void dados(){
        System.out.println("---------------- DADOS PESSOAIS ----------------");
        System.out.println("Nome:_____ " + this.getNome());
        System.out.println("Idade:____ " + this.getIdade());
        System.out.println("Sexo:_____ " + this.getSexo());
        System.out.println("------------------------------------------------");
    }
}
