package GUI;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmmenu = new javax.swing.JPopupMenu();
        miadd = new javax.swing.JMenuItem();
        mihide = new javax.swing.JMenuItem();
        mishow = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();

        miadd.setText("hinzufügen");
        miadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miaddActionPerformed(evt);
            }
        });
        pmmenu.add(miadd);

        mihide.setText("Band verstecken");
        mihide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mihideActionPerformed(evt);
            }
        });
        pmmenu.add(mihide);

        mishow.setText("Band anzeigen");
        mishow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mishowActionPerformed(evt);
            }
        });
        pmmenu.add(mishow);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbtable.setFont(new java.awt.Font("Courier New", 0, 11)); // NOI18N
        tbtable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbtable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mihideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mihideActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mihideActionPerformed

    private void miaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miaddActionPerformed

    private void mishowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mishowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mishowActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miadd;
    private javax.swing.JMenuItem mihide;
    private javax.swing.JMenuItem mishow;
    private javax.swing.JPopupMenu pmmenu;
    private javax.swing.JTable tbtable;
    // End of variables declaration//GEN-END:variables
}
