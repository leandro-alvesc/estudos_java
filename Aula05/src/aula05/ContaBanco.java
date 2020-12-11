package aula05;
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Metodos Especiais
    public ContaBanco () {
        this.saldo=0;
        this.status=false;
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    public String getTipo() {
        return tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return status;
    }
    
    //Metodos Especificos
    public void estadoAtual(){
        String s = null;
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        if (this.getStatus()) {
            s = "Aberta";
        } else {
            s = "Fechada";
        }
        System.out.println("Status: " + s);
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta criada com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Retire o saldo disponível antes de fechar a conta!");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta negativa. Por favor pague antes de fechar a conta!");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depositado com sucesso!");
        } else {
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Valor sacado com sucesso na conta de" + this.getDono());
            } else {
                System.out.println("ERRO! Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar! (Conta inexistente)");
        }
    }
    public void pagarMensal(){
        float v;
        if (this.getTipo()=="CC") {
            v = 12;
        } else {
            v = 20;
        }
        if (this.getStatus()) {
            if (this.getSaldo()>v) {
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Pagamento realizado!");
            } else {
                System.out.println("Saldo insuficiente!");
            }
        } else {
            System.out.println("Impossível pagar!");
        }
    }
}
