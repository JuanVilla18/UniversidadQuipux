/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.universidad.manager;

import java.util.regex.*;
import javax.swing.*;

public class Validaciones {
    
    public boolean campoVacio(String campo){ 
        boolean resp= true;
        if(campo.trim().length()==0){
            resp= false;
        }
        return resp;
    }
    
    public boolean longitudCampo(String campo,int lonMin,int lonMax){
       boolean resp= true; 
       if(campo.trim().length()<lonMin || campo.trim().length()>lonMax ){        
       resp= false;
       } 
       return resp;
    }
    
   public boolean confirmoCampo(String campo1,String campo2){
       boolean resp= true;
       if(!campo1.equals(campo2)){       
       resp= false;
       }
       return resp;
   }       
        
   public boolean datoNumerico(String campo){
       boolean resp= true;
       //Verificamos que el campo sea de tipo numérico
       int conversion; 
       try{		
       conversion=Integer.parseInt(campo);
        }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"El dato ingresado solo puede contener valores numericos","Ingreso de Datos", JOptionPane.ERROR_MESSAGE);
        resp= false;
        }
       return resp;
   }
   
   public boolean seleccionDeComboBox(JComboBox combobox, String item){  
        boolean resp= true;
        if(combobox.getSelectedItem()==item){
        //JOptionPane.showMessageDialog(null, "Debe seleccionar una opción de la lista desplegable...", "Seleccionar una opción",JOptionPane.WARNING_MESSAGE);
        combobox.requestFocusInWindow();     
        resp= false;
        } 
        return resp;
   }     
   
   public String seleccionRadioButton(JRadioButton rbtn, String texto){
        //verificamos que le de clic a un radio button, el código es igual para los JCheckBox
        if (rbtn.isSelected()){
            texto= texto;         
        } 
        return texto;
   }     
        
    public boolean esEmailCorrecto(String email) {
        
        boolean valido = true;        
        Pattern patronEmail = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        Matcher mEmail = patronEmail.matcher(email.toLowerCase());
        if (mEmail.matches()){
           valido = false;  
        }
        return valido;
    }  

}
