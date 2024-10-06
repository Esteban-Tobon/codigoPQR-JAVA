package com.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sede =  new Scanner(System.in);
       System.out.println("\nSelecione la  sede a la cual desea realizar su PQRSF");
       System.out.println("1.Sede Bello");
       System.out.println("2. Otras Sedes");
    
       int eleccion = sede.nextInt();
       sede.nextLine();

       if (eleccion == 1) {
        System.out.println("\nSelecione tipo de usuario");
        System.out.println("1. Anonimo");
        System.out.println("2. Otros");
        System.out.println("3. Administrador");
        System.out.println("4. Salir");
        int usuarioSeleccionado = sede.nextInt();
        sede.nextLine();
        //Secre unsewitch  para   cada caso  de usuario

        switch (usuarioSeleccionado) {
            case 3:
            Administrador.main(args);
                break;
        
            default:
                break;
        }
        
       }else if (eleccion == 2) {
        System.out.println("usted debe dirigirse  ala web https://forms.office.com/Pages/ResponsePage.aspx?id=ZB3r34MsSkO_IcZpbVMi7DSiM9OjpPJDuahWiTvzBQpUMktRWlU2Vk83MUo4QVJNWEFSMkhFT1ZHNiQlQCN0PWcu");
       } else{
        System.out.println("Seleccione una opcion valida");
       }
        
    }
}