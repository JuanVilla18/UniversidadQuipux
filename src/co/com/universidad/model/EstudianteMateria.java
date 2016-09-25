
package co.com.universidad.model;

import java.util.ArrayList;


public class EstudianteMateria {
    
//Instanciamos las entidades nesesarias para implementar nuestros Getters and Setters
    private Estudiante estudiante;
    private Profesor profesor;
    private ArrayList<Double> notas = new ArrayList<>();

//Getear un estudiante mediante la entidad de estudiante
    public Estudiante getEstudiante() {
        return estudiante;
    }

//Setear un estudiante mediante la entidad de estudiante
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

//Getear un profesor mediante la entidad de estudiante
    public Profesor getProfesor() {
        return profesor;
    }

//Setear un profesor mediante la entidad de estudiante
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

//Getear las notas desde un ArrayList de doubles llamado notas
    public ArrayList<Double> getNotas() {
        return notas;
    }

//Setear las notas a un ArrayList de doubles llamado notas
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
}