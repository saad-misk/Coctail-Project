/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.coctail;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class AddIngredient extends javax.swing.JFrame {

    private Gui mainFrame;
    
    public AddIngredient(){
        initComponents();
    }
    public AddIngredient(Gui mainFrame) {
        this.mainFrame = mainFrame;
        initComponents();
    }
    private static String name;
    private static double calories, volume;
    private static int red, blue, green;
    private static Color color;
    private static String selectedIngredient;
    private Color defColor = new Color(152,219,124);
    
    
    public void printIngredients(){
        ArrayList <Ingredient> arr = mainFrame.getIngredients();
        DefaultTableModel tbModel = (DefaultTableModel) ingredientsTable.getModel();
        tbModel.setRowCount(0);
        
        for(Ingredient i: arr){
            String [] data = {i.getName(), i.getType(), Double.toString(i.getNoOfCalories()), Double.toString(i.getVolume())};
            tbModel.addRow(data);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Model = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        nameBox = new javax.swing.JTextField();
        volumeBox = new javax.swing.JTextField();
        caloriesBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chooseColor = new javax.swing.JButton();
        colorSelector = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        volSlider = new javax.swing.JSlider();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingredientsTable = new javax.swing.JTable();
        volTxt = new javax.swing.JTextField();

        jLabel4.setText("Ingredients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 500));

        jPanel1.setBackground(new java.awt.Color(152, 219, 124));
        jPanel1.setForeground(new java.awt.Color(56, 33, 16));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        Model.setBackground(new java.awt.Color(255, 71, 85));
        Model.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fruit", "Drink", "Extra" }));
        Model.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(255, 71, 85));
        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nameBox.setForeground(new java.awt.Color(56, 33, 16));

        caloriesBox.setForeground(new java.awt.Color(56, 33, 16));

        jLabel1.setBackground(new java.awt.Color(245, 245, 220));
        jLabel1.setText("Name:");

        jLabel2.setBackground(new java.awt.Color(245, 245, 220));
        jLabel2.setText("Volume: ");

        jLabel3.setBackground(new java.awt.Color(245, 245, 220));
        jLabel3.setText("Calories: ");

        chooseColor.setBackground(new java.awt.Color(255, 71, 85));
        chooseColor.setText("Choose Color");
        chooseColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseColorActionPerformed(evt);
            }
        });

        colorSelector.setBackground(new java.awt.Color(152, 219, 124));
        colorSelector.setForeground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout colorSelectorLayout = new javax.swing.GroupLayout(colorSelector);
        colorSelector.setLayout(colorSelectorLayout);
        colorSelectorLayout.setHorizontalGroup(
            colorSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        colorSelectorLayout.setVerticalGroup(
            colorSelectorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Ingredients:");

        volSlider.setBackground(new java.awt.Color(0, 0, 0));
        volSlider.setMajorTickSpacing(150);
        volSlider.setMaximum(600);
        volSlider.setMinorTickSpacing(50);
        volSlider.setPaintLabels(true);
        volSlider.setPaintTicks(true);
        volSlider.setValue(100);
        volSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                volSliderMouseDragged(evt);
            }
        });
        volSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volSliderMouseClicked(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 71, 85));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setText("<-- Back");
        backBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        ingredientsTable.setBackground(new java.awt.Color(152, 219, 124));
        ingredientsTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ingredientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "No. of Calories", "Volume", "Color in RGB"
            }
        ));
        ingredientsTable.setGridColor(new java.awt.Color(56, 33, 16));
        ingredientsTable.setNextFocusableComponent(nameBox);
        ingredientsTable.setSelectionBackground(new java.awt.Color(56, 33, 16));
        ingredientsTable.setSelectionForeground(new java.awt.Color(245, 245, 220));
        ingredientsTable.setShowHorizontalLines(true);
        ingredientsTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(ingredientsTable);

        volTxt.setEditable(false);
        volTxt.setBackground(new java.awt.Color(255, 255, 255));
        volTxt.setForeground(new java.awt.Color(56, 33, 16));
        volTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(chooseColor)
                            .addGap(38, 38, 38)
                            .addComponent(colorSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameBox)
                                .addComponent(caloriesBox)))))
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(26, 26, 26)
                            .addComponent(volTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98)))
                    .addComponent(volSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 587, Short.MAX_VALUE)
                            .addComponent(volumeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(jLabel5)
                            .addContainerGap(245, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jSeparator1)
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(volTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(volSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caloriesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseColor)
                            .addComponent(colorSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(addBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(volumeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(139, 139, 139)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel5)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void readInput(){
        name = nameBox.getText();
        calories = Double.parseDouble(caloriesBox.getText()); 
        volume = (volSlider.getValue());
        
    }
    
    private void ModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelActionPerformed

        selectedIngredient = (String) Model.getSelectedItem();

    }//GEN-LAST:event_ModelActionPerformed

    private void chooseColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseColorActionPerformed
        color = Color.BLACK;
        color = JColorChooser.showDialog(this, "Select a Color", color);
        
        if( color == null ){
            color = Color.WHITE; 
            colorSelector.setBackground(color);
        }
        colorSelector.setBackground(color);
        this.red = color.getRed();
        this.green = color.getGreen();
        this.blue = color.getBlue();
    }//GEN-LAST:event_chooseColorActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        readInput();
        selectedIngredient = (String) Model.getSelectedItem();
        DefaultTableModel tbModel = (DefaultTableModel) ingredientsTable.getModel();

        if (name == null || name.isEmpty() || Double.isNaN(calories) || Double.isNaN(volume)) {
            JOptionPane.showMessageDialog(null, "Invalid input!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String colorRow = "(" + Integer.toString(red) + ", " + Integer.toString(green) + ", " + Integer.toString(blue) + ")";
        
        String[] data = {name, selectedIngredient, Double.toString(calories), Double.toString(volume), colorRow};

        try {
            if ("Fruit".equals(selectedIngredient)) {
                Fruit f = new Fruit(name, calories, volume, new OurColor(red, green, blue));
                Gui.blender.add(f);
            } else if ("Drink".equals(selectedIngredient)) {
                Drink d = new Drink(name, calories, volume, new OurColor(red, green, blue));
                Gui.blender.add(d);
            } else {
                Extra ex = new Extra(name, calories, volume, new OurColor(red, green, blue));
                Gui.blender.add(ex);
            }

            tbModel.addRow(data); // Add row to table model
            ingredientsTable.setModel(tbModel); // Set updated model to the table
        }catch (BlenderOverFlowException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Exception!", JOptionPane.WARNING_MESSAGE);
        }

        // Clear input fields and reset color selector
        nameBox.setText("");
        caloriesBox.setText("");
        volTxt.setText("");
        colorSelector.setBackground(defColor);
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        mainFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void volTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volTxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_volTxtActionPerformed

    private void volSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volSliderMouseDragged
        int num = volSlider.getValue();
        volTxt.setText(Integer.toString(num));
    }//GEN-LAST:event_volSliderMouseDragged

    private void volSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volSliderMouseClicked
        // TODO add your handling code here:
        int num = volSlider.getValue();
        volTxt.setText(Integer.toString(num));
    }//GEN-LAST:event_volSliderMouseClicked

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
            java.util.logging.Logger.getLogger(AddIngredient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddIngredient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddIngredient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddIngredient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddIngredient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Model;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField caloriesBox;
    private javax.swing.JButton chooseColor;
    private javax.swing.JPanel colorSelector;
    private javax.swing.JTable ingredientsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameBox;
    private javax.swing.JSlider volSlider;
    private javax.swing.JTextField volTxt;
    private javax.swing.JTextField volumeBox;
    // End of variables declaration//GEN-END:variables
}
