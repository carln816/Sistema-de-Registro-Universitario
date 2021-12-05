package Metodos;

import Clases.Curso;
import Interfaces.IMetodosCurso;
import java.util.ArrayList;

public class MetodosCurso implements IMetodosCurso {

    @Override
    public boolean agregarCurso(ArrayList<Curso> listaCurso, Curso curso) {
        for(int i = 0; i < listaCurso.size(); i++){
          if(listaCurso.get(i).getCodigoCurso().equals(curso.getCodigoCurso())){
          
              throw new AbstractMethodError("Curso ya existe");
          }
        }
        
        listaCurso.add(curso);
    
        return true;
        }
    
      @Override
    public Curso consultarCurso(ArrayList<Curso> listaCurso, String codigoCurso) {
        for(int i = 0; i < listaCurso.size(); i++){
            if(listaCurso.get(i).getCodigoCurso().equals(codigoCurso)){
                
                return listaCurso.get(i);
            }
        }
        
        return null;
        
    }
    
}
