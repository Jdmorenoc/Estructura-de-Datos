/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.listasimple;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-22
 */
public class Menu extends javax.swing.JFrame {
    
    ListaSimple objLista = new ListaSimple();
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        createList = new javax.swing.JButton();
        consult = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        averageField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        insertFinal = new javax.swing.JButton();
        indiceButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nombreButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ageButton = new javax.swing.JButton();
        averageButton = new javax.swing.JButton();
        beforeIndexButton = new javax.swing.JButton();
        deleteIndex = new javax.swing.JButton();
        deleteName = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        fillButton = new javax.swing.JButton();
        oldSort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista Simple");

        createList.setText("Insertar al inicio");
        createList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createListActionPerformed(evt);
            }
        });

        consult.setText("Consultar");
        consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Promedio");

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        averageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageFieldActionPerformed(evt);
            }
        });

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        insertFinal.setText("Insertar Final");
        insertFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertFinalActionPerformed(evt);
            }
        });

        indiceButton.setText("Insertar después de indice");
        indiceButton.setEnabled(false);
        indiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Datos del nodo");

        nombreButton.setText("Insertar después de nombre");
        nombreButton.setEnabled(false);
        nombreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Opciones adicionales de insertado");
        jLabel5.setEnabled(false);

        ageButton.setText("Insertar después de edad");
        ageButton.setEnabled(false);
        ageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageButtonActionPerformed(evt);
            }
        });

        averageButton.setText("Insertar después de promedio");
        averageButton.setEnabled(false);
        averageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                averageButtonActionPerformed(evt);
            }
        });

        beforeIndexButton.setText("Insertar antes de indice");
        beforeIndexButton.setEnabled(false);
        beforeIndexButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beforeIndexButtonActionPerformed(evt);
            }
        });

        deleteIndex.setText("Eliminar Indice");
        deleteIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteIndexActionPerformed(evt);
            }
        });

        deleteName.setText("Eliminar Nombre");
        deleteName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteNameActionPerformed(evt);
            }
        });

        orderButton.setText("Ordenar");
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        fillButton.setText("Llenar al azar");
        fillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillButtonActionPerformed(evt);
            }
        });

        oldSort.setText("Ordenar viejo");
        oldSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(beforeIndexButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fillButton))
                                    .addComponent(deleteIndex)
                                    .addComponent(deleteName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ageButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(indiceButton, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(averageButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(averageField))
                                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(createList, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 89, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(jLabel5)))
                        .addGap(95, 95, 95)
                        .addComponent(oldSort)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(oldSort))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(orderButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertFinal)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(averageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consult))
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indiceButton)
                    .addComponent(beforeIndexButton)
                    .addComponent(fillButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(averageButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(deleteIndex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteName)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createListActionPerformed
        objLista.insertarInicio(nombreField.getText(), Integer.parseInt(ageField.getText()), Float.parseFloat(averageField.getText()));
        indiceButton.setEnabled(true);
        ageButton.setEnabled(true);
        nombreButton.setEnabled(true);
        averageButton.setEnabled(true);
        jLabel5.setEnabled(true);
        beforeIndexButton.setEnabled(true);
    }//GEN-LAST:event_createListActionPerformed

    private void consultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultActionPerformed
        objLista.consultar();
    }//GEN-LAST:event_consultActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void averageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_averageFieldActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void insertFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertFinalActionPerformed
        objLista.insertarFinal(nombreField.getText(), Integer.parseInt(ageField.getText()), Float.parseFloat(averageField.getText()));
        indiceButton.setEnabled(true);
        ageButton.setEnabled(true);
        nombreButton.setEnabled(true);
        averageButton.setEnabled(true);
        jLabel5.setEnabled(true);
        beforeIndexButton.setEnabled(true);
    }//GEN-LAST:event_insertFinalActionPerformed

    private void indiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceButtonActionPerformed
        objLista.insertarEnIndice(nombreField.getText(),
                Integer.parseInt(ageField.getText()),
                Float.parseFloat(averageField.getText()),
                validateIntInput(JOptionPane.showInputDialog("Ingrese el indice:")));
    }//GEN-LAST:event_indiceButtonActionPerformed

    private void nombreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreButtonActionPerformed
        objLista.insertarEnNombre(nombreField.getText(),
                Integer.parseInt(ageField.getText()),
                Float.parseFloat(averageField.getText()), 
                JOptionPane.showInputDialog("Ingrese el nombre:"));
    }//GEN-LAST:event_nombreButtonActionPerformed

    private void ageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageButtonActionPerformed
        objLista.insertarEnEdad(nombreField.getText(),
                Integer.parseInt(ageField.getText()),
                Float.parseFloat(averageField.getText()), 
                validateIntInput(JOptionPane.showInputDialog("Ingrese la edad:")));
    }//GEN-LAST:event_ageButtonActionPerformed

    private void averageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_averageButtonActionPerformed
        objLista.insertarEnPromedio(nombreField.getText(),
                Integer.parseInt(ageField.getText()),
                Float.parseFloat(averageField.getText()), 
                Float.parseFloat(JOptionPane.showInputDialog("Ingrese el promedio:")));
    }//GEN-LAST:event_averageButtonActionPerformed

    private void beforeIndexButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beforeIndexButtonActionPerformed
        objLista.insertarAntesDeIndice(nombreField.getText(),
                Integer.parseInt(ageField.getText()),
                Float.parseFloat(averageField.getText()),
                validateIntInput(JOptionPane.showInputDialog("Ingrese el indice:")));
    }//GEN-LAST:event_beforeIndexButtonActionPerformed

    private void deleteIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteIndexActionPerformed
        objLista.eliminarIndice(validateIntInput(JOptionPane.showInputDialog("Ingrese el indice:")));
    }//GEN-LAST:event_deleteIndexActionPerformed

    private void deleteNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteNameActionPerformed
        objLista.eliminarPorNombre(JOptionPane.showInputDialog("Ingrese el nombre:"));
    }//GEN-LAST:event_deleteNameActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        objLista.ordenarEnOrdenO();
    }//GEN-LAST:event_orderButtonActionPerformed

    private void fillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillButtonActionPerformed
        objLista.llenarAlAzar(validateIntInput(JOptionPane.showInputDialog("Ingrese la cantidad de nodos a agregar:")));
    }//GEN-LAST:event_fillButtonActionPerformed

    private void oldSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldSortActionPerformed
        objLista.ordenarEnOrden();
    }//GEN-LAST:event_oldSortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public int validateIntInput(String str) {
        while (isNumber(str)==false) {
            str = JOptionPane.showInputDialog("Ingrese un número válido mayor a cero:");
        }
        return Integer.parseInt(str);
    }
    
    public static boolean isNumber(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ageButton;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton averageButton;
    private javax.swing.JTextField averageField;
    private javax.swing.JButton beforeIndexButton;
    private javax.swing.JButton consult;
    private javax.swing.JButton createList;
    private javax.swing.JButton deleteIndex;
    private javax.swing.JButton deleteName;
    private javax.swing.JButton fillButton;
    private javax.swing.JButton indiceButton;
    private javax.swing.JButton insertFinal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton nombreButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JButton oldSort;
    private javax.swing.JButton orderButton;
    // End of variables declaration//GEN-END:variables
}
