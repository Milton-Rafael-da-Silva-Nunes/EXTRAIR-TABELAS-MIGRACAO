package telas;

import java.io.IOException;
import javax.swing.JOptionPane;
import servicos.ExtrairTabelasSelecionadasDumpSql;
import servicos.VersaoSistemas;

/**
 *
 * @author Rafael Nunes
 */
public class TelaInicialPrograma extends javax.swing.JFrame {

    public TelaInicialPrograma() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btngerar = new javax.swing.JButton();
        btnLimparSelecoes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jRUnidades = new javax.swing.JRadioButton();
        jRClientes = new javax.swing.JRadioButton();
        jRCategorias = new javax.swing.JRadioButton();
        jRSubcategorias = new javax.swing.JRadioButton();
        jRFabricante = new javax.swing.JRadioButton();
        jRProdutos = new javax.swing.JRadioButton();
        jRFornecedores = new javax.swing.JRadioButton();
        jRConvenio = new javax.swing.JRadioButton();
        jREmpresa = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRUsuario = new javax.swing.JRadioButton();
        jRFidelidade = new javax.swing.JRadioButton();
        jRPaciente = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRGrupoDeTributacao = new javax.swing.JRadioButton();
        jRCest = new javax.swing.JRadioButton();
        jRNcm = new javax.swing.JRadioButton();
        jRCst = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jREstoque = new javax.swing.JRadioButton();
        jRLote = new javax.swing.JRadioButton();
        jRLocalEstoque = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jRReceber = new javax.swing.JRadioButton();
        jRPagar = new javax.swing.JRadioButton();
        jRPagamento = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(new VersaoSistemas().versao());
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Extrair Tabelas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TRIBUTAÇÂO");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CADASTROS PRINCIPAIS");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("FINANCEIRO");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btngerar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btngerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-selecionado-18.png"))); // NOI18N
        btngerar.setText(" Gerar");
        btngerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngerarActionPerformed(evt);
            }
        });

        btnLimparSelecoes.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimparSelecoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-vassoura-18.png"))); // NOI18N
        btnLimparSelecoes.setText(" Limpar");
        btnLimparSelecoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparSelecoesActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRUnidades.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRUnidades.setSelected(true);
        jRUnidades.setText("Unidades");

        jRClientes.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRClientes.setSelected(true);
        jRClientes.setText("Clientes");

        jRCategorias.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRCategorias.setSelected(true);
        jRCategorias.setText("Categorias");

        jRSubcategorias.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRSubcategorias.setSelected(true);
        jRSubcategorias.setText("Subcategorias");

        jRFabricante.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRFabricante.setSelected(true);
        jRFabricante.setText("Fabricantes");

        jRProdutos.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRProdutos.setSelected(true);
        jRProdutos.setText("Produtos");

        jRFornecedores.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRFornecedores.setSelected(true);
        jRFornecedores.setText("Fornecdores");

        jRConvenio.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRConvenio.setText("Convenio");

        jREmpresa.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jREmpresa.setText("Empresa");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("_______________________");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jRUsuario.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRUsuario.setText("Usuarios");

        jRFidelidade.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRFidelidade.setText("Fidelidade");
        jRFidelidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRFidelidadeActionPerformed(evt);
            }
        });

        jRPaciente.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRPaciente.setText("Pacientes");
        jRPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRSubcategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jREmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRFidelidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRUnidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRCategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRSubcategorias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRFabricante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRFornecedores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jRFidelidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRConvenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jREmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRPaciente)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESTOQUE / LOTE");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRGrupoDeTributacao.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRGrupoDeTributacao.setSelected(true);
        jRGrupoDeTributacao.setText("Grupos de Tributação");

        jRCest.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRCest.setSelected(true);
        jRCest.setText("Cest");

        jRNcm.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRNcm.setSelected(true);
        jRNcm.setText("Ncm");

        jRCst.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRCst.setSelected(true);
        jRCst.setText("Cst");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRGrupoDeTributacao, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addComponent(jRCest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRNcm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRCst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRCst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRNcm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRCest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRGrupoDeTributacao)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jREstoque.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jREstoque.setSelected(true);
        jREstoque.setText("Estoque");

        jRLote.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRLote.setText("Lotes");

        jRLocalEstoque.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRLocalEstoque.setText("Local Estoque");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("________________");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jREstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRLocalEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jREstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRLote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRLocalEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jRReceber.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRReceber.setSelected(true);
        jRReceber.setText("Receber (CA)");

        jRPagar.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRPagar.setSelected(true);
        jRPagar.setText("Pagar (CA)");

        jRPagamento.setFont(new java.awt.Font("Dialog", 0, 17)); // NOI18N
        jRPagamento.setText("Pagamento");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("________________");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jRPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jRPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jRReceber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRPagamento)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimparSelecoes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btngerar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimparSelecoes)
                    .addComponent(btngerar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparSelecoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparSelecoesActionPerformed
        jRProdutos.setSelected(false);
        jRUnidades.setSelected(false);
        jRCategorias.setSelected(false);
        jRSubcategorias.setSelected(false);
        jRFabricante.setSelected(false);
        jRFornecedores.setSelected(false);
        jRClientes.setSelected(false);
        jRCst.setSelected(false);
        jRNcm.setSelected(false);
        jRCest.setSelected(false);
        jRGrupoDeTributacao.setSelected(false);
        jREstoque.setSelected(false);
        jRLote.setSelected(false);
        jRReceber.setSelected(false);
        jRPagar.setSelected(false);
        jRPagamento.setSelected(false);
        jRConvenio.setSelected(false);
        jREmpresa.setSelected(false);
        jRUsuario.setSelected(false);
        jRFidelidade.setSelected(false);
        jRPaciente.setSelected(false);
    }//GEN-LAST:event_btnLimparSelecoesActionPerformed

    private void btngerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngerarActionPerformed
        try {
            
            if (validarSelecoes()) {
                new ExtrairTabelasSelecionadasDumpSql().extrairTabelasSql();
            } else {
                JOptionPane.showMessageDialog(null, "Selecione uma das tabelas!", "Atenção!", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btngerarActionPerformed

    private void jRFidelidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRFidelidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRFidelidadeActionPerformed

    private void jRPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRPacienteActionPerformed

    private boolean validarSelecoes() {
        if (jRProdutos.isSelected()
                || jRUnidades.isSelected()
                || jRCategorias.isSelected()
                || jRSubcategorias.isSelected()
                || jRFabricante.isSelected()
                || jRFornecedores.isSelected()
                || jRClientes.isSelected()
                || jRCst.isSelected()
                || jRNcm.isSelected()
                || jRCest.isSelected()
                || jRGrupoDeTributacao.isSelected()
                || jREstoque.isSelected()
                || jRLote.isSelected()
                || jRReceber.isSelected()
                || jRPagar.isSelected()
                || jRPagamento.isSelected()
                || jRConvenio.isSelected()
                || jREmpresa.isSelected()
                || jRUsuario.isSelected()
                || jRFidelidade.isSelected()
                || jRPaciente.isSelected()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicialPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicialPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicialPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicialPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicialPrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimparSelecoes;
    private javax.swing.JButton btngerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JRadioButton jRCategorias;
    public static javax.swing.JRadioButton jRCest;
    public static javax.swing.JRadioButton jRClientes;
    public static javax.swing.JRadioButton jRConvenio;
    public static javax.swing.JRadioButton jRCst;
    public static javax.swing.JRadioButton jREmpresa;
    public static javax.swing.JRadioButton jREstoque;
    public static javax.swing.JRadioButton jRFabricante;
    public static javax.swing.JRadioButton jRFidelidade;
    public static javax.swing.JRadioButton jRFornecedores;
    public static javax.swing.JRadioButton jRGrupoDeTributacao;
    public static javax.swing.JRadioButton jRLocalEstoque;
    public static javax.swing.JRadioButton jRLote;
    public static javax.swing.JRadioButton jRNcm;
    public static javax.swing.JRadioButton jRPaciente;
    public static javax.swing.JRadioButton jRPagamento;
    public static javax.swing.JRadioButton jRPagar;
    public static javax.swing.JRadioButton jRProdutos;
    public static javax.swing.JRadioButton jRReceber;
    public static javax.swing.JRadioButton jRSubcategorias;
    public static javax.swing.JRadioButton jRUnidades;
    public static javax.swing.JRadioButton jRUsuario;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
