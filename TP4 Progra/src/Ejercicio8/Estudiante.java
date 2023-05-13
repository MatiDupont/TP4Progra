package Ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona{
    // En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
    private List<Curso> cursoMatriculado;

    public Estudiante(String nombre, String apellido, int DNI, EstadoCivil estado) {
        super(nombre, apellido, DNI, estado);
        this.cursoMatriculado = new ArrayList<>();

    }

    // Matriculación de un estudiante en un nuevo curso.
    public void matriculacionNuevoCurso(Curso nuevoCursoMatriculado){
        if (!cursoMatriculado.contains(nuevoCursoMatriculado)) {
            System.out.println("Te has matriculado exitosamente a la materia " + nuevoCursoMatriculado);
            this.cursoMatriculado.add(nuevoCursoMatriculado);
        }
        else {
            System.out.println("Ya estas inscripto en ese curso (" + nuevoCursoMatriculado + ") actualmente");
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "Estudiante{" +
                "nombre=" + getNombre() + ", " +
                "apellido=" + getApellido() + ", " +
                "DNI=" + getDNI() + ", " +
                "estadoCivil=" + getEstado() + ", " +
                "cursoMatriculado=" + cursoMatriculado +
                '}' + '}';
    }
}
