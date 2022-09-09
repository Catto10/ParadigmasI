package Figuras;


public class Cuadrado extends Figura {

    private double lado1;

    private double area;

    private double perimetro;



    public Cuadrado(double lado1) {

        this.lado1 = lado1;



    }



    @Override

    public double calcularArea() {

        area = (lado1*lado1);

        return area;

    }



    @Override

    public double calcularPerimetro() {

        return 4*lado1;

    }



    @Override

    public String toString() {

        return "Cuadrado{" +

                "lado1=" + lado1 +

                ", Area=" + calcularArea() +

                ", perimetro=" + calcularPerimetro() +

                '}';

    }

}