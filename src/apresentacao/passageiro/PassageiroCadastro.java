package apresentacao.passageiro;

import apresentacao.Dialogo_ERRO;
import apresentacao.Dialogo_Sucesso;
import apresentacao.TelaLogin;
import enuns.Legenda;
import enuns.Sexo;
import interfaces.IComunicaPaginaPrincipal;
import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import model.Endereco;
import model.Passageiro;
import service.PassageiroService;
import util.Ultilidades;

public class PassageiroCadastro extends javax.swing.JInternalFrame {

    private Legenda legenda;
    private JDesktopPane principal;
    private IComunicaPaginaPrincipal paginaPrincipal;
    
    public PassageiroCadastro(Legenda legenda, JDesktopPane principal, IComunicaPaginaPrincipal paginaPrincipal) {
        initComponents();
        this.legenda = legenda;
        this.principal = principal;
        this.paginaPrincipal = paginaPrincipal;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelID = new javax.swing.JLabel();
        jLabelID1 = new javax.swing.JLabel();
        jLabelID2 = new javax.swing.JLabel();
        jLabelID3 = new javax.swing.JLabel();
        jLabelID4 = new javax.swing.JLabel();
        jLabelID5 = new javax.swing.JLabel();
        jLabelID6 = new javax.swing.JLabel();
        jLabelID7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldLogin = new javax.swing.JTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextFieldDataNascimento = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelID8 = new javax.swing.JLabel();
        jRadioButtonHomem = new javax.swing.JRadioButton();
        jRadioButtonMulher = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldQuadra = new javax.swing.JTextField();
        jTextFieldLote = new javax.swing.JTextField();
        jTextFieldSetor = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setResizable(true);
        setTitle("Cadastro de Passageiro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Dados Básicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabelID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID.setText("Código");
        jLabelID.setToolTipText("");

        jLabelID1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID1.setText("Nome");
        jLabelID1.setToolTipText("");

        jLabelID2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID2.setText("CPF");
        jLabelID2.setToolTipText("");

        jLabelID3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID3.setText("Telefone");
        jLabelID3.setToolTipText("");

        jLabelID4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID4.setText("E-mail");
        jLabelID4.setToolTipText("");

        jLabelID5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID5.setText("Login");
        jLabelID5.setToolTipText("");

        jLabelID6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID6.setText("Senha");
        jLabelID6.setToolTipText("");

        jLabelID7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID7.setText("Data de nascimento");
        jLabelID7.setToolTipText("");

        jTextFieldID.setEditable(false);
        jTextFieldID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCPF.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            jFormattedTextFieldTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldTelefone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            jFormattedTextFieldDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldDataNascimento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextFieldEmail.setText("@.");

        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelID8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID8.setText("Sexo");
        jLabelID8.setToolTipText("");

        jRadioButtonHomem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButtonHomem.setText("Homem");
        jRadioButtonHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonHomemActionPerformed(evt);
            }
        });

        jRadioButtonMulher.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButtonMulher.setText("Mulher");
        jRadioButtonMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMulherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID8)
                    .addComponent(jLabelID)
                    .addComponent(jLabelID1)
                    .addComponent(jLabelID2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelID7)
                        .addComponent(jLabelID6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelID5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelID4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelID3, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNome)
                    .addComponent(jTextFieldLogin)
                    .addComponent(jFormattedTextFieldCPF)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldDataNascimento)
                    .addComponent(jTextFieldEmail)
                    .addComponent(jPasswordFieldSenha)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButtonHomem)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButtonMulher))
                    .addComponent(jTextFieldID))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID1)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID2)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID3)
                    .addComponent(jFormattedTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID4)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID5)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID6)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID7)
                    .addComponent(jFormattedTextFieldDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID8)
                    .addComponent(jRadioButtonHomem)
                    .addComponent(jRadioButtonMulher))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Rua");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Quadra");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Lote");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Setor");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("CEP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Complemento");

        jTextFieldRua.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldQuadra.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldLote.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldSetor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSetor)
                    .addComponent(jTextFieldComplemento)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jTextFieldRua)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(145, 145, 145))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonFechar.setText("Fechar");
        jButtonFechar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonHomemActionPerformed
        jRadioButtonMulher.setSelected(false);
    }//GEN-LAST:event_jRadioButtonHomemActionPerformed

    private void jRadioButtonMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMulherActionPerformed
        jRadioButtonHomem.setSelected(false);
    }//GEN-LAST:event_jRadioButtonMulherActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        try {
            this.validaCampos();
            Passageiro passageiro = this.printTela();
            
            new PassageiroService().salvar(passageiro);
            Dialogo_Sucesso.dialogo_Sucesso(principal, "Dados Inseridos com sucesso!");
            this.limparTela();
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        try {
            limparTela();
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        try {
            if(jTextFieldID.getText().trim().equals("")){
                JInternalFrame tela = new TelaLogin(principal, paginaPrincipal, legenda);
                principal.add(tela);
                tela.setVisible(true);
            }
            else{
                
            }
            this.dispose();
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void validaCampos() throws Exception{
        if(jTextFieldNome.getText().trim().equals("")) throw new Exception("Insira Nome.");
        if(jFormattedTextFieldCPF.getText().trim().length() != 14){
            throw new Exception("Insira CPF.");
        }
        if(jFormattedTextFieldTelefone.getText().trim().length() < 15){
            throw new Exception("Insira Telefone.");
        }
        if(jTextFieldEmail.getText().trim().length() >= 5){
            int cont = 0;
            boolean ponto = false;
            for (int i = 0; i < jTextFieldEmail.getText().trim().length(); i++) {
                if(jTextFieldEmail.getText().trim().charAt(i) == '@'){
                    cont ++;
                }
                else if(jTextFieldEmail.getText().trim().charAt(i) == '.'){
                    ponto = true;
                }
            }
            if(cont != 1 || !ponto){
                throw new Exception("E-mail Inválido.");
            }
        }
        if(jTextFieldLogin.getText().trim().equals("")) throw new Exception("Insira Login.");
        if(jPasswordFieldSenha.getPassword().length == 0) throw new Exception("Insira Senha.");
        if(jFormattedTextFieldDataNascimento.getText().trim().length() != 10){
            throw new Exception("Insira Data de Nascimento.");
        }
        if(!jRadioButtonHomem.isSelected() && !jRadioButtonMulher.isSelected()){
            throw new Exception("Selecione Sexo.");
        }
    }
    
    private void validaCamposEndereco() throws Exception{
        if(jTextFieldRua.getText().trim().equals("")) throw new Exception("Insira Rua.");
        if(jTextFieldQuadra.getText().trim().equals("")) throw new Exception("Insira Quadra.");
        if(jTextFieldLote.getText().trim().equals("")) throw new Exception("Insira Lote.");
        if(jTextFieldSetor.getText().trim().equals("")) throw new Exception("Insira Setor.");
//        if(jFormattedTextFieldCEP.getText().trim().length() != 9){
//            throw new Exception("");
//        }
//        if(jTextFieldComplemento.getText().trim().equals("")) throw new Exception("");
    }
    
    private Passageiro printTela() throws Exception{
        Passageiro passageiro = new Passageiro();
        if(!jTextFieldID.getText().trim().equals("")){
            passageiro.setId(new Integer(jTextFieldID.getText().trim()));
        }
        passageiro.setNome(jTextFieldNome.getText().trim());
        passageiro.setCpf(jFormattedTextFieldCPF.getText().trim());
        passageiro.setTelefone(jFormattedTextFieldTelefone.getText().trim());
        if(jTextFieldEmail.getText().trim().length() >= 5){
            passageiro.setEmail(jTextFieldEmail.getText().trim());
        }
        passageiro.setLogin(jTextFieldLogin.getText().trim());
        passageiro.setSenha(Arrays.toString(jPasswordFieldSenha.getPassword()));
        passageiro.setDataDeNascimento(
                Ultilidades.pegaStringDevolveDataUtil(jFormattedTextFieldDataNascimento.getText().trim()));
        if(jRadioButtonHomem.isSelected()){
            passageiro.setSexo(Sexo.HOMEM);
        }
        else{
            passageiro.setSexo(Sexo.MULHER);
        }
        
        passageiro.setEndereco(printTelaEndereco());
        
        return passageiro;
    }
    
    private Endereco printTelaEndereco(){
        Endereco x = new Endereco();
        
        x.setRua(jTextFieldRua.getText().trim());
        x.setQuadra(jTextFieldQuadra.getText().trim());
        x.setLote(jTextFieldLote.getText().trim());
        x.setSetor(jTextFieldSetor.getText().trim());
        if(jFormattedTextFieldCEP.getText().trim().length() == 9){
            x.setCep(jFormattedTextFieldCEP.getText().trim());
        }
        if(!jTextFieldComplemento.getText().trim().equals("")){
            x.setComplemento(jTextFieldComplemento.getText().trim());
        }
        
        return x;
    }
    
    private void preencherTela(Passageiro passageiro){
        try {
            jTextFieldID.setText(passageiro.getId() + "");
            jTextFieldNome.setText(passageiro.getNome());
            jFormattedTextFieldCPF.setText(passageiro.getCpf());
            jFormattedTextFieldTelefone.setText(passageiro.getTelefone());
            jTextFieldEmail.setText(passageiro.getEmail());
            jTextFieldLogin.setText(passageiro.getLogin());
            jPasswordFieldSenha.setText(passageiro.getSenha());
            jFormattedTextFieldDataNascimento.setText(Ultilidades.pegaDataDevolveString(passageiro.getDataDeNascimento()));
            this.preencherTelaEndereco(passageiro.getEndereco());

//            jButtonExcluir.setEnabled(true);
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }
    
    private void preencherTelaEndereco(Endereco endereco){
        try {
            jTextFieldRua.setText(endereco.getRua());
            jTextFieldQuadra.setText(endereco.getQuadra());
            jTextFieldLote.setText(endereco.getLote());
            jTextFieldSetor.setText(endereco.getSetor());
            jFormattedTextFieldCEP.setText(endereco.getCep());
            jTextFieldComplemento.setText(endereco.getComplemento());
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }
    
    private void limparTela(){
        try {
            jTextFieldID.setText("");
            jTextFieldNome.setText("");
            jFormattedTextFieldCPF.setText("");
            jFormattedTextFieldTelefone.setText("");
            jTextFieldEmail.setText("@.");
            jTextFieldLogin.setText("");
            jPasswordFieldSenha.setText("");
            jFormattedTextFieldDataNascimento.setText("");
            this.limparTelaEndereco();

//            jButtonExcluir.setEnabled(false);
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }
    
    private void limparTelaEndereco(){
        try {
            jTextFieldRua.setText("");
            jTextFieldQuadra.setText("");
            jTextFieldLote.setText("");
            jTextFieldSetor.setText("");
            jFormattedTextFieldCEP.setText("");
            jTextFieldComplemento.setText("");
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelID1;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JLabel jLabelID3;
    private javax.swing.JLabel jLabelID4;
    private javax.swing.JLabel jLabelID5;
    private javax.swing.JLabel jLabelID6;
    private javax.swing.JLabel jLabelID7;
    private javax.swing.JLabel jLabelID8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButtonHomem;
    private javax.swing.JRadioButton jRadioButtonMulher;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldQuadra;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldSetor;
    // End of variables declaration//GEN-END:variables
}
