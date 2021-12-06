package uaslp.objetos.figuras;

public class Triangulo {
    private double altura;
    private double base;
    private double area;

    public Triangulo(double base, double altura){
       this.base=base;
       this.altura=altura;
    }
    public Triangulo(){

    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        area=(base*altura)/2;
        return area;
    }

    public double getAltura() {
        return altura;
    }
}
