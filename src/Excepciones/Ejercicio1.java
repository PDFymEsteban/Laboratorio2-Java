package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;

        try {
            System.out.printf("ingrese un numero: ");
            numero=sc.nextInt();
            System.out.println("El numero ingresado es: "+numero);
        }catch (InputMismatchException e){
            System.out.println("Solo se puede ingresar numeros enteros");

        }
    }
}
