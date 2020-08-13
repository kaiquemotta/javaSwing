/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Kaique
 */
public class Darf1 extends javax.swing.JFrame {

    public Darf1() {
        initComponents();
        setSize(1150, 500);
        initIcon();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel3 = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        nCodigo = new javax.swing.JTextField();
        lbCadastro = new javax.swing.JLabel();
        dCadastro = new javax.swing.JTextField();
        lbAlterado = new javax.swing.JLabel();
        dAlterado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jpEspaco = new javax.swing.JPanel();
        jpInfo = new javax.swing.JPanel();
        lbPeriodoApuracao = new javax.swing.JLabel();
        lbCpfCnpj = new javax.swing.JLabel();
        lbCodigoReceita = new javax.swing.JLabel();
        lbDataVencimento = new javax.swing.JLabel();
        lbValorPrincipal = new javax.swing.JLabel();
        lbReferencia = new javax.swing.JLabel();
        lbValorMulta = new javax.swing.JLabel();
        lbValorJurosEncargos = new javax.swing.JLabel();
        lbValorTotal = new javax.swing.JLabel();
        tPeriodoApuracao = new javax.swing.JTextField();
        nCodigoReceita = new javax.swing.JTextField();
        nCpfCnpj = new javax.swing.JTextField();
        dDataVencimento = new javax.swing.JTextField();
        nReferencia = new javax.swing.JTextField();
        nValorPrincipal = new javax.swing.JTextField();
        nValorMulta = new javax.swing.JTextField();
        nValorJurosEncargos = new javax.swing.JTextField();
        nValorTotal = new javax.swing.JTextField();
        jpNome = new javax.swing.JPanel();
        cbNomeEmpresa = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbImagem = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de guia de imposto");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel3.setLayout(new java.awt.GridBagLayout());

        lbCodigo.setText("Codigo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(lbCodigo, gridBagConstraints);

        nCodigo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        jPanel3.add(nCodigo, gridBagConstraints);

        lbCadastro.setText("Cadastro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(lbCadastro, gridBagConstraints);

        dCadastro.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        jPanel3.add(dCadastro, gridBagConstraints);

        lbAlterado.setText("Alterado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(lbAlterado, gridBagConstraints);

        dAlterado.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        jPanel3.add(dAlterado, gridBagConstraints);

        jLabel4.setText("Alterado por");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jLabel4, gridBagConstraints);

        jTextField1.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        jPanel3.add(jTextField1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 20;
        getContentPane().add(jLabel5, gridBagConstraints);

        jPanel4.setLayout(new java.awt.GridBagLayout());

        jButton1.setText("Cadastrar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jButton1, gridBagConstraints);

        jButton4.setText("Alterar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jButton4, gridBagConstraints);

        jButton2.setText("Mais Um");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jButton2, gridBagConstraints);

        jButton3.setText("Proximo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jButton3, gridBagConstraints);

        jButton5.setText("Anterior");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.weightx = 1.0;
        jPanel4.add(jButton5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel4, gridBagConstraints);

        jpEspaco.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        getContentPane().add(jpEspaco, gridBagConstraints);

        jpInfo.setLayout(new java.awt.GridBagLayout());

        lbPeriodoApuracao.setText("02 - Periodo de Apuracao:*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbPeriodoApuracao, gridBagConstraints);

        lbCpfCnpj.setText("03 - N do CPF ou CNPJ:*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbCpfCnpj, gridBagConstraints);

        lbCodigoReceita.setText("04 - Codigo da Receita:*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbCodigoReceita, gridBagConstraints);

        lbDataVencimento.setText("06 - Data de Vencimento:*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbDataVencimento, gridBagConstraints);

        lbValorPrincipal.setText("07 - Valor do Principal:*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbValorPrincipal, gridBagConstraints);

        lbReferencia.setText("05 - Numero de Referencia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbReferencia, gridBagConstraints);

        lbValorMulta.setText("08 - Valor da Multa:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbValorMulta, gridBagConstraints);

        lbValorJurosEncargos.setText("09 - Valor dos Juros e/ ou Encargos DL - 1.025/69:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbValorJurosEncargos, gridBagConstraints);

        lbValorTotal.setText("10 - Valor Total:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpInfo.add(lbValorTotal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(tPeriodoApuracao, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nCodigoReceita, gridBagConstraints);

        nCpfCnpj.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nCpfCnpj, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(dDataVencimento, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nReferencia, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nValorPrincipal, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nValorMulta, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nValorJurosEncargos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 150;
        jpInfo.add(nValorTotal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jpInfo, gridBagConstraints);

        jpNome.setLayout(new java.awt.GridBagLayout());

        cbNomeEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto Geral Matri 05.437.537.0001-37", "Auto Geral Salto 05.437.537.0002-57", "Auto Geral Indai 05.437.537.0003-37", "Auto Geral Salto 05.437.537.0005-37", "Auto Geral Jaca  05.437.537.0006-37", "Auto Geral Soroc 05.437.537.0007-37", " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpNome.add(cbNomeEmpresa, gridBagConstraints);

        jLabel1.setText("        MINISTERIO DA FAZENDA SECRETARIA DA RECEITA FEDERAL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpNome.add(jLabel1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/brasao-do-brasil-republica-6.png"))); // NOI18N
        jPanel1.add(lbImagem, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpNome.add(jPanel1, gridBagConstraints);

        jLabel2.setText("            Documento de Arrecadacao de Receitas Federais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jpNome.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("                                                            DARF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jpNome.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jpNome, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Darf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Darf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Darf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Darf1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Darf1().setVisible(true);
            }
        });
    }

    private void initIcon() {
        setLocationRelativeTo(null);
        URL icone = getClass().getResource("/img/brasao-do-brasil-republica-6.png");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(icone);
        this.setIconImage(iconeTitulo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbNomeEmpresa;
    private javax.swing.JTextField dAlterado;
    private javax.swing.JTextField dCadastro;
    private javax.swing.JTextField dDataVencimento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpEspaco;
    private javax.swing.JPanel jpInfo;
    private javax.swing.JPanel jpNome;
    private javax.swing.JLabel lbAlterado;
    private javax.swing.JLabel lbCadastro;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigoReceita;
    private javax.swing.JLabel lbCpfCnpj;
    private javax.swing.JLabel lbDataVencimento;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JLabel lbPeriodoApuracao;
    private javax.swing.JLabel lbReferencia;
    private javax.swing.JLabel lbValorJurosEncargos;
    private javax.swing.JLabel lbValorMulta;
    private javax.swing.JLabel lbValorPrincipal;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JTextField nCodigo;
    private javax.swing.JTextField nCodigoReceita;
    private javax.swing.JTextField nCpfCnpj;
    private javax.swing.JTextField nReferencia;
    private javax.swing.JTextField nValorJurosEncargos;
    private javax.swing.JTextField nValorMulta;
    private javax.swing.JTextField nValorPrincipal;
    private javax.swing.JTextField nValorTotal;
    private javax.swing.JTextField tPeriodoApuracao;
    // End of variables declaration//GEN-END:variables

}
