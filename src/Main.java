public class Main {

    public static void main(String[] args) {

        User standard = Singleton.getUtente();
        User santo = Singleton.getUtente();

        standard.stampaDettagli();

        santo.setNome("santo");
        santo.setEta(23);

        santo.stampaDettagli();
    }
}