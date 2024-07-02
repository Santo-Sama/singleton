public class User {
    private String nome;
    private int eta;

    public User(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void stampaDettagli(){
        System.out.println("nome:  "+nome);
        System.out.println("eta:   "+eta);
    }
}
