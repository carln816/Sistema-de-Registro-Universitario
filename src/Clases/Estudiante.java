package Clases;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante extends Persona  {
    private String carnetEstudiante;
    private ArrayList<Curso> cursos;
    
    public Estudiante(){
    }

    public Estudiante(String carnetEstudiante, String nombre, 
            String apellido, Date fechaNacimiento, String cedula) {
        super(nombre, apellido, fechaNacimiento, cedula);
        this.carnetEstudiante = carnetEstudiante;
        this.cursos = new ArrayList<>();
    }

     public String getCarnetEstudiante() {
        
        return this.carnetEstudiante;
    }

    public void setCarnetEstudiante(String carnetEstudiante) {
        this.carnetEstudiante = carnetEstudiante;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }    
}
