package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    private String nombre;
    private String codigo;


    /*Agregacion: */
    private List<Estudiante> estudiantes;
    public Programa(){
        estudiantes = new ArrayList<>();
    }
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
