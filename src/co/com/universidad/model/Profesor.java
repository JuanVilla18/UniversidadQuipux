
package co.com.universidad.model;


//La clase profesor hereda de la clase persona
public class Profesor extends Persona{
    
//Instanciamos la clase materia para asignarsela a el profesor
    private Materia materia;

//Geteamos una materia de un profesor por medio de su entidad
    public Materia getMateria() {
        return materia;
    }

//Seteamos una materia al profesor por medio de la entidad de materia
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

}
