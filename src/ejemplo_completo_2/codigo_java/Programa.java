package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private String nombre;
    private String codigo;

    public Programa(String nombre, String codigo) {
        this.nombre=nombre;
        this.codigo=codigo;
        this.estudiantes=new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }

    /*Agregacion: */
    private List<Estudiante> estudiantes;
    public void agregarEstudiante(Estudiante estudiante){ /*Metodo para agregar nuevo estudiante a la lista de Estudiantes*/
        estudiantes.add(estudiante);
    }
    public void eliminarEstudiante(Estudiante estudiante){ /*Metodo para eliminar estudiante de la lista de Estudiantes*/
        estudiantes.remove(estudiante);
    }
    public List<Estudiante> getEstudiantes() { /*Metodo para mostrar todos los estudiantes de la lista*/
        return estudiantes;
    }

}
