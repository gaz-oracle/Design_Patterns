package com.gaz.app.patrones.singleton03;



public class singletonMain3 {
    public static void main(String[] args) {

        Configurador c1 = Configurador.getInstance();
        // Configurador.getInstance();
        c1.setCarpeta("carpeta C1");
        System.out.println(c1.getCarpeta());

        Configurador c2 = Configurador.getInstance();
        c2.setCarpeta("carpeta C2");
        System.out.println(c2.getCarpeta());

        System.out.println("Value Object 1 = " + c1);
        System.out.println("Value Object 2 =" + c2);

        System.out.println(" ******** Apuntan a la misma Addrres");
        System.out.println(c1.getCarpeta());
        System.out.println(c2.getCarpeta());
        System.out.println("Solo se tiene un Objeto en Memoria");

    }
}
