package uaslp.objetos.escuela;

public class SalaC {

    private static SalaDeJuntas uniqueInstance;
    public static SalaDeJuntas getInstance() {
        if(uniqueInstance==null){
            uniqueInstance=new SalaDeJuntas();
        }
        return uniqueInstance;
    }


}
