package aula07;
public class Lutador {
    // Atributos
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    // Metodos Especiais

    public Lutador(String no, String na, int id, float al,  float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    // Metodos
    public void apresentar(){
        System.out.print("É AGORA! Chegou o " + this.getNome());
        System.out.print(", diretamente de " + this.getNacionalidade());
        System.out.print("! Com " + this.getIdade());
        System.out.print(" anos e " + this.getAltura());
        System.out.print(" metros de altura! Pesando " + this.getPeso() + "Kg");
        System.out.print(" e fazendo parte da categoria Peso " + this.getCategoria());
        System.out.print(". Seu score é de " + this.getVitorias());
        System.out.print(" vitórias, " + this.getDerrotas());
        System.out.print(" derrotas e " + this.getEmpates() + " empates.");
        System.out.println("");
        System.out.println("UMA SALVA DE PALMAS!!");
    }
    public void status(){
        System.out.println("Nome:___________ " + this.getNome());
        System.out.println("Nacionalidade:__ " + this.getNacionalidade());
        System.out.println("Idade:__________ " + this.getIdade());
        System.out.println("Altura:_________ " + this.getAltura());
        System.out.println("Peso:___________ " + this.getPeso() + "Kg");
        System.out.println("Categoria:______ Peso " + this.getCategoria());
        System.out.println("Vitórias:_______ " + this.getVitorias());
        System.out.println("Derrotas:_______ " + this.getDerrotas());
        System.out.println("Empates:________ " + this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
