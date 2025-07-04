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
    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    getContentPane().setLayout(new java.awt.GridLayout());

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    jLabel1.setText("O que você deseja fazer?");

    jButton1.setBackground(new java.awt.Color(255, 102, 102));
    jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    jButton1.setForeground(new java.awt.Color(255, 255, 255));
    jButton1.setText("VER ALUNOS");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setBackground(new java.awt.Color(255, 102, 102));
    jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    jButton2.setForeground(new java.awt.Color(255, 255, 255));
    jButton2.setText("VER PROFESSORES");

    jButton3.setBackground(new java.awt.Color(255, 102, 102));
    jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
    jButton3.setForeground(new java.awt.Color(255, 255, 255));
    jButton3.setText("VER CURSOS");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(201, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(189, 189, 189))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(290, 290, 290)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton2)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addComponent(jLabel1)
        .addGap(142, 142, 142)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(87, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    new GerenciamentoAlunos().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> new EscolherGerenciamento().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  // End of variables declaration//GEN-END:variables
}
