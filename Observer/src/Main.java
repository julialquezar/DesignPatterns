//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Artista malcolmTodd = new Artista("Malcolm Todd");
        Fan julia = new Fan("julia");
        malcolmTodd.afegirSeguidor(julia);
        malcolmTodd.treureNouSingle("I Saw Your Face");
        malcolmTodd.notificarTots("I Saw Your Face");
    }
}