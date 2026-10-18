package Proxy;

public class DocumentProxy implements Document{
    private DocumentReal documentReal;
    String contrassenya;

    public DocumentProxy(String contrassenya){
        this.contrassenya = contrassenya;
        this.documentReal = new DocumentReal();
    }

    public void llegir(String c){
        if(validarContrassenya(c)) documentReal.llegir(c);
    }
    public boolean validarContrassenya(String c){
        if(c.equals(contrassenya)) return true;
        else {
            System.out.println("Contrassenya incorrecta");
            return false;
        }
    }

}
