package com.example;

import java.util.Scanner;
//secrea la clase administrador con le usrio y contraseña determinado
public class Administrador  {
    static final String USER = "user";
    static final String PASSWORD ="password";
    
    
    public static void main(String[] args) {

        //Acciones del administrado
        Scanner administrador =new Scanner(System.in);
        boolean  accesoCorrecto = false;

        while (!accesoCorrecto) {
            System.out.println("Por favor, Inicie sesion");
            System.out.println("Ingrese su Usuario");
            String userName =administrador.nextLine();
            System.out.println("Ingrese contraseña");
            String passwordTry = administrador.nextLine();

            //sevalidar usrio y contraseña correcto

            if (USER.equals(userName) && PASSWORD.equals(passwordTry)) {
                accesoCorrecto = true;
                System.out.println("Acceso correcto");
                
            } else {
                System.out.println("usrio o contraseña incorrrectos. Intente de nuevo");
            }
            
        }


        do {
            System.out.println("\nElija su tarea");
            System.out.println("1. Validar QRSF");
            System.out.println("2. Responder QRSF");
            System.out.println("3. Salir");
            int tarea = administrador.nextInt();
            administrador.nextLine();
        
            if (tarea == 1) {
                System.out.println("Hay PQRSF en su bandeja");
                
            } else if (tarea == 2 ){
                System.out.println("\nSelecione que desea responder");
                System.out.println("1. Peticiones");
                System.out.println("2. Quejas");
                System.out.println("3. Reclamos");
                System.out.println("4. Sugerencias");
                System.out.println("5. Felicitaciones");
                System.out.println("6. Volver");
            
                int responder =administrador.nextInt();
                administrador.nextLine();
            }else if (tarea == 3){
                System.out.println("Saliendo del sistema");
                break;
            } else {
                System.out.println("Ingrese una opcion valida. ");
            }
             } while (true);

            administrador.close();
             }
             }