import java.util.ArrayList;

public class Artista{
    private String nom;
    private ArrayList<Observador> seguidors;

    public Artista(String nom){
        this.nom = nom;
        seguidors = new ArrayList<Observador>();
    }

    public void afegirSeguidor(Observador o){
        seguidors.add(o);
    }

    public void eliminarSeguidor(Observador o){
        seguidors.remove(o);
    }

    public void notificarTots(String titolCanco){
        for(int i = 0; i < seguidors.size(); i++){
            seguidors.get(i).rebreNotificacio(nom, titolCanco);
        }
    }

    public void treureNouSingle(String titol){
        System.out.println("Atenció! L'artista " + nom + " ha tret el nou single: " + titol);
    }

}
