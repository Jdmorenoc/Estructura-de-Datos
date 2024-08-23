package global.restaurante;

import javax.swing.JOptionPane;

public class Menu {
    
    String platos[];
    int datos[][];
    String dias[]= new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
    
    public void crearMenu(int cantidad){
            platos = new String[cantidad];
            
            int i=0;
            while (i<cantidad){
            
            platos[i]=JOptionPane.showInputDialog("Diga el nombre del plato "+ (i+1));
            i++;

        }
    }
    
    public void consultarMenu(){
        String concatenar = "";
        for(int i=0; i<platos.length; i++){
            concatenar += platos[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Platos :" + "\n" + concatenar);
    }
    
    public void ingresarDatos(){
        
        datos = new int[6][platos.length];
        
        for(int f=0; f<6; f++){
            for(int c=0; c<platos.length; c++){
                datos[f][c] = Integer.parseInt(JOptionPane.showInputDialog("Ventas para el dia "+dias[f]+ platos[c]));
            }
        }
    }
}
