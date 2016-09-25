
package co.com.universidad.model;

//Entidad: Estudiante - La clase estudiante hereda de la clase persona
public class Estudiante extends Persona {
    
//Declaramos los atributos nesesarios
    private int semestre;

//Geteamos el semestre actual del estudiante
    public int getSemestre() {
        return semestre;
    }

//Seteamos el semestre actual del estudiante
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
}
