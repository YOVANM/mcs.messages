package com.yorhan;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String option = "";
        Scanner reader = new Scanner(System.in);
        do {
            System.out.println("--------------------------------------------");
            System.out.println("Menu de mensajeria");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Eliminar mensaje");
            System.out.println("3. Actualizar mensaje");
            System.out.println("4. Obtener mensaje por id");
            System.out.println("5. Salir");

            //reading the user option
            System.out.print("Elija una opcion: ");
            option = reader.nextLine();
            //Cleaning of the string
            validateOption(option);
            switch (option){
                case "1":
                    System.out.println("Crear mensaje");
                    break;
                case "2":
                    System.out.println("Eliminar mensaje");
                    break;
                case "3":
                    System.out.println("Actualizar mensaje");
                    break;
                case "4":
                    System.out.println("Obtener mensaje por id");
                    break;
                default:
                    System.out.println("Salir");
                    break;
            }

        }while (!StringUtils.equals(option,"5"));
    }

    private static void validateOption(String option){
        //Cleaning of the string
        option = option.trim();
        System.out.println(option);
        if(!Pattern.matches("\\d+", option) || Integer.valueOf(option) > 5 || Integer.valueOf(option) < 1 ){
            System.out.println("Por favor ingrese una opcion valida");
            try {
                //Showing the message for 3 seconds
                Thread.sleep(3000);
                //Cleaning the console
                System.out.print("\033[H\033[2J");
                System.out.flush();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}