
package co.com.universidad.dao;

import co.com.universidad.model.Materia;
import java.util.ArrayList;

//Clase dao para materia
public class MateriaDao {
    
//Declaramos un ArrayList estatico que funcionara como una simulacion de la base de datos
    public static ArrayList<Materia> listaMaterias = new ArrayList<>();

    
//Metodo que permite crear una materia por medio de el parametro recibido (entidad: Materia)
    public void crearMateria(Materia materia){
        listaMaterias.add(materia);
    }
    
//Metodo que permite buscar una materia por medio de el parametro recibido(int: codigo de la materia)
    public Materia buscarMateria(int codigoMateria){
        Materia materia = new Materia();
        for(int i = 0; i<listaMaterias.size(); i++){
            if(listaMaterias.get(i).getCodigo() == codigoMateria){
                materia.setCodigo(listaMaterias.get(i).getCodigo());
                materia.setNombre(listaMaterias.get(i).getNombre());
                materia.setDescripcion(listaMaterias.get(i).getDescripcion());
                materia.setCreditos(listaMaterias.get(i).getCreditos());
            }
        }
        return materia;
    }
 
    //Metodo que permite buscar una materia por medio de el parametro recibido(String: nombre de la materia)
    public Materia buscarMateria(String nombre){
        Materia materia = new Materia();
        for(int i = 0; i<listaMaterias.size(); i++){
            if(listaMaterias.get(i).getNombre().equals(nombre)){
                materia.setCodigo(listaMaterias.get(i).getCodigo());
                materia.setNombre(listaMaterias.get(i).getNombre());
                materia.setDescripcion(listaMaterias.get(i).getDescripcion());
                materia.setCreditos(listaMaterias.get(i).getCreditos());
            }
        }
        return materia;
    }
    
//Metodo que permite actualizar una materia por medio de el parametro recibido(entidad: Materia)
    public void actualizarMateria(Materia materia){
        for(int i = 0; i<listaMaterias.size(); i++){
            if(listaMaterias.get(i).getCodigo() == materia.getCodigo()){
                listaMaterias.set(i, materia);
            }
        }
    }
    
//Metodo que permite eliminar una materia por medio de el parametro recibido(entidad: Materia)
    public void eliminarMateria(Materia materia){
        for(int i = 0; i<listaMaterias.size(); i++){
            if(listaMaterias.get(i).getCodigo() == materia.getCodigo()){
                listaMaterias.remove(i);
            }
        }
    }
    
}
