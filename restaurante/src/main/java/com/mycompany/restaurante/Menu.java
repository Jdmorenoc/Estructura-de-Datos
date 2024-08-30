package com.mycompany.restaurante;

import javax.swing.JOptionPane;

public class Menu {
    String dias[] = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    int datos[][];
    Platos arrayObjetos[];
    
    public void crearMenu(int cantidad) {
        arrayObjetos = new Platos[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            Platos obj = new Platos();
            obj.setNombre(JOptionPane.showInputDialog("Diga el nombre de su plato " + (i + 1)));
            obj.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Precio del plato")));
            arrayObjetos[i] = obj;
        }
    }
    
    public void consultarMenu() {
        String concatenar = "";
        for (Platos plato : arrayObjetos) {
            concatenar += "Nomnre del plato: " + plato.getNombre() + " - Precio: " + plato.getPrecio() + "\n";
        }
        JOptionPane.showMessageDialog(null, "Platos:\n" + concatenar);
    }
    
    public void ingresarDatos() {
        datos = new int[6][arrayObjetos.length];
        for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < arrayObjetos.length; columnas++) {
                datos[filas][columnas] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ventas para el día: " + dias[filas] + "\n" + "Plato: " + arrayObjetos[columnas].getNombre()));
            }
        }
    }
    
    public void analizarInformacion() {
        int[] ventasPorPlato = new int[arrayObjetos.length];
        int[] diaMasVentasPorPlato = new int[arrayObjetos.length];
        int[] diaMenosVentasPorPlato = new int[arrayObjetos.length];
        int[] ventasPorDia = new int[6];
        
        int totalVentas = 0;
        int diaMasVentas = 0;
        int diaMenosVentas = 0;
        int platoMasVendido = 0;
        int platoMenosVendido = 0;

        for (int i = 0; i < arrayObjetos.length; i++) {
            int maxVentas = datos[0][i];
            int minVentas = datos[0][i];
            diaMasVentasPorPlato[i] = 0;
            diaMenosVentasPorPlato[i] = 0;
            
            for (int j = 0; j < 6; j++) {
                ventasPorPlato[i] += datos[j][i];
                ventasPorDia[j] += datos[j][i];
                totalVentas += datos[j][i];
                
                if (datos[j][i] > maxVentas) {
                    maxVentas = datos[j][i];
                    diaMasVentasPorPlato[i] = j;
                }
                if (datos[j][i] < minVentas) {
                    minVentas = datos[j][i];
                    diaMenosVentasPorPlato[i] = j;
                }
            }
        }

        int maxVentasDia = ventasPorDia[0];
        int minVentasDia = ventasPorDia[0];
        for (int j = 0; j < 6; j++) {
            if (ventasPorDia[j] > maxVentasDia) {
                maxVentasDia = ventasPorDia[j];
                diaMasVentas = j;
            }
            if (ventasPorDia[j] < minVentasDia) {
                minVentasDia = ventasPorDia[j];
                diaMenosVentas = j;
            }
        }

        int maxVentasPlato = ventasPorPlato[0];
        int minVentasPlato = ventasPorPlato[0];
        for (int i = 0; i < arrayObjetos.length; i++) {
            if (ventasPorPlato[i] > maxVentasPlato) {
                maxVentasPlato = ventasPorPlato[i];
                platoMasVendido = i;
            }
            if (ventasPorPlato[i] < minVentasPlato) {
                minVentasPlato = ventasPorPlato[i];
                platoMenosVendido = i;
            }
        }

        String resultado = "Análisis de la información:\n\n";
        resultado += "Ventas totales por plato:\n";
        for (int i = 0; i < arrayObjetos.length; i++) {
            resultado += arrayObjetos[i].getNombre() + ": " + ventasPorPlato[i] + " unidades.\n";
            resultado += "Día con más ventas: " + dias[diaMasVentasPorPlato[i]] + " (" + datos[diaMasVentasPorPlato[i]][i] + " unidades)\n";
            resultado += "Día con menos ventas: " + dias[diaMenosVentasPorPlato[i]] + " (" + datos[diaMenosVentasPorPlato[i]][i] + " unidades)\n\n";
        }

        resultado += "Día con más ventas en general: " + dias[diaMasVentas] + " (" + maxVentasDia + " unidades)\n";
        resultado += "Día con menos ventas en general: " + dias[diaMenosVentas] + " (" + minVentasDia + " unidades)\n";
        resultado += "Plato más vendido de la semana: " + arrayObjetos[platoMasVendido].getNombre() + " (" + maxVentasPlato + " unidades)\n";
        resultado += "Plato menos vendido de la semana: " + arrayObjetos[platoMenosVendido].getNombre() + " (" + minVentasPlato + " unidades)\n";

        double promedioVentasPorPlato = totalVentas / (double) arrayObjetos.length;
        double promedioVentasPorDia = totalVentas / 6.0;
        resultado += "\nPromedio de ventas por plato: " + promedioVentasPorPlato + " unidades.\n";
        resultado += "Promedio de ventas por día: " + promedioVentasPorDia + " unidades.\n";
        resultado += "Total de ventas en la semana: " + totalVentas + " unidades.\n";

        int rangoVentasPorPlato = maxVentasPlato - minVentasPlato;
        resultado += "Rango de ventas entre el plato más y menos vendido: " + rangoVentasPorPlato + " unidades.\n";

        int rangoVentasPorDia = maxVentasDia - minVentasDia;
        resultado += "Rango de ventas entre el día con más y menos ventas: " + rangoVentasPorDia + " unidades.\n";

        JOptionPane.showMessageDialog(null, resultado);
    }
}
