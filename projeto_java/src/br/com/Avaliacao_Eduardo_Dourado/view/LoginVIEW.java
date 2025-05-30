package br.com.Avaliacao_Eduardo_Dourado.view;
import javax.swing.JOptionPane;
import br.com.Avaliacao_Eduardo_Dourado.dto.FuncionarioDTO;
import br.com.Avaliacao_Eduardo_Dourado.ctr.FuncionarioCTR;


public class LoginVIEW extends javax.swing.JFrame {
    
    FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
    FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
   
    public LoginVIEW() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_fun = new javax.swing.JTextField();
        senha_fun = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnLogar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Senha:");

        login_fun.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        login_fun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        senha_fun.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        senha_fun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        senha_fun.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLogar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/salvar.png"))); // NOI18N
        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(senha_fun)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(login_fun))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(192, 192, 192))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_fun, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha_fun, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        senha_fun.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        if(verificaPreenchimento()){
            logar();
        }
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVIEW().setVisible(true);
            }
        });
    }

    private void logar(){
        funcionarioDTO.setLogin_fun(login_fun.getText());
        funcionarioDTO.setSenha_fun(String.valueOf(senha_fun.getPassword()));
        funcionarioDTO.setTipo_fun(funcionarioCTR.logarFuncionario(funcionarioDTO));
        if(funcionarioDTO.getTipo_fun().length() > 0){
            this.dispose();
            new PrincipalView(funcionarioDTO).setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Login ou senha\nIncorreto!!!");
        }
}
    
    private boolean verificaPreenchimento() {
   if(login_fun.getText().equalsIgnoreCase("")){
       JOptionPane.showMessageDialog(null, "O campo Login deve ser preenchido");
       login_fun.requestFocus();
       return false;
   }
   else{
       if((senha_fun.getPassword()).length == 0){
           JOptionPane.showMessageDialog(null, "O campo Senha deve ser preenchido");
           senha_fun.requestFocus();
           return false;
       }
       else{
           return true;
       }
   }
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLogar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField login_fun;
    private javax.swing.JPasswordField senha_fun;
    // End of variables declaration//GEN-END:variables
}
