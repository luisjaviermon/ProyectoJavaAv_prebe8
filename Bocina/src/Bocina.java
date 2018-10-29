
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author proteco
 */
public class Bocina extends javax.swing.JFrame {

    /**
     * Creates new form Bocina
     */
    public Bocina() {
        initComponents();
    }

    public void creaciones() throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException  {
        ServerSocket paquete_recibir = new ServerSocket(9999);
        Tabla_sec recibir = new Tabla_sec();
        int bpms;
        int contador;
        Boolean loops=false;
        
        while(true){

			Socket misocket = paquete_recibir.accept();
			ObjectInputStream paquete_recibido = new ObjectInputStream(misocket.getInputStream());
			recibir = (Tabla_sec) paquete_recibido.readObject();
                        recibir.imp();
                        
                        bpms=recibir.ritmo;
                        contador = recibir.repeat;
                        loops = recibir.ciclo_inf;
                        
                        System.out.println(recibir.ritmo + " " + recibir.repeat + " " + recibir.ciclo_inf);

                        
                        
                        
                        
			int j=0;
                        System.out.println(j);
			if(loops == true){
                            do{
                                for (int i = 0;i<8 ;i++ ) {
                                    
                                    
                                    
                                    
                                    
                                    Thread.sleep(bpms);
                                    
                                    if(recibir.tab[0][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/bombo.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                    if(recibir.tab[1][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/hi_hat.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                    if(recibir.tab[2][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/percusion.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                    if(recibir.tab[3][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/tarola.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                }
                                
                                
                                
                            }while(loops);
                            
                        }else{
                            do{
                                for (int i = 0;i<8 ;i++ ) {
                                    
                                    
                                    
                                    
                                    
                                    Thread.sleep(bpms);
                                    
                                    if(recibir.tab[0][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/bombo.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                    if(recibir.tab[1][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/hi_hat.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                    if(recibir.tab[2][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/percusion.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                    if(recibir.tab[3][i]==1){
                                        Runnable t = new Reproducir("/home/proteco/Descargas/Bocina/src/tarola.wav");
                                        Thread c1 = new Thread(t);
                                        c1.start();
                                    }
                                    
                                }
                                
                                
                                j++;
                            }while(j<contador);
                        }


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

        jLabel1 = new javax.swing.JLabel();
        enc_boc = new javax.swing.JToggleButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boc.png"))); // NOI18N

        enc_boc.setText("Encender Bocina");
        enc_boc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enc_bocActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(enc_boc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(enc_boc, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enc_bocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enc_bocActionPerformed
        try {
            creaciones();
        } catch (Exception ex) {
            
        } 
    }//GEN-LAST:event_enc_bocActionPerformed

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
            java.util.logging.Logger.getLogger(Bocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bocina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton enc_boc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
