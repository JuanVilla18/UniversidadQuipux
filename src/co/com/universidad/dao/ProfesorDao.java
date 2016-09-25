
package co.com.universidad.dao;

import co.com.universidad.model.Profesor;
import java.util.ArrayList;

//Clase dao para profesor
public class ProfesorDao {
    
//Declaramos un ArrayList estatico que funcionara como una simulacion de la base de datos
    public static ArrayList<Profesor> listaProfesores = new ArrayList<>();
    
//Metodo que permite crear un profesor por medio de el parametro recibido (entidad: Profesor)
    public void crearProfesor(Profesor profesor){
        listaProfesores.add(profesor);
    }
    
//Metodo que permite buscar un profesor por medio de el parametro recibido(String: numero de documento del profesor)
    public Profesor buscarProfesor(String numeroDocumentoProfesor){
        Profesor profesor = new Profesor();
        for(int i = 0; i<listaProfesores.size(); i++){
            if(listaProfesores.get(i).getNumeroDocumento().equals(numeroDocumentoProfesor)){
                profesor.setNumeroDocumento(listaProfesores.get(i).getNumeroDocumento());
                profesor.setNombre(listaProfesores.get(i).getNombre());
                profesor.setMateria(listaProfesores.get(i).getMateria());
            }
        }
        return profesor;
    }
    
//Metodo que permite actualizar un profesor por medio de el parametro recibido(entidad: Profesor)
    public void actualizarProfesor(Profesor profesor){
        for(int i = 0; i<listaProfesores.size(); i++){
            if(listaProfesores.get(i).getNumeroDocumento().equals(profesor.getNumeroDocumento())){
                listaProfesores.set(i, profesor);
            }
        }
    }
    
//Metodo que permite eliminar un profesor por medio de el parametro recibido(entidad: Profesor)
    public void eliminarProfesor(Profesor profesor){
        for(int i = 0; i<listaProfesores.size(); i++){
            if(listaProfesores.get(i).getNumeroDocumento().equals(profesor.getNumeroDocumento())){
                listaProfesores.remove(i);
            }
        }
    }

}
