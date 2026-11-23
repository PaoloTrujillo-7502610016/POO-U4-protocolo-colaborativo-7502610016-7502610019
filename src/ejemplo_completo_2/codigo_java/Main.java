package ejemplo_completo_2.codigo_java;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n*** SISTEMA ACADEMICO ***\n");
        // construye los objetos (instancias de las clases)
        // utiliza los objetos para invocar los métodos
        // Trata que el programa sea funcional.
        // Pe: ejecutarlo muestra información sobre los objetos (propiedades y salida de los métodos)


        /*Instancia de la clase Estudiante*/
        Estudiante estudiante1 = new Estudiante(
                "Paolo Trujillo",
                "1077866",
                "ptrujilloa@unicartagena.edu.co",
                "7502610016");

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);


        /*Instancia de la clase Asignatura*/
        Asignatura asignatura1 = new Asignatura(
                "Programacion Orientada a Objetos",
                "1002546",
                30);
        List<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(asignatura1);

        /*Isntancia de la clase Docente*/
        Docente docente1 = new Docente(
                "Javier Lara",
                "80001254",
                "jlara@unicartagena.com",
                "2026-2");
        List<Docente> docentes = new ArrayList<>();
        docentes.add(docente1);

        /*Instancia de la clase Matricula*/
        Matricula matricula1= new Matricula(
                LocalDate.of(2026,11,10),
                4.5,
                estudiante1,asignatura1);

        /*Asociaciones de clases*/
        estudiante1.agregarMatricula(matricula1);
        asignatura1.agregarMatricula(matricula1);
        docente1.agregarAsignatura(asignatura1);
        asignatura1.agregarDocente(docente1);

        /*Instnacia de la clase Programa*/
        Programa programa1 = new Programa(
                "Ingenieria de Software",
                "456789");
        programa1.agregarEstudiante(estudiante1);

        /*Instanacia de la clase Facultad*/
        Facultad facultad1  = new Facultad(
                "Facultad de Ingenieria",
                "456-123");
        facultad1.agregarPrograma(programa1);
        List<Facultad> facultades = new ArrayList<>();
        facultades.add(facultad1);

        /*Mostrar informacion de los objetos*/
        System.out.println("\nDatos del estudiante:\n");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Documento: " + estudiante1.getDocumento());
        System.out.println("Email: " + estudiante1.getEmail());
        System.out.println("Codigo: " + estudiante1.getCodigo());
        System.out.println("El estudiante "+estudiante1.getNombre()+" esta matriculado al curso de "+asignatura1.getNombre());

        System.out.println("\nDatos de la asignatura:\n");
        System.out.println("Nombre: " + asignatura1.getNombre());
        System.out.println("Codigo: " + asignatura1.getCodigo());
        System.out.println("Creditos: " + asignatura1.getCreditos());

        System.out.println("\nDatos de la matricula:\n");
        System.out.println("Fecha: " + matricula1.getFecha());
        System.out.println("Nota final: " + matricula1.getNotaFinal());
        System.out.println("Estado: " + matricula1.calcularEstado());

        System.out.println("\nDatos del docente:\n");
        System.out.println("Nombre: " + docente1.getNombre());
        System.out.println("Contrato: " + docente1.getNumeroContrato());
        System.out.println("Asignatura encargada: " + asignatura1.getNombre());
        docente1.calificar();

        System.out.println("\nEstructura academica:\n");
        System.out.println("Facultad: " + facultad1.getNombre());
        System.out.println("Programa: " + programa1.getNombre());
        System.out.println("Total de estudiantes del programa: "+programa1.getEstudiantes().size());
        System.out.println("Total de programas de la facultad: "+facultad1.getProgramas().size());


    }

}
