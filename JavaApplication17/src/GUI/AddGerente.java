package GUI;

import Objetos.Gerente;
import java.awt.Toolkit;

public class AddGerente extends javax.swing.JFrame {

    public AddGerente() {
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

        tituloDentro = new javax.swing.JLabel();
        addGerenteLoginLabel = new javax.swing.JLabel();
        addGerenteLogin = new javax.swing.JTextField();
        addGerenteSenhaLabel = new javax.swing.JLabel();
        addGerenteBtnOk = new javax.swing.JButton();
        addGerenteBtnCanc = new javax.swing.JButton();
        addGerenteSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setResizable(false);

        tituloDentro.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        tituloDentro.setText("Cadastro de Gerente");
        tituloDentro.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        addGerenteLoginLabel.setText("Login:");

        addGerenteLogin.setToolTipText("Digite o login do gerente a ser utilizado. Este Login NÃO poderá ser editado.");

        addGerenteSenhaLabel.setText("Senha:");

        addGerenteBtnOk.setText("Confirmar");
        addGerenteBtnOk.setToolTipText("");
        addGerenteBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGerenteBtnOkActionPerformed(evt);
            }
        });

        addGerenteBtnCanc.setText("Cancelar");
        addGerenteBtnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGerenteBtnCancActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tituloDentro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(addGerenteLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addGerenteSenha)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addGerenteSenhaLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addGerenteLoginLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addGerenteBtnOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addGerenteBtnCanc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloDentro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGerenteLoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGerenteLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addGerenteSenhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addGerenteSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addGerenteBtnCanc)
                    .addComponent(addGerenteBtnOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 static boolean canLogin = false;
    private void addGerenteBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGerenteBtnOkActionPerformed
        String senha = String.copyValueOf(addGerenteSenha.getPassword());

        if (addGerenteLogin.getText().isEmpty()) {
            addGerenteLogin.requestFocus();
        } else if (senha.isEmpty()) {

        } else {
            Login.gerente = new Gerente(addGerenteLogin.getText(), senha.toCharArray());
            canLogin = true;
            this.dispose();
        }

    }//GEN-LAST:event_addGerenteBtnOkActionPerformed

    private void addGerenteBtnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGerenteBtnCancActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_addGerenteBtnCancActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGerente().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGerenteBtnCanc;
    private javax.swing.JButton addGerenteBtnOk;
    private javax.swing.JTextField addGerenteLogin;
    private javax.swing.JLabel addGerenteLoginLabel;
    private javax.swing.JPasswordField addGerenteSenha;
    private javax.swing.JLabel addGerenteSenhaLabel;
    private javax.swing.JLabel tituloDentro;
    // End of variables declaration//GEN-END:variables
}
