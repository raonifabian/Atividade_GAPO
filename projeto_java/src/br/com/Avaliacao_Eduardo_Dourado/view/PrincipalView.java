package br.com.Avaliacao_Eduardo_Dourado.view;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import br.com.Avaliacao_Eduardo_Dourado.dto.FuncionarioDTO;


public class PrincipalView extends javax.swing.JFrame {

    
    public PrincipalView(FuncionarioDTO funcionarioDTO) {
        initComponents();
        this.setLocationRelativeTo(null);
        if(funcionarioDTO.getTipo_fun().equalsIgnoreCase("Comum")){
            itemMenuFuncionario.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageicon = new ImageIcon(getClass().getResource("imagens/FundoProjeto.jpg"));
        Image image = imageicon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics graphics){
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuCadastrar = new javax.swing.JMenu();
        itemMenuLutador = new javax.swing.JMenuItem();
        itemMenuLuta = new javax.swing.JMenuItem();
        itemMenuApostador = new javax.swing.JMenuItem();
        itemMenuAposta = new javax.swing.JMenuItem();
        itemMenuFuncionario = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastrar.setMnemonic('f');
        menuCadastrar.setText("Cadastrar");
        menuCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });

        itemMenuLutador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemMenuLutador.setMnemonic('o');
        itemMenuLutador.setText("Lutador");
        itemMenuLutador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuLutadorActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuLutador);

        itemMenuLuta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemMenuLuta.setMnemonic('x');
        itemMenuLuta.setText("Luta");
        itemMenuLuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuLutaActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuLuta);

        itemMenuApostador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemMenuApostador.setText("Apostador");
        itemMenuApostador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuApostadorActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuApostador);

        itemMenuAposta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemMenuAposta.setText("Aposta");
        itemMenuAposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuApostaActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuAposta);

        itemMenuFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        itemMenuFuncionario.setText("Funcionário");
        itemMenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuFuncionarioActionPerformed(evt);
            }
        });
        menuCadastrar.add(itemMenuFuncionario);

        menuBar.add(menuCadastrar);

        menuSair.setMnemonic('h');
        menuSair.setText("Sair");
        menuSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 798, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuLutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuLutaActionPerformed
        abreLutaVIEW();        
    }//GEN-LAST:event_itemMenuLutaActionPerformed

    private void itemMenuLutadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuLutadorActionPerformed
        abreLutadorVIEW();
    }//GEN-LAST:event_itemMenuLutadorActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        sair();        // TODO add your handling code here:
    }//GEN-LAST:event_menuSairMouseClicked

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void itemMenuApostadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuApostadorActionPerformed
        abreApostadorView();
        // TODO add your handling code here:
    }//GEN-LAST:event_itemMenuApostadorActionPerformed

    private void itemMenuApostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuApostaActionPerformed
        abreApostaVIEW();
    }//GEN-LAST:event_itemMenuApostaActionPerformed

    private void itemMenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuFuncionarioActionPerformed
        abreFuncionarioVIEW();
    }//GEN-LAST:event_itemMenuFuncionarioActionPerformed

     
    
    private void sair(){
        Object[] options = {"Sair", "Cancelar"};
        if(JOptionPane.showOptionDialog(null, "Deseja sair do sistema?", "informação",
                JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0){
            System.exit(0);
        }
    }
private void abreLutadorVIEW(){
    LutadorVIEW lutadorVIEW = new LutadorVIEW();
    this.desktopPane.add(lutadorVIEW);
    lutadorVIEW.setVisible(true);
    lutadorVIEW.setPosicao();
   
} 

private void abreApostadorView(){
        ApostadorVIEW apostadorVIEW = new ApostadorVIEW();
        this.desktopPane.add(apostadorVIEW);
        apostadorVIEW.setVisible(true);
        apostadorVIEW.setPosicao();
    }

private void abreLutaVIEW(){
    LutaVIEW lutaVIEW = new LutaVIEW();
    this.desktopPane.add(lutaVIEW);
    lutaVIEW.setVisible(true);
    lutaVIEW.setPosicao();
   
}

private void abreApostaVIEW(){
   ApostaVIEW apostaVIEW = new ApostaVIEW();
   this.desktopPane.add(apostaVIEW);
   apostaVIEW.setVisible(true);
   apostaVIEW.setPosicao();
}

private void abreFuncionarioVIEW(){
    FuncionarioVIEW funcionarioVIEW = new FuncionarioVIEW();
    this.desktopPane.add(funcionarioVIEW);
    funcionarioVIEW.setVisible(true);
    funcionarioVIEW.setPosicao();
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem itemMenuAposta;
    private javax.swing.JMenuItem itemMenuApostador;
    private javax.swing.JMenuItem itemMenuFuncionario;
    private javax.swing.JMenuItem itemMenuLuta;
    private javax.swing.JMenuItem itemMenuLutador;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

}
