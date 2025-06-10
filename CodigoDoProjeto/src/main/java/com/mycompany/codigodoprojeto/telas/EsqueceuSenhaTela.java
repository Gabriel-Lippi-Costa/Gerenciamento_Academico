package com.mycompany.codigodoprojeto.telas;

import com.mycompany.codigodoprojeto.modelos.UsuarioEsqueceuSenha;
import com.mycompany.codigodoprojeto.persistencia.DAO;
import javax.swing.JOptionPane;

public class EsqueceuSenhaTela extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EsqueceuSenhaTela.class.getName());

  public EsqueceuSenhaTela() {
    super("Gerenciamento Acadêmico");
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    lembreiLabel = new javax.swing.JLabel();
    confirmarButton = new javax.swing.JButton();
    emailTextField = new javax.swing.JTextField();
    senhaNovaTextField = new javax.swing.JTextField();
    senhaNovaLabel = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    tituloLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setPreferredSize(new java.awt.Dimension(800, 500));
    getContentPane().setLayout(new java.awt.GridLayout());

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    lembreiLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
    lembreiLabel.setText("Lembrei da minha conta");
    lembreiLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    lembreiLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        lembreiLabelMouseClicked(evt);
      }
    });

    confirmarButton.setBackground(new java.awt.Color(41, 41, 41));
    confirmarButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    confirmarButton.setForeground(new java.awt.Color(255, 255, 255));
    confirmarButton.setText("CONFIRMAR");
    confirmarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirmarButtonActionPerformed(evt);
      }
    });

    emailTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    emailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    senhaNovaTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    senhaNovaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    senhaNovaLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    senhaNovaLabel.setText("SENHA NOVA");

    emailLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    emailLabel.setText("E-MAIL");

    tituloLabel.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    tituloLabel.setText("Informe seu e-mail para redifinir sua senha!");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(38, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(32, 32, 32))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(confirmarButton)
            .addGap(308, 308, 308))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lembreiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(senhaNovaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(senhaNovaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(278, 278, 278))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(tituloLabel)
        .addGap(42, 42, 42)
        .addComponent(emailLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(21, 21, 21)
        .addComponent(senhaNovaLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(senhaNovaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
        .addComponent(lembreiLabel)
        .addGap(18, 18, 18)
        .addComponent(confirmarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(63, 63, 63))
    );

    getContentPane().add(jPanel2);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void lembreiLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lembreiLabelMouseClicked
    new LoginTela().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_lembreiLabelMouseClicked

  private void confirmarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarButtonActionPerformed
    String email = emailTextField.getText();
    String novaSenha = senhaNovaTextField.getText();
    
    try {
      UsuarioEsqueceuSenha usuario = new UsuarioEsqueceuSenha(email, novaSenha);
      DAO dao = new DAO();
      
      if (dao.mudarSenhaUsuario(usuario)) {
        JOptionPane.showMessageDialog(null, "Senha atualizada com sucesso!");
        new LoginTela().setVisible(true);
        this.dispose();
      } else {
        JOptionPane.showMessageDialog(null, "E-mail não encontrado ou erro ao alterar a senha");
      }
      
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
      e.printStackTrace();
    }
    
  }//GEN-LAST:event_confirmarButtonActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new EsqueceuSenhaTela().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton confirmarButton;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JTextField emailTextField;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lembreiLabel;
  private javax.swing.JLabel senhaNovaLabel;
  private javax.swing.JTextField senhaNovaTextField;
  private javax.swing.JLabel tituloLabel;
  // End of variables declaration//GEN-END:variables
}
