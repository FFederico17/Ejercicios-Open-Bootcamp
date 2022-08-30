public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Emiliano");
        persona.setEdad(36);
        persona.setTelefono(699342717);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Teléfono: " + persona.getTelefono());

    }
}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}