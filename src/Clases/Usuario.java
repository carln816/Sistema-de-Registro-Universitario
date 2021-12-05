package Clases;

public class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario() {
    }
    
    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombreUsuario() {
        
        return this.nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        
        return this.contrasena;
    }

    public void setContraseña(String contrasena) {
        this.contrasena = contrasena;
    }
}
