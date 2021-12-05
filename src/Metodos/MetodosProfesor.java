package Metodos;


import Clases.Curso;
import Clases.Profesor;
import Interfaces.IMetodosProfesor;
import java.util.ArrayList;

public class MetodosProfesor implements IMetodosProfesor {

    @Override
    public boolean agregarProfesor(ArrayList<Profesor> listaProfesor, Profesor profesor) {
        for(int i = 0; i < listaProfesor.size(); i++){
          if(listaProfesor.get(i).getCarnetProfesor().equals(profesor.getCarnetProfesor())){
          
              throw new AbstractMethodError("Profesor ya existe");
          }
        }
        
        listaProfesor.add(profesor);
    
        return true;
        }
    
    @Override
    public Profesor consultarProfesor(ArrayList<Profesor> listaProfesor, String carnetProfesor) {
        for(int i = 0; i < listaProfesor.size(); i++){
            if(listaProfesor.get(i).getCarnetProfesor().equals(carnetProfesor)){
                
                return listaProfesor.get(i);
            }
        }
        
        return null;
    
    }
    
    @Override
    public void asignarCursoProfesor(Profesor profesor, Curso curso) {
        profesor.setCursos(curso);
    }
    
}
