package apresentacao;

import apresentacao.cadastro.CadastroViagem;
import apresentacao.cadastro.CadastroOnibus;
import apresentacao.cadastro.CadastroMotorista;
import apresentacao.cadastro.CadastroModelo;
import java.util.Vector;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Modelo;
import model.Motorista;
import model.Onibus;
import model.Viagem;
import service.ModeloService;
import service.MotoristaService;
import service.OnibusService;
import service.ViagemService;

public class TelaPesquisa extends javax.swing.JInternalFrame {
    
    private JDesktopPane principal;
    private String chamada;
    private Onibus onibus;
    private Motorista motorista;
    private Viagem viagem;
    
    public TelaPesquisa() {
        initComponents();
    }
    
    public TelaPesquisa(JDesktopPane principal, Vector<String> cabecalho, Vector detalhe, String chamada) {
        this();
        this.chamada = chamada;
        this.principal = principal;
        jTable1.setModel(new DefaultTableModel(detalhe, cabecalho));
    }
    
    public TelaPesquisa(JDesktopPane principal, Vector<String> cabecalho, Vector detalhe, String chamada, Onibus onibus) {
        this();
        this.onibus = onibus;
        this.chamada = chamada;
        this.principal = principal;
        jTable1.setModel(new DefaultTableModel(detalhe, cabecalho));
    }
    
    public TelaPesquisa(JDesktopPane principal, Vector<String> cabecalho, Vector detalhe, String chamada, Motorista motorista) {
        this();
        this.motorista = motorista;
        this.chamada = chamada;
        this.principal = principal;
        jTable1.setModel(new DefaultTableModel(detalhe, cabecalho));
    }
    
    public TelaPesquisa(JDesktopPane principal, Vector<String> cabecalho, Vector detalhe, String chamada, Viagem viagem) {
        this();
        this.viagem = viagem;
        this.chamada = chamada;
        this.principal = principal;
        jTable1.setModel(new DefaultTableModel(detalhe, cabecalho));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonFechar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButtonFechar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonFechar.setText("FECHAR");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1659, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFechar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        try {
            JInternalFrame tela = null;
            if(null != chamada)switch (chamada) {
                case "motorista":
                    tela = new CadastroMotorista(principal);
                    break;
                case "modelo":
                    tela = new CadastroModelo(principal);
                    break;
                case "onibus":
                    tela = new CadastroOnibus(principal);
                    break;
                case "onibus/modelo":
                    tela = new CadastroOnibus(principal, onibus);
                    break;
                case "viagem/motorista":
                    tela = new CadastroViagem(principal, viagem);
                    break;
                case "viagem/onibus":
                    tela = new CadastroViagem(principal, viagem);
                    break;
                case "viagem":
                    tela = new CadastroViagem(principal);
                    break;
                default:
                    break;
            }
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        try {
            JInternalFrame tela = null;
            int linha = jTable1.getSelectedRow();
            
            if(chamada == "motorista"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Motorista motorista = new MotoristaService().visualizarUm(Integer.parseInt(codigo));
                tela = new CadastroMotorista(principal, motorista);
            }
            else if(chamada == "modelo"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Modelo modelo = new ModeloService().visualizarUm(Integer.parseInt(codigo));
                tela = new CadastroModelo(principal, modelo);
            }
            else if(chamada == "onibus"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Onibus onibus = new OnibusService().visualizarUm(codigo);
                tela = new CadastroOnibus(principal, onibus);
            }
            else if(chamada == "onibus/modelo"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Modelo modelo = new ModeloService().visualizarUm(Integer.parseInt(codigo));
                tela = new CadastroOnibus(principal, onibus, modelo);
            }
            else if(chamada == "viagem/onibus"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Onibus onibus = new OnibusService().visualizarUm(codigo);
                tela = new CadastroViagem(principal, viagem, onibus);
            }
            else if(chamada == "viagem/motorista"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Motorista motorista = new MotoristaService().visualizarUm(Integer.parseInt(codigo));
                tela = new CadastroViagem(principal, viagem, motorista);
            }
            else if(chamada == "viagem"){
                String codigo = jTable1.getValueAt(linha, 0).toString();
                Viagem viagem = new ViagemService().visualizarUm(Integer.parseInt(codigo));
                tela = new CadastroViagem(principal, viagem);
            }
            principal.add(tela);
            tela.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable1MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
