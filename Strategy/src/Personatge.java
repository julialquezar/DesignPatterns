public class Personatge {
    private String nom;
    private EstrategiaAtac estrategiaActual;

    public Personatge(String nom, EstrategiaAtac estrategiaActual) {
        this.nom = nom;
        this.estrategiaActual = estrategiaActual;
    }

    public void setEstrategia(EstrategiaAtac novaEstrategia) {
        estrategiaActual = novaEstrategia;
    }

    public void atacar() {
        estrategiaActual.atacar();
    }
}
