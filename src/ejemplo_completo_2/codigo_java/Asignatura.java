package ejemplo_completo_2.codigo_java;

import java.util.List;

public class Asignatura {
    private String nombre;
    private String codigo;
    private int creditos;

    private List<Matricula> matriculas; /*Asociacion*/
    //Una asignatura puede tener 0 a muchas matriculas

    private List<Docente> docentes; /*Asociacion*/
    //Una asignatura puede tener 0 o muchos docentes

}
