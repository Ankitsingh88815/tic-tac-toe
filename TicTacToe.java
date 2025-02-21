/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tictacgame;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankitsinghrajput
 */
public class TicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xcount = 0;
    private int ocount =0;
    boolean checker;
    private int count1=0;
    private int count2=0;
    private int count3=0;
    private int count4=0;
    private int count5=0;
    private int count6=0;
    private int count7=0;
    private int count8=0;
    private int count9=0;
    
    public TicTacToe() {
        initComponents();
    }

    private void gameScore()
    {
        Player0.setText(String.valueOf(ocount));
        Player1.setText(String.valueOf(xcount));
        
    }
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("X")){
            startGame="0";
        }else{
            startGame="X";
        }
    }
    
    private void winningGame(){
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1==("X") && b2 == ("X") && b3 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.ORANGE);
            jButton2.setBackground(Color.ORANGE);
            jButton3.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            //RESETActionPerformed();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        
        else if(b4==("X") && b5 == ("X") && b6 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;             
        }
        else if(b7==("X") && b8 == ("X") && b9 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton7.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;            
        }
        else if(b1==("X") && b4 == ("X") && b7 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.ORANGE);
            jButton1.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        else if(b4==("X") && b5 == ("X") && b6 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        else if(b3==("X") && b5 == ("X") && b7 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton7.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;              
        }
        else if(b1==("X") && b5 == ("X") && b9 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
             count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;              
        }
        else if(b2==("X") && b5 == ("X") && b8 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton2.setBackground(Color.ORANGE);
            jButton5.setBackground(Color.ORANGE);
            jButton8.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;             
        }
        else if(b3==("X") && b6 == ("X") && b9 == "X")
        {
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.ORANGE);
            jButton6.setBackground(Color.ORANGE);
            jButton9.setBackground(Color.ORANGE);
            xcount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        
        else if(b1==("0") && b2 == ("0") && b3 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.GREEN);
            jButton2.setBackground(Color.GREEN);
            jButton3.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        
        else if(b4==("0") && b5 == ("0") && b6 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;              
        }
        else if(b7==("0") && b8 == ("0") && b9 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton7.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        else if(b1==("0") && b4 == ("0") && b7 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton4.setBackground(Color.GREEN);
            jButton1.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;              
        }
        else if(b3==("0") && b5 == ("0") && b7 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        else if(b1==("0") && b5 == ("0") && b9 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        else if(b2==("0") && b5 == ("0") && b8 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;              
        }
        else if(b3==("0") && b6 == ("0") && b9 == "0")
        {
            JOptionPane.showMessageDialog(this,"Player 0 Wins","Tic Tac Toe ",JOptionPane.INFORMATION_MESSAGE);
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
            ocount++;
            gameScore();
            jButton6.setText("");
            jButton7.setText("");
            jButton8.setText("");
            jButton1.setText("");
            jButton4.setText("");
            jButton2.setText("");
            jButton5.setText("");
            jButton3.setText("");
            jButton9.setText("");
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;               
        }
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private JFrame frame;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Player1 = new javax.swing.JLabel();
        Player0 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButtonn = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 240, 190));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 230, 190));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 190));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 240, 200));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 230, 190));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 230, 200));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 240, 190));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 240, 190));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 240, 200));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 750, 620));

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 153, 153));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel9.setBackground(new java.awt.Color(0, 153, 153));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 153, 153));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel11.setBackground(new java.awt.Color(0, 153, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 153, 153));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel13.setBackground(new java.awt.Color(0, 153, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 0");
        jPanel13.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 150));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Player X");
        jPanel13.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 330, 140));

        Player1.setBackground(new java.awt.Color(255, 255, 255));
        Player1.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        Player1.setForeground(new java.awt.Color(0, 0, 0));
        Player1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player1.setText("0");
        Player1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.add(Player1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 300, 130));

        Player0.setBackground(new java.awt.Color(255, 255, 255));
        Player0.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        Player0.setForeground(new java.awt.Color(0, 0, 0));
        Player0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Player0.setText("0");
        Player0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.add(Player0, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 300, 130));

        jPanel5.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 320));

        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonn.setBackground(new java.awt.Color(255, 255, 255));
        jButtonn.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jButtonn.setForeground(new java.awt.Color(0, 0, 0));
        jButtonn.setText("NEW GAME");
        jButtonn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnActionPerformed(evt);
            }
        });
        jPanel14.add(jButtonn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 640, 140));

        RESET.setBackground(new java.awt.Color(255, 255, 255));
        RESET.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        RESET.setForeground(new java.awt.Color(0, 0, 0));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel14.add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 320, 110));

        EXIT.setBackground(new java.awt.Color(255, 255, 255));
        EXIT.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        EXIT.setForeground(new java.awt.Color(0, 0, 0));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        jPanel14.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 310, 110));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 660, 280));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 150, 680, 620));

        jPanel15.setBackground(new java.awt.Color(0, 153, 153));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 0, 51));
        jTextPane1.setText("                           Tic Tac Toe Game");
        jTextPane1.setToolTipText("");
        jTextPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(jTextPane1);

        jPanel15.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1420, 110));

        jPanel2.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1440, 130));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Comfirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton1.setEnabled(true);
        jButton4.setEnabled(true);
        jButton2.setEnabled(true);
        jButton5.setEnabled(true);
        jButton3.setEnabled(true);
        jButton9.setEnabled(true);
        
        Player1.setText("0");
        Player0.setText("0");
        
        
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton1.setText("");
        jButton4.setText("");
        jButton2.setText("");
        jButton5.setText("");
        jButton3.setText("");
        jButton9.setText("");
        
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
            count1=0;
            count2=0;
            count3=0;
            count4=0;
            count5=0;
            count6=0;
            count7=0;
            count8=0;
            count9=0;           
        
        
    }//GEN-LAST:event_RESETActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(count1<1){
            jButton1.setText(startGame);
            choose_a_player();
            count1=1;
        }
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnActionPerformed
        // TODO add your handling code here:
        Player1.setText("0");
        Player0.setText("0");
        
        
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton1.setText("");
        jButton4.setText("");
        jButton2.setText("");
        jButton5.setText("");
        jButton3.setText("");
        jButton9.setText("");
        
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
 
        count1=0;
        count2=0;
        count3=0;
        count4=0;
        count5=0;
        count6=0;
        count7=0;
        count8=0;
        count9=0;        
    }//GEN-LAST:event_jButtonnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(count2<1){
            jButton2.setText(startGame);
            choose_a_player();
            count2=1;
        }         
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //jButton6.setText(startGame);
        if(count6<1){
            jButton6.setText(startGame);
            choose_a_player();
            count6=1;
        }          
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(count3<1){
            jButton3.setText(startGame);
            choose_a_player();
            count3=1;
        }  
        
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //jButton4.setText(startGame);
        if(count4<1){
            jButton4.setText(startGame);
            choose_a_player();
            count4=1;
        }          
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       // jButton5.setText(startGame);
        if(count5<1){
            jButton5.setText(startGame);
            choose_a_player();
            count5=1;
        }          
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //jButton7.setText(startGame);
        if(count7<1){
            jButton7.setText(startGame);
            choose_a_player();
            count7=1;
        }          
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //jButton8.setText(startGame);
        if(count8<1){
            jButton8.setText(startGame);
            choose_a_player();
            count8=1;
        }          
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //jButton9.setText(startGame);
        if(count9<1){
            jButton9.setText(startGame);
            choose_a_player();
            count9=1;
        }          
        if(startGame.equalsIgnoreCase("X")){
            checker = false;
        }else{
            checker =   true;
        }
        //choose_a_player();
        winningGame();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EXIT;
    private javax.swing.JLabel Player0;
    private javax.swing.JLabel Player1;
    private javax.swing.JButton RESET;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
