package apresentacao.principal;

import apresentacao.motorista.MotoristaPrincipal;
import apresentacao.passageiro.PassageiroPrincipal;
import enuns.StatusMotorista;
import enuns.StatusPassageiro;
import interfaces.IDesmaterializar;
import interfaces.IObservador;
import interfaces.IServidorObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import observer.Informacao;
import service.MotoristaService;
import service.PassageiroService;

public class Servidor extends javax.swing.JFrame implements IServidorObserver{

    private List observadores;
    private Informacao informacao;
    private final PassageiroService passageiroService;
    private final MotoristaService motoristaService;
    private String[] coluna = {"Código", "Nome", "CPF", "Telefone", "Sexo"};
    
    public Servidor() {
        this.passageiroService = new PassageiroService();
        this.motoristaService = new MotoristaService();
        initComponents();
        observadores = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmViagem = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePassageiroOnline = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablePassageiroSolicitouViagem = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableMotoristaDisponivel = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonPassageiro = new javax.swing.JButton();
        jButtonMotorista = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servidor");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Em Viagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jTableEmViagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome Passageiro", "Nome Motorista"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmViagem);
        if (jTableEmViagem.getColumnModel().getColumnCount() > 0) {
            jTableEmViagem.getColumnModel().getColumn(0).setResizable(false);
            jTableEmViagem.getColumnModel().getColumn(1).setResizable(false);
            jTableEmViagem.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Passageiros Online", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jTablePassageiroOnline.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablePassageiroOnline);
        if (jTablePassageiroOnline.getColumnModel().getColumnCount() > 0) {
            jTablePassageiroOnline.getColumnModel().getColumn(0).setResizable(false);
            jTablePassageiroOnline.getColumnModel().getColumn(1).setResizable(false);
            jTablePassageiroOnline.getColumnModel().getColumn(2).setResizable(false);
            jTablePassageiroOnline.getColumnModel().getColumn(3).setResizable(false);
            jTablePassageiroOnline.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Passageiro Solicitou Viagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jTablePassageiroSolicitouViagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Telefone", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTablePassageiroSolicitouViagem);
        if (jTablePassageiroSolicitouViagem.getColumnModel().getColumnCount() > 0) {
            jTablePassageiroSolicitouViagem.getColumnModel().getColumn(0).setResizable(false);
            jTablePassageiroSolicitouViagem.getColumnModel().getColumn(1).setResizable(false);
            jTablePassageiroSolicitouViagem.getColumnModel().getColumn(2).setResizable(false);
            jTablePassageiroSolicitouViagem.getColumnModel().getColumn(3).setResizable(false);
            jTablePassageiroSolicitouViagem.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)), "Motoristas Disponíveis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N

        jTableMotoristaDisponivel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CNH", "Sexo", "Placa Veículo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableMotoristaDisponivel);
        if (jTableMotoristaDisponivel.getColumnModel().getColumnCount() > 0) {
            jTableMotoristaDisponivel.getColumnModel().getColumn(0).setResizable(false);
            jTableMotoristaDisponivel.getColumnModel().getColumn(1).setResizable(false);
            jTableMotoristaDisponivel.getColumnModel().getColumn(2).setResizable(false);
            jTableMotoristaDisponivel.getColumnModel().getColumn(3).setResizable(false);
            jTableMotoristaDisponivel.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jButtonPassageiro.setBackground(java.awt.Color.lightGray);
        jButtonPassageiro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonPassageiro.setText("PASSAGEIRO");
        jButtonPassageiro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonPassageiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPassageiroActionPerformed(evt);
            }
        });

        jButtonMotorista.setBackground(java.awt.Color.lightGray);
        jButtonMotorista.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonMotorista.setText("MOTORISTA");
        jButtonMotorista.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMotoristaActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(6);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("DEIXE\nSEU \nANÚNCIO\nAKI!");
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        jScrollPane5.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPassageiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonMotorista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonPassageiro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPassageiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassageiroActionPerformed
        try {
            PassageiroPrincipal janela = new PassageiroPrincipal(this);
            janela.setVisible(true);
            janela.setLocationRelativeTo(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro no Servidor", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPassageiroActionPerformed

    private void jButtonMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMotoristaActionPerformed
        try {
            MotoristaPrincipal janela = new MotoristaPrincipal(this);
            janela.setVisible(true);
            janela.setLocationRelativeTo(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro no Servidor", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMotoristaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        teste();
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public void incluirNaRede(IObservador cv) {
        observadores.add(cv);
    }

    @Override
    public void retirarDaRede(IObservador cv) {
        if(cv != null){
            observadores.remove(cv);
        }
    }

    @Override
    public void dispararInformacoes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInformacao(Informacao cv) {
        //atualizargrid
    }
    
    private void atualizaGrids(){
        try {
            this.popularGridPassageiro();
            this.popularGrid(jTablePassageiroOnline, motoristaService.bucarMotoristasPassandoStatusEnum(StatusMotorista.ONLINE), this.coluna);
//            DefaultTableModel model = new DefaultTableModel();
//            model.setNumRows(0);
//            Iterator online = passageiroService.bucarPassageirosPassandoStatusEnum(StatusPassageiro.ONLINE);
//            while(online.hasNext()){
//                IDesmaterializar x = (IDesmaterializar) online.next();
//                model.addRow(popularGridPassageiro(x.desmaterializar()));
//            }
//            model.setColumnIdentifiers(this.colunaPassageiro);
//            jTablePassageiroOnline.setModel(model);
//            
//            model = new DefaultTableModel();
//            model.setNumRows(0);
//            online = passageiroService.bucarPassageirosPassandoStatusEnum(StatusPassageiro.SOLICITOU_VIAGEM);
//            while(online.hasNext()){
//                IDesmaterializar x = (IDesmaterializar) online.next();
//                model.addRow(popularGridPassageiro(x.desmaterializar()));
//            }
//            model.setColumnIdentifiers(this.colunaPassageiro);
//            jTablePassageiroSolicitouViagem.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro no Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void popularGridPassageiro(){
        try {
            this.popularGrid(jTablePassageiroOnline, passageiroService.bucarPassageirosPassandoStatusEnum(StatusPassageiro.ONLINE), this.coluna);
            this.popularGrid(jTablePassageiroSolicitouViagem, passageiroService.bucarPassageirosPassandoStatusEnum(StatusPassageiro.SOLICITOU_VIAGEM), this.coluna);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro no Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void popularGrid(JTable jTable, Iterator iterator, String[] coluna) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            model.setNumRows(0);
            while (iterator.hasNext()) {
                IDesmaterializar x = (IDesmaterializar) iterator.next();
                model.addRow(popularGridColuna(x.desmaterializar()));
            }
            model.setColumnIdentifiers(coluna);
            jTable.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro no Servidor", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private String[] popularGridColuna(String[] vet){
        String linha[] = new String[5];
        linha[0] = vet[0];
        linha[1] = vet[1];
        linha[2] = vet[2];
        linha[3] = vet[3];
        linha[4] = vet[14];
        return linha;
    }
    
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
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMotorista;
    private javax.swing.JButton jButtonPassageiro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTableEmViagem;
    private javax.swing.JTable jTableMotoristaDisponivel;
    private javax.swing.JTable jTablePassageiroOnline;
    private javax.swing.JTable jTablePassageiroSolicitouViagem;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private void teste() {
        DefaultTableModel model = new DefaultTableModel();
        model.setNumRows(0);
        model.addRow(new String[5]);
        model.setColumnIdentifiers(this.coluna);
        jTablePassageiroOnline.setModel(model);
    }
}
