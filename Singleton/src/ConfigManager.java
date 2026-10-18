public class ConfigManager{
    private String idioma;
    private boolean modeFosc;
    private static ConfigManager manejador;

    private ConfigManager(){
        this.idioma = "Català";
        this.modeFosc = false;
    }

    public static ConfigManager getConfigManager(){
        if(manejador == null){
            manejador = new ConfigManager();
        }
        return manejador;
    }

    public String getIdioma(){
        return idioma;
    }

    public boolean getModeFosc(){
        return modeFosc;
    }

    public void setIdioma(String idioma){
        this.idioma = idioma;
    }

    public void setModeFosc(boolean mode){
        this.modeFosc = mode;
    }
}