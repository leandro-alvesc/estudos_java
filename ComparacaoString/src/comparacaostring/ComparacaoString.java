package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Carlos";
        String nome2 = "Carlos";
        String nome3 = new String("Carlos");
        String res;
        res = (nome1==nome2)?"igual":"diferente";
        System.out.println(res);
        res = (nome1==nome3)?"igual":"diferente";
        System.out.println(res);
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
