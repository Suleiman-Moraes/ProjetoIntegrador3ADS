package apresentacao.motorista;

import apresentacao.Dialogo_ERRO;
import apresentacao.TelaLogin;
import enuns.Legenda;
import enuns.StatusMotorista;
import interfaces.IComunicaPaginaPrincipal;
import interfaces.IObservador;
import interfaces.IServidorObserver;
import javax.swing.JInternalFrame;
import model.Motorista;
import observer.Informacao;
import service.MotoristaService;
import util.Fabrica;

public class MotoristaPrincipal extends javax.swing.JFrame implements IObservador, IComunicaPaginaPrincipal{

    private Informacao informacao = new Informacao();
    private IServidorObserver servidorObserver;
    private Legenda legenda = Legenda.MOTORISTA; 
    private Motorista motorista = null;
    
    public MotoristaPrincipal() {
        initComponents();
        JInternalFrame tela = new TelaLogin(jDesktopPane, this, legenda);
        jDesktopPane.add(tela);
        tela.setVisible(true);
    }
    public MotoristaPrincipal(IServidorObserver servidorObserver) {
        this();
        this.servidorObserver = servidorObserver;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemAlterarDados = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Motorista");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastro");
        jMenuCadastro.setEnabled(false);
        jMenuCadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItemAlterarDados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemAlterarDados.setText("Alterar Dados");
        jMenuItemAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlterarDadosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemAlterarDados);

        jMenuBar1.add(jMenuCadastro);

        jMenuSair.setText("Sair");
        jMenuSair.setEnabled(false);
        jMenuSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jMenuItemSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlterarDadosActionPerformed
        try {
            JInternalFrame janela = (JInternalFrame) Fabrica.getInstance(legenda, jDesktopPane, this);
            this.jDesktopPane.add(janela);
            janela.setVisible(true);
        } catch (Exception e) {
            Dialogo_ERRO.dialogo_ERRO(jDesktopPane, e.getMessage());
        }
    }//GEN-LAST:event_jMenuItemAlterarDadosActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        this.motorista.setStatusMotorista(StatusMotorista.OFFLINE);
        try {
            if(motorista != null && motorista.getId() > 0)
                new MotoristaService().salvar(motorista);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.servidorObserver.retirarDaRede(this);
        this.dispose();
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.motorista.setStatusMotorista(StatusMotorista.OFFLINE);
        try {
            if(motorista != null && motorista.getId() > 0)
                new MotoristaService().salvar(motorista);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        this.servidorObserver.retirarDaRede(this);
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    @Override
    public void atualiza(Informacao informacao) {
        this.informacao = informacao;
    }

    @Override
    public void conversarComServidor(Object object) {
        
        this.servidorObserver.setInformacao(this.informacao);
    }
    
    @Override
    public void comunicaPaginaPrincipal(boolean x, String login, String senha)  throws Exception{
        this.motorista = new MotoristaService().buscarPassandoLoginSenha(login, senha).get(0);
        this.motorista.setStatusMotorista(StatusMotorista.ONLINE);
        new MotoristaService().salvar(motorista);
        this.servidorObserver.incluirNaRede(this);
        jMenuCadastro.setEnabled(x);
        jMenuSair.setEnabled(x);
    }
    
    @Override
    public String tipoStatusEnum() {
        return motorista.getStatusMotorista().getDescricao();
    }
    
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MotoristaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MotoristaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MotoristaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MotoristaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MotoristaPrincipal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemAlterarDados;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuSair;
    // End of variables declaration//GEN-END:variables
}
