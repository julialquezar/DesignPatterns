
public class Main {
    public static void main(String[] args) {
        Personatge lux = new Personatge("Lux", new AtacMagia());
        lux.atacar();
        lux.setEstrategia(new AtacEspasa());
        lux.atacar();
        lux.setEstrategia(new AtacArc());
        lux.atacar();
    }
}