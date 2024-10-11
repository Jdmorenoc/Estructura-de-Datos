package com.mycompany.restaurante;

import javax.swing.JOptionPane;

public class Menu {
    String dias[] = new String[]{"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
    int datos[][];
    Platos arrayObjetos[];
    
    public void crearMenu(int cantidad) {
        arrayObjetos = new Platos[cantidad];
        
        try{
            for (int i = 0; i < cantidad; i++) {
            Platos obj = new Platos();
            obj.setNombre(JOptionPane.showInputDialog("Diga el nombre de su plato " + (i + 1)));
            obj.setCostoProduccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo de producción")));
            obj.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de venta del plato")));

            arrayObjetos[i] = obj;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese correctamente lo que se pide");
        }
    }
    
    public void consultarMenu() {
        try{
            String concatenar = "";
            for (Platos plato : arrayObjetos) {
                concatenar += "Nombre del plato: " + plato.getNombre() + "\n" + " - Precio de Venta: " + plato.getPrecio() + "\n" + " - Precio de Producción: " + plato.getCostoProduccion() + "\n";
            }
            JOptionPane.showMessageDialog(null, "Platos:\n" + concatenar);
        }catch(Exception e4){
            JOptionPane.showMessageDialog(null, "Ocuurio un error al generar el menu");
        }
    }
    
    public void ingresarDatos() {
        datos = new int[6][arrayObjetos.length];
        try{
            for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < arrayObjetos.length; columnas++) {
                datos[filas][columnas] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ventas para el día: " + dias[filas] + "\n" + "Plato: " + arrayObjetos[columnas].getNombre()));
            }
            }
        }catch(Exception e3){
            JOptionPane.showMessageDialog(null, "Ingrese la cantidad en numeros enteros");
        }
    }
    
    public void analizarInformacion() {
        try{
            int[] ventasPorPlato = new int[arrayObjetos.length];
            int[] diaMasVentasPorPlato = new int[arrayObjetos.length];
            int[] diaMenosVentasPorPlato = new int[arrayObjetos.length];
            int[] ventasPorDia = new int[6];

            int totalVentas = 0;
            int diaMasVentas = 0;
            int diaMenosVentas = 0;
            int platoMasVendido = 0;
            int platoMenosVendido = 0;

            int gananciaTotal = 0;

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

                double gananciaPorPlato = (arrayObjetos[i].getPrecio() - arrayObjetos[i].getCostoProduccion()) * ventasPorPlato[i];
                gananciaTotal += gananciaPorPlato;
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
                    double gananciaPorPlato = (arrayObjetos[i].getPrecio() - arrayObjetos[i].getCostoProduccion()) * ventasPorPlato[i];
                    resultado += arrayObjetos[i].getNombre() + ": " + ventasPorPlato[i] + " unidades.\n";
                    resultado += "Ganancia por plato: $" + gananciaPorPlato + "\n";
                    resultado += "Día con más ventas: " + dias[diaMasVentasPorPlato[i]] + " (" + datos[diaMasVentasPorPlato[i]][i] + " unidades)\n";
                    resultado += "Día con menos ventas: " + dias[diaMenosVentasPorPlato[i]] + " (" + datos[diaMenosVentasPorPlato[i]][i] + " unidades)\n\n";
                }

                resultado += "Día con más ventas en general: " + dias[diaMasVentas] + " (" + maxVentasDia + " unidades)\n";
                resultado += "Día con menos ventas en general: " + dias[diaMenosVentas] + " (" + minVentasDia + " unidades)\n";
                resultado += "Plato más vendido de la semana: " + arrayObjetos[platoMasVendido].getNombre() + " (" + maxVentasPlato + " unidades)\n";
                resultado += "Plato menos vendido de la semana: " + arrayObjetos[platoMenosVendido].getNombre() + " (" + minVentasPlato + " unidades)\n";
                resultado += "\nTotal de ventas en la semana: " + totalVentas + " unidades.\n";
                resultado += "Ganancia total de la semana: $" + gananciaTotal + "\n";

                JOptionPane.showMessageDialog(null, resultado);
        }catch(Exception e4){
            JOptionPane.showMessageDialog(null, "Ocurrio un error al crear el menu o ingresar los datos");
        }
    }

}