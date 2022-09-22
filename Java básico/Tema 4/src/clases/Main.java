package clases;


public class Main {

    public static void main(String[] args) {


        Smartphone samsungS22 = new Smartphone("Samsung", "S22", "Negro", "Android",
                5.9, 3700, true, true);

        Smartwatch appleWatch = new Smartwatch("Apple", "Series 7", "Rojo", "watchOS",
                1.8, 284, true, true);


        System.out.println("Mi smartphone:");
        System.out.println("Marca: " + samsungS22.brand);
        System.out.println("Modelo: " + samsungS22.model);
        System.out.println("Color: " + samsungS22.color);
        System.out.println("Sistema operativo: " + samsungS22.os);
        System.out.println("Tamaño de la pantalla: " + samsungS22.displaySize);
        System.out.println("Capacidad de batería: " + samsungS22.battery);
        System.out.println("¿Es resistente al agua?: " + samsungS22.waterproof);
        System.out.println("¿Tiene carga rápida?: " + samsungS22.quickCharge);

        System.out.println("-------------------------------");

        System.out.println("Mi smartwatch:");
        System.out.println("Marca: " + appleWatch.brand);
        System.out.println("Modelo: " + appleWatch.model);
        System.out.println("Color: " + appleWatch.color);
        System.out.println("Sistema operativo: " + appleWatch.os);
        System.out.println("Tamaño de la pantalla: " + appleWatch.displaySize);
        System.out.println("Capacidad de batería: " + appleWatch.battery);
        System.out.println("¿Es resistente al agua?: " + appleWatch.waterproof);
        System.out.println("¿Tiene carga rápida?: " + appleWatch.quickCharge);

    }

}

