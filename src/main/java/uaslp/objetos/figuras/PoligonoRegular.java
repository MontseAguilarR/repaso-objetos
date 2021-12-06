package uaslp.objetos.figuras;

import static java.lang.Math.sqrt;

public class PoligonoRegular {
    private int numeroDeLados;
    private double lado;
    private double area;

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }
    public PoligonoRegular(int numeroDeLados){
       this.numeroDeLados=numeroDeLados;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        area=(3*sqrt(3))*(lado*lado)/2;
        return area;
    }
}
