package TP5;
//Esteban Josué Verza   Facundo Luis Ferrara    Villalba Pedro  Neston Laurore
import java.util.Scanner;

public class UsoFacultad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Facultad facu1 = new Facultad();

        int cant = facu1.CrearFacultad();

        Estudiante[] estudiantes = new Estudiante[cant];
        facu1.CargarAlumnos(estudiantes);

        Estudiante.ListarAlumnos(estudiantes);

        Estudiante.BuscarAlumno(estudiantes);

    }
}


/*
Ejercicio 01: La Facultad
Crear un programa que conste de tres clases:
UsoFacultad: Clase principal  */