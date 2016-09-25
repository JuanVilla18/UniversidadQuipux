
package co.com.universidad.model;


public class Materia {
    
//Declaramos los atributos nesesarios para una materia
    private int codigo;
    private String nombre;
    private String descripcion;
    private int creditos;

//Geteamos el codigo de una materia
    public int getCodigo() {
        return codigo;
    }

//Seteamos el codigo de una materia
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

//Geteamos el nombre de una materia
    public String getNombre() {
        return nombre;
    }

//Seteamos el nombre de una materia
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//Geteamos la descripcion de una materia
    public String getDescripcion() {
        return descripcion;
    }

//Seteamos la descripcion de una materia
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

//Geteamos los creditos de una materia
    public int getCreditos() {
        return creditos;
    }

//Seteamos los creditos de una materia
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

}
