package Metodos;

import Clases.Usuario;
import Interfaces.IMetodosUsuario;
import java.util.ArrayList;

public class MetodosUsuario implements IMetodosUsuario {

    @Override
    public boolean agregarUsuario(ArrayList<Usuario> listaUsuario, Usuario usuario) {
        for(int i = 0; i < listaUsuario.size(); i++){
          if(listaUsuario.get(i).getNombreUsuario().equals(usuario.getNombreUsuario())){
          
              throw new AbstractMethodError("Usuario ya existe");
          }
        }
        
        listaUsuario.add(usuario);
    
        return true;
        }    

    @Override
    public Usuario consultarUsuario(ArrayList<Usuario> listaUsuario, String nombreUsuario) {
        for(int i = 0; i < listaUsuario.size(); i++){
            if(listaUsuario.get(i).getNombreUsuario().equals(nombreUsuario)){
                
                return listaUsuario.get(i);
            }
        }
        
        return null;
        
    }
    
}
