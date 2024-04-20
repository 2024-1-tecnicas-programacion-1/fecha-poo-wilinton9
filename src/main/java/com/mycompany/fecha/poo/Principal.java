package com.mycompany.fecha.poo;

public class Principal {
    // TODO: Aquí va el código de la clase Principal
    import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el día:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año:");
        int anno = scanner.nextInt();

        Fecha fecha = new Fecha(dia, mes, anno);
        if (fecha.validarFecha()) {
            System.out.println("La fecha ingresada es válida:");
            System.out.println("Fecha larga: " + fecha.fechaLarga());
        } else {
            System.out.println("La fecha ingresada no es válida.");
        }

        scanner.close();
    }
}

}
