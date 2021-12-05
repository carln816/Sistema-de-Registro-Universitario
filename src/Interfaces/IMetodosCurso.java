package Interfaces;

import Clases.Curso;
import java.util.ArrayList;

public interface IMetodosCurso {
    
    boolean agregarCurso(ArrayList<Curso> listaCurso, Curso curso);
     Curso consultarCurso(ArrayList<Curso> listaCurso, String codigoCurso);
}
