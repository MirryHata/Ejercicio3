package com.salazar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {
    public Lector() {
    }

    public static int solicitarEntero(String mensaje) {
        Scanner lector = new Scanner(System.in);
        System.out.println(mensaje);

        try {
            int numero = lector.nextInt();
            return numero;
        } catch (InputMismatchException var3) {
            System.out.println("El dato ingresado no es válido");
            solicitarEntero(mensaje);
            return solicitarEntero(mensaje);
        }
    }

    public static double solicitarDouble(String mensaje) {
        Scanner lector = new Scanner(System.in);
        System.out.println(mensaje);

        try {
            double numero = lector.nextDouble();
            return numero;
        } catch (InputMismatchException var4) {
            System.out.println("El dato ingresado no es valido");
            solicitarDouble(mensaje);
            return solicitarDouble(mensaje);
        }
    }
}