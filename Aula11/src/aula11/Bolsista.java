package aula11;
public final class Bolsista extends Aluno {
    // Atributo
    private int bolsa;
    // Metodos getter e setter
    public int getBolsa() {
        return bolsa;
    }
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    // Metodo
    public void renovarBolsa(){
        System.out.println("Renovando bolsa...");
    }
    @Override
    public final void pagarMensalidade(){
        System.out.println("\n" + this.nome + " é bolsista! Pagando "
                + "mensalidade...");
    }
    @Override
    public String toString() {
        return "\nDADOS:" + "\nNome: " + nome + "\nSexo: " + sexo + "\nIdade: " + 
                idade + "\nMatricula: " + matricula + "\nCurso: " + curso + 
                "\nAluno Bolsista: " + bolsa + "%";
    }
}
