package operadorternario;
public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2, n3, r;
        boolean b;
        n1 = 6;
        n2 = 8;
        n3 = 15;
        r = n1>n2 ? n1+n2:n1-n2;
        System.out.println(r);
        
        b = (n1 < n2 || n1 > n3)?true:false;
        System.out.println(b);
        b = (n1 < n2 && n1 > n3)?true:false;
        System.out.println(b);
    }
    
}
