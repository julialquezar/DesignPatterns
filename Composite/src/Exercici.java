public class Exercici implements Composite{
    private int temps;
    private String nom;

    public Exercici(String nom, int temps){
        this.nom = nom;
        this.temps = temps;
    }
    public int getTemps(){
        return temps;
    }
}
