public class Singleton {
    private static User utente;
    public static User getUtente(){
        if (utente == null ){
            utente = new User("utente",0);
        }
        return utente;
    }
}
