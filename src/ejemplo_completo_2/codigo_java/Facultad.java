package ejemplo_completo_2.codigo_java;

import java.util.ArrayList;
import java.util.List;

public class Facultad {

    private  String nombre;
    private String codigo;

    public Facultad(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.programas = new ArrayList<>();
    }


    /*Composicion: */
    private List<Programa> programas;
    public Facultad(Programa programa) {
        programas = new ArrayList<>();
        programas.add(programa);
    }
    public void agregarPrograma(Programa programa) {
        programas.add(programa);
    }
    public boolean eliminarPrograma(Programa programa) {
        if (programas.size() > 1) {
            return programas.remove(programa);
        }
        return false;
    }
    public List<Programa> getProgramas() {
        return programas;
    }
    //Un Programa pertenece a una facultad especifica y normalmente no tiene sentido como elemento independiente de dicha Ffacultad

}
