package Interfaces;

import Clases.Usuario;
import java.util.ArrayList;

public interface IMetodosUsuario {
    
    boolean agregarUsuario(ArrayList<Usuario> listaUsuario, Usuario usuario);
    Usuario consultarUsuario(ArrayList<Usuario> listaUsuario, String nombreUsuario);
}
