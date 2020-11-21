package aula10;
public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private double salario;
    // Metodos especiais
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Metodos
    public void receberAum(double aum){
        this.salario += aum;
    }
}
