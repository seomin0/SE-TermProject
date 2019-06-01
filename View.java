/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yutgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


/**
 *
 * @author aster
 */
public class View extends javax.swing.JFrame {

    int playernum;
    int mal;
    int currentplayer;
    int currentposition;
    int chance;
    int movenum;
    int moveclick;
    int malclick;
    int currentmove;
    int hole;
    int[] move = new int[6]; // 0없 1빽 2도 3개 4걸 5윷 6모
    int[] status = new int[29]; // 0~5
    int[] malnum = new int[29]; // 0~5
    Player[] player;
    
    public View(int playernum, int mal) {
        initComponents();
        this.playernum = playernum;
        this.mal = mal;
        currentplayer = 1;
        chance = 1;
        movenum = 0;
        moveclick = 0;
        malclick =0;
        currentposition = 29;
        jLabel16.setText("1");
             
        player = new Player[this.playernum+1];
        for(int x=1;x<this.playernum+1;x++){
            player[x] = new Player(this.mal);
        }
        
        String a = this.mal + "";
        jLabel9.setText(a);
        jLabel11.setText(a);
        jLabel13.setText(a);
        jLabel15.setText(a);
        
        
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setForeground(new java.awt.Color(200, 200, 0));
        jLabel7.setForeground(new java.awt.Color(200, 200, 200));
        
        if(this.playernum < 4)
        {
            jLabel7.setText(" ");
            jLabel14.setText(" ");
            jLabel15.setText(" ");
        }
        if(this.playernum < 3)
        {
            jLabel6.setText(" ");
            jLabel12.setText(" ");
            jLabel13.setText(" ");
        }
        
        Color tempc1 = new Color(240,240,240);
        jButton1.setBackground(tempc1);
        jButton2.setBackground(tempc1);
        jButton3.setBackground(tempc1);
        jButton4.setBackground(tempc1);
        jButton5.setBackground(tempc1);
        jButton6.setBackground(tempc1);

        for(int x=0; x<29; x++){
            status[x] = 0;
            malnum[x] = 0;
        }
        Color tempc2 = new Color(0,255,255);
        jButton15.setBackground(tempc2);
        jButton21.setBackground(tempc2);
        jButton26.setBackground(tempc2);
        jButton31.setBackground(tempc2);
        jButton38.setBackground(tempc2);
        
        Color tempc3 = new Color(204,255,204);
        jButton17.setBackground(tempc3);
        jButton18.setBackground(tempc3);
        jButton19.setBackground(tempc3);
        jButton20.setBackground(tempc3);
        jButton22.setBackground(tempc3);
        jButton23.setBackground(tempc3);
        jButton24.setBackground(tempc3);
        jButton25.setBackground(tempc3);
        jButton27.setBackground(tempc3);
        jButton28.setBackground(tempc3);
        jButton29.setBackground(tempc3);
        jButton30.setBackground(tempc3);
        jButton32.setBackground(tempc3);
        jButton33.setBackground(tempc3);
        jButton34.setBackground(tempc3);
        jButton35.setBackground(tempc3);
        jButton36.setBackground(tempc3);
        jButton37.setBackground(tempc3);
        jButton39.setBackground(tempc3);
        jButton40.setBackground(tempc3);
        jButton41.setBackground(tempc3);
        jButton42.setBackground(tempc3);
        jButton43.setBackground(tempc3);
        jButton44.setBackground(tempc3);
        
        Color tempc4 = new Color(255,153,0);
        jButton7.setBackground(tempc4);
        jButton9.setBackground(tempc4);
        
        Color tempc5 = new Color(51,255,0);
        jButton8.setBackground(tempc5);
        
        Color tempc6 = new Color(204,204,255);
        jButton10.setBackground(tempc6);
        jButton11.setBackground(tempc6);
        jButton12.setBackground(tempc6);
        jButton13.setBackground(tempc6);
        jButton14.setBackground(tempc6);
        jButton16.setBackground(tempc6);
        
        setTitle("윷놀이");
        setVisible(true);
    }
    
    public void Setting(){
        Color tempc2 = new Color(0,255,255);
        jButton15.setBackground(tempc2);
        jButton21.setBackground(tempc2);
        jButton26.setBackground(tempc2);
        jButton31.setBackground(tempc2);
        jButton38.setBackground(tempc2);
        
        Color tempc3 = new Color(204,255,204);
        jButton17.setBackground(tempc3);
        jButton18.setBackground(tempc3);
        jButton19.setBackground(tempc3);
        jButton20.setBackground(tempc3);
        jButton22.setBackground(tempc3);
        jButton23.setBackground(tempc3);
        jButton24.setBackground(tempc3);
        jButton25.setBackground(tempc3);
        jButton27.setBackground(tempc3);
        jButton28.setBackground(tempc3);
        jButton29.setBackground(tempc3);
        jButton30.setBackground(tempc3);
        jButton32.setBackground(tempc3);
        jButton33.setBackground(tempc3);
        jButton34.setBackground(tempc3);
        jButton35.setBackground(tempc3);
        jButton36.setBackground(tempc3);
        jButton37.setBackground(tempc3);
        jButton39.setBackground(tempc3);
        jButton40.setBackground(tempc3);
        jButton41.setBackground(tempc3);
        jButton42.setBackground(tempc3);
        jButton43.setBackground(tempc3);
        jButton44.setBackground(tempc3);
        
        jButton15.setText(" ");
        jButton17.setText(" ");
        jButton15.setText(" ");
        jButton18.setText(" ");
        jButton19.setText(" ");
        jButton20.setText(" ");
        jButton21.setText(" ");
        jButton22.setText(" ");
        jButton23.setText(" ");
        jButton24.setText(" ");
        jButton25.setText(" ");
        jButton26.setText(" ");
        jButton27.setText(" ");
        jButton28.setText(" ");
        jButton29.setText(" ");
        jButton30.setText(" ");
        jButton31.setText(" ");
        jButton32.setText(" ");
        jButton33.setText(" ");
        jButton34.setText(" ");
        jButton35.setText(" ");
        jButton36.setText(" ");
        jButton37.setText(" ");
        jButton38.setText(" ");
        jButton39.setText(" ");
        jButton40.setText(" ");
        jButton41.setText(" ");
        jButton42.setText(" ");
        jButton43.setText(" ");
        jButton44.setText(" ");
        
        Color player1c = new Color(255,150,150);
        Color player2c = new Color(150,150,255);
        Color player3c = new Color(255,255,150);
        Color player4c = new Color(240,240,240);
        String mals;
        int x;
        
        x = 0;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton15.setBackground(player1c);
                jButton15.setText(mals);
                break;
            case 2:
                jButton15.setBackground(player2c);
                jButton15.setText(mals);
                break;
            case 3:
                jButton15.setBackground(player3c);
                jButton15.setText(mals);
                break;
            case 4:
                jButton15.setBackground(player4c);
                jButton15.setText(mals);
                break;
        }
        x = 1;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton17.setBackground(player1c);
                jButton17.setText(mals);
                break;
            case 2:
                jButton17.setBackground(player2c);
                jButton17.setText(mals);
                break;
            case 3:
                jButton17.setBackground(player3c);
                jButton17.setText(mals);
                break;
            case 4:
                jButton17.setBackground(player4c);
                jButton17.setText(mals);
                break;
        }
        x = 2;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton18.setBackground(player1c);
                jButton18.setText(mals);
                break;
            case 2:
                jButton18.setBackground(player2c);
                jButton18.setText(mals);
                break;
            case 3:
                jButton18.setBackground(player3c);
                jButton18.setText(mals);
                break;
            case 4:
                jButton18.setBackground(player4c);
                jButton18.setText(mals);
                break;
        }
        x = 3;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton19.setBackground(player1c);
                jButton19.setText(mals);
                break;
            case 2:
                jButton19.setBackground(player2c);
                jButton19.setText(mals);
                break;
            case 3:
                jButton19.setBackground(player3c);
                jButton19.setText(mals);
                break;
            case 4:
                jButton19.setBackground(player4c);
                jButton19.setText(mals);
                break;
        }
        x = 4;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton20.setBackground(player1c);
                jButton20.setText(mals);
                break;
            case 2:
                jButton20.setBackground(player2c);
                jButton20.setText(mals);
                break;
            case 3:
                jButton20.setBackground(player3c);
                jButton20.setText(mals);
                break;
            case 4:
                jButton20.setBackground(player4c);
                jButton20.setText(mals);
                break;
        }
        x = 5;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton21.setBackground(player1c);
                jButton21.setText(mals);
                break;
            case 2:
                jButton21.setBackground(player2c);
                jButton21.setText(mals);
                break;
            case 3:
                jButton21.setBackground(player3c);
                jButton21.setText(mals);
                break;
            case 4:
                jButton21.setBackground(player4c);
                jButton21.setText(mals);
                break;
        }
        x = 6;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton22.setBackground(player1c);
                jButton22.setText(mals);
                break;
            case 2:
                jButton22.setBackground(player2c);
                jButton22.setText(mals);
                break;
            case 3:
                jButton22.setBackground(player3c);
                jButton22.setText(mals);
                break;
            case 4:
                jButton22.setBackground(player4c);
                jButton22.setText(mals);
                break;
        }
        x = 7;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton23.setBackground(player1c);
                jButton23.setText(mals);
                break;
            case 2:
                jButton23.setBackground(player2c);
                jButton23.setText(mals);
                break;
            case 3:
                jButton23.setBackground(player3c);
                jButton23.setText(mals);
                break;
            case 4:
                jButton23.setBackground(player4c);
                jButton23.setText(mals);
                break;
        }
        x = 8;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton24.setBackground(player1c);
                jButton24.setText(mals);
                break;
            case 2:
                jButton24.setBackground(player2c);
                jButton24.setText(mals);
                break;
            case 3:
                jButton24.setBackground(player3c);
                jButton24.setText(mals);
                break;
            case 4:
                jButton24.setBackground(player4c);
                jButton24.setText(mals);
                break;
        }
        x = 9;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton25.setBackground(player1c);
                jButton25.setText(mals);
                break;
            case 2:
                jButton25.setBackground(player2c);
                jButton25.setText(mals);
                break;
            case 3:
                jButton25.setBackground(player3c);
                jButton25.setText(mals);
                break;
            case 4:
                jButton25.setBackground(player4c);
                jButton25.setText(mals);
                break;
        }
        x = 10;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton26.setBackground(player1c);
                jButton26.setText(mals);
                break;
            case 2:
                jButton26.setBackground(player2c);
                jButton26.setText(mals);
                break;
            case 3:
                jButton26.setBackground(player3c);
                jButton26.setText(mals);
                break;
            case 4:
                jButton26.setBackground(player4c);
                jButton26.setText(mals);
                break;
        }
        x = 11;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton27.setBackground(player1c);
                jButton27.setText(mals);
                break;
            case 2:
                jButton27.setBackground(player2c);
                jButton27.setText(mals);
                break;
            case 3:
                jButton27.setBackground(player3c);
                jButton27.setText(mals);
                break;
            case 4:
                jButton27.setBackground(player4c);
                jButton27.setText(mals);
                break;
        }
        x = 12;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton28.setBackground(player1c);
                jButton28.setText(mals);
                break;
            case 2:
                jButton28.setBackground(player2c);
                jButton28.setText(mals);
                break;
            case 3:
                jButton28.setBackground(player3c);
                jButton28.setText(mals);
                break;
            case 4:
                jButton28.setBackground(player4c);
                jButton28.setText(mals);
                break;
        }
        x = 13;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton29.setBackground(player1c);
                jButton29.setText(mals);
                break;
            case 2:
                jButton29.setBackground(player2c);
                jButton29.setText(mals);
                break;
            case 3:
                jButton29.setBackground(player3c);
                jButton29.setText(mals);
                break;
            case 4:
                jButton29.setBackground(player4c);
                jButton29.setText(mals);
                break;
        }
        x = 14;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton30.setBackground(player1c);
                jButton30.setText(mals);
                break;
            case 2:
                jButton30.setBackground(player2c);
                jButton30.setText(mals);
                break;
            case 3:
                jButton30.setBackground(player3c);
                jButton30.setText(mals);
                break;
            case 4:
                jButton30.setBackground(player4c);
                jButton30.setText(mals);
                break;
        }
        x = 15;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton31.setBackground(player1c);
                jButton31.setText(mals);
                break;
            case 2:
                jButton31.setBackground(player2c);
                jButton31.setText(mals);
                break;
            case 3:
                jButton31.setBackground(player3c);
                jButton31.setText(mals);
                break;
            case 4:
                jButton31.setBackground(player4c);
                jButton31.setText(mals);
                break;
        }
        x = 16;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton32.setBackground(player1c);
                jButton32.setText(mals);
                break;
            case 2:
                jButton32.setBackground(player2c);
                jButton32.setText(mals);
                break;
            case 3:
                jButton32.setBackground(player3c);
                jButton32.setText(mals);
                break;
            case 4:
                jButton32.setBackground(player4c);
                jButton32.setText(mals);
                break;
        }
        x = 17;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton33.setBackground(player1c);
                jButton33.setText(mals);
                break;
            case 2:
                jButton33.setBackground(player2c);
                jButton33.setText(mals);
                break;
            case 3:
                jButton33.setBackground(player3c);
                jButton33.setText(mals);
                break;
            case 4:
                jButton33.setBackground(player4c);
                jButton33.setText(mals);
                break;
        }
        x = 18;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton34.setBackground(player1c);
                jButton34.setText(mals);
                break;
            case 2:
                jButton34.setBackground(player2c);
                jButton34.setText(mals);
                break;
            case 3:
                jButton34.setBackground(player3c);
                jButton34.setText(mals);
                break;
            case 4:
                jButton34.setBackground(player4c);
                jButton34.setText(mals);
                break;
        }
        x = 19;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton35.setBackground(player1c);
                jButton35.setText(mals);
                break;
            case 2:
                jButton35.setBackground(player2c);
                jButton35.setText(mals);
                break;
            case 3:
                jButton35.setBackground(player3c);
                jButton35.setText(mals);
                break;
            case 4:
                jButton35.setBackground(player4c);
                jButton35.setText(mals);
                break;
        }
        x = 20;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton36.setBackground(player1c);
                jButton36.setText(mals);
                break;
            case 2:
                jButton36.setBackground(player2c);
                jButton36.setText(mals);
                break;
            case 3:
                jButton36.setBackground(player3c);
                jButton36.setText(mals);
                break;
            case 4:
                jButton36.setBackground(player4c);
                jButton36.setText(mals);
                break;
        }
        x = 21;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton37.setBackground(player1c);
                jButton37.setText(mals);
                break;
            case 2:
                jButton37.setBackground(player2c);
                jButton37.setText(mals);
                break;
            case 3:
                jButton37.setBackground(player3c);
                jButton37.setText(mals);
                break;
            case 4:
                jButton37.setBackground(player4c);
                jButton37.setText(mals);
                break;
        }
        x = 22;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton38.setBackground(player1c);
                jButton38.setText(mals);
                break;
            case 2:
                jButton38.setBackground(player2c);
                jButton38.setText(mals);
                break;
            case 3:
                jButton38.setBackground(player3c);
                jButton38.setText(mals);
                break;
            case 4:
                jButton38.setBackground(player4c);
                jButton38.setText(mals);
                break;
        }
        x = 23;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton39.setBackground(player1c);
                jButton39.setText(mals);
                break;
            case 2:
                jButton39.setBackground(player2c);
                jButton39.setText(mals);
                break;
            case 3:
                jButton39.setBackground(player3c);
                jButton39.setText(mals);
                break;
            case 4:
                jButton39.setBackground(player4c);
                jButton39.setText(mals);
                break;
        }
        x = 24;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton40.setBackground(player1c);
                jButton40.setText(mals);
                break;
            case 2:
                jButton40.setBackground(player2c);
                jButton40.setText(mals);
                break;
            case 3:
                jButton40.setBackground(player3c);
                jButton40.setText(mals);
                break;
            case 4:
                jButton40.setBackground(player4c);
                jButton40.setText(mals);
                break;
        }
        x = 25;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton41.setBackground(player1c);
                jButton41.setText(mals);
                break;
            case 2:
                jButton41.setBackground(player2c);
                jButton41.setText(mals);
                break;
            case 3:
                jButton41.setBackground(player3c);
                jButton41.setText(mals);
                break;
            case 4:
                jButton41.setBackground(player4c);
                jButton41.setText(mals);
                break;
        }
        x = 26;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton42.setBackground(player1c);
                jButton42.setText(mals);
                break;
            case 2:
                jButton42.setBackground(player2c);
                jButton42.setText(mals);
                break;
            case 3:
                jButton42.setBackground(player3c);
                jButton42.setText(mals);
                break;
            case 4:
                jButton42.setBackground(player4c);
                jButton42.setText(mals);
                break;
        }
        x = 27;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton43.setBackground(player1c);
                jButton43.setText(mals);
                break;
            case 2:
                jButton43.setBackground(player2c);
                jButton43.setText(mals);
                break;
            case 3:
                jButton43.setBackground(player3c);
                jButton43.setText(mals);
                break;
            case 4:
                jButton43.setBackground(player4c);
                jButton43.setText(mals);
                break;
        }
        x = 28;
        mals = malnum[x] + "";
        switch(status[x]){
            case 0:
                break;
            case 1:
                jButton44.setBackground(player1c);
                jButton44.setText(mals);
                break;
            case 2:
                jButton44.setBackground(player2c);
                jButton44.setText(mals);
                break;
            case 3:
                jButton44.setBackground(player3c);
                jButton44.setText(mals);
                break;
            case 4:
                jButton44.setBackground(player4c);
                jButton44.setText(mals);
                break;
        }
    }
    
    public void TurnCheck(){
        if(chance == 0){
            int count = 0;
            for(int x=0; x<6 ; x++)
                if(move[x] == 0)
                    count++;
            if(count == 6){
                currentplayer++;
                if(currentplayer > playernum)
                    currentplayer = 1;
                chance = 1;
                movenum = 0;
                String s = currentplayer + "";
                jLabel19.setText(s);
                jLabel16.setText("1");
            }
        }
    }
    
    public void Win(){
        setVisible(false);
        EndGame end = new EndGame(currentplayer);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton17.setText(" ");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText(" ");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText(" ");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText(" ");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText(" ");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText(" ");
        jButton22.setToolTipText("");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setText(" ");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setText(" ");
        jButton24.setToolTipText("");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setText(" ");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText(" ");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setText(" ");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setText(" ");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setText(" ");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setText(" ");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setText(" ");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText(" ");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setText(" ");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setText(" ");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setText(" ");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setText(" ");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setText(" ");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setText(" ");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setText(" ");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setText(" ");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setText(" ");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setText(" ");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setText(" ");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jButton44.setText(" ");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jLabel20.setText("↑");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(128, 128, 128)
                                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(19, 19, 19)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(129, 129, 129)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel1.setText("미출발 말");

        jLabel2.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel2.setText("도착 말");

        jLabel4.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel4.setText("Player 1");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel5.setText("Player 2");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel6.setText("Player 3");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel7.setText("Player 4");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel8.setText("0");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel9.setText("1");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel10.setText("0");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel11.setText("1");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel12.setText("0");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel13.setText("1");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel14.setText("0");
        jLabel14.setToolTipText("");

        jLabel15.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel15.setText("1");
        jLabel15.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(43, 43, 43)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(37, 37, 37))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText(" ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(" ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(" ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(" ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(" ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(" ");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("이동");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("새로 출발");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setText("윷 던지기");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton10.setText("도");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("개");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("걸");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("윷");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("모");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton16.setText("빽도");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel3.setText("남은 횟수 : ");

        jLabel16.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel16.setText("0");

        jLabel17.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel17.setText("회");

        jLabel18.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel18.setText("Player");

        jLabel19.setFont(new java.awt.Font("함초롬돋움", 1, 14)); // NOI18N
        jLabel19.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                                             

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move[0] > 0){
            moveclick = 1;
            currentmove = move[0];
            System.out.println(currentmove);
            
            Color tempc1 = new Color(153,255,255);
            Color tempc2 = new Color(240,240,240);
            Color tempc3 = new Color(0,255,255);
            if(move[0]>0)
                jButton1.setBackground(tempc1);
            else
                jButton1.setBackground(tempc2);
            if(move[1]>0)
                jButton2.setBackground(tempc1);
            else
                jButton2.setBackground(tempc2);
            if(move[2]>0)
                jButton3.setBackground(tempc1);
            else
                jButton3.setBackground(tempc2);
            if(move[3]>0)
                jButton4.setBackground(tempc1);
            else
                jButton4.setBackground(tempc2);
            if(move[4]>0)
                jButton5.setBackground(tempc1);
            else
                jButton5.setBackground(tempc2);
            if(move[5]>0)
                jButton6.setBackground(tempc1);
            else
                jButton6.setBackground(tempc2);
            jButton1.setBackground(tempc3);
        }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move[1] > 0){
            moveclick = 2;
            currentmove = move[1];
            System.out.println(currentmove);
            
            Color tempc1 = new Color(153,255,255);
            Color tempc2 = new Color(240,240,240);
            Color tempc3 = new Color(0,255,255);
            if(move[0]>0)
                jButton1.setBackground(tempc1);
            else
                jButton1.setBackground(tempc2);
            if(move[1]>0)
                jButton2.setBackground(tempc1);
            else
                jButton2.setBackground(tempc2);
            if(move[2]>0)
                jButton3.setBackground(tempc1);
            else
                jButton3.setBackground(tempc2);
            if(move[3]>0)
                jButton4.setBackground(tempc1);
            else
                jButton4.setBackground(tempc2);
            if(move[4]>0)
                jButton5.setBackground(tempc1);
            else
                jButton5.setBackground(tempc2);
            if(move[5]>0)
                jButton6.setBackground(tempc1);
            else
                jButton6.setBackground(tempc2);
            jButton2.setBackground(tempc3);
        }
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move[2] > 0){
            moveclick = 3;
            currentmove = move[2];
            System.out.println(currentmove);
            
            Color tempc1 = new Color(153,255,255);
            Color tempc2 = new Color(240,240,240);
            Color tempc3 = new Color(0,255,255);
            if(move[0]>0)
                jButton1.setBackground(tempc1);
            else
                jButton1.setBackground(tempc2);
            if(move[1]>0)
                jButton2.setBackground(tempc1);
            else
                jButton2.setBackground(tempc2);
            if(move[2]>0)
                jButton3.setBackground(tempc1);
            else
                jButton3.setBackground(tempc2);
            if(move[3]>0)
                jButton4.setBackground(tempc1);
            else
                jButton4.setBackground(tempc2);
            if(move[4]>0)
                jButton5.setBackground(tempc1);
            else
                jButton5.setBackground(tempc2);
            if(move[5]>0)
                jButton6.setBackground(tempc1);
            else
                jButton6.setBackground(tempc2);
            jButton3.setBackground(tempc3);
        }
    }   
        
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move[3] > 0){
            moveclick = 4;
            currentmove = move[3];
            System.out.println(currentmove);
            
            Color tempc1 = new Color(153,255,255);
            Color tempc2 = new Color(240,240,240);
            Color tempc3 = new Color(0,255,255);
            if(move[0]>0)
                jButton1.setBackground(tempc1);
            else
                jButton1.setBackground(tempc2);
            if(move[1]>0)
                jButton2.setBackground(tempc1);
            else
                jButton2.setBackground(tempc2);
            if(move[2]>0)
                jButton3.setBackground(tempc1);
            else
                jButton3.setBackground(tempc2);
            if(move[3]>0)
                jButton4.setBackground(tempc1);
            else
                jButton4.setBackground(tempc2);
            if(move[4]>0)
                jButton5.setBackground(tempc1);
            else
                jButton5.setBackground(tempc2);
            if(move[5]>0)
                jButton6.setBackground(tempc1);
            else
                jButton6.setBackground(tempc2);
            jButton4.setBackground(tempc3);
        }
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move[4] > 0){
            moveclick = 5;
            currentmove = move[4];
            System.out.println(currentmove);
            
            Color tempc1 = new Color(153,255,255);
            Color tempc2 = new Color(240,240,240);
            Color tempc3 = new Color(0,255,255);
            if(move[0]>0)
                jButton1.setBackground(tempc1);
            else
                jButton1.setBackground(tempc2);
            if(move[1]>0)
                jButton2.setBackground(tempc1);
            else
                jButton2.setBackground(tempc2);
            if(move[2]>0)
                jButton3.setBackground(tempc1);
            else
                jButton3.setBackground(tempc2);
            if(move[3]>0)
                jButton4.setBackground(tempc1);
            else
                jButton4.setBackground(tempc2);
            if(move[4]>0)
                jButton5.setBackground(tempc1);
            else
                jButton5.setBackground(tempc2);
            if(move[5]>0)
                jButton6.setBackground(tempc1);
            else
                jButton6.setBackground(tempc2);
            jButton5.setBackground(tempc3);
        }
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(move[5] > 0){
            moveclick = 6;
            currentmove = move[5];
            System.out.println(currentmove);
            
            Color tempc1 = new Color(153,255,255);
            Color tempc2 = new Color(240,240,240);
            Color tempc3 = new Color(0,255,255);
            if(move[0]>0)
                jButton1.setBackground(tempc1);
            else
                jButton1.setBackground(tempc2);
            if(move[1]>0)
                jButton2.setBackground(tempc1);
            else
                jButton2.setBackground(tempc2);
            if(move[2]>0)
                jButton3.setBackground(tempc1);
            else
                jButton3.setBackground(tempc2);
            if(move[3]>0)
                jButton4.setBackground(tempc1);
            else
                jButton4.setBackground(tempc2);
            if(move[4]>0)
                jButton5.setBackground(tempc1);
            else
                jButton5.setBackground(tempc2);
            if(move[5]>0)
                jButton6.setBackground(tempc1);
            else
                jButton6.setBackground(tempc2);
            jButton6.setBackground(tempc3);
        }
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(moveclick>0){
            if(move[moveclick-1]>0){
                if(currentposition<29){
                    
                    Color tempc1 = new Color(240,240,240);
                    switch(moveclick){
                        case 1:
                            jButton1.setBackground(tempc1);
                            jButton1.setText(" ");
                        break;
                        case 2:
                            jButton2.setBackground(tempc1);
                            jButton2.setText(" ");
                            break;
                        case 3:
                            jButton3.setBackground(tempc1);
                            jButton3.setText(" ");
                            break;
                        case 4:
                            jButton4.setBackground(tempc1);
                            jButton4.setText(" ");
                            break;
                        case 5:
                            jButton5.setBackground(tempc1);
                            jButton5.setText(" ");
                            break;
                        case 6:
                                jButton6.setBackground(tempc1);
                            jButton6.setText(" ");
                            break;
                    }
                    int currentmove;
                    currentmove = move[moveclick-1];
                    move[moveclick-1] = 0;
                    if(currentmove == 1)
                        currentmove = -1;
                    else
                        currentmove -= 1;
                    
                    System.out.println("CP : " + currentposition + "  /  CM : " + currentmove);
                    
                    int nextposition;
                    if(currentposition == 5){
                        nextposition = currentposition; // np = 5
                        if(currentmove != -1)
                            nextposition += 14;
                        nextposition += currentmove;
                    } else if (currentposition == 10) {
                        if(currentmove == 3)
                            nextposition = 22;
                        else {
                            nextposition = currentposition; // np = 10
                            if(currentmove != -1)
                                nextposition += 14;
                            nextposition += currentmove;
                        }
                    } else if (currentposition == 0) {
                        if(currentmove == -1)
                            if(hole == 0)
                                nextposition = 19;
                            else
                                nextposition = 28;
                        nextposition = 29;
                    } else if (currentposition < 20) {
                        nextposition = currentposition + currentmove;
                        if(nextposition == 20){
                            nextposition = 0;
                            hole = 0;
                        }
                        if(nextposition > 20)
                            nextposition = 29;
                    } else if (currentposition == 22) {
                        nextposition = currentposition + currentmove;
                        if(nextposition == 23)
                            nextposition = 27;
                        if(nextposition == 24)
                            nextposition = 28;
                        if(nextposition == 25)
                            nextposition = 0;
                        if(nextposition > 25)
                            nextposition = 29;
                    } else if (currentposition < 25) {
                        nextposition = currentposition + currentmove;
                        if(nextposition == 19)
                            nextposition = 5;
                        if(nextposition > 24)
                            nextposition -= 10;
                    } else if (currentposition < 27) {
                        nextposition = currentposition + currentmove;
                        if(nextposition == 24)
                            nextposition = 10;
                        if(nextposition == 27)
                            nextposition = 22;
                        if(nextposition == 28)
                            nextposition = 27;
                        if(nextposition == 29)
                            nextposition = 28;
                        if(nextposition == 30){
                            nextposition = 0;
                            hole = 1;
                        }
                        if(nextposition == 31)
                            nextposition = 29;
                    } else {
                        nextposition = currentposition + currentmove;
                        if(nextposition == 26)
                            nextposition = 22;
                        if(nextposition == 29){
                            nextposition = 0;
                            hole = 1;
                        }
                        if(nextposition > 29)
                            nextposition = 29;
                    }
                    String s;
                    System.out.println("NP : " + nextposition);
                    if(nextposition == 29) {
                        player[currentplayer].endMal += malnum[currentposition];
                        
                        s = "" + player[currentplayer].endMal;
                        switch(currentplayer){
                        case 1:
                            jLabel8.setText(s);
                            break;
                        case 2:
                            jLabel10.setText(s);
                            break;
                        case 3:
                            jLabel12.setText(s);
                            break;
                        case 4:
                            jLabel14.setText(s);
                            break;
                        }
                        
                        status[currentposition] = 0;
                        malnum[currentposition] = 0;
                        
                        this.Setting();
                        if(player[currentplayer].endMal == mal)
                            this.Win();
                        this.TurnCheck();
                        currentposition = 29;
                        
                    } else {
                        if(status[nextposition] > 0 && status[nextposition] != currentplayer)
                        {
                            if(currentmove <5)
                                chance++;
                            s = "" + chance;
                            jLabel16.setText(s);
                            player[status[nextposition]].remindMal += malnum[nextposition];
                            malnum[nextposition] = 0;
                            s = "" + player[status[nextposition]].remindMal;
                            switch(status[nextposition]){
                            case 1:
                                jLabel9.setText(s);
                                break;
                            case 2:
                                jLabel11.setText(s);
                                break;
                            case 3:
                                jLabel13.setText(s);
                                break;
                            case 4:
                                jLabel15.setText(s);
                                break;
                            }
                        }
                        status[nextposition] = currentplayer;
                        malnum[nextposition] += malnum[currentposition];
                        
                        status[currentposition] = 0;
                        malnum[currentposition] = 0;
                        
                        this.Setting();
                        this.TurnCheck();
                        
                        currentposition = 29;
                    }
                    
                }
            }
        }
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        if(moveclick>0){
            if(move[moveclick-1]>0){
            if(player[currentplayer].remindMal > 0){
               player[currentplayer].remindMal--;
               String s = "" + player[currentplayer].remindMal;
               switch(currentplayer){
                   case 1:
                       jLabel9.setText(s);
                       break;
                   case 2:
                       jLabel11.setText(s);
                       break;
                   case 3:
                       jLabel13.setText(s);
                       break;
                   case 4:
                       jLabel15.setText(s);
                       break;
               }
               
               Color tempc1 = new Color(240,240,240);
               switch(moveclick){
                   case 1:
                       jButton1.setBackground(tempc1);
                       jButton1.setText(" ");
                       break;
                   case 2:
                       jButton2.setBackground(tempc1);
                       jButton2.setText(" ");
                       break;
                   case 3:
                       jButton3.setBackground(tempc1);
                       jButton3.setText(" ");
                       break;
                   case 4:
                       jButton4.setBackground(tempc1);
                       jButton4.setText(" ");
                       break;
                   case 5:
                       jButton5.setBackground(tempc1);
                       jButton5.setText(" ");
                       break;
                   case 6:
                       jButton6.setBackground(tempc1);
                       jButton6.setText(" ");
                       break;
               }
               
               int currentmove;
               currentmove = move[moveclick-1];
               move[moveclick-1] = 0;
               
               int x = currentmove-1;
               
               if(status[x] > 0 && status[x] != currentplayer)
               {
                   if(currentmove <5)
                       chance++;
                   s = "" + chance;
                   jLabel16.setText(s);
                   player[status[x]].remindMal += malnum[x];
                   malnum[x] = 0;
                   s = "" + player[status[x]].remindMal;
                   switch(status[x]){
                   case 1:
                       jLabel9.setText(s);
                       break;
                   case 2:
                       jLabel11.setText(s);
                       break;
                   case 3:
                       jLabel13.setText(s);
                       break;
                   case 4:
                       jLabel15.setText(s);
                       break;
               }
               }
               status[x] = currentplayer;
               malnum[x] += 1;
               
               this.Setting();
               this.TurnCheck();
            }
            }
        }
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            
            int i = (int)(Math.random()*100+1); // 1~100까지 난수 생성
            System.out.println(i);
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            // 0없 1빽 2도 3개 4걸 5윷 6모
            if(i <= 3){ // 빽도
                move[movenum] = 1;
                Color tempc1 = new Color(153,255,255);
                switch(movenum){    
                case 0 : 
                    jButton1.setBackground(tempc1);
                    jButton1.setText("빽도");
                    break;
                case 1 : 
                    jButton2.setBackground(tempc1);
                    jButton2.setText("빽도");
                    break;
                case 2 : 
                    jButton3.setBackground(tempc1);
                    jButton3.setText("빽도");
                    break;
                case 3 : 
                    jButton4.setBackground(tempc1);
                    jButton4.setText("빽도");
                    break;
                case 4 : 
                    jButton5.setBackground(tempc1);
                    jButton5.setText("빽도");
                    break;
                case 5 : 
                    jButton6.setBackground(tempc1);
                    jButton6.setText("빽도");
                    break;
                }
                movenum++;              
            } else if (i <= 15) { // 도
                move[movenum] = 2;
                Color tempc1 = new Color(153,255,255);
                switch(movenum){    
                case 0 : 
                    jButton1.setBackground(tempc1);
                    jButton1.setText("도");
                    break;
                case 1 : 
                    jButton2.setBackground(tempc1);
                    jButton2.setText("도");
                    break;
                case 2 : 
                    jButton3.setBackground(tempc1);
                    jButton3.setText("도");
                    break;
                case 3 : 
                    jButton4.setBackground(tempc1);
                    jButton4.setText("도");
                    break;
                case 4 : 
                    jButton5.setBackground(tempc1);
                    jButton5.setText("도");
                    break;
                case 5 : 
                    jButton6.setBackground(tempc1);
                    jButton6.setText("도");
                    break;
                }
                movenum++;
            } else if (i <= 50) { // 개
                move[movenum] = 3;
                Color tempc1 = new Color(153,255,255);
                switch(movenum){    
                case 0 : 
                    jButton1.setBackground(tempc1);
                    jButton1.setText("개");
                    break;
                case 1 : 
                    jButton2.setBackground(tempc1);
                    jButton2.setText("개");
                    break;
                case 2 : 
                    jButton3.setBackground(tempc1);
                    jButton3.setText("개");
                    break;
                case 3 : 
                    jButton4.setBackground(tempc1);
                    jButton4.setText("개");
                    break;
                case 4 : 
                    jButton5.setBackground(tempc1);
                    jButton5.setText("개");
                    break;
                case 5 : 
                    jButton6.setBackground(tempc1);
                    jButton6.setText("개");
                    break;
                }
                movenum++;
            } else if (i <= 84) { // 걸
                move[movenum] = 4;
                Color tempc1 = new Color(153,255,255);
                switch(movenum){    
                case 0 : 
                    jButton1.setBackground(tempc1);
                    jButton1.setText("걸");
                    break;
                case 1 : 
                    jButton2.setBackground(tempc1);
                    jButton2.setText("걸");
                    break;
                case 2 : 
                    jButton3.setBackground(tempc1);
                    jButton3.setText("걸");
                    break;
                case 3 : 
                    jButton4.setBackground(tempc1);
                    jButton4.setText("걸");
                    break;
                case 4 : 
                    jButton5.setBackground(tempc1);
                    jButton5.setText("걸");
                    break;
                case 5 : 
                    jButton6.setBackground(tempc1);
                    jButton6.setText("걸");
                    break;
                }
                movenum++;
            } else if (i <= 95) { // 윷
                move[movenum] = 5;
                Color tempc1 = new Color(153,255,255);
                switch(movenum){    
                case 0 : 
                    jButton1.setBackground(tempc1);
                    jButton1.setText("윷");
                    break;
                case 1 : 
                    jButton2.setBackground(tempc1);
                    jButton2.setText("윷");
                    break;
                case 2 : 
                    jButton3.setBackground(tempc1);
                    jButton3.setText("윷");
                    break;
                case 3 : 
                    jButton4.setBackground(tempc1);
                    jButton4.setText("윷");
                    break;
                case 4 : 
                    jButton5.setBackground(tempc1);
                    jButton5.setText("윷");
                    break;
                case 5 : 
                    jButton6.setBackground(tempc1);
                    jButton6.setText("윷");
                    break;
                }
                movenum++;
                chance++;
            } else { // 모
                move[movenum] = 6;
                Color tempc1 = new Color(153,255,255);
                switch(movenum){    
                case 0 : 
                    jButton1.setBackground(tempc1);
                    jButton1.setText("모");
                    break;
                case 1 : 
                    jButton2.setBackground(tempc1);
                    jButton2.setText("모");
                    break;
                case 2 : 
                    jButton3.setBackground(tempc1);
                    jButton3.setText("모");
                    break;
                case 3 : 
                    jButton4.setBackground(tempc1);
                    jButton4.setText("모");
                    break;
                case 4 : 
                    jButton5.setBackground(tempc1);
                    jButton5.setText("모");
                    break;
                case 5 : 
                    jButton6.setBackground(tempc1);
                    jButton6.setText("모");
                    break;
                }
                movenum++;
                chance++;
                
            }
            String a = this.chance + "";
            jLabel16.setText(a);
            }
        }
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            String a = this.chance + "";
            jLabel16.setText(a);
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            
            move[movenum] = 2;
            Color tempc1 = new Color(153,255,255);
            switch(movenum){    
            case 0 : 
                jButton1.setBackground(tempc1);
                jButton1.setText("도");
                break;
            case 1 : 
                jButton2.setBackground(tempc1);
                jButton2.setText("도");
                break;
            case 2 : 
                jButton3.setBackground(tempc1);
                jButton3.setText("도");
                break;
            case 3 : 
                jButton4.setBackground(tempc1);
                jButton4.setText("도");
                break;
            case 4 : 
                jButton5.setBackground(tempc1);
                jButton5.setText("도");
                break;
            case 5 : 
                jButton6.setBackground(tempc1);
                jButton6.setText("도");
                break;
            }
            movenum++;
            }
        }
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            String a = this.chance + "";
            jLabel16.setText(a);
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            
            move[movenum] = 3;
            Color tempc1 = new Color(153,255,255);
            switch(movenum){    
            case 0 : 
                jButton1.setBackground(tempc1);
                jButton1.setText("개");
                break;
            case 1 : 
                jButton2.setBackground(tempc1);
                jButton2.setText("개");
                break;
            case 2 : 
                jButton3.setBackground(tempc1);
                jButton3.setText("개");
                break;
            case 3 : 
                jButton4.setBackground(tempc1);
                jButton4.setText("개");
                break;
            case 4 : 
                jButton5.setBackground(tempc1);
                jButton5.setText("개");
                break;
            case 5 : 
                jButton6.setBackground(tempc1);
                jButton6.setText("개");
                break;
            }
            movenum++;
            }
        }
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            String a = this.chance + "";
            jLabel16.setText(a);
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            
            move[movenum] = 4;
            Color tempc1 = new Color(153,255,255);
            switch(movenum){    
            case 0 : 
                jButton1.setBackground(tempc1);
                jButton1.setText("걸");
                break;
            case 1 : 
                jButton2.setBackground(tempc1);
                jButton2.setText("걸");
                break;
            case 2 : 
                jButton3.setBackground(tempc1);
                jButton3.setText("걸");
                break;
            case 3 : 
                jButton4.setBackground(tempc1);
                jButton4.setText("걸");
                break;
            case 4 : 
                jButton5.setBackground(tempc1);
                jButton5.setText("걸");
                break;
            case 5 : 
                jButton6.setBackground(tempc1);
                jButton6.setText("걸");
                break;
            }
            movenum++;
            }
        }
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            
            move[movenum] = 5;
            Color tempc1 = new Color(153,255,255);
            switch(movenum){    
            case 0 : 
                jButton1.setBackground(tempc1);
                jButton1.setText("윷");
                break;
            case 1 : 
                jButton2.setBackground(tempc1);
                jButton2.setText("윷");
                break;
            case 2 : 
                jButton3.setBackground(tempc1);
                jButton3.setText("윷");
                break;
            case 3 : 
                jButton4.setBackground(tempc1);
                jButton4.setText("윷");
                break;
            case 4 : 
                jButton5.setBackground(tempc1);
                jButton5.setText("윷");
                break;
            case 5 : 
                jButton6.setBackground(tempc1);
                jButton6.setText("윷");
                break;
            }
            movenum++;
            chance++;
            String a = this.chance + "";
            jLabel16.setText(a);
            }
        }     
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            
            move[movenum] = 6;
            Color tempc1 = new Color(153,255,255);
            switch(movenum){    
            case 0 : 
                jButton1.setBackground(tempc1);
                jButton1.setText("모");
                break;
            case 1 : 
                jButton2.setBackground(tempc1);
                jButton2.setText("모");
                break;
            case 2 : 
                jButton3.setBackground(tempc1);
                jButton3.setText("모");
                break;
            case 3 : 
                jButton4.setBackground(tempc1);
                jButton4.setText("모");
                break;
            case 4 : 
                jButton5.setBackground(tempc1);
                jButton5.setText("모");
                break;
            case 5 : 
                jButton6.setBackground(tempc1);
                jButton6.setText("모");
                break;
            }
            movenum++;
            chance++;
            String a = this.chance + "";
            jLabel16.setText(a);
            }
        }
    }                                         

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        if(chance > 0){
            int count=0;
            for(int x=0;x<6;x++)
                if(move[x] != 0)
                    count++;
            if(count<6) {
            chance--;
            String a = this.chance + "";
            jLabel16.setText(a);
            
            for(int x=0 ; x<6 ; x++)
                if(move[x] == 0){
                    movenum = x;
                    break;
                }
            
            move[movenum] = 1;
            Color tempc1 = new Color(153,255,255);
            switch(movenum){    
            case 0 : 
                jButton1.setBackground(tempc1);
                jButton1.setText("빽도");
                break;
            case 1 : 
                jButton2.setBackground(tempc1);
                jButton2.setText("빽도");
                break;
            case 2 : 
                jButton3.setBackground(tempc1);
                jButton3.setText("빽도");
                break;
            case 3 : 
                jButton4.setBackground(tempc1);
                jButton4.setText("빽도");
                break;
            case 4 : 
                jButton5.setBackground(tempc1);
                jButton5.setText("빽도");
                break;
            case 5 : 
                jButton6.setBackground(tempc1);
                jButton6.setText("빽도");
                break;
            }
            movenum++;
            }
        }
    }                                         

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 0;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton15.setBackground(tempc1);
        }
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 1;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton17.setBackground(tempc1);
        }
    }                                         

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 2;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton18.setBackground(tempc1);
        }
    }                                         

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 3;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton19.setBackground(tempc1);
        }
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 4;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton20.setBackground(tempc1);
        }
    }                                         

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 5;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton21.setBackground(tempc1);
        }
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 6;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton22.setBackground(tempc1);
        }
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 7;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton23.setBackground(tempc1);
        }
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 8;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton24.setBackground(tempc1);
        }
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 9;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton25.setBackground(tempc1);
        }
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 10;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton26.setBackground(tempc1);
        }
    }                                         

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 11;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton27.setBackground(tempc1);
        }
    }                                         

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 12;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton28.setBackground(tempc1);
        }
    }                                         

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 13;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton29.setBackground(tempc1);
        }
    }                                         

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 14;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton30.setBackground(tempc1);
        }
    }                                         

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 15;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton31.setBackground(tempc1);
        }
    }                                         

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 16;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton32.setBackground(tempc1);
        }
    }                                         

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 17;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton33.setBackground(tempc1);
        }
    }                                         

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 18;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton34.setBackground(tempc1);
        }
    }                                         

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 19;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton35.setBackground(tempc1);
        }
    }                                         

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 20;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton36.setBackground(tempc1);
        }
    }                                         

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 21;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton37.setBackground(tempc1);
        }
    }                                         

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 22;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton38.setBackground(tempc1);
        }
    }                                         

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 23;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton39.setBackground(tempc1);
        }
    }                                         

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 24;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton40.setBackground(tempc1);
        }
    }                                         

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 25;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton41.setBackground(tempc1);
        }
    }                                         

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 26;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton42.setBackground(tempc1);
        }
    }                                         

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 27;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton43.setBackground(tempc1);
        }
    }                                         

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        int x = 28;
        if(status[x] == currentplayer){
            this.Setting();
            currentposition = x;
            
            int r=0, g=0, b=0;
            switch(currentplayer){
                case 1:
                    r = 255;
                    g = 0;
                    b = 0;
                    break;
                case 2:
                    r = 0;
                    g = 0;
                    b = 255;
                    break;
                case 3:
                    r = 255;
                    g = 255;
                    b = 0;
                    break;
                case 4:
                    r = 200;
                    g = 200;
                    b = 200;
                    break;
            }
            Color tempc1 = new Color(r ,g, b);
            
            jButton44.setBackground(tempc1);
        }
    }                                         

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.TextArea textArea1;
    // End of variables declaration                   
}
