public class Main{
    public static void main(String[] args){
        ConfigManager configA = ConfigManager.getConfigManager();
        System.out.println("Idioma: " + configA.getIdioma());
        System.out.println("mode fosc: " + configA.getModeFosc());
        configA.setIdioma("anglès");
        ConfigManager configB = ConfigManager.getConfigManager();
        System.out.println("Idioma: " + configB.getIdioma());
        System.out.println("mode fosc: " + configB.getModeFosc());
        configB.setIdioma("Miau");
        System.out.println("Idioma: " + configA.getIdioma());
    }
}