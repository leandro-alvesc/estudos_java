/*
Autor: Leandro
Data: 21/11/2020
Titulo: Projeto Livro
*/
package projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        // Instanciando Pessoas
        Pessoa p[] = new Pessoa [3];
        p[0] = new Pessoa("João", "M", 25);
        p[1] = new Pessoa("Maria", "F", 20);
        p[2] = new Pessoa("José", "M", 15);
        
        // Instanciando Livros
        Livro l[] = new Livro [3];
        l[0] = new Livro ("O Rei de Amarelo", "Robert W. Chambers", 256);
        l[1] = new Livro ("Fragmentos do Horror", "Junji Ito", 224);
        l[2] = new Livro ("Revival", "Stephen King", 405);
        
        // Ações
        l[0].definirLeitor(p[0]);
        l[1].definirLeitor(p[2]);
        l[2].definirLeitor(p[1]);
        
        l[2].abrir();
        l[2].folhear();
        l[2].avancarPag();
        l[2].detalhes();
        p[1].dados();
        p[1].fazerAniver();
    }
    
}
