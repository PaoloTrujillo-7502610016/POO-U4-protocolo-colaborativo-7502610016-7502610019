package ejemplo_completo_2.codigo_java;

import java.time.LocalDate;

public class Matricula {

    private LocalDate fecha;
    private double notaFinal;
    private String estado;

    public String calcularEstado() {
        return "";
    }

    private Estudiante estudiante; /*Asociacion*/
    //Una matricula corresponde a un estudiante

    private Asignatura asignatura; /*Asociacion*/
    //Una matricula tiene una asignatura

}
