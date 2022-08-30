public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Fernando Morel");
        cliente.setEdad(34);
        cliente.setTelefono(699562318);
        cliente.setCredito(3480);

        System.out.println("Datos del cliente:");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito: " + cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Miguel Juárez");
        trabajador.setEdad(49);
        trabajador.setTelefono(699390755);
        trabajador.setSalario(2800);

        System.out.println("Datos del trabajador:");
        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Crédito: " + trabajador.getSalario());
    }
}

class Persona {
    String nombre;
    int edad;
    int telefono;

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
class Cliente extends Persona {
    int credito;

    public void setCredito(int credito) {

        this.credito = credito;
    }
    public int getCredito() {

        return this.credito;
    }
}
class Trabajador extends Persona {
    int salario;

    public void setSalario(int salario) {

        this.salario = salario;
    }

    public int getSalario() {
        return this.salario;
    }

}
