package com.gaz.app.patrones.singleton02;


public class singletonMain2 {

    //B). Create Objects With Statiac

    public static void main(String[] args) {

       Configurador c1 = Configurador.getInstance();
        c1.setCarpeta("Set carpeta de C1");

        System.out.println(c1.getCarpeta());

        Configurador c2 = Configurador.getInstance();
        c2.setCarpeta("Set carpeta de C2");
        System.out.println(c2.getCarpeta());
        System.out.println(c1);
        System.out.println(c2);


    }


}
