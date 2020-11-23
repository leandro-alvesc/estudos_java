package aula11;
public class Aula11 {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); 
        // Classes abstratas não podem ser instanciadas
        
        // Instanciando Visitante
        Visitante v1 = new Visitante();
        v1.setNome("Maria");
        v1.setIdade(25);
        v1.setSexo("F");
        System.out.println(v1.toString());
        
        // Instanciando Aluno
        Aluno a1 = new Aluno();
        a1.setNome("José");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.setCurso("ADS");
        a1.setMatricula(1010);
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        // Instanciando Aluno Bolsista
        Bolsista a2 = new Bolsista();
        a2.setNome("Claudia");
        a2.setIdade(26);
        a2.setSexo("F");
        a2.setCurso("ADS");
        a2.setMatricula(1210);
        a2.setBolsa(70);
        a2.pagarMensalidade();
        System.out.println(a2.toString());
        
        // Instanciando Professor
        Professor p1 = new Professor();
        p1.setNome("Paulo");
        p1.setIdade(35);
        p1.setSexo("M");
        p1.setSalario(3500);
        p1.setEsp("Mestre");
        p1.receberAum();
        System.out.println(p1.toString());
    }
    
}
