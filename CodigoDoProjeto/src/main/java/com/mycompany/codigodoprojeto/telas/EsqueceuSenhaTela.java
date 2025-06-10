package com.mycompany.codigodoprojeto.telas;

public class EsqueceuSenhaTela extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EsqueceuSenhaTela.class.getName());

  public EsqueceuSenhaTela() {
    super("Gerenciamento Acadêmico");
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    tituloLabel = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    senhaNovaLabel = new javax.swing.JLabel();
    confirmarSenhaLabel = new javax.swing.JLabel();
    lembreiLabel = new javax.swing.JLabel();
    confirmarButton = new javax.swing.JButton();
    senhaNovaTextField = new javax.swing.JTextField();
    confirmarSenhaTextField = new javax.swing.JTextField();
    emailTextField = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(null);

    tituloLabel.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    tituloLabel.setText("Informe seu e-mail para redifinir sua senha!");
    getContentPane().add(tituloLabel);
    tituloLabel.setBounds(41, 22, 720, 40);

    emailLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    emailLabel.setText("E-MAIL");
    getContentPane().add(emailLabel);
    emailLabel.setBounds(149, 88, 83, 30);

    senhaNovaLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    senhaNovaLabel.setText("SENHA NOVA");
    getContentPane().add(senhaNovaLabel);
    senhaNovaLabel.setBounds(149, 226, 162, 30);

    confirmarSenhaLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    confirmarSenhaLabel.setText("CONFIRMAR SENHA");
    getContentPane().add(confirmarSenhaLabel);
    confirmarSenhaLabel.setBounds(444, 88, 240, 30);

    lembreiLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
    lembreiLabel.setText("Lembrei da minha conta");
    getContentPane().add(lembreiLabel);
    lembreiLabel.setBounds(308, 367, 200, 21);

    confirmarButton.setBackground(new java.awt.Color(41, 41, 41));
    confirmarButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
    confirmarButton.setForeground(new java.awt.Color(255, 255, 255));
    confirmarButton.setText("CONFIRMAR");
    getContentPane().add(confirmarButton);
    confirmarButton.setBounds(321, 406, 170, 50);

    senhaNovaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(senhaNovaTextField);
    senhaNovaTextField.setBounds(149, 262, 210, 39);

    confirmarSenhaTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(confirmarSenhaTextField);
    confirmarSenhaTextField.setBounds(444, 124, 210, 39);

    emailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    getContentPane().add(emailTextField);
    emailTextField.setBounds(149, 124, 210, 39);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 790, Short.MAX_VALUE)
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 490, Short.MAX_VALUE)
    );

    getContentPane().add(jPanel2);
    jPanel2.setBounds(0, 0, 790, 490);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> new EsqueceuSenhaTela().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton confirmarButton;
  private javax.swing.JLabel confirmarSenhaLabel;
  private javax.swing.JTextField confirmarSenhaTextField;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JTextField emailTextField;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JLabel lembreiLabel;
  private javax.swing.JLabel senhaNovaLabel;
  private javax.swing.JTextField senhaNovaTextField;
  private javax.swing.JLabel tituloLabel;
  // End of variables declaration//GEN-END:variables
}
