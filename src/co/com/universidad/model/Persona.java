
package co.com.universidad.model;

//Entidad: Persona - La clase persona puede extender a otras clases
public class Persona {
    
//Agregamos atributos a la entidad (Los atributos son privados y los metodos para Getter and Setter publicos)
    private String numeroDocumento, nombre;   

//Geteamos el numero de documento de una persona (esta se usa tambien en las clases a las que hereda)
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

//Seteamos el numero de documento de una persona (esta se usa tambien en las clases a las que hereda)
    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

//Geteamos el nombre de una persona (esta se usa tambien en las clases a las que hereda)
    public String getNombre() {
        return nombre;
    }

//Seteamos el nombre de una persona (esta se usa tambien en las clases a las que hereda)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
