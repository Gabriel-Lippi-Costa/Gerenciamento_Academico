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
    AdicionarButton = new javax.swing.JButton();
    RemoverButton = new javax.swing.JButton();
    AtualizarButton = new javax.swing.JButton();
    NomeLabel = new javax.swing.JLabel();
    CursoLabel = new javax.swing.JLabel();
    FimLabel = new javax.swing.JLabel();
    InicioLabel = new javax.swing.JLabel();
    SenhaLabel = new javax.swing.JLabel();
    NomeTextField = new javax.swing.JTextField();
    CursoTextField = new javax.swing.JTextField();
    FimTextField = new javax.swing.JTextField();
    InicioTextField = new javax.swing.JTextField();
    SenhaTextField = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    AlunosTable = new javax.swing.JTable();
    EmailLabel = new javax.swing.JLabel();
    EmailTextField = new javax.swing.JTextField();
    SalaLabel = new javax.swing.JLabel();
    CpfLabel = new javax.swing.JLabel();
    CpfTextField = new javax.swing.JTextField();
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

    AdicionarButton.setBackground(new java.awt.Color(0, 0, 0));
    AdicionarButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    AdicionarButton.setForeground(new java.awt.Color(255, 255, 255));
    AdicionarButton.setText("ADICIONAR");
    AdicionarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        AdicionarButtonActionPerformed(evt);
      }
    });

    RemoverButton.setBackground(new java.awt.Color(0, 0, 0));
    RemoverButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    RemoverButton.setForeground(new java.awt.Color(255, 255, 255));
    RemoverButton.setText("REMOVER");
    RemoverButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        RemoverButtonActionPerformed(evt);
      }
    });

    AtualizarButton.setBackground(new java.awt.Color(0, 0, 0));
    AtualizarButton.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    AtualizarButton.setForeground(new java.awt.Color(255, 255, 255));
    AtualizarButton.setText("ATUALIZAR");

    NomeLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    NomeLabel.setText("NOME");

    CursoLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    CursoLabel.setText("CURSO");

    FimLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    FimLabel.setText("FIM");

    InicioLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    InicioLabel.setText("INICIO");

    SenhaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    SenhaLabel.setText("SENHA");

    AlunosTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "NOME", "CURSO", "INICIO", "FIM", "EMAIL", "SENHA", "SALA", "CPF"
      }
    ));
    jScrollPane2.setViewportView(AlunosTable);

    EmailLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    EmailLabel.setText("EMAIL");

    SalaLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    SalaLabel.setText("SALA");

    CpfLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    CpfLabel.setText("CPF");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(CpfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(CpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(AdicionarButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(RemoverButton)
            .addGap(207, 207, 207)
            .addComponent(AtualizarButton)
            .addGap(251, 251, 251))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(FimLabel)
                .addGap(18, 18, 18)
                .addComponent(InicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(NomeLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(CursoLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(CursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(InicioLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(FimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(EmailLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SenhaLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SenhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SalaLabel)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(SalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(29, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(24, 24, 24)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(NomeLabel)
          .addComponent(NomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(CursoLabel)
          .addComponent(CursoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(InicioLabel)
          .addComponent(FimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(33, 33, 33)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(FimLabel)
          .addComponent(InicioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(SenhaLabel)
          .addComponent(SenhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(EmailLabel)
          .addComponent(EmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(SalaLabel)
          .addComponent(SalaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(30, 30, 30)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(CpfLabel)
          .addComponent(CpfTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(AdicionarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(RemoverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(AtualizarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
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

  private void AdicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarButtonActionPerformed
    // TODO add your handling code here:

    try {

      String nome = NomeTextField.getText();
      String curso = CursoTextField.getText();
      String inicio = InicioTextField.getText();
      String fim = FimTextField.getText();
      String email = EmailTextField.getText();
      String senha = SenhaTextField.getText();
      String sala = SalaTextField.getText();
      String cpf = CpfTextField.getText();

      Aluno aluno = new Aluno(nome, curso, inicio, fim, email, senha, sala, cpf);
      DAO dao = new DAO();

      if (dao.criarAluno(aluno)) {
        JOptionPane.showMessageDialog(null, "Aluno criado com sucesso!");

        DefaultTableModel model = (DefaultTableModel) AlunosTable.getModel();

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
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao criar aluno!");
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro!" + e.getMessage());
    }

  }//GEN-LAST:event_AdicionarButtonActionPerformed

  private void RemoverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverButtonActionPerformed

    int linhaSelecionada = AlunosTable.getSelectedRow();

    if (linhaSelecionada == -1) {

      JOptionPane.showMessageDialog(null, "Selecione um aluno para remover!");
      return;

    }

    String cpf = AlunosTable.getValueAt(linhaSelecionada, 7).toString();

    int confirmar = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover o aluno?", "Confirmação", JOptionPane.YES_NO_OPTION);

    if (confirmar == JOptionPane.YES_OPTION) {
      DAO dao = new DAO();
      if (dao.removerAluno(cpf)) {
        DefaultTableModel model = (DefaultTableModel) AlunosTable.getModel();
        model.removeRow(linhaSelecionada);
        JOptionPane.showMessageDialog(null, "Aluno removido com sucesso!");
      } else {
        JOptionPane.showMessageDialog(null, "Aluno não removido!");
      }
    }

  }//GEN-LAST:event_RemoverButtonActionPerformed

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

      DefaultTableModel model = (DefaultTableModel) AlunosTable.getModel();
      model.setRowCount(0);

      for (Aluno aluno : lista) {
          model.addRow(new Object[]{
            aluno.getNome(),
            aluno.getCurso(),
            aluno.getInicio(),
            aluno.getFim(),
            aluno.getEmail(),
            aluno.getSenha(),
            aluno.getCpf(),
            aluno.getSala()
          });
      }

    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, "Erro ao carregar os alunos!");
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton AdicionarButton;
  private javax.swing.JTable AlunosTable;
  private javax.swing.JButton AtualizarButton;
  private javax.swing.JLabel CpfLabel;
  private javax.swing.JTextField CpfTextField;
  private javax.swing.JLabel CursoLabel;
  private javax.swing.JTextField CursoTextField;
  private javax.swing.JLabel EmailLabel;
  private javax.swing.JTextField EmailTextField;
  private javax.swing.JLabel FimLabel;
  private javax.swing.JTextField FimTextField;
  private javax.swing.JLabel InicioLabel;
  private javax.swing.JTextField InicioTextField;
  private javax.swing.JLabel NomeLabel;
  private javax.swing.JTextField NomeTextField;
  private javax.swing.JButton RemoverButton;
  private javax.swing.JLabel SalaLabel;
  private javax.swing.JTextField SalaTextField;
  private javax.swing.JLabel SenhaLabel;
  private javax.swing.JTextField SenhaTextField;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
