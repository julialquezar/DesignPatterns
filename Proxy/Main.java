package Proxy;
public class Main{
    public static void main(String[] args){
        DocumentProxy document = new DocumentProxy("hola");
        document.llegir("blabla");
        document.llegir("hola");
    }
}
