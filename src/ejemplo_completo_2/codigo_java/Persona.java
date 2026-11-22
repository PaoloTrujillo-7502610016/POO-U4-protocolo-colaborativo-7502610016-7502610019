package ejemplo_completo_2.codigo_java;

public abstract class Persona {

    private String nombre;
    private String documento;
    private String email;

    public Persona(String nombre, String documento, String email) {
        this.nombre = nombre;
        this.documento = documento;
        this.email = email;
    }

}
