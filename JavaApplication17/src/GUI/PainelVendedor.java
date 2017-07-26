/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Objetos.Cliente;
import Objetos.JNumberTextField;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author informatica
 */
public class PainelVendedor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public PainelVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabRmCli = new javax.swing.JTabbedPane();
        tabMkCli = new javax.swing.JPanel();
        newClienteNomeLabel = new javax.swing.JLabel();
        newClienteNome = new javax.swing.JTextField();
        newClienteCPFLabel = new javax.swing.JLabel();
        newClienteCPF = validaNums(1);
        newClienteIdadeLabel = new javax.swing.JLabel();
        newClienteIdade = new JNumberTextField(3);
        newClienteSexoLabel = new javax.swing.JLabel();
        newClienteSexo = new javax.swing.JComboBox<>();
        newClienteEnderecoLabel = new javax.swing.JLabel();
        newClienteEndereco = new javax.swing.JTextField();
        newClienteBtnOK = new javax.swing.JButton();
        newClienteBtnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tabVenda = new javax.swing.JPanel();
        lbFilme = new javax.swing.JLabel();
        selFilme = new javax.swing.JComboBox<>();
        lbSessao = new javax.swing.JLabel();
        selSessao = new javax.swing.JComboBox<>();
        texto = new javax.swing.JLabel();
        selQuantIngresso = new javax.swing.JComboBox<>();
        lbCpfCliente = new javax.swing.JLabel();
        codCPFCliVenda = new javax.swing.JTextField();
        btOkVenda = new javax.swing.JButton();
        btSlFilmeCancelar = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        newClienteNomeLabel.setText("Nome:");

        newClienteNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteNomeActionPerformed(evt);
            }
        });

        newClienteCPFLabel.setText("CPF (somente digitos):");

        newClienteCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteCPFActionPerformed(evt);
            }
        });
        newClienteCPF.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                newClienteCPFPropertyChange(evt);
            }
        });

        newClienteIdadeLabel.setText("Idade:");

        newClienteIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteIdadeActionPerformed(evt);
            }
        });

        newClienteSexoLabel.setText("Sexo:");

        newClienteSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));
        newClienteSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteSexoActionPerformed(evt);
            }
        });

        newClienteEnderecoLabel.setText("Endereço:");

        newClienteEndereco.setToolTipText("Digite o endereço do cliente a ser cadastrado.");

        newClienteBtnOK.setText("Confirmar");
        newClienteBtnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClienteBtnOKActionPerformed(evt);
            }
        });

        newClienteBtnCancel.setText("Cancelar");

        javax.swing.GroupLayout tabMkCliLayout = new javax.swing.GroupLayout(tabMkCli);
        tabMkCli.setLayout(tabMkCliLayout);
        tabMkCliLayout.setHorizontalGroup(
            tabMkCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabMkCliLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(tabMkCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newClienteEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(newClienteEnderecoLabel)
                    .addComponent(newClienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClienteSexoLabel)
                    .addComponent(newClienteIdade)
                    .addComponent(newClienteIdadeLabel)
                    .addComponent(newClienteCPF)
                    .addComponent(newClienteCPFLabel)
                    .addComponent(newClienteNome)
                    .addComponent(newClienteNomeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(tabMkCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newClienteBtnCancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClienteBtnOK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabMkCliLayout.setVerticalGroup(
            tabMkCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabMkCliLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(newClienteNomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteCPFLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMkCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClienteBtnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteIdadeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabMkCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newClienteIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newClienteBtnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteSexoLabel)
                .addGap(9, 9, 9)
                .addComponent(newClienteSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteEnderecoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        tabRmCli.addTab("Adicionar Cliente", tabMkCli);

        jLabel2.setText("Selecione UM (1) cliente:");

        jComboBox2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("Confirmar");

        jButton1.setText("Cancelar");
        jButton1.setMaximumSize(new java.awt.Dimension(79, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(79, 23));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabRmCli.addTab("Remover Cliente", jPanel3);

        lbFilme.setText("Filme:");

        selFilme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selFilme.setToolTipText("Seleção do filme, que o cliente deseja.");
        selFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selFilmeActionPerformed(evt);
            }
        });

        lbSessao.setText("Sessão");

        selSessao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selSessao.setToolTipText("Seleção da sessão que o cliente deseja.");

        texto.setText("Quantidade de ingressos:");

        selQuantIngresso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lbCpfCliente.setText("CPF do Cliente (opcional):");

        codCPFCliVenda.setToolTipText("Cpf do cliente cadastrado.");

        btOkVenda.setText("Confirmar");

        btSlFilmeCancelar.setText("Cancelar");

        javax.swing.GroupLayout tabVendaLayout = new javax.swing.GroupLayout(tabVenda);
        tabVenda.setLayout(tabVendaLayout);
        tabVendaLayout.setHorizontalGroup(
            tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabVendaLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto)
                    .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbCpfCliente)
                        .addComponent(lbSessao)
                        .addComponent(lbFilme)
                        .addComponent(selSessao, 0, 374, Short.MAX_VALUE)
                        .addComponent(selFilme, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(selQuantIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codCPFCliVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btOkVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSlFilmeCancelar)
                .addGap(38, 38, 38))
        );
        tabVendaLayout.setVerticalGroup(
            tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbSessao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selQuantIngresso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbCpfCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(codCPFCliVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addGroup(tabVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSlFilmeCancelar)
                    .addComponent(btOkVenda))
                .addContainerGap())
        );

        tabRmCli.addTab("Venda", tabVenda);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel3.setText("Você está logado como: *******");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabRmCli)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabRmCli, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selFilmeActionPerformed

    private void newClienteIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteIdadeActionPerformed

    }//GEN-LAST:event_newClienteIdadeActionPerformed

    private void newClienteNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteNomeActionPerformed

    }//GEN-LAST:event_newClienteNomeActionPerformed

    private void newClienteCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteCPFActionPerformed

    }//GEN-LAST:event_newClienteCPFActionPerformed

    private void newClienteCPFPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_newClienteCPFPropertyChange
    }//GEN-LAST:event_newClienteCPFPropertyChange

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * Método utilizado para transformar o JTextField num JFormattedTextField
     * afim de aceitar somente a entrada descrita.
     *
     * @param subOp
     * @return JTextField formatado
     */
    private JFormattedTextField validaNums(int subOp) {
        switch (subOp) {
            case 1: {
                MaskFormatter formatoCPF = null;
                try {
                    formatoCPF = new MaskFormatter("###.###.###-##");
                } catch (ParseException ex) {
                    Logger.getLogger(PainelVendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                JFormattedTextField field = new JFormattedTextField(formatoCPF);
                return field;
            }
            case 2: {
                MaskFormatter formatoCPF = null;
                try {
                    formatoCPF = new MaskFormatter("###");
                } catch (ParseException ex) {
                    Logger.getLogger(PainelVendedor.class.getName()).log(Level.SEVERE, null, ex);
                }
                JFormattedTextField field = new JFormattedTextField(formatoCPF);
                return field;
            }
            default:
                return new JFormattedTextField();
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void newClienteBtnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteBtnOKActionPerformed
        int idade;
        if (newClienteNome.getText().trim().isEmpty()) {
            newClienteNome.requestFocus();
            return;
        } else {
            boolean op = false;
            boolean op2 = false;
            String idadeStr = newClienteIdade.getText().trim();

            for (int i = 0; i < idadeStr.length(); i++) {
                char carac = idadeStr.charAt(i);
                if (!Character.isDigit(carac)) {
                    op = true;
                }
            }
            if (op) {
                newClienteIdade.requestFocus();
                return;
            } else {
                idade = Integer.parseInt(idadeStr);
                if ((idade > 150) || (idade < 18)) {
                    newClienteIdade.requestFocus();
                    return;
                } else {
                    if (newClienteEndereco.getText().trim().isEmpty()) {
                        newClienteEndereco.requestFocus();
                        return;
                    }
                }
            }
        }
        System.out.println(newClienteCPF.getText());
        //hgs work warning here; acima fazer validação de cpf
        boolean sexo;
        if (newClienteSexo.getSelectedItem().equals("Masculino")) {
            System.out.println("vtup");
        }
        Login.BD2.add(new Cliente(newClienteNome.getText().trim(), newClienteEndereco.getText().trim(), idade, true));
    }//GEN-LAST:event_newClienteBtnOKActionPerformed

    private void newClienteSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newClienteSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newClienteSexoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PainelVendedor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOkVenda;
    private javax.swing.JButton btSlFilmeCancelar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JTextField codCPFCliVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCpfCliente;
    private javax.swing.JLabel lbFilme;
    private javax.swing.JLabel lbSessao;
    private javax.swing.JButton newClienteBtnCancel;
    private javax.swing.JButton newClienteBtnOK;
    private javax.swing.JTextField newClienteCPF;
    private javax.swing.JLabel newClienteCPFLabel;
    private javax.swing.JTextField newClienteEndereco;
    private javax.swing.JLabel newClienteEnderecoLabel;
    private javax.swing.JTextField newClienteIdade;
    private javax.swing.JLabel newClienteIdadeLabel;
    private javax.swing.JTextField newClienteNome;
    private javax.swing.JLabel newClienteNomeLabel;
    private javax.swing.JComboBox<String> newClienteSexo;
    private javax.swing.JLabel newClienteSexoLabel;
    private javax.swing.JComboBox<String> selFilme;
    private javax.swing.JComboBox<String> selQuantIngresso;
    private javax.swing.JComboBox<String> selSessao;
    private javax.swing.JPanel tabMkCli;
    private javax.swing.JTabbedPane tabRmCli;
    private javax.swing.JPanel tabVenda;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
