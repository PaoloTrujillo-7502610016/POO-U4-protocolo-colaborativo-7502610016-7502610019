package ejemplo_completo_2.codigo_java;

import java.time.LocalDate;

public class Matricula {

    private LocalDate fecha;
    private double notaFinal;
    private String estado;

    private Estudiante estudiante; /*Asociacion*/
    //Una matricula corresponde a un estudiante
    private Asignatura asignatura; /*Asociacion*/
    //Una matricula tiene una asignatura

    /*Constructor: */
    public Matricula(
            LocalDate fecha,
            double notaFinal,
            String estado,
            Estudiante estudiante,
            Asignatura asignatura) {
        this.fecha = fecha;
        this.notaFinal = notaFinal;
        this.estado = estado;
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public String getEstado() {
        return estado;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public Asignatura getAsignatura() {
        return asignatura;
    }

    public String calcularEstado() {
        if (notaFinal >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        return estado;
    }

}
