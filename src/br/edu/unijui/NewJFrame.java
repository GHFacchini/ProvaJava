/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unijui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;


public class NewJFrame extends javax.swing.JFrame {
    private DataList dataList;
    private DefaultTableModel model;

    public NewJFrame() {
        dataList = new DataList();
        DefaultTableModel model = new DefaultTableModel();
                


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

        jfcSelect = new javax.swing.JFileChooser();
        jlTitle = new javax.swing.JLabel();
        jlInput = new javax.swing.JLabel();
        jlSelected = new javax.swing.JLabel();
        jlCitiesNumber = new javax.swing.JLabel();
        jlStatesNumber = new javax.swing.JLabel();
        jlState = new javax.swing.JLabel();
        jlCity = new javax.swing.JLabel();
        jbSelect = new javax.swing.JButton();
        jtfSelected = new javax.swing.JTextField();
        jtfCitiesNumber = new javax.swing.JTextField();
        jtfStatesNumber = new javax.swing.JTextField();
        jcbState = new javax.swing.JComboBox<>();
        jcbCity = new javax.swing.JComboBox<>();
        jbFind = new javax.swing.JButton();
        jlIndex = new javax.swing.JLabel();
        jspIndex = new javax.swing.JScrollPane();
        jtIndex = new javax.swing.JTable();
        jlHighest = new javax.swing.JLabel();
        jlLowest = new javax.swing.JLabel();
        jtfHighest = new javax.swing.JTextField();
        jtfLowest = new javax.swing.JTextField();
        jbExport = new javax.swing.JButton();
        jbClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jlTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlTitle.setText("COVID-19 Isolation Index System");

        jlInput.setText("Input file:");

        jlSelected.setText("Selected file:");

        jlCitiesNumber.setText("Number of cities:");

        jlStatesNumber.setText("Number of states:");

        jlState.setText("State:");

        jlCity.setText("City:");

        jbSelect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/page_add.png"))); // NOI18N
        jbSelect.setText("Select ...");
        jbSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSelectMouseClicked(evt);
            }
        });

        jtfSelected.setEditable(false);

        jtfCitiesNumber.setEditable(false);

        jtfStatesNumber.setEditable(false);

        jcbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jcbState.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbStatePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jcbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jbFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/zoom.png"))); // NOI18N
        jbFind.setText("Find");
        jbFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbFindMouseClicked(evt);
            }
        });

        jlIndex.setText("Isolation Index (%)");

        jtIndex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Date", "Isolated"
            }
        ));
        jspIndex.setViewportView(jtIndex);

        jlHighest.setText("Highest Isolation:");

        jlLowest.setText("Lowest Isolation:");

        jtfHighest.setEditable(false);

        jtfLowest.setEditable(false);

        jbExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/disk.png"))); // NOI18N
        jbExport.setText("Export Data");
        jbExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbExportMouseClicked(evt);
            }
        });

        jbClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cross.png"))); // NOI18N
        jbClose.setText("Close Application");
        jbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlIndex)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlLowest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfLowest))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlHighest)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtfHighest, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24)
                                .addComponent(jbExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jspIndex, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jlSelected))
                                    .addComponent(jlInput, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlState, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcbState, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbCity, 0, 225, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlStatesNumber)
                                    .addComponent(jlCitiesNumber))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfCitiesNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jtfStatesNumber))
                                .addGap(462, 462, 462)
                                .addComponent(jbFind)))
                        .addGap(76, 76, 76))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jbClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jlTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitle)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlInput)
                    .addComponent(jbSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSelected)
                    .addComponent(jlState)
                    .addComponent(jtfSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCitiesNumber)
                    .addComponent(jlCity)
                    .addComponent(jtfCitiesNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlStatesNumber)
                            .addComponent(jtfStatesNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbFind)))
                .addGap(48, 48, 48)
                .addComponent(jlIndex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspIndex, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlHighest)
                    .addComponent(jtfHighest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExport))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLowest)
                    .addComponent(jtfLowest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbClose)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSelectMouseClicked
        
        int result = jfcSelect.showOpenDialog(this);
        if(result == JFileChooser.CANCEL_OPTION){
            return; // termina a execução do método
        }
        jtfSelected.setText(jfcSelect.getSelectedFile().getName());
        Path p = jfcSelect.getSelectedFile().toPath();
        
        try {
            Files.lines(p)
            .map(line -> line.split(","))
            .map(col-> new Data(col[0], col[1], Double.parseDouble(col[2]), col[3] )) 
            .forEach(x -> dataList.addData(x));
        } catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            //Lê o número de cidades e estados do dataList
            jtfCitiesNumber.setText(Integer.toString(dataList.getCities().size()));
            jtfStatesNumber.setText(Integer.toString(dataList.getStates().size()));
            
            //cria lista de estados sem repetição e ordena 
            List<String> statesList = new ArrayList<String>();
            statesList = dataList.getStates();
            
            Collections.sort(statesList);

            //adiciona estados ao combobox
            for(String x : statesList){
                jcbState.addItem(x);
            }
            
            
            

    }//GEN-LAST:event_jbSelectMouseClicked
    
    
    
    
    
    private void jbFindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFindMouseClicked
       
        /*
        Cria lista customizada com dados de uma das opções:
        1 nada selecionado -> todos os dados
        2 estado selecionado -> dados do estado selecionado
        3 estado e cidade -> dados da cidade selecionada
        */
       
        List<Data> customData = new ArrayList<Data>();
        
        if(!jcbState.getSelectedItem().equals("Select")){ //estado selecionado 
            if(!jcbCity.getSelectedItem().equals("Select")){ //cidade selecionada
                for(Data x : dataList.getAllData()){
                    if((x.getCity().equals(jcbCity.getSelectedItem().toString())) && (x.getState().equals(jcbState.getSelectedItem().toString()))){
                        customData.add(x);
                    }
                }
            } else{ //apenas estado selecionado 
                for(Data x : dataList.getAllData()){
                    if(x.getState().equals(jcbState.getSelectedItem().toString())){
                        customData.add(x);
                    }
                }
            }
            
        } else {//nada selecionado
            for(Data x : dataList.getAllData()){
                customData.add(x);
            }
        }
        
        
        //cria tabela
        createTable(customData);

        Data highest = new Data(null, null, 0.0, null);
        Data lowest = new Data(null, null, 10.0, null);   
        for(Data x : customData){
            if(x.getIsolation() > highest.getIsolation()){
                highest = x;
            }
            if(x.getIsolation() < lowest.getIsolation()){
                lowest = x;
            }
        }
        jtfHighest.setText(highest.getCity().replace(" ", "_") +" / " + highest.getState().replace(" ", "_") + " ( " + highest.getDate() + ")  -> " + highest.getIsolation());
        jtfLowest.setText(lowest.getCity().replace(" ", "_") + " / " + lowest.getState().replace(" ", "_") + " ( " + lowest.getDate() + ")  -> " + lowest.getIsolation());

        
        
    }//GEN-LAST:event_jbFindMouseClicked
    public void createTable(List<Data> dataForTable){
        
        model = (DefaultTableModel)jtIndex.getModel();
        
        model.setRowCount(0);
        for(Data x : dataForTable){
            Object[] newLine = new Object[]{
                x.getDate(),
                x.getIsolation()
        };
          
            model.addRow(newLine);    
        }
        
    }
    private void jcbStatePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbStatePopupMenuWillBecomeInvisible
        List<String> citiesOfState = dataList.getCitiesOfState(jcbState.getSelectedItem().toString());
        Collections.sort(citiesOfState);
        jcbCity.removeAllItems();
        jcbCity.addItem("Select");
        for(String x : citiesOfState ){
            jcbCity.addItem(x);
        }

    }//GEN-LAST:event_jcbStatePopupMenuWillBecomeInvisible

    private void jbExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbExportMouseClicked
       
        try {
            FileWriter fileWriter = new FileWriter(new File("dados.csv"));
            BufferedWriter escreva = new BufferedWriter(fileWriter);

            escreva.write(jcbCity.getSelectedItem().toString().replace(" ", "_") + " / " + jcbState.getSelectedItem().toString().replace(" ", "_"));
            escreva.newLine();
            escreva.newLine();
        for (int i = 0; i < model.getRowCount(); i++) {
            Object o0 = (i+1);
            Object o1 = model.getValueAt(i, 0);
            Object o2 = model.getValueAt(i, 1);
            escreva.write(Integer.toString(i+1));
            escreva.write(";");
            escreva.write(o1.toString());
            escreva.write(";");
            escreva.write((String.valueOf(o2)));
            escreva.newLine();
        }
        
        escreva.close();
        JOptionPane.showMessageDialog(null, "Data has been saved.", "Information", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException ex) {
        Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jbExportMouseClicked

    private void jbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCloseMouseClicked
        UIMessage.exit();
    }//GEN-LAST:event_jbCloseMouseClicked

    
    
    
    
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbClose;
    private javax.swing.JButton jbExport;
    private javax.swing.JButton jbFind;
    private javax.swing.JButton jbSelect;
    private javax.swing.JComboBox<String> jcbCity;
    private javax.swing.JComboBox<String> jcbState;
    private javax.swing.JFileChooser jfcSelect;
    private javax.swing.JLabel jlCitiesNumber;
    private javax.swing.JLabel jlCity;
    private javax.swing.JLabel jlHighest;
    private javax.swing.JLabel jlIndex;
    private javax.swing.JLabel jlInput;
    private javax.swing.JLabel jlLowest;
    private javax.swing.JLabel jlSelected;
    private javax.swing.JLabel jlState;
    private javax.swing.JLabel jlStatesNumber;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JScrollPane jspIndex;
    private javax.swing.JTable jtIndex;
    private javax.swing.JTextField jtfCitiesNumber;
    private javax.swing.JTextField jtfHighest;
    private javax.swing.JTextField jtfLowest;
    private javax.swing.JTextField jtfSelected;
    private javax.swing.JTextField jtfStatesNumber;
    // End of variables declaration//GEN-END:variables
}
