package com.mycompany.codigodoprojeto.telas;

import com.mycompany.codigodoprojeto.modelos.Professor;
import com.mycompany.codigodoprojeto.persistencia.DAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoProfessores extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GerenciamentoProfessores.class.getName());

  public GerenciamentoProfessores() {
    initComponents();
    professorTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null},
        {null, null, null, null, null}
      },
      new String [] {
        "CODIGO", "NOME", "ENSINA", "EMAIL", "SENHA", "CPF"
      }
    ));
    setLocationRelativeTo(null);
    carregarProfessor();
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
    voltarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        voltarButtonActionPerformed(evt);
      }
    });

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
    adicionarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        adicionarButtonActionPerformed(evt);
      }
    });

    removerButton.setBackground(new java.awt.Color(0, 0, 0));
    removerButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    removerButton.setForeground(new java.awt.Color(255, 255, 255));
    removerButton.setText("REMOVER");
    removerButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        removerButtonActionPerformed(evt);
      }
    });

    atualizarButton.setBackground(new java.awt.Color(0, 0, 0));
    atualizarButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    atualizarButton.setForeground(new java.awt.Color(255, 255, 255));
    atualizarButton.setText("ATUALIZAR");
    atualizarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        atualizarButtonActionPerformed(evt);
      }
    });

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
    professorTable.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        professorTableMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(professorTable);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addComponent(atualizarButton)))
            .addGap(0, 59, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1)))
        .addContainerGap())
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

  private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
    new EscolherGerenciamento().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_voltarButtonActionPerformed

  private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
    try {
      
      String nome = nomeTextField.getText();
      String ensina = ensinaTextField.getText();
      String email = emailTextField.getText();
      String senha = senhaTextField.getText();
      String cpf = cpfTextField.getText();
      
      Professor professor = new Professor(nome, ensina, email, senha, cpf);
      
      DAO dao = new DAO();
      
      if (dao.criarProfessor(professor)) {
        JOptionPane.showMessageDialog(null, "Professor criado com sucesso!");
        
        DefaultTableModel model = (DefaultTableModel) professorTable.getModel();
        
        model.addRow(new Object[] {
          professor.getNome(),
          professor.getEnsina(),
          professor.getEmail(),
          professor.getSenha(),
          professor.getCpf()
        });
        carregarProfessor();
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao criar um professor!");
      }
      
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao adicionar um professor!");
      e.printStackTrace();
    }
  }//GEN-LAST:event_adicionarButtonActionPerformed

  private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
    int linhaSelecionada = professorTable.getSelectedRow();
    
    if (linhaSelecionada == -1) {
      JOptionPane.showMessageDialog(null, "Selecione um aluno para remover!");
      return;
    }
    
    int codigo = Integer.parseInt(professorTable.getValueAt(linhaSelecionada, 0).toString());
    
    int confirmar = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover esse professor? ", "Confirmação", JOptionPane.YES_NO_OPTION);
    
    try {
      DAO dao = new DAO();
      if (dao.removerProfessor(codigo)) {
        carregarProfessor();
        JOptionPane.showMessageDialog(null, "Professor removido com sucesso!");
      } else {
        JOptionPane.showMessageDialog(null, "Professor não removido");
      }
    } catch(Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }
  }//GEN-LAST:event_removerButtonActionPerformed

  private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
    int linhaSelecionada = professorTable.getSelectedRow();
    
    if (linhaSelecionada == -1) {
      JOptionPane.showMessageDialog(null, "Selecione um professor para editar!");
      return;
    }
    
    try {
      int codigo = Integer.parseInt(professorTable.getValueAt(linhaSelecionada, 0).toString());
      
      String nome = nomeTextField.getText();
      String ensina = ensinaTextField.getText();
      String email = emailTextField.getText();
      String senha = senhaTextField.getText();
      String cpf = cpfTextField.getText();
      
      Professor professor = new Professor(codigo, nome, ensina, email, senha, cpf);
      
      DAO dao = new DAO();
      
      if (dao.atualizarProfessor(professor)) {
        JOptionPane.showMessageDialog(null, "Professor atualizado com sucesso!");
        carregarProfessor();
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar um professor!");
      }
      
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro ao atualizar um professor!");
    }
  }//GEN-LAST:event_atualizarButtonActionPerformed

  private void professorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_professorTableMouseClicked
    int linhaSelecionada = professorTable.getSelectedRow();
    
    nomeTextField.setText(professorTable.getValueAt(linhaSelecionada, 1).toString());
    ensinaTextField.setText(professorTable.getValueAt(linhaSelecionada, 2).toString());
    emailTextField.setText(professorTable.getValueAt(linhaSelecionada, 3).toString());
    senhaTextField.setText(professorTable.getValueAt(linhaSelecionada, 4).toString());
    cpfTextField.setText(professorTable.getValueAt(linhaSelecionada, 5).toString());
  }//GEN-LAST:event_professorTableMouseClicked
  
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
  
  private void carregarProfessor() {
    try {
      DAO dao = new DAO();
      
      java.util.List <Professor> lista = dao.listarProfessor();
      
      DefaultTableModel model = (DefaultTableModel) professorTable.getModel();
      model.setRowCount(0);
      
      for (Professor professor : lista) {
        model.addRow(new Object[] {
          professor.getCodigo(),
          professor.getNome(),
          professor.getEnsina(),
          professor.getEmail(),
          professor.getSenha(),
          professor.getCpf()
        });
      }
      
      professorTable.getColumnModel().getColumn(0).setMinWidth(0);
      professorTable.getColumnModel().getColumn(0).setMaxWidth(0);
      professorTable.getColumnModel().getColumn(0).setWidth(0);
      
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao carregar os professores!");
      e.printStackTrace();
    }
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
