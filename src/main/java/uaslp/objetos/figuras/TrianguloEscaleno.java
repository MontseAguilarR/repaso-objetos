package uaslp.objetos.figuras;

public class TrianguloEscaleno extends Triangulo{

    private String description;

    @Override
    public String getDescription() {
        return "Lados diferentes";
    }

    public String getName() {
        return "Triangulo Escaleno";
    }
}
