public class Main {

    public static void main(String[] args) {
        int sumaNumeros = suma(17, 66, 91);
        System.out.println("El resultado de la suma es: " + sumaNumeros);

        Coche miCoche = new Coche();
        miCoche.IncrementarPuertas();
        System.out.println("La cantidad de puertas es: " + miCoche.puertas);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;
    public void IncrementarPuertas() {
        this.puertas++;
    }
}
