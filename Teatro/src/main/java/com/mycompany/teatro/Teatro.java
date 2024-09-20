/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teatro;

import javax.swing.JOptionPane;

/**
 *
 * @author EXITOPC
 */
public class Teatro {
    
    Nodoscirculares inicio;
    
    
    Teatro(){
    inicio=null;    
    }

   
    
    public void solicitarTurno( String nombre, String documento, String genero ){
        
        Nodoscirculares nuevo= new Nodoscirculares();
        nuevo.setDocumento(documento);
        nuevo.setNombre(nombre);
        nuevo.setGenero(genero);
        nuevo.setSiguiente(nuevo);
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");   
            
               inicio=nuevo;
        
        }else{
            
          nuevo.setSiguiente(inicio);
          
          inicio.setSiguiente(nuevo);
          
          inicio=nuevo;     
        
        }
        
        
        
        
        
        
        
        
    
    
    }
    
    public void imprimir(){        
    Nodoscirculares temporal=inicio;
    if(inicio==null){    
        JOptionPane.showMessageDialog(null, "La lista esta vacia");
    
    }
    else{
        
        do{       
              JOptionPane.showMessageDialog(null, "Documento "+
                      temporal.getDocumento()+" Nombre " + temporal.getNombre() +" Genero "+ temporal.getGenero()
                     );
              
              temporal=temporal.getSiguiente();       
        
        }while(temporal!=inicio);
    
    
    
    }


    
        
        
        
        }   
    
    
    public void atender(int nboletas){
        
           
        
        
        
     
    
    
    }
    
    
        
    
    
    
}
