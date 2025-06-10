package com.mycompany.codigodoprojeto.telas;

import com.mycompany.codigodoprojeto.modelos.UsuarioCriarConta;
import com.mycompany.codigodoprojeto.persistencia.DAO;
import javax.swing.JOptionPane;

public class CriarContaTela extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CriarContaTela.class.getName());

  public CriarContaTela() {
    super("Gerenciamento Acadêmico");
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    tituloLabel = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    senhaLabel = new javax.swing.JLabel();
    dataNascimentoUmLabel = new javax.swing.JLabel();
    dataNascimentoDoisLabel = new javax.swing.JLabel();
    senhaTextField = new javax.swing.JTextField();
    dataNascimentoTextField = new javax.swing.JTextField();
    emailTextField = new javax.swing.JTextField();
    jaTenhoContaLabel = new javax.swing.JLabel();
    criarContaButton = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    nomeCompletoLabel = new javax.swing.JLabel();
    nomeCompletoTextField = new javax.swing.JTextField();
    cpfLabel = new javax.swing.JLabel();
    cpfTextField = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));
    setPreferredSize(new java.awt.Dimension(800, 500));
    getContentPane().setLayout(null);

    tituloLabel.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    tituloLabel.setText("Crie sua conta");
    getContentPane().add(tituloLabel);
    tituloLabel.setBounds(269, 16, 240, 40);

    emailLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    emailLabel.setText("E-MAIL");
    getContentPane().add(emailLabel);
    emailLabel.setBounds(20, 90, 85, 30);

    senhaLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    senhaLabel.setText("SENHA");
    getContentPane().add(senhaLabel);
    senhaLabel.setBounds(20, 200, 87, 30);

    dataNascimentoUmLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    dataNascimentoUmLabel.setText("DATA DE ");
    getContentPane().add(dataNascimentoUmLabel);
    dataNascimentoUmLabel.setBounds(560, 60, 116, 30);

    dataNascimentoDoisLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    dataNascimentoDoisLabel.setText("NASCIMENTO");
    getContentPane().add(dataNascimentoDoisLabel);
    dataNascimentoDoisLabel.setBounds(561, 87, 164, 30);

    senhaTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    senhaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(senhaTextField);
    senhaTextField.setBounds(20, 230, 210, 39);

    dataNascimentoTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    dataNascimentoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(dataNascimentoTextField);
    dataNascimentoTextField.setBounds(560, 120, 210, 39);

    emailTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    emailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(emailTextField);
    emailTextField.setBounds(20, 120, 210, 39);

    jaTenhoContaLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
    jaTenhoContaLabel.setText("Já tenho uma conta");
    jaTenhoContaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jaTenhoContaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jaTenhoContaLabelMouseClicked(evt);
      }
    });
    getContentPane().add(jaTenhoContaLabel);
    jaTenhoContaLabel.setBounds(300, 340, 170, 21);

    criarContaButton.setBackground(new java.awt.Color(41, 41, 41));
    criarContaButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
    criarContaButton.setForeground(new java.awt.Color(255, 255, 255));
    criarContaButton.setText("CRIAR");
    criarContaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    criarContaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        criarContaButtonActionPerformed(evt);
      }
    });
    getContentPane().add(criarContaButton);
    criarContaButton.setBounds(320, 380, 120, 50);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));
    jPanel1.setLayout(null);

    nomeCompletoLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    nomeCompletoLabel.setText("NOME COMPLETO");
    jPanel1.add(nomeCompletoLabel);
    nomeCompletoLabel.setBounds(280, 90, 223, 30);

    nomeCompletoTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    nomeCompletoTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel1.add(nomeCompletoTextField);
    nomeCompletoTextField.setBounds(280, 120, 210, 39);

    cpfLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    cpfLabel.setText("CPF");
    jPanel1.add(cpfLabel);
    cpfLabel.setBounds(280, 200, 50, 30);

    cpfTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    cpfTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel1.add(cpfTextField);
    cpfTextField.setBounds(280, 230, 210, 39);

    getContentPane().add(jPanel1);
    jPanel1.setBounds(0, 0, 780, 490);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void criarContaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarContaButtonActionPerformed
    String email = emailTextField.getText();
    String senha = senhaTextField.getText();
    String nomeCompleto = nomeCompletoTextField.getText();
    String cpf = cpfTextField.getText();
    String dataNascimento = dataNascimentoTextField.getText();
    
    try {
      UsuarioCriarConta usuarioCriarConta = new UsuarioCriarConta(email, senha, nomeCompleto, cpf, dataNascimento);
      DAO dao = new DAO();
      boolean sucesso = dao.criarContaUsuario(usuarioCriarConta);
      
      if (sucesso) {
        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");
        new LoginTela().setVisible(true);
        this.dispose();
      } else {
        JOptionPane.showMessageDialog(null, "Não foi possível criar a conta!");
      }
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
      e.printStackTrace();
    }
  }//GEN-LAST:event_criarContaButtonActionPerformed

  private void jaTenhoContaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jaTenhoContaLabelMouseClicked
    new LoginTela().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_jaTenhoContaLabelMouseClicked

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> new CriarContaTela().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel cpfLabel;
  private javax.swing.JTextField cpfTextField;
  private javax.swing.JButton criarContaButton;
  private javax.swing.JLabel dataNascimentoDoisLabel;
  private javax.swing.JTextField dataNascimentoTextField;
  private javax.swing.JLabel dataNascimentoUmLabel;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JTextField emailTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel jaTenhoContaLabel;
  private javax.swing.JLabel nomeCompletoLabel;
  private javax.swing.JTextField nomeCompletoTextField;
  private javax.swing.JLabel senhaLabel;
  private javax.swing.JTextField senhaTextField;
  private javax.swing.JLabel tituloLabel;
  // End of variables declaration//GEN-END:variables
}
