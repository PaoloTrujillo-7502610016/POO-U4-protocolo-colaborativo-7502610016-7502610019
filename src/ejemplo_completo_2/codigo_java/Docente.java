package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Persona {
    private String numeroContrato;

    public Docente(String nombre, String documento, String email, String numeroContrato) {
        super(nombre,documento, email);
        this.numeroContrato = numeroContrato;
        this.asignaturas = new ArrayList<>();
    }

    public void calificar(){
        System.out.println("El docente "+getNombre()+" ha calificado");
    }

    /*Asociacion muchos a muchos: */
    private List<Asignatura> asignaturas;

    public void agregarAsignatura(Asignatura asignatura){
        asignaturas.add(asignatura);
    }
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

}
