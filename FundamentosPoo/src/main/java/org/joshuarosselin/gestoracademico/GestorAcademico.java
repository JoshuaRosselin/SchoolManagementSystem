package org.joshuarosselin.gestoracademico;

import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private HashMap<Integer, ArrayList<Estudiante>> inscripciones = new HashMap<>();

    // Métodos para manejar estudiantes y cursos
    public void matricularEstudiante(Estudiante estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
        }
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws Exception {
        ArrayList<Estudiante> inscritos = inscripciones.getOrDefault(idCurso, new ArrayList<>());

        if (inscritos.contains(estudiante)) {
            throw new Exception("El estudiante ya está inscrito en este curso.");
        }

        inscritos.add(estudiante);
        inscripciones.put(idCurso, inscritos);
    }

    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws Exception {
        ArrayList<Estudiante> inscritos = inscripciones.get(idCurso);

        if (inscritos == null || !inscritos.removeIf(e -> e.getId() == idEstudiante)) {
            throw new Exception("El estudiante no está inscrito en este curso o el ID del curso es inválido.");
        }
    }
}

// Clases de apoyo
class Estudiante {
    private int id;
    // Otros atributos y métodos aquí

    public int getId() {
        return id;
    }
}

class Curso {
    // Atributos y métodos aquí
}


