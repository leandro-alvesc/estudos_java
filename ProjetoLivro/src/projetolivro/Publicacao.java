package projetolivro;
public interface Publicacao {
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear();
    public abstract void avancarPag();
    public abstract void voltarPag();
    public abstract void definirLeitor(Pessoa p);
}
