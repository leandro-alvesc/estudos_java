package projetovideo;
public class Video implements AcoesVideo {
    // Atributos 
    private String titulo;
    private int views, curtidas;
    private double avaliacao;
    private boolean reproduzindo;
    // Construtor
    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(double avaliacao) {
        double nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        this.avaliacao = nova;
    }
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    public boolean getReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    // Metodos 
    @Override
    public void play() {
        if (this.getReproduzindo()) {
            System.out.println("Vídeo já está sendo reproduzido.");
        } else {
            System.out.println("Reproduzindo vídeo.");
            this.setReproduzindo(true);
        }
    }
    @Override
    public void pause() {
        if (this.getReproduzindo()) {
            System.out.println("Pausando vídeo.");
            this.setReproduzindo(false);
        } else {
            System.out.println("Vídeo já está pausado.");
        }
    }
    @Override
    public void like() {
        this.curtidas++;
    }
    // Metodo toString()
    @Override
    public String toString() {
        String x;
        if (reproduzindo) {
            x = "SIM";
        } else {
            x = "NÃO";
        }
        return "\nDetalhes do Vídeo: " + "\nTitulo: " + titulo + 
                "\nAvaliação: " + avaliacao + "\nViews: " + views + 
                "\nCurtidas: " + curtidas + "\nReproduzindo: " + x;
    }
    
}
