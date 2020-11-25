package aula12;
public class Cachorro extends Mamifero {
    // Metodos
    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }
    public void abanarRabo(){
        System.out.println("Estou feliz. Abanando o rabo...");
    }
    @Override
    public void emitirSom(){
        System.out.println("Au! Au!");
    }
}
