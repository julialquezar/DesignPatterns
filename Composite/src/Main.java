//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Exercici martillo = new Exercici("martillo", 10);
        Exercici predicador = new Exercici("predicador", 12);

        SuperSerie biceps = new SuperSerie("biceps");
        biceps.afegirExercici(martillo);
        biceps.afegirExercici(predicador);

        System.out.println(biceps);

        Exercici pressMilitar = new Exercici("press militar", 15);
        SuperSerie brazo = new SuperSerie("brazo");
        brazo.afegirExercici(biceps);
        brazo.afegirExercici(pressMilitar);

        System.out.println(brazo);

    }
}