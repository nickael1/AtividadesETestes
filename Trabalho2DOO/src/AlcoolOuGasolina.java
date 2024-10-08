import Clases.Audios.AudioErro;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author alunolages
 */
public class AlcoolOuGasolina extends javax.swing.JPanel {

    /**
     * Creates new form AlcoolOuGasolina
     */
    public AlcoolOuGasolina() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_tituloLogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jL_quantosKmFaz = new javax.swing.JLabel();
        jTF_valorGasolina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_valorAlcool = new javax.swing.JTextField();
        jB_calcular = new javax.swing.JButton();
        jB_limpar = new javax.swing.JButton();
        jB_voltar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(179, 200, 144));

        jL_tituloLogin.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        jL_tituloLogin.setText("Consult Trip");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jL_quantosKmFaz.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jL_quantosKmFaz.setForeground(new java.awt.Color(255, 255, 255));
        jL_quantosKmFaz.setText("Digite o valor do litro da gasolina:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Digite o valor do litro da alcool:");

        jB_calcular.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jB_calcular.setForeground(new java.awt.Color(109, 135, 116));
        jB_calcular.setText("Calcular");
        jB_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_calcularMouseClicked(evt);
            }
        });

        jB_limpar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jB_limpar.setForeground(new java.awt.Color(109, 135, 116));
        jB_limpar.setText("Limpar");
        jB_limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_limparMouseClicked(evt);
            }
        });

        jB_voltar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jB_voltar.setForeground(new java.awt.Color(109, 135, 116));
        jB_voltar.setText("Voltar");
        jB_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_voltarMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<html>O calculo efetuado leva em consideração a conformidade da agencia <br> nacional de petróleo que só compensa abastecer com <br>ácool quando valor do mesmo represente no máximo 70%<br> do valor da gasolina!<html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jL_tituloLogin)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_valorGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_valorAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jB_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jB_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jB_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jL_quantosKmFaz)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL_tituloLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_quantosKmFaz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jB_calcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB_limpar)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTF_valorGasolina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTF_valorAlcool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jB_voltar)
                .addGap(58, 58, 58)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jB_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_calcularMouseClicked
        
        if (jTF_valorAlcool.getText().equals("") || jTF_valorGasolina.getText().equals("")) {
            //Som de erro!
            AudioErro audioErro = new AudioErro();
            audioErro.AudioErro();
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        } else {
            float p, media;
            p = Float.parseFloat(jTF_valorAlcool.getText()) / Float.parseFloat(jTF_valorGasolina.getText());
            media = p;
            if (media >= 0.70) {
                // Carregar a imagem desejada
                ImageIcon icon = new ImageIcon("src/Imagens/icon-petrol-price-preto.png");
                // Exibir o JOptionPane com a imagem
                JOptionPane.showMessageDialog(null, "É preferível abastecer o seu veículo com Álcool, pois mesmo sendo maior o consumo de álcool em relação ao da gasolina, a diferença de preço compensa esta perda de autonomia.", "Qual compensa mais alcool ou gasolina:", JOptionPane.INFORMATION_MESSAGE, icon);
            }else {
                // Carregar a imagem desejada
                ImageIcon icon = new ImageIcon("src/Imagens/icon-petrol-price-preto.png");
                // Exibir o JOptionPane com a imagem
                JOptionPane.showMessageDialog(null, "É preferível abastecer o seu veículo com gasolina, pois o preço do litro do álcool está muito elevado em relação ao preço da gasolina.", "Qual compensa mais alcool ou gasolina:", JOptionPane.INFORMATION_MESSAGE, icon);
            } 
        }
        
        
    }//GEN-LAST:event_jB_calcularMouseClicked

    private void jB_limparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_limparMouseClicked
        jTF_valorAlcool.setText("");
        jTF_valorGasolina.setText("");
    }//GEN-LAST:event_jB_limparMouseClicked

    private void jB_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_voltarMouseClicked
        principalJFrame.painel3 = new PainelCliente();
        JFrame janela = (JFrame) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(principalJFrame.painel8);
        janela.add(principalJFrame.painel3, BorderLayout.CENTER);
        janela.pack();
        
    }//GEN-LAST:event_jB_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_calcular;
    private javax.swing.JButton jB_limpar;
    private javax.swing.JButton jB_voltar;
    private javax.swing.JLabel jL_quantosKmFaz;
    private javax.swing.JLabel jL_tituloLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTF_valorAlcool;
    private javax.swing.JTextField jTF_valorGasolina;
    // End of variables declaration//GEN-END:variables
}
