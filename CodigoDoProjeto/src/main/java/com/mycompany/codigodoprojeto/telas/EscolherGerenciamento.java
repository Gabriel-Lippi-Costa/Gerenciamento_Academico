package com.mycompany.codigodoprojeto.telas;

public class EscolherGerenciamento extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EscolherGerenciamento.class.getName());

  public EscolherGerenciamento() {
    super("Gerenciamento Acadêmico");
    initComponents();
    setLocationRelativeTo(null);    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    perguntaLabel = new javax.swing.JLabel();
    alunoButton = new javax.swing.JButton();
    professorButton = new javax.swing.JButton();
    cursoButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    perguntaLabel.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    perguntaLabel.setText("O que você deseja fazer?");

    alunoButton.setBackground(new java.awt.Color(255, 0, 0));
    alunoButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    alunoButton.setForeground(new java.awt.Color(255, 255, 255));
    alunoButton.setText("VER ALUNOS");
    alunoButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        alunoButtonActionPerformed(evt);
      }
    });

    professorButton.setBackground(new java.awt.Color(255, 0, 0));
    professorButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    professorButton.setForeground(new java.awt.Color(255, 255, 255));
    professorButton.setText("VER PROFESSORES");

    cursoButton.setBackground(new java.awt.Color(255, 0, 0));
    cursoButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    cursoButton.setForeground(new java.awt.Color(255, 255, 255));
    cursoButton.setText("VER CURSOS");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(199, 199, 199)
            .addComponent(perguntaLabel))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(271, 271, 271)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(professorButton)
              .addComponent(alunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(cursoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(206, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(perguntaLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
        .addComponent(alunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(professorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(cursoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(219, 219, 219))
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

  private void alunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoButtonActionPerformed
    new GerenciamentoAlunos().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_alunoButtonActionPerformed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> new EscolherGerenciamento().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton alunoButton;
  private javax.swing.JButton cursoButton;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel perguntaLabel;
  private javax.swing.JButton professorButton;
  // End of variables declaration//GEN-END:variables
}
