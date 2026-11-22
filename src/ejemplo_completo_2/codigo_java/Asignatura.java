package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private String nombre;
    private String codigo;
    private int creditos;

    /*Cosntructor: */
    public Asignatura(String nombre, String codigo, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.matriculas = new ArrayList<>();
        this.docentes = new ArrayList<>();
    }

    private List<Matricula> matriculas; /*Asociacion*/
    //Una asignatura puede tener 0 a muchas matriculas
    public void agregarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public List<Matricula> getMatriculas() {
        return matriculas;
    }


    /*Asociacion muchos a muchos: */
    private List<Docente> docentes;
    public void agregarDocente(Docente docente){
        docentes.add(docente);
    }
    public List<Docente> getDocentes() {
        return docentes;
    }


}
