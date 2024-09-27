package global.doble;

import javax.swing.JOptionPane;

public class Doble {
    
    NodoDoble inicio;

    Doble(){
        inicio = null;
    }
    
    public void insertarInicio(String dato){
        
        NodoDoble nuevo = new NodoDoble();
        
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        
        if(inicio!=null){
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            
        }
            inicio=nuevo;
    }
    public void insertarFinal(String dato){
        
        NodoDoble nuevo = new NodoDoble();      
        nuevo.setAnterior(null);
        nuevo.setSiguiente(null);
        nuevo.setDato(dato);
        
        if(inicio==null){
            inicio = nuevo;
            
        }else{
            NodoDoble temporal = inicio;
            while(temporal.getSiguiente()!=null){
                temporal = temporal.getSiguiente();
            }
            
            temporal.setSiguiente(nuevo);
            nuevo.setAnterior(temporal);
            }
    }
    
    
    
    public void imprimir(){
        NodoDoble temporal = inicio;
        
        if(inicio==null){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
        }else{
            while(temporal!=null){
                JOptionPane.showMessageDialog(null, "Datos: "+ temporal.getDato());
                temporal=temporal.getSiguiente();
            }
        }
    }
    
    
}
