package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    private String codigo;

    private List<Matricula> matriculas; /*Asociacion*/
    //Un Estudiante puede tener 0 a muchas matriculas

    public Estudiante(String nombre, String documento, String email, String codigo ) {
        super(nombre, documento, email);
        this.codigo = codigo;
        this.matriculas = new ArrayList<>();
    }
    public void agregarMatricula(Matricula matricula) {
        matriculas.add(matricula);
    }
    public String getCodigo() {
        return codigo;
    }
    public List<Matricula> getMatriculas() {
        return matriculas;
    }

}
