package aula11;
public class Professor extends Pessoa {
    // Atributos
    private String esp;
    private int salario;
    // Metodos getters e setters
    public String getEsp() {
        return esp;
    }
    public void setEsp(String esp) {
        this.esp = esp;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    // Metodos
    public void receberAum(){
        System.out.println("\n" + this.getNome() + " recebeu aumento...");
    }
    @Override
    public String toString() {
        return "\nDADOS:" + "\nNome: " + nome + "\nSexo: " + sexo + 
                "\nIdade:" + idade + "\nEspecialidade: " + esp + "\nSalário: "
                + salario;
    }
}
