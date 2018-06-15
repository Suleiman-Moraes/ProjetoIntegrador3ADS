package apresentacao.motorista;

import apresentacao.Dialogo_ERRO;
import apresentacao.Dialogo_Sucesso;
import apresentacao.TelaLogin;
import enuns.Legenda;
import enuns.Sexo;
import enuns.StatusMotorista;
import interfaces.IComunicaPaginaPrincipal;
import java.util.Arrays;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import model.Endereco;
import model.Motorista;
import model.Veiculo;
import service.EnderecoService;
import service.MotoristaService;
import util.Ultilidades;

public class MotoristaCadastro extends javax.swing.JInternalFrame {

    private Legenda legenda;
    private JDesktopPane principal;
    private IComunicaPaginaPrincipal paginaPrincipal;
    private Motorista motorista;
    
    public MotoristaCadastro(Legenda legenda, JDesktopPane principal, IComunicaPaginaPrincipal paginaPrincipal) {
        initComponents();
        this.legenda = legenda;
        this.principal = principal;
        this.paginaPrincipal = paginaPrincipal;
    }
    public MotoristaCadastro(Legenda legenda, JDesktopPane principal, IComunicaPaginaPrincipal paginaPrincipal, Motorista motorista) {
        initComponents();
        this.legenda = legenda;
        this.principal = principal;
        this.paginaPrincipal = paginaPrincipal;
        this.motorista = motorista;
        this.preencherTela(motorista);
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
        jLabelID9 = new javax.swing.JLabel();
        jFormattedTextFieldCNH = new javax.swing.JFormattedTextField();
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
        jFormattedTextFieldCEP = new javax.swing.JFormattedTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldCor = new javax.swing.JTextField();
        jTextFieldPlaca = new javax.swing.JTextField();
        jFormattedTextFieldAssentos = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setResizable(true);
        setTitle("Cadastro de Motorista");

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

        jLabelID9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelID9.setText("CNH");
        jLabelID9.setToolTipText("");

        try {
            jFormattedTextFieldCNH.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCNH.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID9)
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
                    .addComponent(jTextFieldID)
                    .addComponent(jFormattedTextFieldCNH))
                .addContainerGap(27, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID9)
                    .addComponent(jFormattedTextFieldCNH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        try {
            jFormattedTextFieldCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCEP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldComplemento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldCEP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldSetor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jTextFieldLote, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldComplemento))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Modelo");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Marca");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Cor");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Assentos");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Placa");

        jTextFieldModelo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldMarca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldCor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jTextFieldPlaca.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            jFormattedTextFieldAssentos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldAssentos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldModelo)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldAssentos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jFormattedTextFieldAssentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Ações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jButtonFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
            Motorista motorista = this.printTela();

            new EnderecoService().salvar(motorista.getEndereco());
            new MotoristaService().salvar(motorista);
            Dialogo_Sucesso.dialogo_Sucesso(principal, "Dados Inseridos com sucesso!");
            this.limparTela();
            
            if(jTextFieldID.getText().trim().equals("")){
                JInternalFrame tela = new TelaLogin(principal, paginaPrincipal, legenda);
                principal.add(tela);
                tela.setVisible(true);
            }
            this.dispose();
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
        if(jFormattedTextFieldCNH.getText().trim().length() != 11){
            throw new Exception("Insira CNH.");
        }
        
        this.validaCamposEndereco();
        this.validaCamposVeiculo();
    }
    
    private void validaCamposVeiculo()throws Exception{
        if(jTextFieldModelo.getText().trim().equals("")){
            throw new Exception("Insira Modelo.");
        }
        if(jTextFieldMarca.getText().trim().equals("")){
            throw new Exception("Insira Marca.");
        }
        if(jTextFieldCor.getText().trim().equals("")){
            throw new Exception("Insira Cor.");
        }
        if(jFormattedTextFieldAssentos.getText().trim().equals("")){
            throw new Exception("Insira Assentos.");
        }
        if(jTextFieldPlaca.getText().trim().equals("")){
            throw new Exception("Insira Placa.");
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
    
    private Motorista printTela() throws Exception{
        Motorista motorista = new Motorista();
        if(!jTextFieldID.getText().trim().equals("")){
            motorista.setId(new Integer(jTextFieldID.getText().trim()));
        }
        motorista.setNome(jTextFieldNome.getText().trim());
        motorista.setCpf(jFormattedTextFieldCPF.getText().trim());
        motorista.setTelefone(jFormattedTextFieldTelefone.getText().trim());
        if(jTextFieldEmail.getText().trim().length() >= 5){
            motorista.setEmail(jTextFieldEmail.getText().trim());
        }
        motorista.setLogin(jTextFieldLogin.getText().trim());
        motorista.setSenha(Arrays.toString(jPasswordFieldSenha.getPassword()));
        motorista.setDataDeNascimento(
                Ultilidades.pegaStringDevolveDataUtil(jFormattedTextFieldDataNascimento.getText().trim()));
        if(jRadioButtonHomem.isSelected()){
            motorista.setSexo(Sexo.HOMEM);
        }
        else{
            motorista.setSexo(Sexo.MULHER);
        }
        motorista.setCnh(jFormattedTextFieldCNH.getText().trim());
        
        motorista.setEndereco(printTelaEndereco());
        motorista.setVeiculo(printTelaVeiculo());
        motorista.setStatusMotorista(StatusMotorista.OFFLINE);
        
        return motorista;
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
    
    private Veiculo printTelaVeiculo(){
        Veiculo x = new Veiculo();
        
        x.setModelo(jTextFieldModelo.getText().trim());
        x.setMarca(jTextFieldMarca.getText().trim());
        x.setCor(jTextFieldCor.getText().trim());
        x.setAssentos(new Integer(jFormattedTextFieldAssentos.getText().trim()));
        x.setPlaca(jTextFieldPlaca.getText().trim());
        
        return x;
    }
    
    private void preencherTela(Motorista motorista){
        try {
            jTextFieldID.setText(motorista.getId() + "");
            jTextFieldNome.setText(motorista.getNome());
            jFormattedTextFieldCPF.setText(motorista.getCpf());
            jFormattedTextFieldTelefone.setText(motorista.getTelefone());
            jTextFieldEmail.setText(motorista.getEmail());
            jTextFieldLogin.setText(motorista.getLogin());
            jPasswordFieldSenha.setText(motorista.getSenha());
            jFormattedTextFieldDataNascimento.setText(Ultilidades.pegaDataDevolveString(motorista.getDataDeNascimento()));
            this.preencherTelaEndereco(motorista.getEndereco());
            this.preencherTelaVeiculo(motorista.getVeiculo());

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
    
    private void preencherTelaVeiculo(Veiculo veiculo){
        try {
            jTextFieldModelo.setText(veiculo.getModelo());
            jTextFieldMarca.setText(veiculo.getMarca());
            jTextFieldCor.setText(veiculo.getCor());
            jFormattedTextFieldAssentos.setText(veiculo.getAssentos() + "");
            jTextFieldPlaca.setText(veiculo.getPlaca());
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
            this.limparTelaVeiculo();

//            jButtonExcluir.setEnabled(false);
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(principal, e.getMessage());
        }
    }
    
    private void limparTelaVeiculo(){
        try {
            jTextFieldModelo.setText("");
            jTextFieldMarca.setText("");
            jTextFieldCor.setText("");
            jFormattedTextFieldAssentos.setText("");
            jTextFieldPlaca.setText("");
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
    private javax.swing.JFormattedTextField jFormattedTextFieldAssentos;
    private javax.swing.JFormattedTextField jFormattedTextFieldCEP;
    private javax.swing.JFormattedTextField jFormattedTextFieldCNH;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelID1;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JLabel jLabelID3;
    private javax.swing.JLabel jLabelID4;
    private javax.swing.JLabel jLabelID5;
    private javax.swing.JLabel jLabelID6;
    private javax.swing.JLabel jLabelID7;
    private javax.swing.JLabel jLabelID8;
    private javax.swing.JLabel jLabelID9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JRadioButton jRadioButtonHomem;
    private javax.swing.JRadioButton jRadioButtonMulher;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPlaca;
    private javax.swing.JTextField jTextFieldQuadra;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldSetor;
    // End of variables declaration//GEN-END:variables
}
