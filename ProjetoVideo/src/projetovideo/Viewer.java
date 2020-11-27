package projetovideo;
public class Viewer extends Pessoa {
    // Atributos
    private String login;
    private int totAssistido;
    // Construtor
    public Viewer(String nome, String sexo, int idade, String login) {
        super(nome, sexo, idade);
        this.login = login;
        this.totAssistido = 0;
    }
    // Getters e Setters
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    // Metodo toString()
    @Override
    public String toString() {
        return super.toString() + "\nLogin: " + login + "\nTotal Assistido: " 
                + totAssistido;
    }
    
}
