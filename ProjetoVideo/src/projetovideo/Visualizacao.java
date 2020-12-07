package projetovideo;
public class Visualizacao {
    // Atributos
    private Viewer espec;
    private Video filme;
    // Construtor
    public Visualizacao(Viewer espec, Video filme) {
        this.espec = espec;
        this.filme = filme;
        this.espec.setTotAssistido(this.espec.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    // Avaliar
    public void avaliar(){
        this.filme.setAvaliacao(5.0);
    }
    public void avaliar(double porc){
        double tot = 0;
        if (porc <= 10){
            tot = 1;
        } else if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 80) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    // Getters e Setters
    public Viewer getEspec() {
        return espec;
    }
    public void setEspec(Viewer espec) {
        this.espec = espec;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }
    // toString
    @Override
    public String toString() {
        return "\nVisualização: " + "\nEspectador: " + espec.getNome() + "\nFilme: " + filme.getTitulo();
    }
    
    
}
