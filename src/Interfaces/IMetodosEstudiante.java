package Interfaces;

import Clases.Curso;
import Clases.Estudiante;
import Clases.Profesor;
import java.util.ArrayList;

public interface IMetodosEstudiante {
    
    boolean agregarEstudiante(ArrayList<Estudiante> listaEstudiante, Estudiante estudiante);
    Estudiante consultarEstudiante(ArrayList<Estudiante> listaEstudiante, String carnetEstudiante);
    void asignarCursoEstudiante(Estudiante estudianter, Curso curso);
}
