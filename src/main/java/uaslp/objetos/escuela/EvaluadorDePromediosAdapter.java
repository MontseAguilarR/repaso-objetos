package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private EvaluadorDePromedios evaluadorDePromedios;

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios){
        this.evaluadorDePromedios=evaluadorDePromedios;
    }


    public double evalua(String Calificaciones) {

       // String[] strArr=Calificaciones.split(",");
        List<Double> list=new ArrayList(Collections.singleton(Calificaciones.split(",")));
        Double.valueOf(Calificaciones);

        for(double c: list){




        }

          return evalua(Calificaciones);
    }




}
