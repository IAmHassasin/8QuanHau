/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8quanhau;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hassasin
 */
public class InterFace extends javax.swing.JFrame {

    /**
     * Creates new form InterFace
     */
    quanhauver2 data;

    private int a;
    private ArrayList<String> pos=new ArrayList();
    private ArrayList<String> b=new ArrayList();
    public InterFace() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        in = new javax.swing.JTextField();
        go = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        out = new javax.swing.JTable();
        show = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("8 Quân Hậu -- Hassasin");

        in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inActionPerformed(evt);
            }
        });
        in.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inKeyPressed(evt);
            }
        });

        go.setText("Solve");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        go.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                goKeyPressed(evt);
            }
        });

        out.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Các lời giải"
            }
        ));
        jScrollPane2.setViewportView(out);

        show.setText("Show");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg8quanhau/Logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(show, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(go, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(in, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(go, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        //JOptionPane.showMessageDialog(rootPane, choose);
        //Creat Bàn cơ
        a=Integer.parseInt(in.getText());
        try {
            data=new quanhauver2(a);
            data.SetHau(1);
        } catch (IOException ex) {
            Logger.getLogger(InterFace.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image_1 img=new Image_1();
        img.setSize((a+2)*60, (a+2)*60);
        img.setVisible(true);
        //img.setPos(pos);//Vị trí đang xét và giá trị tương ứng
        //img.setCheck(check);//Đã duyệt xong chưa?
        img.setN(a);
        img.setPos_data(data.getPos());
        img.setKey_data(data.getResult_key());
       
    }//GEN-LAST:event_goActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        int choose=out.getSelectedRow();
        pos=data.getPos();
        if (choose!=-1) {
            DefaultTableModel md= (DefaultTableModel) out.getModel();
            //JOptionPane.showMessageDialog(rootPane, choose);
            //Creat Bàn cơ
            Image img=new Image(a,b.get(choose));
            img.setSize((a+2)*60, (a+2)*60);
            img.setVisible(true);
        }
        else  JOptionPane.showMessageDialog(rootPane, "Hãy chọn 1 phương án giải để show!");
    }//GEN-LAST:event_showActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void goKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_goKeyPressed

    }//GEN-LAST:event_goKeyPressed

    private void inKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inKeyPressed
          if(evt.getKeyChar()==KeyEvent.VK_ENTER){  
            DefaultTableModel md= (DefaultTableModel) out.getModel();
            a=Integer.parseInt(in.getText());
        try {
            data=new quanhauver2(a);
            data.SetHau(1);
        } catch (IOException ex) {
            Logger.getLogger(InterFace.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            b=data.getResult();
            try {
                for (int i=0;i<b.size();i++){
                    md.addRow(new Object[]{b.get(i)});
                }
                JOptionPane.showMessageDialog(rootPane, "Successful!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_inKeyPressed

    private void inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inActionPerformed

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
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterFace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterFace().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton go;
    private javax.swing.JTextField in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable out;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}