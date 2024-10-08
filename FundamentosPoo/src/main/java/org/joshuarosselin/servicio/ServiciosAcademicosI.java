package org.joshuarosselin.servicio;

public interface ServiciosAcademicosI {
    void matricularEstudiante(Estudiante estudiante) throws EstudianteYaInscritoException;
    void agregarCurso(Curso curso) throws CursoYaExisteException;
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;
}
