package com.mycompany.listassimples;

import java.util.Random;
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
                
        if (indice == 0) {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
            return;
        }

        Nodo temporal = inicio;
        int contador = 0;

        while (temporal != null && contador < indice - 1) {
            temporal = temporal.getEnlace();
            contador++;
        }

        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango");
            return;
        }

        nuevo.setEnlace(temporal.getEnlace());
        temporal.setEnlace(nuevo);
    }
    
    public void eliminarPorIndice(int indice) {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        if (indice == 0) {
            inicio = inicio.getEnlace();  
            JOptionPane.showMessageDialog(null, "Nodo en el índice " + indice + " eliminado");
            return;
        }

        Nodo temporal = inicio;
        Nodo anterior = null;
        int contador = 0;

        while (temporal != null && contador < indice) {
            anterior = temporal;
            temporal = temporal.getEnlace();
            contador++;
        }

        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "Índice fuera de rango");
            return;
        }

        anterior.setEnlace(temporal.getEnlace());
        JOptionPane.showMessageDialog(null, "Nodo en el índice " + indice + " eliminado");
    }


    
    public void insertarPorDato(String nombre, int edad, float promedio) {
        Nodo nuevo = new Nodo();

        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);

        if (inicio == null || nombre.compareToIgnoreCase(inicio.getNombre()) < 0) {
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        } else {
            Nodo temporal = inicio;

            while (temporal.getEnlace() != null && nombre.compareToIgnoreCase(temporal.getEnlace().getNombre()) > 0) {
                temporal = temporal.getEnlace();
            }

            nuevo.setEnlace(temporal.getEnlace());
            temporal.setEnlace(nuevo);
        }
    }
    
    public void eliminarPorDato(String nombre) {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        if (inicio.getNombre().equalsIgnoreCase(nombre)) {
            inicio = inicio.getEnlace();  
            JOptionPane.showMessageDialog(null, "Nodo con nombre " + nombre + " eliminado");
            return;
        }

        Nodo temporal = inicio;
        Nodo anterior = null;

        while (temporal != null && !temporal.getNombre().equalsIgnoreCase(nombre)) {
            anterior = temporal;
            temporal = temporal.getEnlace();
        }

        if (temporal == null) {
            JOptionPane.showMessageDialog(null, "El nodo con nombre " + nombre + " no se encontró");
            return;
        }

        anterior.setEnlace(temporal.getEnlace());
        JOptionPane.showMessageDialog(null, "Nodo con nombre " + nombre + " eliminado");
    }

    
    public void ordenarAlfabeticamente() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        Nodo actual = inicio;
        Nodo siguiente = null;
        boolean cambiado;

        do {
            cambiado = false;
            actual = inicio;

            while (actual.getEnlace() != null) {
                siguiente = actual.getEnlace();

                if (actual.getNombre().compareToIgnoreCase(siguiente.getNombre()) > 0) {
                    String tempNombre = actual.getNombre();
                    int tempEdad = actual.getEdad();
                    float tempPromedio = actual.getPromedio();

                    actual.setNombre(siguiente.getNombre());
                    actual.setEdad(siguiente.getEdad());
                    actual.setPromedio(siguiente.getPromedio());

                    siguiente.setNombre(tempNombre);
                    siguiente.setEdad(tempEdad);
                    siguiente.setPromedio(tempPromedio);

                    cambiado = true;
                }
                actual = actual.getEnlace();
            }
        } while (cambiado);

        JOptionPane.showMessageDialog(null, "Lista ordenada alfabéticamente");
    }

    public void buscarNodo(String nombre) {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            return;
        }

        Nodo temporal = inicio;

        while (temporal != null) {
            if (temporal.getNombre().equalsIgnoreCase(nombre)) {
                JOptionPane.showMessageDialog(null, "Nodo encontrado:\nNombre: " + temporal.getNombre() + "\nEdad: " + temporal.getEdad() + "\nPromedio: " + temporal.getPromedio());
                return;
            }
            temporal = temporal.getEnlace();
        }

        JOptionPane.showMessageDialog(null, "Nodo con nombre " + nombre + " no encontrado");
    }
    
    // Método para generar un nombre aleatorio
    public String generarNombreAleatorio() {
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int longitudNombre = random.nextInt(5) + 3;  // Nombres de entre 3 y 8 caracteres
        StringBuilder nombre = new StringBuilder();

        for (int i = 0; i < longitudNombre; i++) {
            int indiceAleatorio = random.nextInt(letras.length());
            nombre.append(letras.charAt(indiceAleatorio));
        }

        return nombre.toString();
    }

    // Método para generar n nombres y ordenarlos
    public void generarYOrdenarNombres(int n) {
        for (int i = 0; i < n; i++) {
            String nombreAleatorio = generarNombreAleatorio();
            int edadAleatoria = new Random().nextInt(80) + 1; // Edad entre 1 y 80
            float promedioAleatorio = new Random().nextFloat() * 5; // Promedio entre 0 y 5

            insertarFinal(nombreAleatorio, edadAleatoria, promedioAleatorio);  // Insertamos el nombre generado
        }

        ordenarAlfabeticamente();  // Ordenamos los nombres
        consultar();  // Imprimimos la lista ordenada
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
