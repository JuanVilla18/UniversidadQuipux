
package co.com.universidad.manager;

import co.com.universidad.dao.EstudianteDao;
import co.com.universidad.dao.EstudianteMateriaDao;
import co.com.universidad.dao.MateriaDao;
import co.com.universidad.dao.ProfesorDao;
import co.com.universidad.model.Estudiante;
import co.com.universidad.model.EstudianteMateria;
import co.com.universidad.model.Materia;
import co.com.universidad.model.Profesor;
import java.util.ArrayList;

//Clase manager que se encarga de controlar toda la logica que se dirigue al dao
public class UniversidadManager {
    
//Instanciamos las clases Dao para usarlas posteriormente
    private EstudianteDao estudianteDao = new EstudianteDao();
    private MateriaDao materiaDao = new MateriaDao();
    private ProfesorDao profesorDao = new ProfesorDao();
    private EstudianteMateriaDao estudianteMateriaDao = new EstudianteMateriaDao();
    
//Metodo para crear una materia en la entidad
    public void crearMateria(int codigo, String nombre, String descripcion, int creditos){
        Materia materia = new Materia();
        materia.setCodigo(codigo);
        materia.setNombre(nombre);
        materia.setDescripcion(descripcion);
        materia.setCreditos(creditos);
        
        materiaDao.crearMateria(materia);
    }
    
//Metodo para crear un profesor en la entidad
    public void crearProfesor(String numeroDocumento, String nombre, Materia materia){ 
        Profesor profesor = new Profesor();
        profesor.setNumeroDocumento(numeroDocumento);
        profesor.setNombre(nombre);
        profesor.setMateria(materia);
        
        profesorDao.crearProfesor(profesor);
    }
    
//Metodo para crear un estudiante en la entidad
    public void crearEstudiante(String numeroDocumento, String nombre, int semestre){ 
        Estudiante estudiante = new Estudiante();
        estudiante.setNumeroDocumento(numeroDocumento);
        estudiante.setNombre(nombre);
        estudiante.setSemestre(semestre);
        
        estudianteDao.crearEstudiante(estudiante); 
    }
    
//Metodo para crear una asociacion de estudiante y materia en la entidad
    public void CrearEstudianteMateria(Estudiante estudiante, Profesor profesor, ArrayList<Double> notas){
        EstudianteMateria estudianteMateria = new EstudianteMateria();
        estudianteMateria.setEstudiante(estudiante);
        estudianteMateria.setProfesor(profesor);
        estudianteMateria.setNotas(notas);
        
        estudianteMateriaDao.crearEstudianteMateria(estudianteMateria); 
    }
    
}