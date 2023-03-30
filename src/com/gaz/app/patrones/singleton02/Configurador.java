package com.gaz.app.patrones.singleton02;

public class Configurador {

    private String carpeta;

    // Step 1: Se declara el constructor privado
    private Configurador(String carpeta) { // <- CONSTRUCTOR
        this.carpeta = carpeta;
    }

    // 2. tener un Metodo Plubico Estatico
    // EN Un metodo static, No hace falta crear Objetos para Invocarlos.
    // Un Constructor que sea privado se puede llamar desde la misma clase
    // Una variable privada se puede invocar desde la clase que esta declarada.
    public  static Configurador getInstance(){
     return new Configurador("Carpeta Singleton"); // <- CONSTRUCTOR
    }

    public String getCarpeta() {

        return carpeta;
    }

    public void setCarpeta(String carpeta) {

        this.carpeta = carpeta;
    }
}
