package proyecto_progra2;

import Clases.Usuario;
import UI.Login;
import UI.VentanaPrincipal;

public class Proyecto_PrograII {

    public static VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
    
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario ("Carlos","1234");
        
        
        
        ventanaPrincipal.listaUsuario.add(usuario1);
      
        new Login().show();
    }
    
}
