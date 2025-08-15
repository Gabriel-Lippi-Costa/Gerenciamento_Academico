package com.mycompany.codigodoprojeto.telas;

import com.mycompany.codigodoprojeto.modelos.Aluno;
import com.mycompany.codigodoprojeto.persistencia.DAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoAlunos extends javax.swing.JFrame {

  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GerenciamentoAlunos.class.getName());

  public GerenciamentoAlunos() {
    super("Gerenciamento Acâdemico");
    initComponents();
    setLocationRelativeTo(null);
    carregarAlunos();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    voltarButton = new javax.swing.JButton();
    adicionarButton = new javax.swing.JButton();
    removerButton = new javax.swing.JButton();
    atualizarButton = new javax.swing.JButton();
    nomeLabel = new javax.swing.JLabel();
    cursoLabel = new javax.swing.JLabel();
    fimLabel = new javax.swing.JLabel();
    inicioLabel = new javax.swing.JLabel();
    senhaLabel = new javax.swing.JLabel();
    nomeTextField = new javax.swing.JTextField();
    cursoTextField = new javax.swing.JTextField();
    fimTextField = new javax.swing.JTextField();
    inicioTextField = new javax.swing.JTextField();
    senhaTextField = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    alunosTable = new javax.swing.JTable();
    emailLabel = new javax.swing.JLabel();
    emailTextField = new javax.swing.JTextField();
    salaLabel = new javax.swing.JLabel();
    cpfLabel = new javax.swing.JLabel();
    cpfTextField = new javax.swing.JTextField();
    SalaTextField = new javax.swing.JTextField();

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

    nomeLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    nomeLabel.setText("NOME");

    cursoLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    cursoLabel.setText("CURSO");

    fimLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    fimLabel.setText("FIM");

    inicioLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    inicioLabel.setText("INICIO");

    senhaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    senhaLabel.setText("SENHA");

    alunosTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "NOME", "CURSO", "INICIO", "FIM", "EMAIL", "SENHA", "SALA", "CPF"
      }
    ));
    alunosTable.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        alunosTableMouseClicked(evt);
      }
    });
    jScrollPane2.setViewportView(alunosTable);

    emailLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    emailLabel.setText("EMAIL");

    salaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    salaLabel.setText("SALA");

    cpfLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    cpfLabel.setText("CPF");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(adicionarButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(removerButton)
            .addGap(207, 207, 207)
            .addComponent(atualizarButton)
            .addGap(251, 251, 251))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(nomeLabel)
                  .addComponent(fimLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(inicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(salaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(34, 34, 34)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cursoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inicioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(cpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(emailLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(senhaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(394, Short.MAX_VALUE))))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jScrollPane2))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nomeLabel)
          .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(cursoLabel)
          .addComponent(cursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inicioLabel)
          .addComponent(fimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(fimLabel)
          .addComponent(inicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(senhaLabel)
          .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(emailLabel)
          .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cpfLabel)
          .addComponent(cpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(salaLabel)
          .addComponent(SalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(adicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(removerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(atualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
      String curso = cursoTextField.getText();
      String inicio = inicioTextField.getText();
      String fim = fimTextField.getText();
      String email = emailTextField.getText();
      String senha = senhaTextField.getText();
      String sala = SalaTextField.getText();
      String cpf = cpfTextField.getText();

      Aluno aluno = new Aluno(nome, curso, inicio, fim, email, senha, sala, cpf);
      DAO dao = new DAO();

      if (dao.criarAluno(aluno)) {
        JOptionPane.showMessageDialog(null, "Aluno criado com sucesso!");

        DefaultTableModel model = (DefaultTableModel) alunosTable.getModel();

        model.addRow(new Object[]{
          aluno.getNome(),
          aluno.getCurso(),
          aluno.getInicio(),
          aluno.getFim(),
          aluno.getEmail(),
          aluno.getSenha(),
          aluno.getSala(),
          aluno.getCpf()

        });

        carregarAlunos();

      } else {
        JOptionPane.showMessageDialog(null, "Erro ao criar aluno!");
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }

  }//GEN-LAST:event_adicionarButtonActionPerformed

  private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed

    int linhaSelecionada = alunosTable.getSelectedRow();

    if (linhaSelecionada == -1) {

      JOptionPane.showMessageDialog(null, "Selecione um aluno para remover!");
      return;

    }

    int codigo = Integer.parseInt(alunosTable.getValueAt(linhaSelecionada, 0).toString());

    int confirmar = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);

    try {
      DAO dao = new DAO();
      if (dao.removerAluno(codigo)) {
        carregarAlunos();
        JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
      } else {
        JOptionPane.showMessageDialog(null, "Aluno não removido!");
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }

  }//GEN-LAST:event_removerButtonActionPerformed

  private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
    int linhaSelecionada = alunosTable.getSelectedRow();

    if (linhaSelecionada == -1) {
      JOptionPane.showMessageDialog(null, "Selecione um aluno para editar!");
      return;
    }

    try {
      int codigo = Integer.parseInt(alunosTable.getValueAt(linhaSelecionada, 0).toString());

      String nome = nomeTextField.getText();
      String curso = cursoTextField.getText();
      String inicio = inicioTextField.getText();
      String fim = fimTextField.getText();
      String email = emailTextField.getText();
      String senha = senhaTextField.getText();
      String sala = SalaTextField.getText();
      String cpf = cpfTextField.getText();

      Aluno aluno = new Aluno(codigo, nome, curso, inicio, fim, email, senha, sala, cpf);

      DAO dao = new DAO();

      if (dao.atualizarAluno(aluno)) {
        JOptionPane.showMessageDialog(null, "Aluno atualizado com sucesso!");
        carregarAlunos();
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar o aluno!");
      }

    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }

  }//GEN-LAST:event_atualizarButtonActionPerformed

  private void alunosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alunosTableMouseClicked
    int linhaSelecionada = alunosTable.getSelectedRow();

    nomeTextField.setText(alunosTable.getValueAt(linhaSelecionada, 1).toString());
    cursoTextField.setText(alunosTable.getValueAt(linhaSelecionada, 2).toString());
    inicioTextField.setText(alunosTable.getValueAt(linhaSelecionada, 3).toString());
    fimTextField.setText(alunosTable.getValueAt(linhaSelecionada, 4).toString());
    emailTextField.setText(alunosTable.getValueAt(linhaSelecionada, 5).toString());
    senhaTextField.setText(alunosTable.getValueAt(linhaSelecionada, 6).toString());
    SalaTextField.setText(alunosTable.getValueAt(linhaSelecionada, 7).toString());
    cpfTextField.setText(alunosTable.getValueAt(linhaSelecionada, 8).toString());
  }//GEN-LAST:event_alunosTableMouseClicked

  public static void main(String args[]) {

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
    java.awt.EventQueue.invokeLater(() -> new GerenciamentoAlunos().setVisible(true));
  }

  private void carregarAlunos() {
    try {
      DAO dao = new DAO();

      java.util.List<Aluno> lista = dao.listarAlunos();

      DefaultTableModel model = (DefaultTableModel) alunosTable.getModel();
      model.setRowCount(0);

      for (Aluno aluno : lista) {
        model.addRow(new Object[]{
          aluno.getCodigo(),
          aluno.getNome(),
          aluno.getCurso(),
          aluno.getInicio(),
          aluno.getFim(),
          aluno.getEmail(),
          aluno.getSenha(),
          aluno.getSala(),
          aluno.getCpf()
        });
      }

      alunosTable.getColumnModel().getColumn(0).setMinWidth(0);
      alunosTable.getColumnModel().getColumn(0).setMaxWidth(0);
      alunosTable.getColumnModel().getColumn(0).setWidth(0);

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField SalaTextField;
  private javax.swing.JButton adicionarButton;
  private javax.swing.JTable alunosTable;
  private javax.swing.JButton atualizarButton;
  private javax.swing.JLabel cpfLabel;
  private javax.swing.JTextField cpfTextField;
  private javax.swing.JLabel cursoLabel;
  private javax.swing.JTextField cursoTextField;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JTextField emailTextField;
  private javax.swing.JLabel fimLabel;
  private javax.swing.JTextField fimTextField;
  private javax.swing.JLabel inicioLabel;
  private javax.swing.JTextField inicioTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel nomeLabel;
  private javax.swing.JTextField nomeTextField;
  private javax.swing.JButton removerButton;
  private javax.swing.JLabel salaLabel;
  private javax.swing.JLabel senhaLabel;
  private javax.swing.JTextField senhaTextField;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
