
package co.com.universidad.dao;

import co.com.universidad.model.Estudiante;
import java.util.ArrayList;

//Clase dao para estudiante
public class EstudianteDao {
    
//Declaramos un ArrayList estatico que funcionara como una simulacion de la base de datos
    public static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    
//Metodo que permite crear un estudiante por medio del parametro recibido (entidad: Estudiante)
    public void crearEstudiante(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    
//Metodo que permite buscar un estudiante por medio de el parametro recibido(String: numero de documento del estudiante)
    public Estudiante buscarEstudiante(String numeroDocumentoEstudiante){
        Estudiante estudiante = new Estudiante();
        for(int i = 0; i<listaEstudiantes.size(); i++){
            if(listaEstudiantes.get(i).getNumeroDocumento().equals(numeroDocumentoEstudiante)){
                estudiante.setNumeroDocumento(listaEstudiantes.get(i).getNumeroDocumento());
                estudiante.setNombre(listaEstudiantes.get(i).getNombre());
                estudiante.setSemestre(listaEstudiantes.get(i).getSemestre());
            }
        }
        return estudiante;
    }
    
//Metodo que permite actualizar un estudiante por medio de el parametro recibido(entidad: Estudiante)
    public void actualizarEstudiante(Estudiante estudiante){
        for(int i = 0; i<listaEstudiantes.size(); i++){
            if(listaEstudiantes.get(i).getNumeroDocumento().equals(estudiante.getNumeroDocumento())){
                listaEstudiantes.set(i, estudiante);
            }
        }
    }
    
//Metodo que permite eliminar un estudiante por medio de el parametro recibido(entidad: Estudiante)
    public void eliminarEstudiante(Estudiante estudiante){
        for(int i = 0; i<listaEstudiantes.size(); i++){
            if(listaEstudiantes.get(i).getNumeroDocumento().equals(estudiante.getNumeroDocumento())){
                listaEstudiantes.remove(i);
            }
        }
    }
    
}
