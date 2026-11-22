package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private String numeroContrato;

    public void calificar(){}

    /*Asociacion muchos a muchos: */
    private List<Asignatura> asignaturas;
    public Docente(){
        asignaturas = new ArrayList<>();
    }
    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

}
