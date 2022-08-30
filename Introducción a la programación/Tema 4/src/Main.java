public class Main {

    public static void main(String[] args) {

        /// Sentencia if ///
        System.out.println("Resultado de la sentencia if:");
        int numeroIf = 17;

        if (numeroIf > 0) {
            System.out.println("El número ingresado es positivo.");
        } else if (numeroIf < 0) {
            System.out.println("El número ingresado es negativo.");
        } else {
            System.out.println("El número ingresado es 0.");
        }
        /// Sentencia while ///
        System.out.println("Resultado de la sentencia while:");
        int numeroWhile = -1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        /// Sentencia do while ///
        System.out.println("Resultado de la sentencia do while:");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);


        /// Sentencia for ///
        System.out.println("Resultado de la sentencia for:");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        /// Sentencia swift ///
        System.out.println("Resultado de la sentencia swift:");

        var estacion = "Otoño";

        switch (estacion) {
            case "Verano":
                System.out.println("La estación actual es: " + estacion);
                break;
            case "Otoño":
                System.out.println("La estación actual es: " + estacion);
                break;
            case "Invierno":
                System.out.println("La estación actual es: " + estacion);
                break;
            case "Primavera":
                System.out.println("La estación actual es: " + estacion);
                break;
            default:
                System.out.println("El texto ingresado no corresponde a una estación del año.");
        }
    }
}

