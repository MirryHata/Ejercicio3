package com.salazar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        boolean i = true;
        int opcion;
        Scanner lector = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        System.out.println("--------BIENVENIDO A LA AGENCIA DE CARROS NO ME MANDE A REPO INGE--------");
        label56:
        do {
            System.out.println("1. Registro de vehiculo");
            System.out.println("2. Mostrar vehiculos");
            System.out.println("3. Salir");
            opcion = Lector.solicitarEntero("\nIngrese una opcion: ");
            switch (opcion) {
                case 1:
                    System.out.println("1. Toyota");
                    System.out.println("2. Ford");
                    System.out.println("3. Nissan");
                    System.out.println("4. Honda");

                    int marcaVehi = Lector.solicitarEntero("Ingrese la marca del vehiculo:");
                    int anio;
                    double precio;
                    String color = lector.nextLine();
                    if (marcaVehi == 1) {
                        System.out.println("Color del vehiculo:");
                        color = lector.nextLine();
                        anio = Lector.solicitarEntero("Año del vehiculo: ");
                        precio = Lector.solicitarEntero("Precio del vehiculo: ");
                        Toyota nuevoVehiculo = new Toyota();
                        nuevoVehiculo.ano = anio;
                        nuevoVehiculo.precio = precio;
                        nuevoVehiculo.color = color;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("El Vehiculo Toyota ha sido creado.");
                    } else if (marcaVehi == 2) {
                        System.out.println("Color del vehiculo:");
                        color = lector.nextLine();
                        anio = Lector.solicitarEntero("Año del vehiculo: ");
                        precio = Lector.solicitarEntero("Precio del vehiculo: ");
                        Ford nuevoVehiculo = new Ford();
                        nuevoVehiculo.ano = anio;
                        nuevoVehiculo.precio = precio;
                        nuevoVehiculo.color = color;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("El Vehiculo Ford ha sido creado.");
                    } else if (marcaVehi == 3) {
                        System.out.println("Color del vehiculo:");
                        color = lector.nextLine();
                        anio = Lector.solicitarEntero("Año del vehiculo: ");
                        precio = Lector.solicitarEntero("Precio del vehiculo: ");
                        Nissan nuevoVehiculo = new Nissan();
                        nuevoVehiculo.ano = anio;
                        nuevoVehiculo.precio = precio;
                        nuevoVehiculo.color = color;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("El Vehiculo Nissan ha sido creado.");
                    } else if (marcaVehi == 4) {
                        System.out.println("Color del vehiculo:");
                        color = lector.nextLine();
                        anio = Lector.solicitarEntero("Año del vehiculo: ");
                        precio = Lector.solicitarEntero("Precio del vehiculo: ");
                        Honda nuevoVehiculo = new Honda();
                        nuevoVehiculo.ano = anio;
                        nuevoVehiculo.precio = precio;
                        nuevoVehiculo.color = color;
                        vehiculos.add(nuevoVehiculo);
                        System.out.println("El Vehiculo Honda ha sido creado.");
                    } else {
                        System.out.println("El vehiculo que ingreso no existe, asi como el amor de ella.");
                    }
                    break;
                case 2:
                    if (vehiculos.isEmpty()) {
                        System.out.println("**** No hay vehiculos ****");
                    } else {
                        System.out.println("**** Mostrando vehiculos ****");
                    }

                    Iterator var5 = vehiculos.iterator();

                    while (true) {
                        if (!var5.hasNext()) {
                            continue label56;
                        }
                        Vehiculo c = (Vehiculo) var5.next();
                        if (c instanceof Toyota) {
                            System.out.println("Marca: Toyota");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.ano);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        } else if (c instanceof Nissan) {
                            System.out.println("Marca: Nissan");
                            System.out.println("Color: " + c.color);
                            System.out.println("Año: " + c.ano);
                            System.out.println("Precio: Lps. " + c.precio + "\n");
                        }
                    }
                case 3:
                    System.out.println("Adios");
                    i = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
        while (opcion != 3);
    }
}
