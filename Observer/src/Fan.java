public class Fan implements Observador{
    private String nom;

    public Fan(String nom){
        this.nom = nom;
    }

    public void rebreNotificacio(String nomArtista, String nomCanco){
        System.out.println("Hola " + nom + "! L'artista " + nomArtista + " ha publicat la nova cançó " + nomCanco + "! Disfruta-la pai@");
    }
}
