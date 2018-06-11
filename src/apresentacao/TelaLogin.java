package apresentacao;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import interfaces.IComunicaPaginaPrincipal;

public class TelaLogin extends JInternalFrame {

    private JDesktopPane pane;
    private IComunicaPaginaPrincipal paginaPrincipal;
    public TelaLogin(JDesktopPane pane, IComunicaPaginaPrincipal tt) {
        initComponents();
        this.pane = pane;
        this.paginaPrincipal = tt;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAvancar = new javax.swing.JButton();
        jLabelCadastre_se_1 = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelCadastre_se_2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelEsqueceuASenha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Login");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(0, 0, 0)));

        jButtonAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagem/icons8-login-50.png"))); // NOI18N
        jButtonAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAvancarActionPerformed(evt);
            }
        });

        jLabelCadastre_se_1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelCadastre_se_1.setText("É novo na área?\n");
        jLabelCadastre_se_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastre_se_1MouseClicked(evt);
            }
        });

        jTextFieldLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelCadastre_se_2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelCadastre_se_2.setText("Cadastre - se agora!");
        jLabelCadastre_se_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCadastre_se_2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Login:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Senha:");

        jPasswordFieldSenha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabelEsqueceuASenha.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelEsqueceuASenha.setText("Esqueceu a senha?");
        jLabelEsqueceuASenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEsqueceuASenhaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldLogin)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordFieldSenha)
                        .addComponent(jLabelCadastre_se_1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAvancar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                    .addComponent(jLabelCadastre_se_2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEsqueceuASenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonAvancar)
                .addGap(43, 43, 43)
                .addComponent(jLabelCadastre_se_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCadastre_se_2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelEsqueceuASenha)
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagem/register-login-add-on.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAvancarActionPerformed
        try {
            paginaPrincipal.comunicaPaginaPrincipal(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "");
        }
    }//GEN-LAST:event_jButtonAvancarActionPerformed

    private void jLabelCadastre_se_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastre_se_1MouseClicked
        JOptionPane.showMessageDialog(null, "HaHa");
    }//GEN-LAST:event_jLabelCadastre_se_1MouseClicked

    private void jLabelCadastre_se_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCadastre_se_2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCadastre_se_2MouseClicked

    private void jLabelEsqueceuASenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEsqueceuASenhaMouseClicked
    }//GEN-LAST:event_jLabelEsqueceuASenhaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAvancar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCadastre_se_1;
    private javax.swing.JLabel jLabelCadastre_se_2;
    private javax.swing.JLabel jLabelEsqueceuASenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
