package com.mycompany.listassimples;

import javax.swing.JOptionPane;

public class ListasSimples {
    
    Nodo inicio;

    ListasSimples() { //Constructor
        inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        
        nuevo.setEnlace(null);
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
            inicio = nuevo;
        }else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            
        }
    }
    
    public void insertarFinal(String nombre, int edad, float promedio){
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        
        nuevo.setEnlace(null);
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
            inicio = nuevo;
        }else{
            Nodo temporal = inicio;
            
            while(temporal.getEnlace() != null){
                temporal = temporal.getEnlace();
            }
            
            temporal.setEnlace(nuevo);
            
        }
    }           
    
    public void insertarPorIndice(String nombre, int edad, float promedio, int indice) {
        Nodo nuevo = new Nodo();

        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);

        // Si el índice es 0, insertar al inicio
        if (indice == 0) {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            return;
        }

        Nodo temporal = inicio;
        int contador = 0;

        // Recorrer la lista hasta el nodo anterior al índice
        while (temporal != null && contador < indice - 1) {
            temporal = temporal.getEnlace();
            contador++;
        }

        // Verificar si el índice está fuera de los límites
        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango");
            return;
        }

        // Insertar el nodo en la posición indicada
        nuevo.setEnlace(temporal.getEnlace());
        temporal.setEnlace(nuevo);
    }

    
    public void insertarPorDato(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();

        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);

        // Si la lista está vacía o el nuevo nodo debe ir al principio (alfabéticamente)
        if (inicio == null || nombre.compareToIgnoreCase(inicio.getNombre()) < 0) {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        } else {
            Nodo temporal = inicio;

            // Recorrer la lista hasta encontrar la posición correcta
            while (temporal.getEnlace() != null && nombre.compareToIgnoreCase(temporal.getEnlace().getNombre()) > 0) {
                temporal = temporal.getEnlace();
            }

            // Insertar el nuevo nodo en la posición encontrada
            nuevo.setEnlace(temporal.getEnlace());
            temporal.setEnlace(nuevo);
        }
    }

    public void eliminarIndice(int indice){
        
        int posicion = 1;
        boolean indiceEncontrado = false;
        
        Nodo anterior = inicio;
        Nodo siguiente = null;
        if(indice == 1){
            inicio= inicio.getEnlace();
            return;
        }
        
        while(anterior!=null){
            if(posicion+1==indice){
                siguiente = anterior.getEnlace().getEnlace();
                indiceEncontrado = true;
                break;
            }
            anterior = anterior.getEnlace();
            posicion++;
        }
        if(indiceEncontrado){
            anterior.setEnlace(siguiente);
        }
        else{
            JOptionPane.showMessageDialog(null, "no se encontro el indice ingresado");
        }
        
    }
    
    public void eliminarValor() {
        
    }
    
    
    public void consultar(){
        Nodo temporal = inicio;
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null,"La lista esta vacia");
        }else{
            do{
                JOptionPane.showMessageDialog(null,"Nombre: " +  temporal.getNombre() + "\n Edad: " + temporal.getEdad() + "\n Promedio: " +  temporal.getPromedio());

                temporal = temporal.getEnlace();
            }while(temporal != null);
            
        }
    }
}
