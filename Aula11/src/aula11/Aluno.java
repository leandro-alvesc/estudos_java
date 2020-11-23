package aula11;
public class Aluno extends Pessoa {
    // Atributos
    protected int matricula;
    protected String curso;
    // Metodos Getters e Setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    // Metodos
    public void pagarMensalidade(){
        System.out.println("\nMensalidade de " + this.nome + " paga.");
    }

    @Override
    public String toString() {
        return "\nDADOS:" + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + 
                idade + "\nMatricula: " + matricula + "\nCurso: " + curso;
    }
    
}
