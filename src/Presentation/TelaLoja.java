package Presentation;

import Business.BusinessFacade;
import EDA.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bencke
 */
public class TelaLoja extends javax.swing.JFrame {
    Loja lojinha = new Loja();
    int valortotal = 0;
    int xPlayer;
    int yPlayer;
    ArrayList<Arma> arrayArmas = new ArrayList<>();
    ArrayList<Armadura> arrayArmadura = new ArrayList<>();
    ArrayList<Itens> arrayItens = new ArrayList<>();
    ArrayList<Equipamento> arrayEquipamento = new ArrayList<>();
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();

    public TelaLoja(int xPlayer, int yPlayer) {
        initComponents();
        labelGrana.setText("" + personagem.getDinheiro());
        this.xPlayer = xPlayer;
        this.yPlayer = yPlayer;
        Random x = new Random();
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Arma(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Elmo(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Peitoral(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));
        arrayEquipamento.add(new Grevas(x.nextInt(personagem.getLvl() + 10) + 1));

        
        arrayItens.add(new Itens());
        arrayItens.add(new Itens());
        arrayItens.add(new Itens());
        arrayItens.add(new Itens());

        DefaultTableModel modelo = new DefaultTableModel(
            new Object [][]{},
            new String[] {"Nome", "Lvl", "Dano/Defesa", "Preço"}
        );
        DefaultTableModel modelo2 = new DefaultTableModel(
            new Object [][]{},
            new String[] {"Nome", "Lvl", "Proteçao", "Preço"}
        );
        DefaultTableModel modelo3 = new DefaultTableModel(
            new Object [][]{},
            new String[] {"Tipo", "Eficiencia", "Quantidade", "Preço"}
        );
        
        tabelaArmas.setModel(modelo);
        tabelaItens.setModel(modelo3);
        
        
        /*if(tabelaArmas.getModel() instanceof DefaultTableModel && tabelaEquip.getModel() instanceof DefaultTableModel && tabelaItens.getModel() instanceof DefaultTableModel){
            System.out.println("Tá top");
            Iterator it = arrayEquipamento.iterator();
            while(it.hasNext()){
                if(it.next() instanceof Arma){
                    System.out.println("arma");
                    Arma arma = (Arma) it.next();
                    modelo.addRow(new Object[]{arma.getNome(), arma.getLvl(), arma.getDano(), arma.getValorCompra()});
                } else if(it.next() instanceof Armadura){
                    System.out.println("armor");
                    Armadura armor = (Armadura) it.next();
                    modelo2.addRow(new Object[]{armor.getNome(), armor.getLvl(), armor.getProtecao(), armor.getValorCompra()});
                } else if(it.next() instanceof Itens){
                    Itens item = (Itens) it.next();
                    modelo3.addRow(new Object[]{item.getNome(), item.getEficiencia().getEficiencia(), item.getQuantidade(), item.getValorCompra()});
                }
                
            }
        }*/
        
        if(tabelaArmas.getModel() instanceof DefaultTableModel){
            Iterator it = arrayEquipamento.iterator();
            while(it.hasNext()){
                Equipamento equip = (Equipamento) it.next();
                modelo.addRow(new Object[]{equip.getNome(), equip.getLvl(), equip.getPropriedade(), equip.getValorCompra()});
            }
        }
        
        if(tabelaItens.getModel() instanceof DefaultTableModel){
            Iterator itItens = arrayItens.iterator();
            while(itItens.hasNext()){
                Itens itens = (Itens) itItens.next();
                modelo3.addRow(new Object[]{itens.getTipo(), itens.getEficiencia(), itens.getQuantidade(), itens.getValorCompra()});
            }
        }    
        /*if(tabelaEquip.getModel() instanceof DefaultTableModel){
            Iterator itArmadura = arrayArmadura.iterator();
            while(itArmadura.hasNext()){
                Armadura armor = (Armadura) itArmadura.next();
                modelo.addRow(new Object[]{armor.getNome(), armor.getLvl(), armor.getProtecao(), armor.getValorCompra()});
                
            }
        }
        
        if(tabelaItens.getModel() instanceof DefaultTableModel){
            Iterator itItens = arrayItens.iterator();
            while(itItens.hasNext()){
                Itens itens = (Itens) itItens.next();
                modelo.addRow(new Object[]{itens.getTipo(), itens.getEficiencia(), itens.getQuantidade(), itens.getValorCompra()});
            }
        }*/
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaArmas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labelValor = new javax.swing.JLabel();
        labelArmas = new javax.swing.JLabel();
        LabelPots = new javax.swing.JLabel();
        botaoSair = new javax.swing.JButton();
        labelVendedor = new javax.swing.JLabel();
        botaoComprar = new javax.swing.JButton();
        labelFalaVendedor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelGrana = new javax.swing.JLabel();
        labelImgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem-Vindo a Loja");
        setPreferredSize(new java.awt.Dimension(1000, 667));
        setSize(new java.awt.Dimension(1000, 667));
        getContentPane().setLayout(null);

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaItens(evt);
            }
        });
        jScrollPane3.setViewportView(tabelaItens);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(540, 80, 450, 300);

        tabelaArmas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaArmas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tabelaArmasFocusGained(evt);
            }
        });
        tabelaArmas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaArmasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaArmas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 390, 310);

        jLabel2.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seja-Bem Vindo a loja");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 0, 260, 40);

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        labelValor.setForeground(new java.awt.Color(255, 255, 255));
        labelValor.setText("0");
        getContentPane().add(labelValor);
        labelValor.setBounds(880, 490, 120, 50);

        labelArmas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelArmas.setForeground(new java.awt.Color(255, 255, 255));
        labelArmas.setText("Equipamento");
        getContentPane().add(labelArmas);
        labelArmas.setBounds(170, 40, 90, 40);

        LabelPots.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LabelPots.setForeground(new java.awt.Color(255, 255, 255));
        LabelPots.setText("Poções");
        getContentPane().add(LabelPots);
        LabelPots.setBounds(760, 40, 70, 40);

        botaoSair.setText("Sair");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(20, 590, 51, 23);

        labelVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/undo (1).png"))); // NOI18N
        labelVendedor.setText("jLabel1");
        getContentPane().add(labelVendedor);
        labelVendedor.setBounds(350, 230, 220, 390);

        botaoComprar.setText("Comprar");
        botaoComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoComprarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoComprar);
        botaoComprar.setBounds(860, 580, 80, 23);

        labelFalaVendedor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelFalaVendedor.setForeground(new java.awt.Color(255, 255, 255));
        labelFalaVendedor.setText("Ta precisando de que mermão?");
        getContentPane().add(labelFalaVendedor);
        labelFalaVendedor.setBounds(340, 590, 260, 20);

        jLabel1.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("seu dinheiro:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 420, 120, 30);

        jLabel3.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(800, 510, 51, 30);

        labelGrana.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        labelGrana.setForeground(new java.awt.Color(255, 255, 255));
        labelGrana.setText("0");
        getContentPane().add(labelGrana);
        labelGrana.setBounds(150, 424, 60, 20);

        labelImgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fundo_loja.jpg"))); // NOI18N
        getContentPane().add(labelImgFundo);
        labelImgFundo.setBounds(0, 0, 1000, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaArmasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tabelaArmasFocusGained
    }//GEN-LAST:event_tabelaArmasFocusGained

    private void tabelaArmasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaArmasMouseClicked
        valortotal = 0;
        
        /*if(tabelaArmas.getSelectedRows() != null){
            int vetArmas[] = tabelaArmas.getSelectedRows();
        
            for(int i = 0; i < vetArmas.length; i++){
                arraySelecao.add(arrayArmas.get(vetArmas[i]));
            }
        
            Iterator itSelecao = arraySelecao.iterator();
        
            while(itSelecao.hasNext()){
                Equipamento aux = (Equipamento) itSelecao.next();
                valortotal = valortotal + aux.getValorCompra();
                labelValor.setText("" + valortotal);
            }
        }*/    

        if(tabelaArmas.getSelectedRow() != -1){
            int index = tabelaArmas.getSelectedRow();
            valortotal = valortotal + arrayEquipamento.get(index).getValorCompra();
            labelValor.setText("" + valortotal);
        } 
    }//GEN-LAST:event_tabelaArmasMouseClicked

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        TelaMundo telaMundo = new TelaMundo(xPlayer, yPlayer);
        Main.abrir(telaMundo);
        JOptionPane.showMessageDialog(null, "Volte Sempre!");
        this.dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void tabelaItens(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaItens
        valortotal = 0;
        if(tabelaItens.getSelectedRow() != -1){
            int index = tabelaItens.getSelectedRow();
            valortotal = valortotal + arrayItens.get(index).getValorCompra();
            labelValor.setText("" + valortotal);
        }
    }//GEN-LAST:event_tabelaItens

    private void botaoComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoComprarActionPerformed
        if(tabelaArmas.getSelectedRow() != -1){
            int index = tabelaArmas.getSelectedRow();
            Equipamento aux = arrayEquipamento.get(index);
            if(personagem.getDinheiro() >=  aux.getValorCompra()){
                personagem.getInventario().add(aux);
                arrayEquipamento.remove(index);
                personagem.setDinheiro(personagem.getDinheiro() -  aux.getValorCompra());
                TelaLoja tela = new TelaLoja(xPlayer, yPlayer);
                Main.abrir(tela);
                this.dispose();                
            } else {
                JOptionPane.showMessageDialog(null, "Desculpa bro mas você não tem dinheiro suficiente.", "Opa", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoComprarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaLoja(0, 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPots;
    private javax.swing.JButton botaoComprar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelArmas;
    private javax.swing.JLabel labelFalaVendedor;
    private javax.swing.JLabel labelGrana;
    private javax.swing.JLabel labelImgFundo;
    private javax.swing.JLabel labelValor;
    private javax.swing.JLabel labelVendedor;
    private javax.swing.JTable tabelaArmas;
    private javax.swing.JTable tabelaItens;
    // End of variables declaration//GEN-END:variables
}
