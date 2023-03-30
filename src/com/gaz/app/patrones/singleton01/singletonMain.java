package com.gaz.app.patrones.singleton01;

// A). Create objects Normal

public class singletonMain {

    public static void main(String[] args) {

        Configurador c = new Configurador("Mi carpeta");
        System.out.println(c.getCarpeta());

        Configurador c2 = new Configurador("Mi carpeta2");
        System.out.println(c2.getCarpeta());

    }


}
