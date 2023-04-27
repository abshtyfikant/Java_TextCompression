import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.table.*;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jakub Włodarski
 * @version 1.0
 */
public class RLE_gui extends javax.swing.JFrame {

    /**
     * Creates new form RLE_gui
     */
    public RLE_gui() {
        initComponents();
        cRadio.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogWindow = new javax.swing.JDialog();
        dialogButton = new javax.swing.JButton();
        dialogLabel = new javax.swing.JLabel();
        cRadio = new javax.swing.JRadioButton();
        dRadio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        enterText = new javax.swing.JTextField();
        result = new javax.swing.JLabel();
        modifyText = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();

        dialogWindow.setAlwaysOnTop(true);
        dialogWindow.setMinimumSize(new java.awt.Dimension(300, 150));

        dialogButton.setText("OK");
        dialogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dialogButtonActionPerformed(evt);
            }
        });

        dialogLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dialogLabel.setText("jLabel2");

        javax.swing.GroupLayout dialogWindowLayout = new javax.swing.GroupLayout(dialogWindow.getContentPane());
        dialogWindow.getContentPane().setLayout(dialogWindowLayout);
        dialogWindowLayout.setHorizontalGroup(
            dialogWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWindowLayout.createSequentialGroup()
                .addGroup(dialogWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogWindowLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(dialogButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogWindowLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(dialogLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        dialogWindowLayout.setVerticalGroup(
            dialogWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogWindowLayout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(dialogLabel)
                .addGap(18, 18, 18)
                .addComponent(dialogButton)
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(377, 900));
        setMinimumSize(new java.awt.Dimension(377, 450));

        buttonGroup1.add(cRadio);
        cRadio.setText("Compression");
        cRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRadioActionPerformed(evt);
            }
        });

        buttonGroup1.add(dRadio);
        dRadio.setText("Decompression");
        dRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dRadioActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose modification type:");

        enterText.setText("Wpisz tekst");

        result.setText("Text after modification");

        modifyText.setText("Modify");
        modifyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyTextActionPerformed(evt);
            }
        });

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modification Type", "Text Before", "Text After"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(historyTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enterText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dRadio)
                                        .addComponent(cRadio))
                                    .addGap(15, 15, 15)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(modifyText)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dRadio)
                .addGap(18, 18, 18)
                .addComponent(enterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modifyText)
                .addGap(30, 30, 30)
                .addComponent(result)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        result.getAccessibleContext().setAccessibleParent(dialogButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
     String modType = "c";
    private void cRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRadioActionPerformed
        modType = "c";
        
    }//GEN-LAST:event_cRadioActionPerformed

    private void dRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dRadioActionPerformed
        modType = "d";
    }//GEN-LAST:event_dRadioActionPerformed

    /**
     * 
     * Calls model functions, sets modified text in label, pops dialog window in case of incorrect input.
     */
    private void modifyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyTextActionPerformed
        List<String> beforeList = new ArrayList<>();
        List<String> afterList = new ArrayList<>();
        guiModel m = new guiModel();
        
        String beforeText = enterText.getText();
        String modifiedText = "";

        beforeList.add(beforeText);
        modifiedText = m.modifyText(modType, beforeText);
        afterList.add(modifiedText);

        result.setText(modifiedText);
        if(modifiedText == "Error"){
            result.setText("Incorrect format.");
            dialogLabel.setText("Incorrect format. ");
            dialogWindow.setLocationRelativeTo(this);
            dialogWindow.setVisible(true);
        }
        else{
            char mt = modType.charAt(0);
            String stringMt;
            if(mt=='c')
                stringMt = "Compression";
            else
                stringMt = "Decompression";
            
           DefaultTableModel tableModel = (DefaultTableModel) historyTable.getModel();
           Object[] row = {stringMt, beforeText, modifiedText};
           tableModel.addRow(row);
        }
    }//GEN-LAST:event_modifyTextActionPerformed

    private void dialogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dialogButtonActionPerformed
        // TODO add your handling code here:
        
        dialogWindow.setVisible(false);
    }//GEN-LAST:event_dialogButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RLE_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RLE_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RLE_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RLE_gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RLE_gui window = new RLE_gui();
                window.setLocationRelativeTo(null);
                window.setVisible(true);
                ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cRadio;
    private javax.swing.JRadioButton dRadio;
    private javax.swing.JButton dialogButton;
    private javax.swing.JLabel dialogLabel;
    private javax.swing.JDialog dialogWindow;
    private javax.swing.JTextField enterText;
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyText;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
