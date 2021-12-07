package uaslp.objetos.escuela;

public class SalaDeJuntasFactory{

    private SalaDeJuntas sala;
     private static String salaa;
    public static SalaDeJuntas get(String sala) {
        switch (sala) {
            case "Sala A":
                return SalaA.getInstance();
            case "Sala B":
                return SalaB.getInstance();
            case "Sala C":
                return SalaC.getInstance();

        }
        return null;
    }
}
