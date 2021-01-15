package testefuncao;
public class TesteFuncao {
    static void soma(int a, int b){
        int s = a + b;
        System.out.println(s);
    }
    static int somar(int a, int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        System.out.println("Soma como procedimento: ");
        soma(5, 2);
        System.out.println("Soma como método: ");
        int s = somar(5, 2);
        System.out.println(s);
        
        System.out.println("Contador: ");
        System.out.println(Operacoes.contador(1, 10));
    }
    
}
