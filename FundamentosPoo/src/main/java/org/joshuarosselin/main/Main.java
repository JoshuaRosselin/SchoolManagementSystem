package org.joshuarosselin.main;

import org.joshuarosselin.estudiante.Estudiante;
import org.joshuarosselin.gestoracademico.Curso;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de estudiantes y cursos
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Pérez", "2000-01-01", "Matriculado");
        Estudiante estudiante2 = new Estudiante(2, "María", "Gómez", "2001-02-02", "Matriculado");

        Curso curso1 = new Curso(1, "Matemáticas", "Curso de matemáticas básicas", 3, "1.0");
        Curso curso2 = new Curso(2, "Historia", "Curso de historia general", 4, "1.0");

        // Crear una instancia de GestorAcademico
        GestorAcademico gestor = new GestorAcademico();

        try {
            // Matricular estudiantes
            gestor.matricularEstudiante(estudiante1);
            gestor.matricularEstudiante(estudiante2);

            // Agregar cursos
            gestor.agregarCurso(curso1);
            gestor.agregarCurso(curso2);

            // Inscribir estudiantes en cursos
            gestor.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestor.inscribirEstudianteCurso(estudiante2, curso2.getId());

            // Desinscribir un estudiante de un curso
            gestor.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
