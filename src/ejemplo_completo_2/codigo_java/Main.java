package ejemplo_completo_2.codigo_java;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Desarrollado por Paolo***");
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


        /*Instancia de la clase Asignatura*/
        Asignatura asignatura1 = new Asignatura(
                "Programacion Orientada a Objetos",
                "1002546",
                30);

        /*Isntancia de la clase Docente*/
        Docente docente1 = new Docente(
                "Javier Lara",
                "80001254",
                "jlara@unicartagena.com",
                "2026-2");

        /*Instancia de la clase Matricula*/
        Matricula matricula1= new Matricula(
                LocalDate.of(2026,11,10),
                4.5,
                "Aprobada",
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





    }

}
