package com.mycompany.codigodoprojeto.telas;

import com.mycompany.codigodoprojeto.modelos.UsuarioLogin;
import com.mycompany.codigodoprojeto.persistencia.DAO;
import javax.swing.JOptionPane;

public class LoginTela extends javax.swing.JFrame {
  
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LoginTela.class.getName());

  public LoginTela() {
    super("Gerenciamento Acadêmico");
    initComponents();
    setLocationRelativeTo(null);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    grandePanel = new javax.swing.JPanel();
    esquerdaPanel = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    tituloLabel = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    senhaLabel = new javax.swing.JLabel();
    emailTextField = new javax.swing.JTextField();
    senhaPasswordField = new javax.swing.JPasswordField();
    criarContaLabel = new javax.swing.JLabel();
    esqueciSenhaLabel = new javax.swing.JLabel();
    entrarButton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    grandePanel.setBackground(new java.awt.Color(255, 255, 255));
    grandePanel.setPreferredSize(new java.awt.Dimension(800, 500));
    grandePanel.setLayout(null);

    esquerdaPanel.setBackground(new java.awt.Color(41, 41, 41));
    esquerdaPanel.setPreferredSize(new java.awt.Dimension(400, 500));

    jLabel6.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 255));
    jLabel6.setText("© 2025 - Todos os direitos reservados.");

    jLabel7.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(102, 178, 255));
    jLabel7.setText("G.L.D.C.");

    jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\logo.png")); // NOI18N

    javax.swing.GroupLayout esquerdaPanelLayout = new javax.swing.GroupLayout(esquerdaPanel);
    esquerdaPanel.setLayout(esquerdaPanelLayout);
    esquerdaPanelLayout.setHorizontalGroup(
      esquerdaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(esquerdaPanelLayout.createSequentialGroup()
        .addGroup(esquerdaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(esquerdaPanelLayout.createSequentialGroup()
            .addGap(97, 97, 97)
            .addComponent(jLabel7))
          .addGroup(esquerdaPanelLayout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(jLabel6))
          .addGroup(esquerdaPanelLayout.createSequentialGroup()
            .addGap(150, 150, 150)
            .addComponent(jLabel9)))
        .addContainerGap(36, Short.MAX_VALUE))
    );
    esquerdaPanelLayout.setVerticalGroup(
      esquerdaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esquerdaPanelLayout.createSequentialGroup()
        .addContainerGap(149, Short.MAX_VALUE)
        .addComponent(jLabel9)
        .addGap(18, 18, 18)
        .addComponent(jLabel7)
        .addGap(112, 112, 112)
        .addComponent(jLabel6)
        .addGap(59, 59, 59))
    );

    grandePanel.add(esquerdaPanel);
    esquerdaPanel.setBounds(0, 0, 400, 500);

    tituloLabel.setFont(new java.awt.Font("Arial", 1, 34)); // NOI18N
    tituloLabel.setText("Seja bem-vindo(a)");
    grandePanel.add(tituloLabel);
    tituloLabel.setBounds(450, 20, 340, 40);

    emailLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    emailLabel.setText("E-mail");
    grandePanel.add(emailLabel);
    emailLabel.setBounds(440, 100, 85, 30);

    senhaLabel.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
    senhaLabel.setText("Senha");
    grandePanel.add(senhaLabel);
    senhaLabel.setBounds(440, 210, 75, 30);

    emailTextField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    emailTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    grandePanel.add(emailTextField);
    emailTextField.setBounds(440, 130, 320, 40);

    senhaPasswordField.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
    senhaPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    grandePanel.add(senhaPasswordField);
    senhaPasswordField.setBounds(440, 240, 320, 40);

    criarContaLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
    criarContaLabel.setText("Criar uma conta");
    criarContaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    criarContaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        criarContaLabelMouseClicked(evt);
      }
    });
    grandePanel.add(criarContaLabel);
    criarContaLabel.setBounds(440, 290, 130, 21);

    esqueciSenhaLabel.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
    esqueciSenhaLabel.setText("Esqueci a senha");
    esqueciSenhaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    esqueciSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        esqueciSenhaLabelMouseClicked(evt);
      }
    });
    grandePanel.add(esqueciSenhaLabel);
    esqueciSenhaLabel.setBounds(630, 290, 140, 20);

    entrarButton.setBackground(new java.awt.Color(41, 41, 41));
    entrarButton.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
    entrarButton.setForeground(new java.awt.Color(255, 255, 255));
    entrarButton.setText("ENTRAR");
    entrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    entrarButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        entrarButtonActionPerformed(evt);
      }
    });
    grandePanel.add(entrarButton);
    entrarButton.setBounds(530, 400, 140, 50);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(grandePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(grandePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void entrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarButtonActionPerformed
    String email = emailTextField.getText();
    String senha = new String(senhaPasswordField.getPassword());
    
    try {
      UsuarioLogin usuario = new UsuarioLogin(email, senha);
      DAO dao = new DAO();
      
      if (dao.existeUsuario(usuario)) {
        new EscolherGerenciamento().setVisible(true);
        this.dispose();
      } else {
        JOptionPane.showMessageDialog(null, "Usuário/senha inválido!");
      }
      
    } catch(Exception e) {
      JOptionPane.showMessageDialog(null, "Tente novamente mais tarde!");
    }
  }//GEN-LAST:event_entrarButtonActionPerformed

  private void criarContaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_criarContaLabelMouseClicked
    new CriarContaTela().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_criarContaLabelMouseClicked

  private void esqueciSenhaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esqueciSenhaLabelMouseClicked
    new EsqueceuSenhaTela().setVisible(true);
    this.dispose();
  }//GEN-LAST:event_esqueciSenhaLabelMouseClicked

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> new LoginTela().setVisible(true));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel criarContaLabel;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JTextField emailTextField;
  private javax.swing.JButton entrarButton;
  private javax.swing.JLabel esqueciSenhaLabel;
  private javax.swing.JPanel esquerdaPanel;
  private javax.swing.JPanel grandePanel;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JLabel senhaLabel;
  private javax.swing.JPasswordField senhaPasswordField;
  private javax.swing.JLabel tituloLabel;
  // End of variables declaration//GEN-END:variables
}
