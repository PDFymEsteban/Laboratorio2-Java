package TFI02;

import java.util.Scanner;

public abstract class Personas {
    String nombre;
    String apellido;
    int legajo;

    public void modificarDatos(){

    }
}
/*
La Facultad contiene carreras.
Agregar Carreras a una Facultad.
Eliminar Carreras de la facultad.
Eliminar Estudiantes de una facultad implica que se elimine el estudiante de cada una de las materias a las cuales se inscribió.
Agregar materias a una Carreras.
Eliminar materias a una Carreras.
Editar materias a una Carreras.
Encontrar materias de una carreras en particular indicando el nombre de la materia. Si la materia existe nos deberá preguntar si deseamos modificar, eliminar o editar sus datos y realizar la tarea correspondiente según lo indique el usuario.
Agregar Estudiantes a una Materias.
Eliminar Estudiante de una Materias.
Modificar el Profesor de la materia.
Las clases Estudiantes y Profesores descienden de la clase abstracta Personas.
El método calcularSueldo() de la clase Profesores calcula el sueldo sumando un 10% al básico por cada año de antiguedad.
El método listarContenidos() de la interface Información lista los elementos de la clase contenida, es decir que de la clase Facultad se listará las Carreras, de la clase Carreras las materias, etc.
El método verCantidad() de la interface Información muestra la cantidad de elementos que contiene, es decir que en el caso de la clase Carreras, devolverá la cantidad de materias que posee, en el caso de la clase Materias, la cantidad de estudiantes que tienen, etc.
Los constructores de todas las clases deben inicializar o cargar cada uno de los atributos que posee.
Todas las clases deben tener los métodos toString() para ver todos los datos de la clase y los métodos geters y seter por cada una de sus atributos.
Todos los lugares que signifiquen el ingreso de datos deberán establecer controles por posibles ingresos erróneos de datos.

 */