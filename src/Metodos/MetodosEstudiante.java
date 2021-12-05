package Metodos;

import Clases.Curso;
import Clases.Estudiante;
import Clases.Profesor;
import Interfaces.IMetodosEstudiante;
import java.util.ArrayList;

public class MetodosEstudiante implements IMetodosEstudiante {

    @Override
    public boolean agregarEstudiante(ArrayList<Estudiante> listaEstudiante, Estudiante estudiante) {
        for(int i = 0; i < listaEstudiante.size(); i++){
          if(listaEstudiante.get(i).getCedula().equals(estudiante.getCedula())){
          
              throw new AbstractMethodError("Estudiante ya existe");
          }
        }
        
        listaEstudiante.add(estudiante);
    
        return true;
        }
    @Override
    public Estudiante consultarEstudiante(ArrayList<Estudiante> listaEstudiante, String carnetEstudiante) {
        for(int i = 0; i < listaEstudiante.size(); i++){
            if(listaEstudiante.get(i).getCarnetEstudiante().equals(carnetEstudiante)){
                
                return listaEstudiante.get(i);
            }
        }
        
        return null;
        
    }
    @Override
    public void asignarCursoEstudiante(Estudiante estudiante, Curso curso) {
        estudiante.setCursos(curso);
    }
}
