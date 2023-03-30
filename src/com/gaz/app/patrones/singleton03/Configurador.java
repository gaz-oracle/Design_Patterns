package com.gaz.app.patrones.singleton03;

public class Configurador {

    private String carpeta;

    private static Configurador configurador;

    private Configurador(String carpeta) {
        this.carpeta = carpeta;
    }

    public  static Configurador getInstance(){
        /*
    Configurador@7a81197d
    Configurador@5ca881b*/
        if(configurador == null){
            // Solo se ejecuta una vez asignando
            configurador = new Configurador("Carpeta Singleton");
        }
        return configurador;
    /*
     Configurador@7a81197d
     Configurador@7a81197d
     */

    }

    public String getCarpeta() {

        return carpeta;
    }

    public void setCarpeta(String carpeta) {

        this.carpeta = carpeta;
    }
}
