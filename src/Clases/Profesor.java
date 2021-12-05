package Clases;

import java.util.ArrayList;
import java.util.Date;

public class Profesor extends Persona {
    private String carnetProfesor;
    private ArrayList<Curso> cursos;
    
    public Profesor (){
       
    }

    public Profesor(String carnetProfesor, String nombre, 
            String apellido, Date fechaNacimiento, String cedula) {
        super(nombre, apellido, fechaNacimiento, cedula);
        this.carnetProfesor = carnetProfesor;
        this.cursos = new ArrayList<>();
    }

    public String getCarnetProfesor() {
        
        return this.carnetProfesor;
    }

    public void setCarnetProfesor(String carnetProfesor) {
        this.carnetProfesor = carnetProfesor;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(Curso curso) {
        this.cursos.add(curso);
    }
}