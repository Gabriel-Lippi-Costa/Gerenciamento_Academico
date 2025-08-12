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
    PerguntaLabel = new javax.swing.JLabel();
    AlunoButton = new javax.swing.JButton();
    ProfessorButton = new javax.swing.JButton();
    CursoButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setBackground(new java.awt.Color(255, 255, 255));

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    PerguntaLabel.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    PerguntaLabel.setText("O que você deseja fazer?");

    AlunoButton.setBackground(new java.awt.Color(255, 0, 0));
    AlunoButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    AlunoButton.setForeground(new java.awt.Color(255, 255, 255));
    AlunoButton.setText("VER ALUNOS");
    AlunoButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AlunoButtonActionPerformed(evt);
      }
    });

    ProfessorButton.setBackground(new java.awt.Color(255, 0, 0));
    ProfessorButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    ProfessorButton.setForeground(new java.awt.Color(255, 255, 255));
    ProfessorButton.setText("VER PROFESSORES");

    CursoButton.setBackground(new java.awt.Color(255, 0, 0));
    CursoButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    CursoButton.setForeground(new java.awt.Color(255, 255, 255));
    CursoButton.setText("VER CURSOS");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(199, 199, 199)
            .addComponent(PerguntaLabel))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(271, 271, 271)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(ProfessorButton)
              .addComponent(AlunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(CursoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addContainerGap(206, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(PerguntaLabel)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
        .addComponent(AlunoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(ProfessorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(CursoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

  private void AlunoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlunoButtonActionPerformed
    new GerenciamentoAlunos().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_AlunoButtonActionPerformed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> new EscolherGerenciamento().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton AlunoButton;
  private javax.swing.JButton CursoButton;
  private javax.swing.JLabel PerguntaLabel;
  private javax.swing.JButton ProfessorButton;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
}
