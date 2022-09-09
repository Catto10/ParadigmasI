package Figuras;



import Figuras.Cuadrado;

import Figuras.Figura;



public class Prueba {

    public static void main(String[] args) {

        Figura[] figs=new Figura[3];

        figs[0]=new Cuadrado(2);

        figs[1]=new Triangulo(4,4,4);

        figs[2]=new Cuadrado(4);



        for(Figura fg:figs){

            System.out.println(fg.toString());

        }

    }

}
