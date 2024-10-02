package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creamos el escanaer  y la varible opcion
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        //solicitamos  que acepte lapolitica de datos   para poder   iniciar con la PQRSF
        System.out.println("Antes   de poder   tomar su PQR es fundamental informarle nuestra politica de manejo de datos");
        System.out.println("1.Acepto");
        System.out.println("2.No acepto");
        int desicion = scanner.nextInt();

        if (desicion == 1) {
            
        
        //Creamos un do con el menu de opciones
        do {
            System.out.println("\nMenú de PQR");
            System.out.println("1. Crear PQRSF");
            System.out.println("2.Salir");
            System.out.println("Selecione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            //Buffer  son los residuos en caso de que el usurio ingrese un spacio o algo extra


            //Cremos unswitch  que ejecute segun la opcion que el usuario elija
            switch (opcion) {
                case 1:
                System.out.println("Ingrese el tipo de PQRSF");
                System.out.println("1.Petcion");
                System.out.println("2.Queja");
                System.out.println("3.Reclamo");
                System.out.println("4.Sugerencia");
                System.out.println("5.Felicitaciones");
                //creamos la varible que guardar la decicion del  usuario
                int tipo = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner

                //Solicitamos los detalles de su PQRSF
                System.out.println("Ingrese la  descripcion");
                String descripcion = scanner.nextLine();
                    break;
                case 2:
                System.out.println("Saliendo del sistema gracias por su tiempo");
                scanner.nextLine(); // Limpiar el buffer del scanner
                default:
                System.out.println("Opcion no valida");  
                    break;
            
        }
    } // creamos un while  para informar que siempre que la opcion no sea 2 de ejecutar el do
     while (opcion !=2 );
     
    } 
    //Encaso  del usurio  no acepte se le informa que no se puede continuar con la pqr
    else {
        System.out.println("Entendemos gracias por su tiempo en este caso no es posible continuar con el proceso.");
        scanner.close();
    }
} 
}