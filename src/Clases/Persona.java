package Clases;

import java.util.Date;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String cedula;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido, Date fechaNacimiento, 
            String cedula){
               
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
    }

    public String getNombre() {
        
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        
        return this.cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
}
