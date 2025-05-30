package br.com.Avaliacao_Eduardo_Dourado.view;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostaDTO;
import br.com.Avaliacao_Eduardo_Dourado.ctr.ApostaCTR;
import br.com.Avaliacao_Eduardo_Dourado.dto.LutaDTO;
import br.com.Avaliacao_Eduardo_Dourado.ctr.LutaCTR;
import br.com.Avaliacao_Eduardo_Dourado.dto.ApostadorDTO;
import br.com.Avaliacao_Eduardo_Dourado.ctr.ApostadorCTR;
import java.util.Date;


public class ApostaVIEW extends javax.swing.JInternalFrame {
    
    ApostaCTR apostaCTR = new ApostaCTR();
    ApostaDTO apostaDTO = new ApostaDTO();
    LutaCTR lutaCTR = new LutaCTR();
    LutaDTO lutaDTO = new LutaDTO();
    ApostadorDTO apostadorDTO = new ApostadorDTO();
    ApostadorCTR apostadorCTR = new ApostadorCTR();

    ResultSet rs;
    DefaultTableModel modelo_jtl_consultar_apo;
    DefaultTableModel modelo_jtl_consultar_combate;
    DefaultTableModel modelo_jtl_consultar_combate_selecionado;
    
    
    public ApostaVIEW() {
        initComponents();
        liberaCampos(false);
        liberaBotoes(true, false, false, true);
        modelo_jtl_consultar_apo = (DefaultTableModel) jtl_consultar_apo.getModel();
        modelo_jtl_consultar_combate = (DefaultTableModel) jtl_consultar_combate.getModel();
        modelo_jtl_consultar_combate_selecionado = (DefaultTableModel) jtl_consultar_combate_selecionado.getModel();
}
    
    public void setPosicao(){
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pesquisa_nome_apo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_apo = new javax.swing.JTable();
        btnPesquisarApo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_combate_selecionado = new javax.swing.JTable();
        btnCombateAdd = new javax.swing.JButton();
        btnCombateRem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pesquisa_nome_combate = new javax.swing.JTextField();
        btnPesquisarCombate = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtl_consultar_combate = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        TotalAposta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Apostadores");

        jLabel2.setText("Cliente:");

        jtl_consultar_apo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_apo);
        if (jtl_consultar_apo.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_apo.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_apo.getColumnModel().getColumn(1).setResizable(false);
        }

        btnPesquisarApo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarApo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarApoActionPerformed(evt);
            }
        });

        jtl_consultar_combate_selecionado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "QTD"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_combate_selecionado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtl_consultar_combate_selecionadoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtl_consultar_combate_selecionado);
        if (jtl_consultar_combate_selecionado.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_combate_selecionado.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_combate_selecionado.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_combate_selecionado.getColumnModel().getColumn(2).setResizable(false);
        }

        btnCombateAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/prod_add.png"))); // NOI18N
        btnCombateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombateAddActionPerformed(evt);
            }
        });

        btnCombateRem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/prod_rem.png"))); // NOI18N
        btnCombateRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombateRemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Carrinho");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(btnCombateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnCombateRem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 239, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCombateRem, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnCombateAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

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

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Lutas");

        jLabel4.setText("Descrição:");

        btnPesquisarCombate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Avaliacao_Eduardo_Dourado/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarCombate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCombateActionPerformed(evt);
            }
        });

        jtl_consultar_combate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jtl_consultar_combate);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Total Venda:");

        TotalAposta.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TotalAposta.setForeground(new java.awt.Color(0, 204, 51));
        TotalAposta.setText("0.00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TotalAposta))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(pesquisa_nome_combate, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPesquisarCombate)
                                                .addGap(86, 86, 86))))
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pesquisa_nome_apo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPesquisarApo))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnNovo)
                        .addGap(106, 106, 106)
                        .addComponent(btnSalvar)
                        .addGap(86, 86, 86)
                        .addComponent(btnCancelar)
                        .addGap(103, 103, 103)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPesquisarCombate)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(pesquisa_nome_apo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnPesquisarApo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(pesquisa_nome_combate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TotalAposta))
                        .addGap(34, 34, 34)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Apostas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(479, 479, 479)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarApoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarApoActionPerformed
        preencheTabelaApostador(pesquisa_nome_apo.getText());
    }//GEN-LAST:event_btnPesquisarApoActionPerformed

    private void btnPesquisarCombateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCombateActionPerformed
    preencheTabelaCombate(pesquisa_nome_combate.getText());
    }//GEN-LAST:event_btnPesquisarCombateActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, true);       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        if(verificaPreenchimento()){
            gravar();
            limpaCampos();
            liberaCampos(false);
            liberaBotoes(true, false, false, true);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_apo.setNumRows(0);
        modelo_jtl_consultar_combate.setNumRows(0);
        liberaBotoes(true, false, false, true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCombateAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombateAddActionPerformed

        adicionaCombateSelecionado(
        Integer.parseInt(String.valueOf(jtl_consultar_combate.getValueAt(
       jtl_consultar_combate.getSelectedRow(), 0))),
        String.valueOf(jtl_consultar_combate.getValueAt(jtl_consultar_combate.getSelectedRow(), 1)),
        Double.parseDouble(String.valueOf(jtl_consultar_combate.getValueAt(
       jtl_consultar_combate.getSelectedRow(), 2))));
    }//GEN-LAST:event_btnCombateAddActionPerformed

    private void btnCombateRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombateRemActionPerformed
        removeCombateSelecionado(jtl_consultar_combate_selecionado.getSelectedRow());
    }//GEN-LAST:event_btnCombateRemActionPerformed

    private void jtl_consultar_combate_selecionadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtl_consultar_combate_selecionadoKeyReleased
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            calculaTotalAposta();
        }
    }//GEN-LAST:event_jtl_consultar_combate_selecionadoKeyReleased

    private void gravar() {
    apostaDTO.setDat_aposta(new Date());
    apostaDTO.setCusto_aposta_combate(Double.parseDouble(TotalAposta.getText()));
    apostadorDTO.setId_apo(Integer.parseInt(String.valueOf(
        jtl_consultar_apo.getValueAt(jtl_consultar_apo.getSelectedRow(), 0))));
    
    JOptionPane.showMessageDialog(null,
        apostaCTR.inserirAposta(apostaDTO, apostadorDTO, jtl_consultar_combate_selecionado)
    );
}
    
    private void preencheTabelaApostador(String nome_apo){
    try{
        modelo_jtl_consultar_apo.setNumRows(0);
        
        apostadorDTO.setNome_apo(nome_apo);
        rs = apostadorCTR.consultarApostador(apostadorDTO, 1);
        
        while(rs.next()){
            modelo_jtl_consultar_apo.addRow(new Object[]{
                rs.getString("id_apo"),
                rs.getString("nome_apo")
            });
        }
    }
    catch(Exception erTab){
        System.out.println("Erro SQL: "+erTab);
    }
}
    
    private void preencheTabelaCombate(String nome_combate){
    try{
        modelo_jtl_consultar_combate.setNumRows(0);
        lutaDTO.setNome_combate(nome_combate);
        rs = lutaCTR.consultarLuta(lutaDTO, 1);
        
        while(rs.next()){
            modelo_jtl_consultar_combate.addRow(new Object[]{
                rs.getString("id_combate"),
                rs.getString("nome_combate"),
                rs.getDouble("custo_aposta_combate")
            });
        }
    }
    catch(Exception erTab){
        System.out.println("Erro SQL: "+ erTab);
    }
}   
    
   private void calculaTotalAposta() {
    try {
        double total = 0;
        for (int cont = 0; cont < jtl_consultar_combate_selecionado.getRowCount(); cont++) {
            total += (Double.parseDouble(String.valueOf(
                         jtl_consultar_combate_selecionado.getValueAt(cont, 2))) *
                      Integer.parseInt(String.valueOf(
                         jtl_consultar_combate_selecionado.getValueAt(cont, 3))));
        }
        TotalAposta.setText(String.valueOf(total));
    } catch (Exception erTab) {
        System.out.println("Erro SQL: " + erTab);
    }
}
    
    private void adicionaCombateSelecionado(int id_combate, String nome_combate, double custo_aposta_combate){
   try{
       modelo_jtl_consultar_combate_selecionado.addRow(new Object[]{
           id_combate,
           nome_combate,
           custo_aposta_combate
       });
   }
   catch(Exception erTab){
       System.out.println("Erro SQL: "+erTab);
   }
}
    
    private void removeCombateSelecionado(int linha_selecionada){
   try{
       if(linha_selecionada >= 0){
           modelo_jtl_consultar_combate_selecionado.removeRow(linha_selecionada);
           calculaTotalAposta();
       }
   }
   catch(Exception erTab){
       System.out.println("Erro SQL: "+erTab);
   }
}
    private void liberaCampos(boolean a){
        pesquisa_nome_apo.setEnabled(a);
        btnPesquisarApo.setEnabled(a);
        jtl_consultar_apo.setEnabled(a);
        pesquisa_nome_combate.setEnabled(a);
        btnPesquisarCombate.setEnabled(a);
        jtl_consultar_combate.setEnabled(a);
        btnCombateAdd.setEnabled(a);
        btnCombateRem.setEnabled(a);
        jtl_consultar_combate_selecionado.setEnabled(a);
        TotalAposta.setText("0.00");
}
    
   private void limpaCampos(){
        pesquisa_nome_apo.setText("");
        modelo_jtl_consultar_apo.setNumRows(0);
        pesquisa_nome_combate.setText("");
        modelo_jtl_consultar_combate.setNumRows(0);
        modelo_jtl_consultar_combate_selecionado.setNumRows(0);
}
   
   private void liberaBotoes(boolean a, boolean b, boolean c, boolean d){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnSair.setEnabled(d);
}
   
   private boolean verificaPreenchimento() {
    if(jtl_consultar_apo.getSelectedRowCount() <= 0){
        JOptionPane.showMessageDialog(null, "Deve ser selecionado um Apostador");
        jtl_consultar_apo.requestFocus();
        return false;
    }
    else{
        if(jtl_consultar_combate_selecionado.getRowCount() <= 0){
            JOptionPane.showMessageDialog(null, "É necessário adicionar pelo menos uma Luta");
            jtl_consultar_combate_selecionado.requestFocus();
            return false;
        }
        else{
            int verifica=0;
            for(int cont=0; cont<jtl_consultar_combate_selecionado.getRowCount(); cont++){
                if(String.valueOf(jtl_consultar_combate_selecionado.getValueAt(
                    cont, 3)).equalsIgnoreCase("null")){
                    verifica++;
                }
            }
            if(verifica > 0){
                JOptionPane.showMessageDialog(null,
                    "A quantidade de apostas deve ser informada");
                jtl_consultar_combate_selecionado.requestFocus();
                return false;
            }
            else{
                return true;
            }
        }
    }
}
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TotalAposta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCombateAdd;
    private javax.swing.JButton btnCombateRem;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisarApo;
    private javax.swing.JButton btnPesquisarCombate;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtl_consultar_apo;
    private javax.swing.JTable jtl_consultar_combate;
    private javax.swing.JTable jtl_consultar_combate_selecionado;
    private javax.swing.JTextField pesquisa_nome_apo;
    private javax.swing.JTextField pesquisa_nome_combate;
    // End of variables declaration//GEN-END:variables
}
