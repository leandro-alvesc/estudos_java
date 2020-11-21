package aula10;
public class Aula10 {
    public static void main(String[] args) {
        // Instanciando 
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        // Ações
        p1.setNome("João");
        p1.setIdade(35);
        p1.setSexo("M");
        
        p2.setNome("Maria");
        p2.setIdade(21);
        p2.setSexo("F");
        p2.setCurso("ADS");
        p2.setMatr(1010);
        p2.cancelarMatr();
        
        p3.setNome("José");
        p3.setIdade(45);
        p3.setSexo("M");
        p3.setEspecialidade("Mestre");
        p3.setSalario(3000.50);
        p3.receberAum(300);
        
        p4.setNome("Karla");
        p4.setIdade(40);
        p4.setSexo("F");
        p4.setSetor("Administração");
        p4.mudarTrabalho();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
