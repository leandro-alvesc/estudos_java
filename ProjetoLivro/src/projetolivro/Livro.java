package projetolivro;

import java.util.Random;

public class Livro implements Publicacao {
    // Atributos
    private String titulo, autor;
    private Pessoa leitor;
    private int totPag, pagAtual;
    private boolean aberto;
    // Métodos Especiais
    public Livro(String ti, String au, int to) {
        this.titulo = ti;
        this.autor = au;
        this.totPag = to;
        this.aberto = false;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    // Métodos Abstratos
    @Override
    public void abrir() {
        if (this.getLeitor().getIdade() > 0){
            if (this.getAberto()){
                System.out.println("O livro já está aberto.");
            } else if(this.getTotPag() > 5) {
                this.setAberto(true);
                this.setPagAtual(1);
                System.out.println("Abrindo o livro...");
                System.out.println("Está na página: " + this.getPagAtual());
            } else {
                System.out.println("Livro inválido.");
            }
        } else {
            System.out.println("Nenhum leitor encontrado.");
        }
        
    }
    @Override
    public void fechar() {
        if (this.getLeitor().getIdade() > 0){
            if (this.getAberto()) {
                this.setAberto(false);
                this.setPagAtual(0);
                System.out.println("Fechando o livro...");
            } else {
                System.out.println("O livro já está fechado.");
            }
        } else {
            System.out.println("Nenhum leitor encontrado.");
        }
        
    }
    @Override
    public void folhear() {
        if (this.getLeitor().getIdade() > 0){
            if (this.getAberto()){
                Random aleat = new Random();
                //int folha = aleat.nextInt(this.getTotPag());
                //this.setPagAtual(folha);
                this.setPagAtual(aleat.nextInt(this.getTotPag()));
                System.out.println("Folheou para a página " + this.getPagAtual());
            } else {
                System.out.println("Impossível folhear.");
            }
        } else {
            System.out.println("Nenhum leitor encontrado.");
        }
    }
    @Override
    public void avancarPag() {
        if (this.getLeitor().getIdade() > 0){
            if (this.getAberto() && this.getPagAtual() < this.getTotPag()){
                this.setPagAtual(this.getPagAtual() + 1);
                System.out.println("Avançando uma página.");
                System.out.println("Está na página: " + this.getPagAtual());
            } else {
                System.out.println("Impossível avançar página.");
            }
        } else {
            System.out.println("Nenhum leitor encontrado.");
        }
    }
    @Override
    public void voltarPag() {
        if (this.getLeitor().getIdade() > 0){
            if (this.getAberto() && this.getPagAtual() > 1){
                this.setPagAtual(this.getPagAtual() - 1);
                System.out.println("Voltando uma página.");
                System.out.println("Está na página: " + this.getPagAtual());
            }
        } else {
            System.out.println("Nenhum leitor encontrado.");
        }
        
    }
    @Override
    public void definirLeitor(Pessoa p){
        this.setLeitor(p);
    }
    // Métodos
    public void detalhes(){
        System.out.println("---------------- DADOS DO LIVRO ----------------");
        System.out.println("Título:___________ " + this.getTitulo());
        System.out.println("Autor:____________ " + this.getAutor());
        System.out.println("Páginas:__________ " + this.getTotPag());
        String v;
        if (this.getAberto()){
            v = "Sim";
        } else {
            v = "Não";
        }
        System.out.println("Aberto:___________ " + v);
        System.out.println("Leitor:___________ " + this.getLeitor().getNome());
        System.out.println("Página Atual:_____ " + this.getPagAtual());
        System.out.println("------------------------------------------------");
    }
}
