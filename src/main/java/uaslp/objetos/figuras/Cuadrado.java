package uaslp.objetos.figuras;

public class Cuadrado extends Figura implements DrawableItem{
    private double lado;
    private double area;

    public void draw() {

    }

    public Cuadrado(double lado){
      this.lado=lado;
    }

    public Cuadrado() {

    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() throws LadoNoProvistoException{
        if(lado==0)
        {
            throw new LadoNoProvistoException();
        }
        area=lado*lado;
        return area;
    }

    public double getLado() {
        return lado;
    }

    public String getName() {
        return "Cuadrado";
    }
}
