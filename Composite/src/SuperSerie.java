import java.lang.reflect.Array;
import java.util.ArrayList;

public class SuperSerie implements Composite{
    private String nom;
    private ArrayList<Composite> exercicisSuperserie;

    public SuperSerie(String nom){
        exercicisSuperserie = new ArrayList<Composite>();
        this.nom = nom;
    }

    public void afegirExercici(Composite ex){
        exercicisSuperserie.add(ex);
    }

    public void removeExercici(Composite ex){
        exercicisSuperserie.remove(ex);
    }

    public ArrayList<Composite> getExercicis(){
        return exercicisSuperserie;
    }

    public int getTemps(){
        int temps = 0;
        for(int i = 0; i < exercicisSuperserie.size(); i++){
            temps = temps + exercicisSuperserie.get(i).getTemps();
        }
        return temps;
    }

    @Override
    public String toString() {
        return "SuperSerie{" +
                "nom='" + nom + '\'' +
                ", exercicisSuperserie=" + exercicisSuperserie +
                '}';
    }
}
