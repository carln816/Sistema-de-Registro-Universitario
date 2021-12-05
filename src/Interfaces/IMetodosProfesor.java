package Interfaces;

import Clases.Curso;
import Clases.Profesor;
import java.util.ArrayList;

public interface IMetodosProfesor {
    
    boolean agregarProfesor(ArrayList<Profesor> listaProfesor, Profesor profesor);
    Profesor consultarProfesor(ArrayList<Profesor> listaProfesor, String carnetProfesor);
    void asignarCursoProfesor(Profesor profesor, Curso curso);
}
