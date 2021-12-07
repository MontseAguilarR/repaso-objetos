package uaslp.objetos.escuela;

public class SalaB {

    private static SalaDeJuntas uniqueInstance;
    public static SalaDeJuntas getInstance() {
        if(uniqueInstance==null){
            uniqueInstance=new SalaDeJuntas();
        }
        return uniqueInstance;
    }
}
