package projetovideo;
public class ProjetoVideo {
    public static void main(String[] args) {
        Video vi[] = new Video[3];
        vi[0] = new Video("Tutorial 1");
        vi[1] = new Video("Aula teórica 1");
        vi[2] = new Video("Gatinhos pulando");
        
        Viewer vw[] = new Viewer[2];
        vw[0] = new Viewer("Jose", "M", 22, "ze");
        vw[1] = new Viewer("Carla", "F", 23, "carlinha22");
        
        System.out.println(vw[0].toString());
        System.out.println(vi[0].toString());
    }
    
}
