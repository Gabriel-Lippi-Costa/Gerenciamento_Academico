package com.mycompany.codigodoprojeto.telas;

import com.mycompany.codigodoprojeto.modelos.Curso;
import com.mycompany.codigodoprojeto.persistencia.DAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GerenciamentoCursos extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GerenciamentoCursos.class.getName());

  public GerenciamentoCursos() {
    super("Gerenciamento Acâdemico");
    initComponents();
    setLocationRelativeTo(null);
    carregarCursos();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    voltarButton = new javax.swing.JButton();
    nomeLabel = new javax.swing.JLabel();
    tipoLabel = new javax.swing.JLabel();
    tipoTextField = new javax.swing.JTextField();
    nomeTextField = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    cursoTable = new javax.swing.JTable();
    adicionarButton = new javax.swing.JButton();
    removerButton = new javax.swing.JButton();
    atualizarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    voltarButton.setBackground(new java.awt.Color(255, 0, 0));
    voltarButton.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
    voltarButton.setForeground(new java.awt.Color(255, 255, 255));
    voltarButton.setText("VOLTAR");

    nomeLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    nomeLabel.setText("NOME");

    tipoLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    tipoLabel.setText("TIPO");

    cursoTable.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "CODIGO", "NOME", "TIPO"
      }
    ));
    cursoTable.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        cursoTableMouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(cursoTable);

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
            .addGap(123, 123, 123)
            .addComponent(nomeLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tipoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(removerButton)
                .addGap(149, 149, 149)
                .addComponent(atualizarButton))))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(77, 77, 77)
            .addComponent(adicionarButton))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(166, 166, 166)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(84, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(47, 47, 47)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nomeLabel)
          .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(tipoLabel)
          .addComponent(tipoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(adicionarButton)
          .addComponent(removerButton)
          .addComponent(atualizarButton))
        .addGap(29, 29, 29)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
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

  private void adicionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarButtonActionPerformed
    try {
      String nome = nomeTextField.getText();
      String tipo = tipoTextField.getText();
      
      Curso curso = new Curso(nome, tipo);
      DAO dao = new DAO();
      
      if (dao.criarCurso(curso)) {
        JOptionPane.showMessageDialog(null, "Curso criado com sucesso!");
        
        carregarCursos();
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao criar um aluno!");
      }
              
    } catch(Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }
  }//GEN-LAST:event_adicionarButtonActionPerformed

  private void cursoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursoTableMouseClicked
    int linhaSelecionada = cursoTable.getSelectedRow();
    
    nomeTextField.setText(cursoTable.getValueAt(linhaSelecionada, 1).toString());
    tipoTextField.setText(cursoTable.getValueAt(linhaSelecionada, 2).toString());
  }//GEN-LAST:event_cursoTableMouseClicked

  private void removerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerButtonActionPerformed
    int linhaSelecionada = cursoTable.getSelectedRow();
    
    if (linhaSelecionada == -1) {
      JOptionPane.showMessageDialog(null, "Selecione um curso para remover!");
      return;
    }
    
    int codigo = Integer.parseInt(cursoTable.getValueAt(linhaSelecionada, 0).toString());
    
    int confirmar = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja remover?", "Confirmar", JOptionPane.YES_NO_OPTION);
    
    try {
      DAO dao = new DAO();
      
      if(dao.removerCurso(codigo)) {
        JOptionPane.showMessageDialog(null, "Curso removido com sucesso!");
        carregarCursos();
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao remover o curso!");
      }
    } catch(Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }
    
  }//GEN-LAST:event_removerButtonActionPerformed

  private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
    int linhaSelecionada = cursoTable.getSelectedRow();
    
    if (linhaSelecionada == -1) {
      JOptionPane.showMessageDialog(null, "Selecione um curso para atualizar!");
    }
    
    try {
      int codigo = Integer.parseInt(cursoTable.getValueAt(linhaSelecionada, 0).toString());
      
      String nome = nomeTextField.getText();
      String tipo = tipoTextField.getText();
      
      Curso curso = new Curso(codigo, nome, tipo);
      DAO dao = new DAO();
      
      if (dao.atualizarCurso(curso)) {
        JOptionPane.showMessageDialog(null, "Curso atualizado com sucesso!");
        carregarCursos();
      } else {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar um aluno!");
      }
    } catch(Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Erro, tente novamente mais tarde!");
    }
  }//GEN-LAST:event_atualizarButtonActionPerformed

  public static void main(String args[]) {
    
    java.awt.EventQueue.invokeLater(() -> new GerenciamentoCursos().setVisible(true));
  }
  
  public void carregarCursos() {
    try {
      DAO dao = new DAO();
      
      java.util.List<Curso> lista = dao.listarCurso();
      
      DefaultTableModel model = (DefaultTableModel) cursoTable.getModel();
      
      model.setRowCount(0);
      
      for (Curso curso : lista) {
        model.addRow(new Object[] {
          curso.getCodigo(),
          curso.getNome(),
          curso.getTipo()
        });
      }
      
      cursoTable.getColumnModel().getColumn(0).setMinWidth(0);
      cursoTable.getColumnModel().getColumn(0).setMaxWidth(0);
      cursoTable.getColumnModel().getColumn(0).setWidth(0);
      
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
              
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton adicionarButton;
  private javax.swing.JButton atualizarButton;
  private javax.swing.JTable cursoTable;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel nomeLabel;
  private javax.swing.JTextField nomeTextField;
  private javax.swing.JButton removerButton;
  private javax.swing.JLabel tipoLabel;
  private javax.swing.JTextField tipoTextField;
  private javax.swing.JButton voltarButton;
  // End of variables declaration//GEN-END:variables
}
