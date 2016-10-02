
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
    private Estudiante estudiante = new Estudiante();
    private MateriaDao materiaDao = new MateriaDao();
    private Materia materia = new Materia();
    private ProfesorDao profesorDao = new ProfesorDao();
    private Profesor profesor = new Profesor();
    private EstudianteMateriaDao estudianteMateriaDao = new EstudianteMateriaDao();
    private EstudianteMateria estudianteMateria = new EstudianteMateria();
    
//Metodo para crear una materia en la entidad
    public void crearMateria(int codigo, String nombre, String descripcion, int creditos){
        materia.setCodigo(codigo);
        materia.setNombre(nombre);
        materia.setDescripcion(descripcion);
        materia.setCreditos(creditos);
        
        materiaDao.crearMateria(materia);
    }
    
    public Materia buscarMateria(int codigoMateria){
        materia = materiaDao.buscarMateria(codigoMateria);
        return materia;
    }
    
    
    public Materia buscarMateria(String nombre){
        materia = materiaDao.buscarMateria(nombre);
        return materia;
    }
 
    
    public void actualizarMateria(Materia materia){
        materiaDao.actualizarMateria(materia);
    }
 
    
    public void eliminarMateria(Materia materia){
        materiaDao.eliminarMateria(materia);
    }
    
//Metodo para crear un profesor en la entidad
    public void crearProfesor(String numeroDocumento, String nombre, Materia materia){
        profesor.setNumeroDocumento(numeroDocumento);
        profesor.setNombre(nombre);
        profesor.setMateria(materia);
        
        profesorDao.crearProfesor(profesor);
    }

    
    public Profesor buscarProfesor(String numeroDocumento){
        profesor = profesorDao.buscarProfesor(numeroDocumento);
        return profesor;
    }

    
    public void actualizarProfesor(Profesor profesor){
        profesorDao.actualizarProfesor(profesor);
    }

    
    public void eliminarProfesor(Profesor profesor){
        profesorDao.eliminarProfesor(profesor);
    }
    
//Metodo para crear un estudiante en la entidad
    public void crearEstudiante(String numeroDocumento, String nombre, int semestre){ 
        estudiante.setNumeroDocumento(numeroDocumento);
        estudiante.setNombre(nombre);
        estudiante.setSemestre(semestre);
        
        estudianteDao.crearEstudiante(estudiante); 
    }

    
    public Estudiante buscarEstudiante(String numeroDocumento){
        estudiante = estudianteDao.buscarEstudiante(numeroDocumento);
        return estudiante;
    }

    
    public void actualizarEstudiante(Estudiante estudiante){
        estudianteDao.actualizarEstudiante(estudiante);
    }

    
    public void eliminarEstudiante(Estudiante estudiante){
        estudianteDao.eliminarEstudiante(estudiante);
    }
    
//Metodo para crear una asociacion de estudiante y materia en la entidad
    public void CrearEstudianteMateria(Estudiante estudiante, Profesor profesor, ArrayList<Double> notas){
        estudianteMateria.setEstudiante(estudiante);
        estudianteMateria.setProfesor(profesor);
        estudianteMateria.setNotas(notas);
        
        estudianteMateriaDao.crearEstudianteMateria(estudianteMateria); 
    }

    
    public EstudianteMateria buscarEstudianteMateria(String numeroDocumentoEstudiante){
        estudianteMateria = estudianteMateriaDao.buscarEstudianteMateria(numeroDocumentoEstudiante);
        return estudianteMateria;
    }

    
    public void actualizarEstudianteMateria(EstudianteMateria estudianteMateria){
        estudianteMateriaDao.actualizarEstudianteMateria(estudianteMateria);
    }

    
    public void eliminarEstudianteMateria(EstudianteMateria estudianteMateria){
        estudianteMateriaDao.eliminarEstudianteMateria(estudianteMateria);
    }
    
}