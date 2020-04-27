/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author lmcdo
 */
public class DeckBuilder extends javax.swing.JFrame {

    /**
     * Creates new form DeckBuilder
     */
    public DeckBuilder() {
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

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Create_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Edit_Button = new javax.swing.JButton();
        Return_Button = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("  Deck Builder");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 260, 60));

        Create_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Create_Button.setText("Create Deck");
        Create_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Create_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 320, 60));

        Delete_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Delete_Button.setText("Delete Deck");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Delete_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 320, 50));

        Edit_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Edit_Button.setText("Edit Deck");
        Edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Edit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 320, 50));

        Return_Button.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Return_Button.setText("Return to Main Menu");
        Return_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Return_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Return_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 320, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/images/DeckBuilder.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Create_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_ButtonActionPerformed
        // TODO add your handling code here:
        DeckView_C dc = new DeckView_C();
        dc.setVisible(true);
        dispose();
    }//GEN-LAST:event_Create_ButtonActionPerformed

    private void Return_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Return_ButtonActionPerformed
        // TODO add your handling code here:
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_Return_ButtonActionPerformed

    private void Edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_ButtonActionPerformed
        // TODO add your handling code here:
        DeckView_E de = new DeckView_E();
        de.setVisible(true);
        dispose();
    }//GEN-LAST:event_Edit_ButtonActionPerformed

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
        // TODO add your handling code here:
        DeckView_D dd = new DeckView_D();
        dd.setVisible(true);
        dispose();
    }//GEN-LAST:event_Delete_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DeckBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeckBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeckBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeckBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeckBuilder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Create_Button;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Edit_Button;
    private javax.swing.JButton Return_Button;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
