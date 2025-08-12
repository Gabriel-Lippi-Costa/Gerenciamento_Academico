package com.mycompany.codigodoprojeto.telas;

public class GerenciamentoProfessores extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GerenciamentoProfessores.class.getName());

  public GerenciamentoProfessores() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    voltarButton = new javax.swing.JButton();
    nomeLabel = new javax.swing.JLabel();
    ensinaLabel = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    senhaLabel = new javax.swing.JLabel();
    cpfLabel = new javax.swing.JLabel();
    nomeTextField = new javax.swing.JTextField();
    ensinaTextField = new javax.swing.JTextField();
    emailTextField = new javax.swing.JTextField();
    senhaTextField = new javax.swing.JTextField();
    cpfTextField = new javax.swing.JTextField();
    adicionarButton = new javax.swing.JButton();
    removerButton = new javax.swing.JButton();
    atualizarButton = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    professorTable = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    voltarButton.setBackground(new java.awt.Color(255, 0, 0));
    voltarButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    voltarButton.setForeground(new java.awt.Color(255, 255, 255));
    voltarButton.setText("VOLTAR");

    nomeLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    nomeLabel.setText("NOME");

    ensinaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    ensinaLabel.setText("ENSINA");

    emailLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    emailLabel.setText("EMAIL");

    senhaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    senhaLabel.setText("SENHA");

    cpfLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    cpfLabel.setText("CPF");

    adicionarButton.setBackground(new java.awt.Color(0, 0, 0));
    adicionarButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    adicionarButton.setForeground(new java.awt.Color(255, 255, 255));
    adicionarButton.setText("ADICIONAR");

    removerButton.setBackground(new java.awt.Color(0, 0, 0));
    removerButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    removerButton.setForeground(new java.awt.Color(255, 255, 255));
    removerButton.setText("REMOVER");

    atualizarButton.setBackground(new java.awt.Color(0, 0, 0));
    atualizarButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    atualizarButton.setForeground(new java.awt.Color(255, 255, 255));
    atualizarButton.setText("ATUALIZAR");

    professorTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "NOME", "ENSINA", "EMAIL", "SENHA", "CPF"
      }
    ));
    jScrollPane1.setViewportView(professorTable);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(69, 69, 69)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(nomeLabel)
              .addComponent(emailLabel)
              .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(senhaLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(ensinaLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(ensinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(50, 50, 50)
            .addComponent(adicionarButton)
            .addGap(184, 184, 184)
            .addComponent(removerButton)
            .addGap(222, 222, 222)
            .addComponent(atualizarButton))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(30, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(52, 52, 52)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nomeLabel)
          .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(ensinaLabel)
          .addComponent(ensinaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(emailLabel)
          .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(senhaLabel)
          .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(26, 26, 26)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cpfLabel)
          .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(49, 49, 49)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(adicionarButton)
          .addComponent(removerButton)
          .addComponent(atualizarButton))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  public static void main(String args[]) {
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
    } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
      logger.log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    java.awt.EventQueue.invokeLater(() -> new GerenciamentoProfessores().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton adicionarButton;
  private javax.swing.JButton atualizarButton;
  private javax.swing.JLabel cpfLabel;
  private javax.swing.JTextField cpfTextField;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JTextField emailTextField;
  private javax.swing.JLabel ensinaLabel;
  private javax.swing.JTextField ensinaTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel nomeLabel;
  private javax.swing.JTextField nomeTextField;
  private javax.swing.JTable professorTable;
  private javax.swing.JButton removerButton;
  private javax.swing.JLabel senhaLabel;
  private javax.swing.JTextField senhaTextField;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
