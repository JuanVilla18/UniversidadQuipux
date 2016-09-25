
package co.com.universidad.dao;

import co.com.universidad.model.EstudianteMateria;
import java.util.ArrayList;

//Clase dao para estudianteMateria
public class EstudianteMateriaDao {
    
//Declaramos un ArrayList estatico que funcionara como una simulacion de la base de datos
    private static ArrayList<EstudianteMateria> listaEstudianteMateria = new ArrayList<>();
    
//Metodo que permite crear estudiante materia por medio de el parametro recibido (entidad: EstudianteMateria)
    public void crearEstudianteMateria(EstudianteMateria estudianteMateria){
        listaEstudianteMateria.add(estudianteMateria);
    }
    
//Metodo que permite buscar estudiante materia por medio de el parametro recibido(String: numero de documento del estudiante)
    public EstudianteMateria buscarEstudianteMateria(String numeroDocumentoEstudiante){
        EstudianteMateria estudianteMateria = new EstudianteMateria();
        for(int i = 0; i<listaEstudianteMateria.size(); i++){
            if(listaEstudianteMateria.get(i).getEstudiante().getNumeroDocumento().equals(numeroDocumentoEstudiante)){
                estudianteMateria.setEstudiante(listaEstudianteMateria.get(i).getEstudiante());
                estudianteMateria.setProfesor(listaEstudianteMateria.get(i).getProfesor());
                estudianteMateria.setNotas(listaEstudianteMateria.get(i).getNotas());
            }
        }
        return estudianteMateria;
    }
    
    //Metodo que permite actualizar estudiante materia por medio de el parametro recibido(entidad: EstudianteMateria)
    public void actualizarEstudianteMateria(EstudianteMateria estudianteMateria){
        for(int i = 0; i<listaEstudianteMateria.size(); i++){
            if(listaEstudianteMateria.get(i).getEstudiante().getNumeroDocumento().equals(estudianteMateria.getEstudiante().getNumeroDocumento())){
                listaEstudianteMateria.set(i, estudianteMateria);
            }
        }
    }
    
    //Metodo que permite eliminar estudiante materia por medio de el parametro recibido(entidad: EstudianteMateria)
    public void eliminarEstudianteMateria(EstudianteMateria estudianteMateria){
        for(int i = 0; i<listaEstudianteMateria.size(); i++){
            if(listaEstudianteMateria.get(i).getEstudiante().getNumeroDocumento().equals(estudianteMateria.getEstudiante().getNumeroDocumento())){
                listaEstudianteMateria.remove(i);
            }
        }
    }
    
}
