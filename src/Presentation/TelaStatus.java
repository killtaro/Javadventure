/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Business.BusinessFacade;
import EDA.Personagem;
import EDA.Usuario;

/**
 *
 * @author pixel
 */
public class TelaStatus extends javax.swing.JFrame {
    Usuario usuarioLogado = BusinessFacade.getUsuarioLogado();
    Personagem personagem = usuarioLogado.getPersonagem();
    int xPlayer;
    int yPlayer;

    public TelaStatus(int xPlayer, int yPlayer) {
        initComponents();
        this.xPlayer = xPlayer;
        this.yPlayer = yPlayer;
        atualizaLabel();
        if(personagem.getXp() > (personagem.getLvl() * 100)){
            personagem.setLvl(personagem.getLvl() + 1);
            personagem.setSkillpoints(personagem.getSkillpoints() + 1);
        }
        botoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelInfoXP = new javax.swing.JLabel();
        labelInfoMoedas = new javax.swing.JLabel();
        labelInfoDES = new javax.swing.JLabel();
        labelInfoLvl = new javax.swing.JLabel();
        labelInfoAtk = new javax.swing.JLabel();
        labelInfoHP = new javax.swing.JLabel();
        labelInfoNome = new javax.swing.JLabel();
        labelInfoINT = new javax.swing.JLabel();
        labelInfoVIT = new javax.swing.JLabel();
        labelInfoFOR = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelLvl = new javax.swing.JLabel();
        labelHp = new javax.swing.JLabel();
        labelAtk = new javax.swing.JLabel();
        labelXP = new javax.swing.JLabel();
        labelMoedas = new javax.swing.JLabel();
        labelDES = new javax.swing.JLabel();
        labelINT = new javax.swing.JLabel();
        labelVIT = new javax.swing.JLabel();
        labelFOR = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        buttonUparFOR = new javax.swing.JButton();
        buttonUparDES = new javax.swing.JButton();
        buttonUparINT = new javax.swing.JButton();
        buttonUparVIT = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 460));
        setPreferredSize(new java.awt.Dimension(520, 460));
        getContentPane().setLayout(null);

        labelInfoXP.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoXP.setText("XP:");
        getContentPane().add(labelInfoXP);
        labelInfoXP.setBounds(20, 200, 50, 30);

        labelInfoMoedas.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoMoedas.setText("Moedas:");
        getContentPane().add(labelInfoMoedas);
        labelInfoMoedas.setBounds(20, 240, 70, 30);

        labelInfoDES.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoDES.setText("DES:");
        getContentPane().add(labelInfoDES);
        labelInfoDES.setBounds(220, 90, 50, 30);

        labelInfoLvl.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoLvl.setText("Level:");
        getContentPane().add(labelInfoLvl);
        labelInfoLvl.setBounds(20, 80, 50, 30);

        labelInfoAtk.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoAtk.setText("Ataque:");
        getContentPane().add(labelInfoAtk);
        labelInfoAtk.setBounds(20, 160, 70, 30);

        labelInfoHP.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoHP.setText("HP:");
        getContentPane().add(labelInfoHP);
        labelInfoHP.setBounds(20, 120, 50, 30);

        labelInfoNome.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoNome.setText("Nome:");
        getContentPane().add(labelInfoNome);
        labelInfoNome.setBounds(20, 40, 50, 30);

        labelInfoINT.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoINT.setText("INT:");
        getContentPane().add(labelInfoINT);
        labelInfoINT.setBounds(220, 140, 50, 30);

        labelInfoVIT.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoVIT.setText("VIT:");
        getContentPane().add(labelInfoVIT);
        labelInfoVIT.setBounds(220, 190, 50, 30);

        labelInfoFOR.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelInfoFOR.setText("FOR:");
        getContentPane().add(labelInfoFOR);
        labelInfoFOR.setBounds(220, 40, 50, 30);

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setText("-");
        getContentPane().add(labelNome);
        labelNome.setBounds(100, 40, 40, 20);

        labelLvl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelLvl.setText("-");
        getContentPane().add(labelLvl);
        labelLvl.setBounds(100, 80, 40, 20);

        labelHp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelHp.setText("-");
        getContentPane().add(labelHp);
        labelHp.setBounds(100, 120, 40, 20);

        labelAtk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelAtk.setText("-");
        getContentPane().add(labelAtk);
        labelAtk.setBounds(100, 160, 40, 20);

        labelXP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelXP.setText("-");
        getContentPane().add(labelXP);
        labelXP.setBounds(100, 200, 40, 20);

        labelMoedas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelMoedas.setText("-");
        getContentPane().add(labelMoedas);
        labelMoedas.setBounds(100, 240, 40, 20);

        labelDES.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelDES.setText("-");
        getContentPane().add(labelDES);
        labelDES.setBounds(270, 90, 40, 20);

        labelINT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelINT.setText("-");
        getContentPane().add(labelINT);
        labelINT.setBounds(270, 140, 40, 20);

        labelVIT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelVIT.setText("-");
        getContentPane().add(labelVIT);
        labelVIT.setBounds(270, 190, 40, 20);

        labelFOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelFOR.setText("-");
        getContentPane().add(labelFOR);
        labelFOR.setBounds(270, 40, 40, 20);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(20, 410, 61, 23);

        buttonUparFOR.setText("Upar");
        buttonUparFOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparFORActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparFOR);
        buttonUparFOR.setBounds(360, 40, 55, 23);

        buttonUparDES.setText("Upar");
        buttonUparDES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparDESActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparDES);
        buttonUparDES.setBounds(360, 90, 55, 23);

        buttonUparINT.setText("Upar");
        buttonUparINT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparINTActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparINT);
        buttonUparINT.setBounds(360, 140, 55, 20);

        buttonUparVIT.setText("Upar");
        buttonUparVIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUparVITActionPerformed(evt);
            }
        });
        getContentPane().add(buttonUparVIT);
        buttonUparVIT.setBounds(360, 190, 55, 23);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backgroundCriacaoPersonagem.jpg"))); // NOI18N
        background.setToolTipText("");
        getContentPane().add(background);
        background.setBounds(0, 0, 520, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        TelaMundo tela = new TelaMundo(xPlayer, yPlayer);
        Main.abrir(tela);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void buttonUparFORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparFORActionPerformed
        personagem.setSkillpoints(personagem.getSkillpoints() - 1);
        personagem.setForca(personagem.getForca() + 1);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparFORActionPerformed

    private void buttonUparDESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparDESActionPerformed
        personagem.setSkillpoints(personagem.getSkillpoints() - 1);
        personagem.setDestreza(personagem.getDestreza() + 1);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparDESActionPerformed

    private void buttonUparINTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparINTActionPerformed
        personagem.setSkillpoints(personagem.getSkillpoints() - 1);
        personagem.setInteligencia(personagem.getInteligencia() + 1);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparINTActionPerformed

    private void buttonUparVITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUparVITActionPerformed
        personagem.setSkillpoints(personagem.getSkillpoints() - 1);
        personagem.setVitalidade(personagem.getVitalidade() + 1);
        atualizaLabel();
        botoes();
    }//GEN-LAST:event_buttonUparVITActionPerformed

    public void botoes(){
        if(personagem.getSkillpoints() > 0){
            buttonUparDES.setEnabled(true);
            buttonUparFOR.setEnabled(true);
            buttonUparINT.setEnabled(true);
            buttonUparVIT.setEnabled(true);
        } else {
            buttonUparDES.setEnabled(false);
            buttonUparFOR.setEnabled(false);
            buttonUparINT.setEnabled(false);
            buttonUparVIT.setEnabled(false);
        }        
    }
    
    public void atualizaLabel(){
        labelHp.setText(Integer.toString(personagem.getHp()));
        labelDES.setText(Integer.toString(personagem.getDestreza()));
        labelFOR.setText(Integer.toString(personagem.getForca()));
        labelINT.setText(Integer.toString(personagem.getInteligencia()));
        labelVIT.setText(Integer.toString(personagem.getVitalidade()));
        labelLvl.setText(Integer.toString(personagem.getLvl()));
        labelMoedas.setText(Integer.toString(personagem.getDinheiro()));
        labelNome.setText(personagem.getNome());
        labelXP.setText("" + personagem.getXp());
        labelAtk.setText("" + personagem.getAtk());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonUparDES;
    private javax.swing.JButton buttonUparFOR;
    private javax.swing.JButton buttonUparINT;
    private javax.swing.JButton buttonUparVIT;
    private javax.swing.JLabel labelAtk;
    private javax.swing.JLabel labelDES;
    private javax.swing.JLabel labelFOR;
    private javax.swing.JLabel labelHp;
    private javax.swing.JLabel labelINT;
    private javax.swing.JLabel labelInfoAtk;
    private javax.swing.JLabel labelInfoDES;
    private javax.swing.JLabel labelInfoFOR;
    private javax.swing.JLabel labelInfoHP;
    private javax.swing.JLabel labelInfoINT;
    private javax.swing.JLabel labelInfoLvl;
    private javax.swing.JLabel labelInfoMoedas;
    private javax.swing.JLabel labelInfoNome;
    private javax.swing.JLabel labelInfoVIT;
    private javax.swing.JLabel labelInfoXP;
    private javax.swing.JLabel labelLvl;
    private javax.swing.JLabel labelMoedas;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelVIT;
    private javax.swing.JLabel labelXP;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
