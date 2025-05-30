package br.com.Avaliacao_Eduardo_Dourado.view;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableCellRenderer;
import br.com.Avaliacao_Eduardo_Dourado.dto.LutadorDTO;
import br.com.Avaliacao_Eduardo_Dourado.ctr.LutadorCTR;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class LutadorVIEW extends javax.swing.JInternalFrame {
    SimpleDateFormat data_format = new SimpleDateFormat("dd/mm/yyyy");
    
    LutadorDTO lutadorDTO = new LutadorDTO();
    LutadorCTR lutadorCTR = new LutadorCTR();
    
    int gravar_alterar;
    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_lutador; 
    
    /**
     * Creates new form FornecedorVIEW
     */
    public LutadorVIEW() {
        initComponents();
        
        liberaCampos(false);
        
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_lutador = (DefaultTableModel) jtl_consultar_lutador.getModel();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nome_lut = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pesquisa_nome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_lutador = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        data_cad_lut = new javax.swing.JFormattedTextField();
        tel_lut = new javax.swing.JFormattedTextField();
        nacionalidade_lut = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        apelido_lut = new javax.swing.JTextField();

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

        nome_lut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_lutActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Nacionalidade");

        jLabel3.setText("Tel.");

        jLabel4.setText("Data Cadastro");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Lutador");

        pesquisa_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_nomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome");

        jtl_consultar_lutador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ));
        jtl_consultar_lutador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_lutadorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_lutador);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Consulta");

        try {
            data_cad_lut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        data_cad_lut.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        data_cad_lut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_cad_lutActionPerformed(evt);
            }
        });

        try {
            tel_lut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tel_lut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_lutActionPerformed(evt);
            }
        });

        nacionalidade_lut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacionalidade_lutActionPerformed(evt);
            }
        });

        jLabel8.setText("Apelido");

        apelido_lut.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(62, 62, 62)
                        .addComponent(btnSair)
                        .addGap(76, 76, 76)
                        .addComponent(btnExcluir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tel_lut, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data_cad_lut, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNovo)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnSalvar))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome_lut, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(apelido_lut, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nacionalidade_lut, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pesquisa_nome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(352, 352, 352))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome_lut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(pesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apelido_lut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacionalidade_lut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data_cad_lut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tel_lut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_lutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_lutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nome_lutActionPerformed

    private void pesquisa_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa_nomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_nome.getText());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(gravar_alterar==1){
            gravar();
            gravar_alterar=0;
        }
        else{
            if(gravar_alterar==2){
                alterar();
                gravar_alterar=0;
            }
            else{
                JOptionPane.showMessageDialog(null, "erro no sistema!!!");
            }
        }
        
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_lutador.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar = 0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        modelo_jtl_consultar_lutador.setNumRows(0);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jtl_consultar_lutadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_lutadorMouseClicked
        preencheCampos(Integer.parseInt(String.valueOf(
        jtl_consultar_lutador.getValueAt(
        jtl_consultar_lutador.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_lutadorMouseClicked

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void data_cad_lutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_cad_lutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_data_cad_lutActionPerformed

    private void tel_lutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_lutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_lutActionPerformed

    private void nacionalidade_lutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacionalidade_lutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nacionalidade_lutActionPerformed

    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    
private void liberaCampos(boolean a){
    nome_lut.setEnabled(a);
    nacionalidade_lut.setEnabled(a);
    apelido_lut.setEnabled(a);
    tel_lut.setEnabled(a);
    data_cad_lut.setEnabled(a);
}

  private void limpaCampos(){
    nome_lut.setText("");
    nacionalidade_lut.setText("");
    apelido_lut.setText("");
    tel_lut.setText("");
    data_cad_lut.setText("");
}//fecha o método limpaCampos()

private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e){
    btnNovo.setEnabled(a);
    btnSalvar.setEnabled(b);
    btnCancelar.setEnabled(c);
    btnExcluir.setEnabled(d);
    btnSair.setEnabled(e);
}// fecha o método liberaBotoes

private void gravar(){
    try{
        lutadorDTO.setNome_lut(nome_lut.getText());
        lutadorDTO.setNacionalidade_lut(nacionalidade_lut.getText());
        lutadorDTO.setApelido_lut(apelido_lut.getText());
        lutadorDTO.setTel_lut(tel_lut.getText());
        lutadorDTO.setData_cad_lut(data_format.parse(data_cad_lut.getText()));
        
        JOptionPane.showMessageDialog(null,
                lutadorCTR.inserirLutador(lutadorDTO));
    }
    catch(Exception e){
        System.out.println("Erro ao Gravar" + e.getMessage());
    }
}

private void preencheTabela(String nome_lut){
    try{
        modelo_jtl_consultar_lutador.setNumRows(0);
        lutadorDTO.setNome_lut(nome_lut);
        rs = lutadorCTR.consultarLutador(lutadorDTO, 1);
        while(rs.next()){
            modelo_jtl_consultar_lutador.addRow(new Object[]{
                rs.getString("id_lut"),
                rs.getString("nome_lut")
            });
        }
    }catch(Exception e){
        System.out.println("Erro ao preencheTabela"+e.getMessage());
    }finally{
        lutadorCTR.CloseDB();
    }
}

private void preencheCampos(int id_lut){
    try{
        lutadorDTO.setId_lut(id_lut);
        rs = lutadorCTR.consultarLutador(lutadorDTO, 2);
        if(rs.next()){
            limpaCampos();
            nome_lut.setText(rs.getString("nome_lut"));
            nacionalidade_lut.setText(rs.getString("nacionalidade_lut"));
            apelido_lut.setText(rs.getString("apelido_lut"));
            tel_lut.setText(rs.getString("tel_lut"));
            data_cad_lut.setText(rs.getString("data_cad_lut"));
            
            gravar_alterar = 2;
            liberaCampos(true);
        }
    }catch(Exception e){
        System.out.println("Erro ao preencheCampos"+e.getMessage());
    }finally{
        lutadorCTR.CloseDB();
    }
} 


private void alterar(){
    try{
        lutadorDTO.setNome_lut(nome_lut.getText());
        lutadorDTO.setNacionalidade_lut(nacionalidade_lut.getText());
        lutadorDTO.setApelido_lut(apelido_lut.getText());
        lutadorDTO.setTel_lut(tel_lut.getText());
        lutadorDTO.setData_cad_lut(data_format.parse(data_cad_lut.getText()));
        
        JOptionPane.showMessageDialog(null,
                lutadorCTR.alterarLutador(lutadorDTO));
    }
    catch(Exception e){
        System.out.println("Erro ao Alterar" + e.getMessage());
    }
}   


private void excluir(){
    if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Lutador?", "Aviso", 
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    lutadorCTR.excluirLutador(lutadorDTO));
    }
}



        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apelido_lut;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField data_cad_lut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jtl_consultar_lutador;
    private javax.swing.JTextField nacionalidade_lut;
    private javax.swing.JTextField nome_lut;
    private javax.swing.JTextField pesquisa_nome;
    private javax.swing.JFormattedTextField tel_lut;
    // End of variables declaration//GEN-END:variables
}
