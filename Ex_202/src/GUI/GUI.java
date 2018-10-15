package GUI;

import BL.SenderTableModel;
import javax.swing.JFileChooser;

public class GUI extends javax.swing.JFrame {

    SenderTableModel model = new SenderTableModel();

    public GUI() {
        initComponents();
        tbtable.setModel(model);
        tbtable.setDefaultRenderer(Object.class, new MyTableCellRenderer());
        JFileChooser jfc = new JFileChooser(".");
        int re = jfc.showOpenDialog(this);
        if (re == JFileChooser.APPROVE_OPTION) {
            try {
                model.load(jfc.getSelectedFile());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jScrollPane1.setComponentPopupMenu(pmmenu);

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
        tbtable.setComponentPopupMenu(pmmenu);
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
        model.hide();
    }//GEN-LAST:event_mihideActionPerformed

    private void miaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miaddActionPerformed
        SenderDlg dia = new SenderDlg(this, true);
        dia.setVisible(true);
        if (dia.getSender() != null) {
            model.add(dia.s);
        }
    }//GEN-LAST:event_miaddActionPerformed

    private void mishowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mishowActionPerformed
        model.show();
    }//GEN-LAST:event_mishowActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JFileChooser chooser = new JFileChooser(".");
        int re = chooser.showSaveDialog(this);
        if (re == JFileChooser.APPROVE_OPTION) {
            try {
                model.save(chooser.getSelectedFile());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_formWindowClosing

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
