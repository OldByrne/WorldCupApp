/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package worldcupapp;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author x13102311
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        close();
        origPnl.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated b
     * y the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void close(){
        origPnl.setVisible(false);
        brazilInfoPnl.setVisible(false);
        fixturesPnl.setVisible(false);
        localAreaInfoPnl.setVisible(false);
        mvpsPnl.setVisible(false);
        oddsPnl.setVisible(false);
        playersPnl.setVisible(false);
        rtwcPnl.setVisible(false);
        refereesPnl.setVisible(false);
        stadiumsPnl.setVisible(false);
        tablesPnl.setVisible(false);
        topScorersPnl.setVisible(false);
        teamsPnl.setVisible(false);
        
        
    }
    public void closefixtures(){
        
        groupApnl.setVisible(false);
        groupBpnl.setVisible(false);
        groupCpnl.setVisible(false);
        groupDpnl.setVisible(false);
        groupEpnl.setVisible(false);
        groupFpnl.setVisible(false);
        groupGpnl.setVisible(false);
        groupHpnl.setVisible(false);
        
    }
    
    public void closeTablePanels(){
        tablesPanel.setVisible(false);
        grpBgrpPnl.setVisible(false);
        grpCgrpPnl.setVisible(false);
        grpDgrpPnl.setVisible(false);
        grpEgrpPnl.setVisible(false);
        grpFgrpPnl.setVisible(false);
        grpGgrpPnl.setVisible(false);
        grpHgrpPnl.setVisible(false);
    }
    
    public void closeOddsPnls(){
        
        OutrightOddsPnl.setVisible(false);
        FinalOddsPnl.setVisible(false);
        SemiOddsPnl.setVisible(false);
        QuarterOddsPnl.setVisible(false);
                
    }
    
    
    public void setPanelSize(){
        
        origPnl.setSize(528, 562);
        brazilInfoPnl.setSize(528, 562);
        fixturesPnl.setSize(528, 562);
        localAreaInfoPnl.setSize(528, 562);
        mvpsPnl.setSize(528, 562);
        oddsPnl.setSize(528, 562);
        playersPnl.setSize(528, 562);
        rtwcPnl.setSize(528, 562);
        refereesPnl.setSize(528, 562);
        stadiumsPnl.setSize(528, 562);
        tablesPnl.setSize(528, 562);
        topScorersPnl.setSize(528, 562);
        teamsPnl.setSize(528, 562);
    }
    
    public void resetTables(){
                score1.setText("");
        score2.setText("");
        score3.setText("");
        score4.setText("");
        score5.setText("");
        score6.setText("");
        score7.setText("");
        score8.setText("");
        score9.setText("");
        score10.setText("");
        score11.setText("");
        score12.setText("");
        team1gamesPlayed.setText("0");
        team2gamesPlayed.setText("0");
        team3gamesPlayed.setText("0");
        team4gamesPlayed.setText("0");
        team1gamesWon.setText("0");
        team2gamesWon.setText("0");
        team3gamesWon.setText("0");
        team4gamesWon.setText("0");
        team1gamesDrew.setText("0");
        team2gamesDrew.setText("0");
        team3gamesDrew.setText("0");
        team4gamesDrew.setText("0");
        team1gamesLost.setText("0");
        team2gamesLost.setText("0");
        team3gamesLost.setText("0");
        team4gamesLost.setText("0");
        team1points.setText("0");
        team2points.setText("0");
        team3points.setText("0");
        team4points.setText("0");
    }
    
    public void closeRefereesPanel(){
        ref1jPanel.setVisible(false);
        ref2jPanel.setVisible(false);
        ref3jPanel.setVisible(false);
        ref4jPanel.setVisible(false);
        ref5jPanel.setVisible(false);
        ref6jPanel.setVisible(false);
        ref7jPanel.setVisible(false);
        ref8jPanel.setVisible(false);
        ref9jPanel.setVisible(false);
        ref10jPanel.setVisible(false);
        ref11jPanel.setVisible(false);
        ref12jPanel.setVisible(false);
        ref13jPanel.setVisible(false);
        ref14jPanel.setVisible(false);
        ref15jPanel.setVisible(false);
        ref16jPanel.setVisible(false);
        ref17jPanel.setVisible(false);
        ref18jPanel.setVisible(false);
        ref19jPanel.setVisible(false);
        ref20jPanel.setVisible(false);
        ref21jPanel.setVisible(false);
        ref22jPanel.setVisible(false);
        ref23jPanel.setVisible(false);
        ref24jPanel.setVisible(false);
        ref25jPanel.setVisible(false);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel151 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fixturesBtn = new javax.swing.JButton();
        refereesBtn = new javax.swing.JButton();
        tablesBtn = new javax.swing.JButton();
        topScorersBtn = new javax.swing.JButton();
        oddsBtn = new javax.swing.JButton();
        mvpsBtn = new javax.swing.JButton();
        teamsBtn = new javax.swing.JButton();
        playersBtn = new javax.swing.JButton();
        stadiumsBtn = new javax.swing.JButton();
        brazilInfoBtn = new javax.swing.JButton();
        localAreaInfoBtn = new javax.swing.JButton();
        rtwcBtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        origPnl = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        fixturesPnl = new javax.swing.JPanel();
        groupAbtn = new javax.swing.JButton();
        groupBbtn = new javax.swing.JButton();
        groupCbtn = new javax.swing.JButton();
        groupDbtn = new javax.swing.JButton();
        groupEbtn = new javax.swing.JButton();
        groupFbtn = new javax.swing.JButton();
        groupGbtn = new javax.swing.JButton();
        groupHbtn = new javax.swing.JButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        groupApnl = new javax.swing.JPanel();
        grpAfixA1 = new javax.swing.JLabel();
        grpAfixB1 = new javax.swing.JLabel();
        grpAfixC1 = new javax.swing.JLabel();
        grpAfixD1 = new javax.swing.JLabel();
        grpAfixE1 = new javax.swing.JLabel();
        grpAfixF1 = new javax.swing.JLabel();
        grpAfixA2 = new javax.swing.JLabel();
        grpAfixB2 = new javax.swing.JLabel();
        grpAfixC2 = new javax.swing.JLabel();
        grpAfixD2 = new javax.swing.JLabel();
        grpAfixE2 = new javax.swing.JLabel();
        grpAfixF2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        groupBpnl = new javax.swing.JPanel();
        grpBfixA1 = new javax.swing.JLabel();
        grpBfixB1 = new javax.swing.JLabel();
        grpBfixC1 = new javax.swing.JLabel();
        grpBfixD1 = new javax.swing.JLabel();
        grpBfixE1 = new javax.swing.JLabel();
        grpBfixF1 = new javax.swing.JLabel();
        grpBfixA2 = new javax.swing.JLabel();
        grpBfixB2 = new javax.swing.JLabel();
        grpBfixC2 = new javax.swing.JLabel();
        grpBfixD2 = new javax.swing.JLabel();
        grpBfixE2 = new javax.swing.JLabel();
        grpBfixF2 = new javax.swing.JLabel();
        grpBVS1Lbl = new javax.swing.JLabel();
        grpBVS2Lbl = new javax.swing.JLabel();
        grpBVS3Lbl = new javax.swing.JLabel();
        grpBVS4Lbl = new javax.swing.JLabel();
        grpBVS5Lbl = new javax.swing.JLabel();
        grpBVS6Lbl = new javax.swing.JLabel();
        groupCpnl = new javax.swing.JPanel();
        grpCfixA1 = new javax.swing.JLabel();
        grpCfixB1 = new javax.swing.JLabel();
        grpCfixC1 = new javax.swing.JLabel();
        grpCfixD1 = new javax.swing.JLabel();
        grpCfixE1 = new javax.swing.JLabel();
        grpCfixF1 = new javax.swing.JLabel();
        grpCfixA2 = new javax.swing.JLabel();
        grpCfixB2 = new javax.swing.JLabel();
        grpCfixC2 = new javax.swing.JLabel();
        grpCfixD2 = new javax.swing.JLabel();
        grpCfixE2 = new javax.swing.JLabel();
        grpCfixF2 = new javax.swing.JLabel();
        grpCVS1Lbl = new javax.swing.JLabel();
        grpCVS2Lbl = new javax.swing.JLabel();
        grpCVS3Lbl = new javax.swing.JLabel();
        grpCVS4Lbl = new javax.swing.JLabel();
        grpCVS5Lbl = new javax.swing.JLabel();
        grpCVS6Lbl = new javax.swing.JLabel();
        groupDpnl = new javax.swing.JPanel();
        grpDfixA1 = new javax.swing.JLabel();
        grpDfixB1 = new javax.swing.JLabel();
        grpDfixC1 = new javax.swing.JLabel();
        grpDfixD1 = new javax.swing.JLabel();
        grpDfixE1 = new javax.swing.JLabel();
        grpDfixF1 = new javax.swing.JLabel();
        grpDfixA2 = new javax.swing.JLabel();
        grpDfixB2 = new javax.swing.JLabel();
        grpDfixC2 = new javax.swing.JLabel();
        grpDfixD2 = new javax.swing.JLabel();
        grpDfixE2 = new javax.swing.JLabel();
        grpDfixF2 = new javax.swing.JLabel();
        grpDVS1Lbl = new javax.swing.JLabel();
        grpDVS2Lbl = new javax.swing.JLabel();
        grpDVS3Lbl = new javax.swing.JLabel();
        grpDVS4Lbl = new javax.swing.JLabel();
        grpDVS5Lbl = new javax.swing.JLabel();
        grpDVS6Lbl = new javax.swing.JLabel();
        groupEpnl = new javax.swing.JPanel();
        grpEfixA1 = new javax.swing.JLabel();
        grpEfixB1 = new javax.swing.JLabel();
        grpEfixC1 = new javax.swing.JLabel();
        grpEfixD1 = new javax.swing.JLabel();
        grpEfixE1 = new javax.swing.JLabel();
        grpEfixF1 = new javax.swing.JLabel();
        grpEfixA2 = new javax.swing.JLabel();
        grpEfixB2 = new javax.swing.JLabel();
        grpEfixC2 = new javax.swing.JLabel();
        grpEfixD2 = new javax.swing.JLabel();
        grpEfixE2 = new javax.swing.JLabel();
        grpEfixF2 = new javax.swing.JLabel();
        grpEVS1Lbl = new javax.swing.JLabel();
        grpEVS2Lbl = new javax.swing.JLabel();
        grpEVS3Lbl = new javax.swing.JLabel();
        grpEVS4Lbl = new javax.swing.JLabel();
        grpEVS5Lbl = new javax.swing.JLabel();
        grpEVS6Lbl = new javax.swing.JLabel();
        groupFpnl = new javax.swing.JPanel();
        grpFfixA1 = new javax.swing.JLabel();
        grpFfixB1 = new javax.swing.JLabel();
        grpFfixC1 = new javax.swing.JLabel();
        grpFfixD1 = new javax.swing.JLabel();
        grpFfixE1 = new javax.swing.JLabel();
        grpFfixF1 = new javax.swing.JLabel();
        grpFfixA2 = new javax.swing.JLabel();
        grpFfixB2 = new javax.swing.JLabel();
        grpFfixC2 = new javax.swing.JLabel();
        grpFfixD2 = new javax.swing.JLabel();
        grpFfixE2 = new javax.swing.JLabel();
        grpFfixF2 = new javax.swing.JLabel();
        grpFVS1Lbl = new javax.swing.JLabel();
        grpFVS2Lbl = new javax.swing.JLabel();
        grpFVS3Lbl = new javax.swing.JLabel();
        grpFVS4Lbl = new javax.swing.JLabel();
        grpFVS5Lbl = new javax.swing.JLabel();
        grpFVS6Lbl = new javax.swing.JLabel();
        groupGpnl = new javax.swing.JPanel();
        grpGfixA1 = new javax.swing.JLabel();
        grpGfixB1 = new javax.swing.JLabel();
        grpGfixC1 = new javax.swing.JLabel();
        grpGfixD1 = new javax.swing.JLabel();
        grpGfixE1 = new javax.swing.JLabel();
        grpGfixF1 = new javax.swing.JLabel();
        grpGfixA2 = new javax.swing.JLabel();
        grpGfixB2 = new javax.swing.JLabel();
        grpGfixC2 = new javax.swing.JLabel();
        grpGfixD2 = new javax.swing.JLabel();
        grpGfixE2 = new javax.swing.JLabel();
        grpGfixF2 = new javax.swing.JLabel();
        grpGVS1Lbl = new javax.swing.JLabel();
        grpGVS2Lbl = new javax.swing.JLabel();
        grpGVS3Lbl = new javax.swing.JLabel();
        grpGVS4Lbl = new javax.swing.JLabel();
        grpGVS5Lbl = new javax.swing.JLabel();
        grpGVS6Lbl = new javax.swing.JLabel();
        groupHpnl = new javax.swing.JPanel();
        grpHfixA1 = new javax.swing.JLabel();
        grpHfixB1 = new javax.swing.JLabel();
        grpHfixC1 = new javax.swing.JLabel();
        grpHfixD1 = new javax.swing.JLabel();
        grpHfixE1 = new javax.swing.JLabel();
        grpHfixF1 = new javax.swing.JLabel();
        grpHfixA2 = new javax.swing.JLabel();
        grpHfixB2 = new javax.swing.JLabel();
        grpHfixC2 = new javax.swing.JLabel();
        grpHfixD2 = new javax.swing.JLabel();
        grpHfixE2 = new javax.swing.JLabel();
        grpHfixF2 = new javax.swing.JLabel();
        grpHVS1Lbl = new javax.swing.JLabel();
        grpHVS2Lbl = new javax.swing.JLabel();
        grpHVS3Lbl = new javax.swing.JLabel();
        grpHVS4Lbl = new javax.swing.JLabel();
        grpHVS5Lbl = new javax.swing.JLabel();
        grpHVS6Lbl = new javax.swing.JLabel();
        refereesPnl = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        refereesHeadingLbl = new javax.swing.JLabel();
        refereeTextLbl = new javax.swing.JLabel();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        ref1jPanel = new javax.swing.JPanel();
        ref1lbl = new javax.swing.JLabel();
        ref2jPanel = new javax.swing.JPanel();
        ref2lbl = new javax.swing.JLabel();
        ref3jPanel = new javax.swing.JPanel();
        ref3lbl = new javax.swing.JLabel();
        ref4jPanel = new javax.swing.JPanel();
        ref4lbl = new javax.swing.JLabel();
        ref5jPanel = new javax.swing.JPanel();
        ref6jPanel = new javax.swing.JPanel();
        ref7jPanel = new javax.swing.JPanel();
        ref8jPanel = new javax.swing.JPanel();
        ref9jPanel = new javax.swing.JPanel();
        ref10jPanel = new javax.swing.JPanel();
        ref11jPanel = new javax.swing.JPanel();
        ref12jPanel = new javax.swing.JPanel();
        ref13jPanel = new javax.swing.JPanel();
        ref14jPanel = new javax.swing.JPanel();
        ref15jPanel = new javax.swing.JPanel();
        ref16jPanel = new javax.swing.JPanel();
        ref17jPanel = new javax.swing.JPanel();
        ref18jPanel = new javax.swing.JPanel();
        ref19jPanel = new javax.swing.JPanel();
        ref20jPanel = new javax.swing.JPanel();
        ref21jPanel = new javax.swing.JPanel();
        ref22jPanel = new javax.swing.JPanel();
        ref23jPanel = new javax.swing.JPanel();
        ref24jPanel = new javax.swing.JPanel();
        ref25jPanel = new javax.swing.JPanel();
        tablesPnl = new javax.swing.JPanel();
        grpABtn = new javax.swing.JButton();
        grpBBtn = new javax.swing.JButton();
        grpCBtn = new javax.swing.JButton();
        grpDBtn = new javax.swing.JButton();
        grpEBtn = new javax.swing.JButton();
        grpFBtn = new javax.swing.JButton();
        grpGBtn = new javax.swing.JButton();
        grpHBtn = new javax.swing.JButton();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        tablesPanel = new javax.swing.JPanel();
        game1team1 = new javax.swing.JLabel();
        game1team2 = new javax.swing.JLabel();
        game2team1 = new javax.swing.JLabel();
        game2team2 = new javax.swing.JLabel();
        game3team1 = new javax.swing.JLabel();
        game3team2 = new javax.swing.JLabel();
        game4team1 = new javax.swing.JLabel();
        game4team2 = new javax.swing.JLabel();
        game5team1 = new javax.swing.JLabel();
        game5team2 = new javax.swing.JLabel();
        game6team1 = new javax.swing.JLabel();
        game6team2 = new javax.swing.JLabel();
        team1 = new javax.swing.JLabel();
        team2 = new javax.swing.JLabel();
        team3 = new javax.swing.JLabel();
        team4 = new javax.swing.JLabel();
        gamesPlayedHeading = new javax.swing.JLabel();
        gamesWonHeading = new javax.swing.JLabel();
        gamesDrewHeading = new javax.swing.JLabel();
        gamesLostHeading = new javax.swing.JLabel();
        pointsTotalHeading = new javax.swing.JLabel();
        grpAgame1Btn = new javax.swing.JButton();
        team1points = new javax.swing.JLabel();
        team1gamesPlayed = new javax.swing.JLabel();
        team1gamesWon = new javax.swing.JLabel();
        team1gamesDrew = new javax.swing.JLabel();
        team1gamesLost = new javax.swing.JLabel();
        team2points = new javax.swing.JLabel();
        team2gamesPlayed = new javax.swing.JLabel();
        team2gamesWon = new javax.swing.JLabel();
        team2gamesDrew = new javax.swing.JLabel();
        team2gamesLost = new javax.swing.JLabel();
        team3points = new javax.swing.JLabel();
        team3gamesPlayed = new javax.swing.JLabel();
        team3gamesWon = new javax.swing.JLabel();
        team3gamesDrew = new javax.swing.JLabel();
        team3gamesLost = new javax.swing.JLabel();
        team4points = new javax.swing.JLabel();
        team4gamesPlayed = new javax.swing.JLabel();
        team4gamesWon = new javax.swing.JLabel();
        team4gamesDrew = new javax.swing.JLabel();
        team4gamesLost = new javax.swing.JLabel();
        score1 = new javax.swing.JTextField();
        score2 = new javax.swing.JTextField();
        score3 = new javax.swing.JTextField();
        score4 = new javax.swing.JTextField();
        score5 = new javax.swing.JTextField();
        score6 = new javax.swing.JTextField();
        score7 = new javax.swing.JTextField();
        score8 = new javax.swing.JTextField();
        score9 = new javax.swing.JTextField();
        score10 = new javax.swing.JTextField();
        score11 = new javax.swing.JTextField();
        score12 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        grpBgrpPnl = new javax.swing.JPanel();
        grpCgrpPnl = new javax.swing.JPanel();
        grpDgrpPnl = new javax.swing.JPanel();
        grpEgrpPnl = new javax.swing.JPanel();
        grpFgrpPnl = new javax.swing.JPanel();
        grpGgrpPnl = new javax.swing.JPanel();
        grpHgrpPnl = new javax.swing.JPanel();
        topScorersPnl = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        oddsPnl = new javax.swing.JPanel();
        OddsOutrightBtn = new javax.swing.JButton();
        SemiOddsBtn = new javax.swing.JButton();
        QuarterOddsBtn = new javax.swing.JButton();
        FinalOddsBtn = new javax.swing.JButton();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        OutrightOddsPnl = new javax.swing.JPanel();
        grpAOutrightLbl = new javax.swing.JLabel();
        CroatiaOutrightLbl = new javax.swing.JLabel();
        MexicoOutrightLbl = new javax.swing.JLabel();
        CameroonOutrightLbl = new javax.swing.JLabel();
        EnglandOutrightLbl = new javax.swing.JLabel();
        BrazilOutrightLbl = new javax.swing.JLabel();
        grpBOutrightLbl = new javax.swing.JLabel();
        SpainOutrightLbl = new javax.swing.JLabel();
        NetherlandsOutrightLbl = new javax.swing.JLabel();
        grpEOutrightLbl = new javax.swing.JLabel();
        ChileOutrightLbl = new javax.swing.JLabel();
        AustraliaOutrightLbl = new javax.swing.JLabel();
        grpCOutrightLbl = new javax.swing.JLabel();
        ColombiaOutrightLbl = new javax.swing.JLabel();
        GreeceOutrightLbl = new javax.swing.JLabel();
        IvoryCoastOutrightLbl = new javax.swing.JLabel();
        JapanOutrightLbl = new javax.swing.JLabel();
        CostaRicaOutrightLbl = new javax.swing.JLabel();
        grpDOutrightLbl = new javax.swing.JLabel();
        UruguayOutrightLbl = new javax.swing.JLabel();
        ItalyOutrightLbl = new javax.swing.JLabel();
        grpFOutrightLbl = new javax.swing.JLabel();
        grpGOutrightLbl = new javax.swing.JLabel();
        grpHOutrightLbl = new javax.swing.JLabel();
        SwitzerlandOutrightLbl = new javax.swing.JLabel();
        EcuadorOutrightLbl = new javax.swing.JLabel();
        FranceOutrightLbl = new javax.swing.JLabel();
        HondurasOutrightLbl = new javax.swing.JLabel();
        ArgentinaOutrightLbl = new javax.swing.JLabel();
        BosniaOutrightLbl = new javax.swing.JLabel();
        IranOutrightLbl = new javax.swing.JLabel();
        NigeriaOutrightLbl = new javax.swing.JLabel();
        GermanyOutrightLbl = new javax.swing.JLabel();
        PortugalOutrightLbl = new javax.swing.JLabel();
        GhanaOutrightLbl = new javax.swing.JLabel();
        USAOutrightLbl = new javax.swing.JLabel();
        BelgiumOutrightLbl = new javax.swing.JLabel();
        AlgeriaOutrightLbl = new javax.swing.JLabel();
        RussiaOutrightLbl = new javax.swing.JLabel();
        SouthKoreaOutrightLbl = new javax.swing.JLabel();
        grpAOdds1Lbl = new javax.swing.JLabel();
        grpAOdds2Lbl = new javax.swing.JLabel();
        grpAOdds3Lbl = new javax.swing.JLabel();
        grpAOdds4Lbl = new javax.swing.JLabel();
        grpEOdds1Lbl = new javax.swing.JLabel();
        grpEOdds2Lbl = new javax.swing.JLabel();
        grpEOdds3Lbl = new javax.swing.JLabel();
        grpEOdds4Lbl = new javax.swing.JLabel();
        grpBOdds1Lbl = new javax.swing.JLabel();
        grpBOdds2Lbl = new javax.swing.JLabel();
        grpBOdds3Lbl = new javax.swing.JLabel();
        grpBOdds4Lbl = new javax.swing.JLabel();
        grpFOdds1Lbl = new javax.swing.JLabel();
        grpFOdds2Lbl = new javax.swing.JLabel();
        grpFOdds3Lbl = new javax.swing.JLabel();
        grpFOdds4Lbl = new javax.swing.JLabel();
        grpCOdds1Lbl = new javax.swing.JLabel();
        grpCOdds2Lbl = new javax.swing.JLabel();
        grpCOdds3Lbl = new javax.swing.JLabel();
        grpCOdds4Lbl = new javax.swing.JLabel();
        grpGOdds1Lbl = new javax.swing.JLabel();
        grpGOdds2Lbl = new javax.swing.JLabel();
        grpGOdds3Lbl = new javax.swing.JLabel();
        grpGOdds4Lbl = new javax.swing.JLabel();
        grpHOdds1Lbl = new javax.swing.JLabel();
        grpHOdds2Lbl = new javax.swing.JLabel();
        grpHOdds3Lbl = new javax.swing.JLabel();
        grpHOdds4Lbl = new javax.swing.JLabel();
        grpDOdds1Lbl = new javax.swing.JLabel();
        grpDOdds2Lbl = new javax.swing.JLabel();
        grpDOdds3Lbl = new javax.swing.JLabel();
        grpDOdds4Lbl = new javax.swing.JLabel();
        FinalOddsPnl = new javax.swing.JPanel();
        SemiOddsPnl = new javax.swing.JPanel();
        QuarterOddsPnl = new javax.swing.JPanel();
        mvpsPnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        teamsPnl = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        playersPnl = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        stadiumsPnl = new javax.swing.JPanel();
        stadium1lbl = new javax.swing.JLabel();
        stadium2lbl = new javax.swing.JLabel();
        stadium3lbl = new javax.swing.JLabel();
        stadium4lbl = new javax.swing.JLabel();
        stadium5lbl = new javax.swing.JLabel();
        stadium6lbl = new javax.swing.JLabel();
        stadium7lbl = new javax.swing.JLabel();
        stadium8lbl = new javax.swing.JLabel();
        stadium9lbl = new javax.swing.JLabel();
        stadium10lbl = new javax.swing.JLabel();
        stadium11lbl = new javax.swing.JLabel();
        stadium12lbl = new javax.swing.JLabel();
        stadium0lbl = new javax.swing.JLabel();
        city0lbl = new javax.swing.JLabel();
        city1lbl = new javax.swing.JLabel();
        city2lbl = new javax.swing.JLabel();
        city3lbl = new javax.swing.JLabel();
        city4lbl = new javax.swing.JLabel();
        city5lbl = new javax.swing.JLabel();
        city6lbl = new javax.swing.JLabel();
        city7lbl = new javax.swing.JLabel();
        city8lbl = new javax.swing.JLabel();
        city9lbl = new javax.swing.JLabel();
        city10lbl = new javax.swing.JLabel();
        city11lbl = new javax.swing.JLabel();
        city12lbl = new javax.swing.JLabel();
        cap0lbl = new javax.swing.JLabel();
        cap1lbl = new javax.swing.JLabel();
        cap2lbl = new javax.swing.JLabel();
        cap3lbl = new javax.swing.JLabel();
        cap4lbl = new javax.swing.JLabel();
        cap5lbl = new javax.swing.JLabel();
        cap6lbl = new javax.swing.JLabel();
        cap7lbl = new javax.swing.JLabel();
        cap8lbl = new javax.swing.JLabel();
        cap9lbl = new javax.swing.JLabel();
        cap10lbl = new javax.swing.JLabel();
        cap11lbl = new javax.swing.JLabel();
        cap12lbl = new javax.swing.JLabel();
        brazilInfoPnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        localAreaInfoPnl = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        rtwcPnl = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel151.setText("jLabel151");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setBackground(new java.awt.Color(0, 204, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/newpackage/Final.jpg"))); // NOI18N
        jLabel13.setText("jLabel13");

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setOpaque(false);

        fixturesBtn.setText("Fixtures");
        fixturesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        fixturesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixturesBtnActionPerformed(evt);
            }
        });

        refereesBtn.setBackground(new java.awt.Color(255, 255, 255));
        refereesBtn.setText("Referees");
        refereesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refereesBtnActionPerformed(evt);
            }
        });

        tablesBtn.setText("Tables");
        tablesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablesBtnActionPerformed(evt);
            }
        });

        topScorersBtn.setText("Top Scorers");
        topScorersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topScorersBtnActionPerformed(evt);
            }
        });

        oddsBtn.setText("Odds");
        oddsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oddsBtnActionPerformed(evt);
            }
        });

        mvpsBtn.setText("MVPs");
        mvpsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mvpsBtnActionPerformed(evt);
            }
        });

        teamsBtn.setText("Teams");
        teamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsBtnActionPerformed(evt);
            }
        });

        playersBtn.setText("Players");
        playersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playersBtnActionPerformed(evt);
            }
        });

        stadiumsBtn.setText("Stadiums");
        stadiumsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stadiumsBtnActionPerformed(evt);
            }
        });

        brazilInfoBtn.setText("Brazil Info");
        brazilInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brazilInfoBtnActionPerformed(evt);
            }
        });

        localAreaInfoBtn.setText("Local Area Info");
        localAreaInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localAreaInfoBtnActionPerformed(evt);
            }
        });

        rtwcBtn.setText("RTWC");
        rtwcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtwcBtnActionPerformed(evt);
            }
        });

        origPnl.setBackground(new java.awt.Color(255, 255, 255));
        origPnl.setOpaque(false);
        origPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel14.setText("blank");

        javax.swing.GroupLayout origPnlLayout = new javax.swing.GroupLayout(origPnl);
        origPnl.setLayout(origPnlLayout);
        origPnlLayout.setHorizontalGroup(
            origPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(origPnlLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        origPnlLayout.setVerticalGroup(
            origPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(origPnlLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
        );

        fixturesPnl.setBackground(new java.awt.Color(51, 204, 0));
        fixturesPnl.setOpaque(false);
        fixturesPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        groupAbtn.setText("Group A");
        groupAbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupAbtnActionPerformed(evt);
            }
        });

        groupBbtn.setText("Group B");
        groupBbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupBbtnActionPerformed(evt);
            }
        });

        groupCbtn.setText("Group C");
        groupCbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupCbtnActionPerformed(evt);
            }
        });

        groupDbtn.setText("Group D");
        groupDbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupDbtnActionPerformed(evt);
            }
        });

        groupEbtn.setText("Group E");
        groupEbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupEbtnActionPerformed(evt);
            }
        });

        groupFbtn.setText("Group F");
        groupFbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupFbtnActionPerformed(evt);
            }
        });

        groupGbtn.setText("Group G");
        groupGbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupGbtnActionPerformed(evt);
            }
        });

        groupHbtn.setText("Group H");
        groupHbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupHbtnActionPerformed(evt);
            }
        });

        groupApnl.setBackground(new java.awt.Color(255, 255, 255));

        grpAfixA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixA1.setText("jLabel1");

        grpAfixB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixB1.setText("jLabel86");

        grpAfixC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixC1.setText("jLabel87");

        grpAfixD1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixD1.setText("jLabel88");

        grpAfixE1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixE1.setText("jLabel89");

        grpAfixF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixF1.setText("jLabel90");

        grpAfixA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixA2.setText("jLabel91");

        grpAfixB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixB2.setText("jLabel92");

        grpAfixC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixC2.setText("jLabel93");

        grpAfixD2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixD2.setText("jLabel94");

        grpAfixE2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixE2.setText("jLabel95");

        grpAfixF2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpAfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAfixF2.setText("jLabel96");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("VS");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("VS");

        jLabel86.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(204, 0, 0));
        jLabel86.setText("VS");

        jLabel87.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(204, 0, 0));
        jLabel87.setText("VS");

        jLabel88.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(204, 0, 0));
        jLabel88.setText("VS");

        jLabel89.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(204, 0, 0));
        jLabel89.setText("VS");

        javax.swing.GroupLayout groupApnlLayout = new javax.swing.GroupLayout(groupApnl);
        groupApnl.setLayout(groupApnlLayout);
        groupApnlLayout.setHorizontalGroup(
            groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupApnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(groupApnlLayout.createSequentialGroup()
                        .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(grpAfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grpAfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(grpAfixF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(grpAfixC1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel86)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, groupApnlLayout.createSequentialGroup()
                                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel89)
                                    .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel88)))
                                .addGap(50, 50, 50)
                                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grpAfixF2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpAfixE2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpAfixD2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(groupApnlLayout.createSequentialGroup()
                        .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpAfixB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grpAfixA1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50)
                        .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpAfixC2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(grpAfixA2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addComponent(grpAfixB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(50, 50, 50))
        );
        groupApnlLayout.setVerticalGroup(
            groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupApnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpAfixA1)
                    .addComponent(grpAfixA2)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpAfixB1)
                    .addComponent(grpAfixB2)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpAfixC1)
                    .addComponent(grpAfixC2)
                    .addComponent(jLabel86))
                .addGap(25, 25, 25)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpAfixD1)
                    .addComponent(grpAfixD2)
                    .addComponent(jLabel87))
                .addGap(25, 25, 25)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpAfixE1)
                    .addComponent(grpAfixE2)
                    .addComponent(jLabel88))
                .addGap(25, 25, 25)
                .addGroup(groupApnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpAfixF1)
                    .addComponent(grpAfixF2)
                    .addComponent(jLabel89))
                .addGap(60, 60, 60))
        );

        groupBpnl.setBackground(new java.awt.Color(255, 255, 255));

        grpBfixA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixA1.setText("jLabel1");

        grpBfixB1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixB1.setText("jLabel86");

        grpBfixC1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixC1.setText("jLabel87");

        grpBfixD1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixD1.setText("jLabel88");

        grpBfixE1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixE1.setText("jLabel89");

        grpBfixF1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixF1.setText("jLabel90");

        grpBfixA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixA2.setText("jLabel91");

        grpBfixB2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixB2.setText("jLabel92");

        grpBfixC2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixC2.setText("jLabel93");

        grpBfixD2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixD2.setText("jLabel94");

        grpBfixE2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixE2.setText("jLabel95");

        grpBfixF2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        grpBfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpBfixF2.setText("jLabel96");

        grpBVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpBVS1Lbl.setText("VS");

        grpBVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpBVS2Lbl.setText("VS");

        grpBVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpBVS3Lbl.setText("VS");

        grpBVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpBVS4Lbl.setText("VS");

        grpBVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpBVS5Lbl.setText("VS");

        grpBVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpBVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupBpnlLayout = new javax.swing.GroupLayout(groupBpnl);
        groupBpnl.setLayout(groupBpnlLayout);
        groupBpnlLayout.setHorizontalGroup(
            groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupBpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(grpBfixB1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(grpBfixC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grpBfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grpBfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(grpBfixF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(grpBfixA1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groupBpnlLayout.createSequentialGroup()
                        .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpBVS2Lbl)
                            .addComponent(grpBVS3Lbl)
                            .addComponent(grpBVS4Lbl)
                            .addComponent(grpBVS5Lbl)
                            .addComponent(grpBVS6Lbl))
                        .addGap(50, 50, 50)
                        .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(grpBfixA2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(grpBfixB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(grpBfixC2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grpBfixD2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(grpBfixF2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(grpBfixE2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(grpBVS1Lbl))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        groupBpnlLayout.setVerticalGroup(
            groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupBpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpBfixA1)
                    .addComponent(grpBfixA2)
                    .addComponent(grpBVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpBfixB1)
                    .addComponent(grpBfixB2)
                    .addComponent(grpBVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpBfixC1)
                    .addComponent(grpBfixC2)
                    .addComponent(grpBVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpBfixD1)
                    .addComponent(grpBfixD2)
                    .addComponent(grpBVS4Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpBfixE1)
                    .addComponent(grpBfixE2)
                    .addComponent(grpBVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupBpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpBfixF1)
                    .addComponent(grpBfixF2)
                    .addComponent(grpBVS6Lbl))
                .addGap(60, 60, 60))
        );

        groupCpnl.setBackground(new java.awt.Color(255, 255, 255));
        groupCpnl.setPreferredSize(new java.awt.Dimension(640, 341));

        grpCfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixA1.setText("jLabel1");

        grpCfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixB1.setText("jLabel86");

        grpCfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixC1.setText("jLabel87");

        grpCfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixD1.setText("jLabel88");

        grpCfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixE1.setText("jLabel89");

        grpCfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixF1.setText("jLabel90");

        grpCfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixA2.setText("jLabel91");

        grpCfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixB2.setText("jLabel92");

        grpCfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixC2.setText("jLabel93");

        grpCfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixD2.setText("jLabel94");

        grpCfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixE2.setText("jLabel95");

        grpCfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpCfixF2.setText("jLabel96");

        grpCVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpCVS1Lbl.setText("VS");

        grpCVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpCVS2Lbl.setText("VS");

        grpCVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpCVS3Lbl.setText("VS");

        grpCVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpCVS4Lbl.setText("VS");

        grpCVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpCVS5Lbl.setText("VS");

        grpCVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpCVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupCpnlLayout = new javax.swing.GroupLayout(groupCpnl);
        groupCpnl.setLayout(groupCpnlLayout);
        groupCpnlLayout.setHorizontalGroup(
            groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupCpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grpCfixC1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(grpCfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpCfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpCfixF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpCfixA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpCfixB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(groupCpnlLayout.createSequentialGroup()
                        .addComponent(grpCVS6Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpCfixF2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addGroup(groupCpnlLayout.createSequentialGroup()
                        .addComponent(grpCVS5Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpCfixE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupCpnlLayout.createSequentialGroup()
                        .addComponent(grpCVS4Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpCfixD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupCpnlLayout.createSequentialGroup()
                        .addComponent(grpCVS3Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpCfixC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupCpnlLayout.createSequentialGroup()
                        .addComponent(grpCVS1Lbl)
                        .addGap(78, 78, 78)
                        .addComponent(grpCfixA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupCpnlLayout.createSequentialGroup()
                        .addComponent(grpCVS2Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpCfixB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        groupCpnlLayout.setVerticalGroup(
            groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupCpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCfixA1)
                    .addComponent(grpCfixA2)
                    .addComponent(grpCVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCfixB1)
                    .addComponent(grpCfixB2)
                    .addComponent(grpCVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCfixC1)
                    .addComponent(grpCfixC2)
                    .addComponent(grpCVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCfixD1)
                    .addComponent(grpCfixD2)
                    .addComponent(grpCVS4Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCfixE1)
                    .addComponent(grpCfixE2)
                    .addComponent(grpCVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupCpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCfixF1)
                    .addComponent(grpCfixF2)
                    .addComponent(grpCVS6Lbl))
                .addGap(60, 60, 60))
        );

        groupDpnl.setBackground(new java.awt.Color(255, 255, 255));
        groupDpnl.setPreferredSize(new java.awt.Dimension(640, 341));

        grpDfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixA1.setText("jLabel1");

        grpDfixB1.setText("jLabel86");

        grpDfixC1.setText("jLabel87");

        grpDfixD1.setText("jLabel88");

        grpDfixE1.setText("jLabel89");

        grpDfixF1.setText("jLabel90");

        grpDfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixA2.setText("jLabel91");

        grpDfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixB2.setText("jLabel92");

        grpDfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixC2.setText("jLabel93");

        grpDfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixD2.setText("jLabel94");

        grpDfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixE2.setText("jLabel95");

        grpDfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpDfixF2.setText("jLabel96");

        grpDVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpDVS1Lbl.setText("VS");

        grpDVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpDVS2Lbl.setText("VS");

        grpDVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpDVS3Lbl.setText("VS");

        grpDVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpDVS4Lbl.setText("VS");

        grpDVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpDVS5Lbl.setText("VS");

        grpDVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpDVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupDpnlLayout = new javax.swing.GroupLayout(groupDpnl);
        groupDpnl.setLayout(groupDpnlLayout);
        groupDpnlLayout.setHorizontalGroup(
            groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupDpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grpDfixF1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(grpDfixB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpDfixC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpDfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpDfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpDfixA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(groupDpnlLayout.createSequentialGroup()
                        .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpDVS6Lbl)
                            .addComponent(grpDVS5Lbl)
                            .addComponent(grpDVS4Lbl)
                            .addComponent(grpDVS3Lbl))
                        .addGap(80, 80, 80)
                        .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(groupDpnlLayout.createSequentialGroup()
                                .addComponent(grpDfixC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(groupDpnlLayout.createSequentialGroup()
                                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(grpDfixD2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(grpDfixE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(grpDfixF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(groupDpnlLayout.createSequentialGroup()
                        .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpDVS2Lbl)
                            .addComponent(grpDVS1Lbl))
                        .addGap(80, 80, 80)
                        .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grpDfixA2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(grpDfixB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        groupDpnlLayout.setVerticalGroup(
            groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupDpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDfixA1)
                    .addComponent(grpDfixA2)
                    .addComponent(grpDVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDfixB1)
                    .addComponent(grpDfixB2)
                    .addComponent(grpDVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDfixC1)
                    .addComponent(grpDfixC2)
                    .addComponent(grpDVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDfixD1)
                    .addComponent(grpDfixD2)
                    .addComponent(grpDVS4Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDfixE1)
                    .addComponent(grpDfixE2)
                    .addComponent(grpDVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupDpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDfixF1)
                    .addComponent(grpDfixF2)
                    .addComponent(grpDVS6Lbl))
                .addGap(60, 60, 60))
        );

        groupEpnl.setBackground(new java.awt.Color(255, 255, 255));
        groupEpnl.setPreferredSize(new java.awt.Dimension(640, 341));

        grpEfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixA1.setText("jLabel1");

        grpEfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixB1.setText("jLabel86");

        grpEfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixC1.setText("jLabel87");

        grpEfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixD1.setText("jLabel88");

        grpEfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixE1.setText("jLabel89");

        grpEfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixF1.setText("jLabel90");

        grpEfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixA2.setText("jLabel91");

        grpEfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixB2.setText("jLabel92");

        grpEfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixC2.setText("jLabel93");

        grpEfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixD2.setText("jLabel94");

        grpEfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixE2.setText("jLabel95");

        grpEfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpEfixF2.setText("jLabel96");

        grpEVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpEVS1Lbl.setText("VS");

        grpEVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpEVS2Lbl.setText("VS");

        grpEVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpEVS3Lbl.setText("VS");

        grpEVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpEVS4Lbl.setText("VS");

        grpEVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpEVS5Lbl.setText("VS");

        grpEVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpEVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupEpnlLayout = new javax.swing.GroupLayout(groupEpnl);
        groupEpnl.setLayout(groupEpnlLayout);
        groupEpnlLayout.setHorizontalGroup(
            groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupEpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grpEfixA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpEfixB1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(grpEfixC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpEfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpEfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpEfixF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(groupEpnlLayout.createSequentialGroup()
                        .addComponent(grpEVS2Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpEfixB2))
                    .addGroup(groupEpnlLayout.createSequentialGroup()
                        .addComponent(grpEVS6Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpEfixF2))
                    .addGroup(groupEpnlLayout.createSequentialGroup()
                        .addComponent(grpEVS5Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpEfixE2))
                    .addGroup(groupEpnlLayout.createSequentialGroup()
                        .addComponent(grpEVS4Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpEfixD2))
                    .addGroup(groupEpnlLayout.createSequentialGroup()
                        .addComponent(grpEVS3Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpEfixC2))
                    .addGroup(groupEpnlLayout.createSequentialGroup()
                        .addComponent(grpEVS1Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpEfixA2)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        groupEpnlLayout.setVerticalGroup(
            groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupEpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpEfixA1)
                    .addComponent(grpEfixA2)
                    .addComponent(grpEVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpEfixB1)
                    .addComponent(grpEfixB2)
                    .addComponent(grpEVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpEfixC1)
                    .addComponent(grpEfixC2)
                    .addComponent(grpEVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpEfixD1)
                    .addComponent(grpEfixD2)
                    .addComponent(grpEVS4Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpEfixE1)
                    .addComponent(grpEfixE2)
                    .addComponent(grpEVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupEpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpEfixF1)
                    .addComponent(grpEfixF2)
                    .addComponent(grpEVS6Lbl))
                .addGap(60, 60, 60))
        );

        groupFpnl.setBackground(new java.awt.Color(255, 255, 255));
        groupFpnl.setPreferredSize(new java.awt.Dimension(640, 341));

        grpFfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixA1.setText("jLabel1");

        grpFfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixB1.setText("jLabel86");

        grpFfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixC1.setText("jLabel87");

        grpFfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixD1.setText("jLabel88");

        grpFfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixE1.setText("jLabel89");

        grpFfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixF1.setText("jLabel90");

        grpFfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixA2.setText("jLabel91");

        grpFfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixB2.setText("jLabel92");

        grpFfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixC2.setText("jLabel93");

        grpFfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixD2.setText("jLabel94");

        grpFfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixE2.setText("jLabel95");

        grpFfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFfixF2.setText("jLabel96");

        grpFVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpFVS1Lbl.setText("VS");

        grpFVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpFVS2Lbl.setText("VS");

        grpFVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpFVS3Lbl.setText("VS");

        grpFVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpFVS4Lbl.setText("VS");

        grpFVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpFVS5Lbl.setText("VS");

        grpFVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpFVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupFpnlLayout = new javax.swing.GroupLayout(groupFpnl);
        groupFpnl.setLayout(groupFpnlLayout);
        groupFpnlLayout.setHorizontalGroup(
            groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupFpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grpFfixA1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(grpFfixB1)
                    .addComponent(grpFfixC1)
                    .addComponent(grpFfixD1)
                    .addComponent(grpFfixE1)
                    .addComponent(grpFfixF1))
                .addGap(80, 80, 80)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(groupFpnlLayout.createSequentialGroup()
                        .addComponent(grpFVS6Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpFfixF2))
                    .addGroup(groupFpnlLayout.createSequentialGroup()
                        .addComponent(grpFVS5Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpFfixE2))
                    .addGroup(groupFpnlLayout.createSequentialGroup()
                        .addComponent(grpFVS4Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpFfixD2))
                    .addGroup(groupFpnlLayout.createSequentialGroup()
                        .addComponent(grpFVS3Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpFfixC2))
                    .addGroup(groupFpnlLayout.createSequentialGroup()
                        .addComponent(grpFVS2Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpFfixB2))
                    .addGroup(groupFpnlLayout.createSequentialGroup()
                        .addComponent(grpFVS1Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpFfixA2)))
                .addGap(162, 162, 162))
        );
        groupFpnlLayout.setVerticalGroup(
            groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupFpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpFfixA1)
                    .addComponent(grpFfixA2)
                    .addComponent(grpFVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpFfixB1)
                    .addComponent(grpFfixB2)
                    .addComponent(grpFVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpFfixC1)
                    .addComponent(grpFfixC2)
                    .addComponent(grpFVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpFfixD1)
                    .addComponent(grpFfixD2)
                    .addComponent(grpFVS4Lbl))
                .addGap(24, 24, 24)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpFfixE1)
                    .addComponent(grpFfixE2)
                    .addComponent(grpFVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupFpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpFfixF1)
                    .addComponent(grpFfixF2)
                    .addComponent(grpFVS6Lbl))
                .addGap(60, 60, 60))
        );

        groupGpnl.setBackground(new java.awt.Color(255, 255, 255));
        groupGpnl.setPreferredSize(new java.awt.Dimension(640, 341));

        grpGfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixA1.setText("jLabel1");

        grpGfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixB1.setText("jLabel86");

        grpGfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixC1.setText("jLabel87");

        grpGfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixD1.setText("jLabel88");

        grpGfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixE1.setText("jLabel89");

        grpGfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixF1.setText("jLabel90");

        grpGfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixA2.setText("jLabel91");

        grpGfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixB2.setText("jLabel92");

        grpGfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixC2.setText("jLabel93");

        grpGfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixD2.setText("jLabel94");

        grpGfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixE2.setText("jLabel95");

        grpGfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpGfixF2.setText("jLabel96");

        grpGVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpGVS1Lbl.setText("VS");

        grpGVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpGVS2Lbl.setText("VS");

        grpGVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpGVS3Lbl.setText("VS");

        grpGVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpGVS4Lbl.setText("VS");

        grpGVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpGVS5Lbl.setText("VS");

        grpGVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpGVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupGpnlLayout = new javax.swing.GroupLayout(groupGpnl);
        groupGpnl.setLayout(groupGpnlLayout);
        groupGpnlLayout.setHorizontalGroup(
            groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupGpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(groupGpnlLayout.createSequentialGroup()
                        .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grpGfixC1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(grpGfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grpGfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(grpGfixA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(80, 80, 80)
                        .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpGVS1Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grpGVS3Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grpGVS4Lbl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grpGVS5Lbl, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(groupGpnlLayout.createSequentialGroup()
                        .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grpGfixB1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grpGfixF1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpGVS6Lbl)
                            .addComponent(grpGVS2Lbl))))
                .addGap(80, 80, 80)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, groupGpnlLayout.createSequentialGroup()
                        .addComponent(grpGfixA2)
                        .addGap(162, 162, 162))
                    .addGroup(groupGpnlLayout.createSequentialGroup()
                        .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpGfixB2)
                            .addComponent(grpGfixC2)
                            .addComponent(grpGfixD2)
                            .addComponent(grpGfixE2)
                            .addComponent(grpGfixF2))
                        .addContainerGap())))
        );
        groupGpnlLayout.setVerticalGroup(
            groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupGpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGfixA2)
                    .addComponent(grpGfixA1)
                    .addComponent(grpGVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGfixB2)
                    .addComponent(grpGfixB1)
                    .addComponent(grpGVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGfixC1)
                    .addComponent(grpGfixC2)
                    .addComponent(grpGVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGfixD1)
                    .addComponent(grpGfixD2)
                    .addComponent(grpGVS4Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGfixE1)
                    .addComponent(grpGfixE2)
                    .addComponent(grpGVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupGpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGfixF1)
                    .addComponent(grpGfixF2)
                    .addComponent(grpGVS6Lbl))
                .addGap(60, 60, 60))
        );

        groupHpnl.setBackground(new java.awt.Color(255, 255, 255));
        groupHpnl.setPreferredSize(new java.awt.Dimension(640, 341));

        grpHfixA1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixA1.setText("jLabel1");

        grpHfixB1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixB1.setText("jLabel86");

        grpHfixC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixC1.setText("jLabel87");

        grpHfixD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixD1.setText("jLabel88");

        grpHfixE1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixE1.setText("jLabel89");

        grpHfixF1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixF1.setText("jLabel90");

        grpHfixA2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixA2.setText("jLabel91");

        grpHfixB2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixB2.setText("jLabel92");

        grpHfixC2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixC2.setText("jLabel93");

        grpHfixD2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixD2.setText("jLabel94");

        grpHfixE2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixE2.setText("jLabel95");

        grpHfixF2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpHfixF2.setText("jLabel96");

        grpHVS1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHVS1Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpHVS1Lbl.setText("VS");

        grpHVS2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHVS2Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpHVS2Lbl.setText("VS");

        grpHVS3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHVS3Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpHVS3Lbl.setText("VS");

        grpHVS4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHVS4Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpHVS4Lbl.setText("VS");

        grpHVS5Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHVS5Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpHVS5Lbl.setText("VS");

        grpHVS6Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHVS6Lbl.setForeground(new java.awt.Color(204, 0, 0));
        grpHVS6Lbl.setText("VS");

        javax.swing.GroupLayout groupHpnlLayout = new javax.swing.GroupLayout(groupHpnl);
        groupHpnl.setLayout(groupHpnlLayout);
        groupHpnlLayout.setHorizontalGroup(
            groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupHpnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(grpHfixA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpHfixB1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(grpHfixC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpHfixD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpHfixE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grpHfixF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(groupHpnlLayout.createSequentialGroup()
                        .addComponent(grpHVS6Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpHfixF2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupHpnlLayout.createSequentialGroup()
                        .addComponent(grpHVS5Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpHfixE2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupHpnlLayout.createSequentialGroup()
                        .addComponent(grpHVS4Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpHfixD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupHpnlLayout.createSequentialGroup()
                        .addComponent(grpHVS3Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpHfixC2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupHpnlLayout.createSequentialGroup()
                        .addComponent(grpHVS2Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpHfixB2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(groupHpnlLayout.createSequentialGroup()
                        .addComponent(grpHVS1Lbl)
                        .addGap(80, 80, 80)
                        .addComponent(grpHfixA2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        groupHpnlLayout.setVerticalGroup(
            groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(groupHpnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHfixA1)
                    .addComponent(grpHfixA2)
                    .addComponent(grpHVS1Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHfixB1)
                    .addComponent(grpHfixB2)
                    .addComponent(grpHVS2Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHfixC1)
                    .addComponent(grpHfixC2)
                    .addComponent(grpHVS3Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHfixD1)
                    .addComponent(grpHfixD2)
                    .addComponent(grpHVS4Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHfixE1)
                    .addComponent(grpHfixE2)
                    .addComponent(grpHVS5Lbl))
                .addGap(25, 25, 25)
                .addGroup(groupHpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHfixF1)
                    .addComponent(grpHfixF2)
                    .addComponent(grpHVS6Lbl))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupApnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupBpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupCpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupDpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupEpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupFpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupGpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(groupHpnl, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupApnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupBpnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupCpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupDpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupEpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupFpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupGpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(groupHpnl, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
        );
        jLayeredPane2.setLayer(groupApnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupBpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupCpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupDpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupEpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupFpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupGpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(groupHpnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout fixturesPnlLayout = new javax.swing.GroupLayout(fixturesPnl);
        fixturesPnl.setLayout(fixturesPnlLayout);
        fixturesPnlLayout.setHorizontalGroup(
            fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fixturesPnlLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(groupEbtn)
                    .addComponent(groupAbtn))
                .addGap(39, 39, 39)
                .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupBbtn)
                    .addComponent(groupFbtn))
                .addGap(38, 38, 38)
                .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupCbtn)
                    .addComponent(groupGbtn))
                .addGap(38, 38, 38)
                .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupHbtn)
                    .addComponent(groupDbtn))
                .addContainerGap(317, Short.MAX_VALUE))
            .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fixturesPnlLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        fixturesPnlLayout.setVerticalGroup(
            fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fixturesPnlLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupAbtn)
                    .addComponent(groupBbtn)
                    .addComponent(groupCbtn)
                    .addComponent(groupDbtn))
                .addGap(32, 32, 32)
                .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groupEbtn)
                    .addComponent(groupFbtn)
                    .addComponent(groupGbtn)
                    .addComponent(groupHbtn))
                .addContainerGap(409, Short.MAX_VALUE))
            .addGroup(fixturesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fixturesPnlLayout.createSequentialGroup()
                    .addContainerGap(245, Short.MAX_VALUE)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        refereesPnl.setBackground(new java.awt.Color(255, 255, 255));
        refereesPnl.setOpaque(false);
        refereesPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ravshan Irmatov", "Yuichi Nishimura ", "Nawaf Shukralla", "Ben Williams", "Noumandiez Doué ", "Bakary Gassama ", "Djamel Haimoudi", "Joel Aguila", "Mark Geiger ", "Marco Rodríguez ", "Néstor Pitana", "Sandro Ricci ", "Enrique Osses ", "Wilmar Roldán", "Carlos Vera", "Peter O'Leary ", "Felix Brych", "Cüneyt Çakır ", "Jonas Eriksson", "Björn Kuipers", "Milorad Mažić", "Pedro Proença ", "Nicola Rizzoli", "Carlos Velasco Carballo", "Howard Webb" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        refereesHeadingLbl.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        refereesHeadingLbl.setText("Referees for World Cup 2014");

        refereeTextLbl.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        refereeTextLbl.setText("Please select a referee:");

        ref1jPanel.setOpaque(false);

        ref1lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/ravshan irmatov (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout ref1jPanelLayout = new javax.swing.GroupLayout(ref1jPanel);
        ref1jPanel.setLayout(ref1jPanelLayout);
        ref1jPanelLayout.setHorizontalGroup(
            ref1jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref1lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        ref1jPanelLayout.setVerticalGroup(
            ref1jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        ref2jPanel.setOpaque(false);

        ref2lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/yuichi nishimura (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout ref2jPanelLayout = new javax.swing.GroupLayout(ref2jPanel);
        ref2jPanel.setLayout(ref2jPanelLayout);
        ref2jPanelLayout.setHorizontalGroup(
            ref2jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref2lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        ref2jPanelLayout.setVerticalGroup(
            ref2jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        ref3jPanel.setOpaque(false);

        ref3lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/nawaf shukralla (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout ref3jPanelLayout = new javax.swing.GroupLayout(ref3jPanel);
        ref3jPanel.setLayout(ref3jPanelLayout);
        ref3jPanelLayout.setHorizontalGroup(
            ref3jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref3lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        ref3jPanelLayout.setVerticalGroup(
            ref3jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        ref4jPanel.setOpaque(false);

        ref4lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/ben williams (Custom).jpg"))); // NOI18N

        javax.swing.GroupLayout ref4jPanelLayout = new javax.swing.GroupLayout(ref4jPanel);
        ref4jPanel.setLayout(ref4jPanelLayout);
        ref4jPanelLayout.setHorizontalGroup(
            ref4jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref4lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
        );
        ref4jPanelLayout.setVerticalGroup(
            ref4jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ref4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref5jPanelLayout = new javax.swing.GroupLayout(ref5jPanel);
        ref5jPanel.setLayout(ref5jPanelLayout);
        ref5jPanelLayout.setHorizontalGroup(
            ref5jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref5jPanelLayout.setVerticalGroup(
            ref5jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref6jPanelLayout = new javax.swing.GroupLayout(ref6jPanel);
        ref6jPanel.setLayout(ref6jPanelLayout);
        ref6jPanelLayout.setHorizontalGroup(
            ref6jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref6jPanelLayout.setVerticalGroup(
            ref6jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref7jPanelLayout = new javax.swing.GroupLayout(ref7jPanel);
        ref7jPanel.setLayout(ref7jPanelLayout);
        ref7jPanelLayout.setHorizontalGroup(
            ref7jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref7jPanelLayout.setVerticalGroup(
            ref7jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref8jPanelLayout = new javax.swing.GroupLayout(ref8jPanel);
        ref8jPanel.setLayout(ref8jPanelLayout);
        ref8jPanelLayout.setHorizontalGroup(
            ref8jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref8jPanelLayout.setVerticalGroup(
            ref8jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref9jPanelLayout = new javax.swing.GroupLayout(ref9jPanel);
        ref9jPanel.setLayout(ref9jPanelLayout);
        ref9jPanelLayout.setHorizontalGroup(
            ref9jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref9jPanelLayout.setVerticalGroup(
            ref9jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref10jPanelLayout = new javax.swing.GroupLayout(ref10jPanel);
        ref10jPanel.setLayout(ref10jPanelLayout);
        ref10jPanelLayout.setHorizontalGroup(
            ref10jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref10jPanelLayout.setVerticalGroup(
            ref10jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref11jPanelLayout = new javax.swing.GroupLayout(ref11jPanel);
        ref11jPanel.setLayout(ref11jPanelLayout);
        ref11jPanelLayout.setHorizontalGroup(
            ref11jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref11jPanelLayout.setVerticalGroup(
            ref11jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref12jPanelLayout = new javax.swing.GroupLayout(ref12jPanel);
        ref12jPanel.setLayout(ref12jPanelLayout);
        ref12jPanelLayout.setHorizontalGroup(
            ref12jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref12jPanelLayout.setVerticalGroup(
            ref12jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref13jPanelLayout = new javax.swing.GroupLayout(ref13jPanel);
        ref13jPanel.setLayout(ref13jPanelLayout);
        ref13jPanelLayout.setHorizontalGroup(
            ref13jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref13jPanelLayout.setVerticalGroup(
            ref13jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref14jPanelLayout = new javax.swing.GroupLayout(ref14jPanel);
        ref14jPanel.setLayout(ref14jPanelLayout);
        ref14jPanelLayout.setHorizontalGroup(
            ref14jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref14jPanelLayout.setVerticalGroup(
            ref14jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref15jPanelLayout = new javax.swing.GroupLayout(ref15jPanel);
        ref15jPanel.setLayout(ref15jPanelLayout);
        ref15jPanelLayout.setHorizontalGroup(
            ref15jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref15jPanelLayout.setVerticalGroup(
            ref15jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref16jPanelLayout = new javax.swing.GroupLayout(ref16jPanel);
        ref16jPanel.setLayout(ref16jPanelLayout);
        ref16jPanelLayout.setHorizontalGroup(
            ref16jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref16jPanelLayout.setVerticalGroup(
            ref16jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref17jPanelLayout = new javax.swing.GroupLayout(ref17jPanel);
        ref17jPanel.setLayout(ref17jPanelLayout);
        ref17jPanelLayout.setHorizontalGroup(
            ref17jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref17jPanelLayout.setVerticalGroup(
            ref17jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref18jPanelLayout = new javax.swing.GroupLayout(ref18jPanel);
        ref18jPanel.setLayout(ref18jPanelLayout);
        ref18jPanelLayout.setHorizontalGroup(
            ref18jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref18jPanelLayout.setVerticalGroup(
            ref18jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref19jPanelLayout = new javax.swing.GroupLayout(ref19jPanel);
        ref19jPanel.setLayout(ref19jPanelLayout);
        ref19jPanelLayout.setHorizontalGroup(
            ref19jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref19jPanelLayout.setVerticalGroup(
            ref19jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref20jPanelLayout = new javax.swing.GroupLayout(ref20jPanel);
        ref20jPanel.setLayout(ref20jPanelLayout);
        ref20jPanelLayout.setHorizontalGroup(
            ref20jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref20jPanelLayout.setVerticalGroup(
            ref20jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref21jPanelLayout = new javax.swing.GroupLayout(ref21jPanel);
        ref21jPanel.setLayout(ref21jPanelLayout);
        ref21jPanelLayout.setHorizontalGroup(
            ref21jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref21jPanelLayout.setVerticalGroup(
            ref21jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref22jPanelLayout = new javax.swing.GroupLayout(ref22jPanel);
        ref22jPanel.setLayout(ref22jPanelLayout);
        ref22jPanelLayout.setHorizontalGroup(
            ref22jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref22jPanelLayout.setVerticalGroup(
            ref22jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref23jPanelLayout = new javax.swing.GroupLayout(ref23jPanel);
        ref23jPanel.setLayout(ref23jPanelLayout);
        ref23jPanelLayout.setHorizontalGroup(
            ref23jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref23jPanelLayout.setVerticalGroup(
            ref23jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref24jPanelLayout = new javax.swing.GroupLayout(ref24jPanel);
        ref24jPanel.setLayout(ref24jPanelLayout);
        ref24jPanelLayout.setHorizontalGroup(
            ref24jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref24jPanelLayout.setVerticalGroup(
            ref24jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ref25jPanelLayout = new javax.swing.GroupLayout(ref25jPanel);
        ref25jPanel.setLayout(ref25jPanelLayout);
        ref25jPanelLayout.setHorizontalGroup(
            ref25jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
        );
        ref25jPanelLayout.setVerticalGroup(
            ref25jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane5Layout = new javax.swing.GroupLayout(jLayeredPane5);
        jLayeredPane5.setLayout(jLayeredPane5Layout);
        jLayeredPane5Layout.setHorizontalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref1jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref2jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref3jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref4jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref5jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref6jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref7jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref8jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref9jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref10jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref11jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref12jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref13jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref14jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref15jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref16jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref17jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref18jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref19jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref20jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref21jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref22jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref23jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref24jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref25jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane5Layout.setVerticalGroup(
            jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref1jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref2jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref3jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ref4jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref5jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref6jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref7jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref8jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref9jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref10jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref11jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref12jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref13jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref14jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref15jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref16jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref17jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref18jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref19jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref20jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref21jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref22jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref23jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref24jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ref25jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane5.setLayer(ref1jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref2jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref3jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref4jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref5jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref6jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref7jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref8jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref9jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref10jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref11jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref12jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref13jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref14jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref15jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref16jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref17jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref18jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref19jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref20jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref21jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref22jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref23jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref24jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane5.setLayer(ref25jPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout refereesPnlLayout = new javax.swing.GroupLayout(refereesPnl);
        refereesPnl.setLayout(refereesPnlLayout);
        refereesPnlLayout.setHorizontalGroup(
            refereesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refereesPnlLayout.createSequentialGroup()
                .addGroup(refereesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(refereesPnlLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(refereesHeadingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(refereesPnlLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(refereesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(refereesPnlLayout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(refereeTextLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        refereesPnlLayout.setVerticalGroup(
            refereesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(refereesPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(refereesHeadingLbl)
                .addGap(105, 105, 105)
                .addComponent(refereeTextLbl)
                .addGap(35, 35, 35)
                .addGroup(refereesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tablesPnl.setBackground(new java.awt.Color(255, 255, 255));
        tablesPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        grpABtn.setText("Group A");
        grpABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpABtnActionPerformed(evt);
            }
        });

        grpBBtn.setText("Group B");
        grpBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpBBtnActionPerformed(evt);
            }
        });

        grpCBtn.setText("Group C");
        grpCBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpCBtnActionPerformed(evt);
            }
        });

        grpDBtn.setText("Group D");
        grpDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpDBtnActionPerformed(evt);
            }
        });

        grpEBtn.setText("Group E");
        grpEBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpEBtnActionPerformed(evt);
            }
        });

        grpFBtn.setText("Group F");
        grpFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpFBtnActionPerformed(evt);
            }
        });

        grpGBtn.setText("Group G");
        grpGBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpGBtnActionPerformed(evt);
            }
        });

        grpHBtn.setText("Group H");
        grpHBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpHBtnActionPerformed(evt);
            }
        });

        game1team1.setText("jLabel4");

        game1team2.setText("jLabel90");

        game2team1.setText("jLabel91");

        game2team2.setText("jLabel92");

        game3team1.setText("jLabel93");

        game3team2.setText("jLabel94");

        game4team1.setText("jLabel95");

        game4team2.setText("jLabel96");

        game5team1.setText("jLabel97");

        game5team2.setText("jLabel98");

        game6team1.setText("jLabel99");

        game6team2.setText("jLabel100");

        team1.setText("jLabel101");

        team2.setText("jLabel102");

        team3.setText("jLabel103");

        team4.setText("jLabel104");

        gamesPlayedHeading.setText("P");

        gamesWonHeading.setText("W");

        gamesDrewHeading.setText("D");

        gamesLostHeading.setText("L");

        pointsTotalHeading.setText("Pts");

        grpAgame1Btn.setText("Update");
        grpAgame1Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grpAgame1BtnActionPerformed(evt);
            }
        });

        team1points.setText("0");

        team1gamesPlayed.setText("0");

        team1gamesWon.setText("0");

        team1gamesDrew.setText("0");

        team1gamesLost.setText("0");

        team2points.setText("0");

        team2gamesPlayed.setText("0");

        team2gamesWon.setText("0");

        team2gamesDrew.setText("0");

        team2gamesLost.setText("0");

        team3points.setText("0");

        team3gamesPlayed.setText("0");

        team3gamesWon.setText("0");

        team3gamesDrew.setText("0");

        team3gamesLost.setText("0");

        team4points.setText("0");

        team4gamesPlayed.setText("0");

        team4gamesWon.setText("0");

        team4gamesDrew.setText("0");

        team4gamesLost.setText("0");

        score1.setText("0");
        score1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score1ActionPerformed(evt);
            }
        });

        score2.setText("0");

        score3.setText("0");
        score3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score3ActionPerformed(evt);
            }
        });

        score4.setText("0");
        score4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score4ActionPerformed(evt);
            }
        });

        score5.setText("0");
        score5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score5ActionPerformed(evt);
            }
        });

        score6.setText("0");
        score6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score6ActionPerformed(evt);
            }
        });

        score7.setText("0");
        score7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score7ActionPerformed(evt);
            }
        });

        score8.setText("0");
        score8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score8ActionPerformed(evt);
            }
        });

        score9.setText("0");
        score9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score9ActionPerformed(evt);
            }
        });

        score10.setText("0");
        score10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score10ActionPerformed(evt);
            }
        });

        score11.setText("0");
        score11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score11ActionPerformed(evt);
            }
        });

        score12.setText("0");
        score12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                score12ActionPerformed(evt);
            }
        });

        jLabel4.setText("Please fill in all scores and click here to update the table:");

        javax.swing.GroupLayout tablesPanelLayout = new javax.swing.GroupLayout(tablesPanel);
        tablesPanel.setLayout(tablesPanelLayout);
        tablesPanelLayout.setHorizontalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tablesPanelLayout.createSequentialGroup()
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(team1)
                                    .addComponent(team2)
                                    .addComponent(team3)
                                    .addComponent(team4))
                                .addGap(119, 119, 119)
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tablesPanelLayout.createSequentialGroup()
                                            .addComponent(team1gamesPlayed)
                                            .addGap(18, 18, 18)
                                            .addComponent(team1gamesWon)
                                            .addGap(18, 18, 18)
                                            .addComponent(team1gamesDrew))
                                        .addGroup(tablesPanelLayout.createSequentialGroup()
                                            .addComponent(gamesPlayedHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(gamesWonHeading)
                                            .addGap(18, 18, 18)
                                            .addComponent(gamesDrewHeading)
                                            .addGap(22, 22, 22)))
                                    .addGroup(tablesPanelLayout.createSequentialGroup()
                                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(tablesPanelLayout.createSequentialGroup()
                                                .addComponent(team2gamesPlayed)
                                                .addGap(18, 18, 18)
                                                .addComponent(team2gamesWon)
                                                .addGap(18, 18, 18)
                                                .addComponent(team2gamesDrew))
                                            .addGroup(tablesPanelLayout.createSequentialGroup()
                                                .addComponent(team3gamesPlayed)
                                                .addGap(18, 18, 18)
                                                .addComponent(team3gamesWon)
                                                .addGap(18, 18, 18)
                                                .addComponent(team3gamesDrew))
                                            .addGroup(tablesPanelLayout.createSequentialGroup()
                                                .addComponent(team4gamesPlayed)
                                                .addGap(18, 18, 18)
                                                .addComponent(team4gamesWon)
                                                .addGap(18, 18, 18)
                                                .addComponent(team4gamesDrew)))
                                        .addGap(18, 18, 18)))
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(tablesPanelLayout.createSequentialGroup()
                                        .addComponent(team4gamesLost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(team4points))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablesPanelLayout.createSequentialGroup()
                                        .addComponent(team3gamesLost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(team3points))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablesPanelLayout.createSequentialGroup()
                                        .addComponent(team2gamesLost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(team2points))
                                    .addGroup(tablesPanelLayout.createSequentialGroup()
                                        .addComponent(team1gamesLost)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(team1points))
                                    .addGroup(tablesPanelLayout.createSequentialGroup()
                                        .addComponent(gamesLostHeading)
                                        .addGap(70, 70, 70)
                                        .addComponent(pointsTotalHeading))))
                            .addGroup(tablesPanelLayout.createSequentialGroup()
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(game6team1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(game1team1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game2team1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game3team1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game4team1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game5team1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(63, 63, 63)
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(score5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(score7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(score9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(score11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(150, 150, 150)
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(score4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(score6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(score8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(score10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(score12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(game1team2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(game2team2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game3team2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game4team2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game5team2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(game6team2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))))
                    .addGroup(tablesPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(grpAgame1Btn)))
                .addGap(17, 17, 17))
        );
        tablesPanelLayout.setVerticalGroup(
            tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(game1team1)
                    .addComponent(score1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game1team2))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(game2team1)
                    .addComponent(game2team2)
                    .addComponent(score3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(game3team1)
                    .addComponent(game3team2)
                    .addComponent(score5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(game4team1)
                    .addComponent(game4team2)
                    .addComponent(score7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(score8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(game5team1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(score10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(score9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(game5team2))))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(score11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(game6team1))
                    .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(score12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(game6team2)))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(grpAgame1Btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gamesPlayedHeading)
                    .addComponent(gamesWonHeading)
                    .addComponent(gamesDrewHeading)
                    .addComponent(gamesLostHeading)
                    .addComponent(pointsTotalHeading))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team1points)
                    .addComponent(team1gamesPlayed)
                    .addComponent(team1gamesWon)
                    .addComponent(team1gamesDrew)
                    .addComponent(team1gamesLost)
                    .addComponent(team1))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team2)
                    .addComponent(team2points)
                    .addComponent(team2gamesPlayed)
                    .addComponent(team2gamesWon)
                    .addComponent(team2gamesDrew)
                    .addComponent(team2gamesLost))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team3)
                    .addComponent(team3points)
                    .addComponent(team3gamesPlayed)
                    .addComponent(team3gamesWon)
                    .addComponent(team3gamesDrew)
                    .addComponent(team3gamesLost))
                .addGap(18, 18, 18)
                .addGroup(tablesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(team4)
                    .addComponent(team4points)
                    .addComponent(team4gamesPlayed)
                    .addComponent(team4gamesWon)
                    .addComponent(team4gamesDrew)
                    .addComponent(team4gamesLost))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout grpBgrpPnlLayout = new javax.swing.GroupLayout(grpBgrpPnl);
        grpBgrpPnl.setLayout(grpBgrpPnlLayout);
        grpBgrpPnlLayout.setHorizontalGroup(
            grpBgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );
        grpBgrpPnlLayout.setVerticalGroup(
            grpBgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grpCgrpPnlLayout = new javax.swing.GroupLayout(grpCgrpPnl);
        grpCgrpPnl.setLayout(grpCgrpPnlLayout);
        grpCgrpPnlLayout.setHorizontalGroup(
            grpCgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        grpCgrpPnlLayout.setVerticalGroup(
            grpCgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grpDgrpPnlLayout = new javax.swing.GroupLayout(grpDgrpPnl);
        grpDgrpPnl.setLayout(grpDgrpPnlLayout);
        grpDgrpPnlLayout.setHorizontalGroup(
            grpDgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        grpDgrpPnlLayout.setVerticalGroup(
            grpDgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grpEgrpPnlLayout = new javax.swing.GroupLayout(grpEgrpPnl);
        grpEgrpPnl.setLayout(grpEgrpPnlLayout);
        grpEgrpPnlLayout.setHorizontalGroup(
            grpEgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        grpEgrpPnlLayout.setVerticalGroup(
            grpEgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grpFgrpPnlLayout = new javax.swing.GroupLayout(grpFgrpPnl);
        grpFgrpPnl.setLayout(grpFgrpPnlLayout);
        grpFgrpPnlLayout.setHorizontalGroup(
            grpFgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        grpFgrpPnlLayout.setVerticalGroup(
            grpFgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grpGgrpPnlLayout = new javax.swing.GroupLayout(grpGgrpPnl);
        grpGgrpPnl.setLayout(grpGgrpPnlLayout);
        grpGgrpPnlLayout.setHorizontalGroup(
            grpGgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        grpGgrpPnlLayout.setVerticalGroup(
            grpGgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout grpHgrpPnlLayout = new javax.swing.GroupLayout(grpHgrpPnl);
        grpHgrpPnl.setLayout(grpHgrpPnlLayout);
        grpHgrpPnlLayout.setHorizontalGroup(
            grpHgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 508, Short.MAX_VALUE)
        );
        grpHgrpPnlLayout.setVerticalGroup(
            grpHgrpPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpBgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpCgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpDgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpEgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpFgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpGgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpHgrpPnl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tablesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpBgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpCgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpDgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpEgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpFgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpGgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(grpHgrpPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tablesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane3.setLayer(tablesPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpBgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpCgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpDgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpEgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpFgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpGgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(grpHgrpPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tablesPnlLayout = new javax.swing.GroupLayout(tablesPnl);
        tablesPnl.setLayout(tablesPnlLayout);
        tablesPnlLayout.setHorizontalGroup(
            tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablesPnlLayout.createSequentialGroup()
                        .addComponent(jLayeredPane3)
                        .addGap(22, 22, 22))
                    .addGroup(tablesPnlLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grpEBtn)
                            .addComponent(grpABtn))
                        .addGap(52, 52, 52)
                        .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(grpFBtn)
                            .addComponent(grpBBtn))
                        .addGap(52, 52, 52)
                        .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpCBtn)
                            .addComponent(grpGBtn))
                        .addGap(52, 52, 52)
                        .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpHBtn)
                            .addComponent(grpDBtn))
                        .addContainerGap())))
        );
        tablesPnlLayout.setVerticalGroup(
            tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesPnlLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpABtn)
                    .addComponent(grpBBtn)
                    .addComponent(grpCBtn)
                    .addComponent(grpDBtn))
                .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablesPnlLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(grpEBtn)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablesPnlLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(tablesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grpFBtn)
                            .addComponent(grpGBtn)
                            .addComponent(grpHBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLayeredPane3)
                .addContainerGap())
        );

        topScorersPnl.setBackground(new java.awt.Color(255, 255, 255));
        topScorersPnl.setPreferredSize(new java.awt.Dimension(528, 562));
        topScorersPnl.setRequestFocusEnabled(false);

        jLabel3.setText("top scorers coming soon!");

        javax.swing.GroupLayout topScorersPnlLayout = new javax.swing.GroupLayout(topScorersPnl);
        topScorersPnl.setLayout(topScorersPnlLayout);
        topScorersPnlLayout.setHorizontalGroup(
            topScorersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topScorersPnlLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel3)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        topScorersPnlLayout.setVerticalGroup(
            topScorersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topScorersPnlLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel3)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        oddsPnl.setBackground(new java.awt.Color(255, 255, 255));
        oddsPnl.setPreferredSize(new java.awt.Dimension(758, 604));

        OddsOutrightBtn.setText("Outright Odds");
        OddsOutrightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OddsOutrightBtnActionPerformed(evt);
            }
        });

        SemiOddsBtn.setText("Semi-Finals");
        SemiOddsBtn.setMaximumSize(new java.awt.Dimension(115, 29));
        SemiOddsBtn.setMinimumSize(new java.awt.Dimension(115, 29));
        SemiOddsBtn.setPreferredSize(new java.awt.Dimension(115, 29));
        SemiOddsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemiOddsBtnActionPerformed(evt);
            }
        });

        QuarterOddsBtn.setText("Quarter Finals");
        QuarterOddsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuarterOddsBtnActionPerformed(evt);
            }
        });

        FinalOddsBtn.setText("Final");
        FinalOddsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalOddsBtnActionPerformed(evt);
            }
        });

        jLayeredPane4.setBackground(new java.awt.Color(204, 204, 204));

        OutrightOddsPnl.setBackground(new java.awt.Color(51, 153, 255));
        OutrightOddsPnl.setForeground(new java.awt.Color(255, 255, 255));

        grpAOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpAOutrightLbl.setText("Group A");

        CroatiaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CroatiaOutrightLbl.setText("jLabel5");

        MexicoOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MexicoOutrightLbl.setText("jLabel90");

        CameroonOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CameroonOutrightLbl.setText("jLabel91");

        EnglandOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EnglandOutrightLbl.setText("jLabel92");

        BrazilOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BrazilOutrightLbl.setText("jLabel93");

        grpBOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpBOutrightLbl.setText("Group B");

        SpainOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SpainOutrightLbl.setText("jLabel95");

        NetherlandsOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NetherlandsOutrightLbl.setText("jLabel96");

        grpEOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpEOutrightLbl.setText("Group E");

        ChileOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ChileOutrightLbl.setText("jLabel98");

        AustraliaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AustraliaOutrightLbl.setText("jLabel99");

        grpCOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpCOutrightLbl.setText("Group C");

        ColombiaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ColombiaOutrightLbl.setText("jLabel130");

        GreeceOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GreeceOutrightLbl.setText("jLabel131");

        IvoryCoastOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IvoryCoastOutrightLbl.setText("jLabel132");

        JapanOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        JapanOutrightLbl.setText("jLabel133");

        CostaRicaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CostaRicaOutrightLbl.setText("jLabel134");

        grpDOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpDOutrightLbl.setText("Group D");

        UruguayOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UruguayOutrightLbl.setText("jLabel136");

        ItalyOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ItalyOutrightLbl.setText("jLabel4");

        grpFOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpFOutrightLbl.setText("Group F");

        grpGOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpGOutrightLbl.setText("Group G");

        grpHOutrightLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        grpHOutrightLbl.setText("Group H");

        SwitzerlandOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SwitzerlandOutrightLbl.setText("jLabel138");

        EcuadorOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EcuadorOutrightLbl.setText("jLabel139");

        FranceOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        FranceOutrightLbl.setText("jLabel140");

        HondurasOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HondurasOutrightLbl.setText("jLabel141");

        ArgentinaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ArgentinaOutrightLbl.setText("jLabel142");

        BosniaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BosniaOutrightLbl.setText("jLabel143");

        IranOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        IranOutrightLbl.setText("jLabel144");

        NigeriaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NigeriaOutrightLbl.setText("jLabel145");

        GermanyOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GermanyOutrightLbl.setText("jLabel146");

        PortugalOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PortugalOutrightLbl.setText("jLabel147");

        GhanaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GhanaOutrightLbl.setText("jLabel148");

        USAOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        USAOutrightLbl.setText("jLabel149");

        BelgiumOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BelgiumOutrightLbl.setText("jLabel150");

        AlgeriaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AlgeriaOutrightLbl.setText("jLabel152");

        RussiaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        RussiaOutrightLbl.setText("jLabel153");

        SouthKoreaOutrightLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SouthKoreaOutrightLbl.setText("jLabel154");

        grpAOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpAOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpAOdds1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAOdds1Lbl.setText("A1");

        grpAOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpAOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpAOdds2Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAOdds2Lbl.setText("A2");

        grpAOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpAOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpAOdds3Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAOdds3Lbl.setText("A3");

        grpAOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpAOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpAOdds4Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpAOdds4Lbl.setText("A4");

        grpEOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpEOdds1Lbl.setText("E1");

        grpEOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpEOdds2Lbl.setText("E2");

        grpEOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpEOdds3Lbl.setText("E3");

        grpEOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpEOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpEOdds4Lbl.setText("E4");

        grpBOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpBOdds1Lbl.setText("B1");

        grpBOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpBOdds2Lbl.setText("B2");

        grpBOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpBOdds3Lbl.setText("B3");

        grpBOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpBOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpBOdds4Lbl.setText("B4");

        grpFOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpFOdds1Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFOdds1Lbl.setText("F1");

        grpFOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpFOdds2Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFOdds2Lbl.setText("F2");

        grpFOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpFOdds3Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFOdds3Lbl.setText("F3");

        grpFOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpFOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpFOdds4Lbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grpFOdds4Lbl.setText("F4");

        grpCOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpCOdds1Lbl.setText("C1");

        grpCOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpCOdds2Lbl.setText("C2");

        grpCOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpCOdds3Lbl.setText("C3");

        grpCOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpCOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpCOdds4Lbl.setText("C4");

        grpGOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpGOdds1Lbl.setText("G1");

        grpGOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpGOdds2Lbl.setText("G2");

        grpGOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpGOdds3Lbl.setText("G3");

        grpGOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpGOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpGOdds4Lbl.setText("G4");

        grpHOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpHOdds1Lbl.setText("H1");

        grpHOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpHOdds2Lbl.setText("H2");

        grpHOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpHOdds3Lbl.setText("H3");

        grpHOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpHOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpHOdds4Lbl.setText("H4");

        grpDOdds1Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDOdds1Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpDOdds1Lbl.setText("D1");

        grpDOdds2Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDOdds2Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpDOdds2Lbl.setText("D2");

        grpDOdds3Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDOdds3Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpDOdds3Lbl.setText("D3");

        grpDOdds4Lbl.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        grpDOdds4Lbl.setForeground(new java.awt.Color(255, 255, 255));
        grpDOdds4Lbl.setText("D4");

        javax.swing.GroupLayout OutrightOddsPnlLayout = new javax.swing.GroupLayout(OutrightOddsPnl);
        OutrightOddsPnl.setLayout(OutrightOddsPnlLayout);
        OutrightOddsPnlLayout.setHorizontalGroup(
            OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BrazilOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CroatiaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MexicoOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CameroonOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grpEOutrightLbl)
                            .addComponent(grpDOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UruguayOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CostaRicaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItalyOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SwitzerlandOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(FranceOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(HondurasOutrightLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(EcuadorOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                .addComponent(grpDOdds1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BelgiumOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpHOutrightLbl)))
                            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                .addComponent(grpDOdds4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(SouthKoreaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(grpEOdds3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpEOdds2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpEOdds1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpAOdds2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpAOdds3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpAOdds4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpAOdds1Lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(USAOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GhanaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(35, 35, 35)
                                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(grpGOdds3Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                            .addComponent(grpGOdds4Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                                        .addGap(190, 190, 190)
                                                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(GermanyOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(PortugalOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                                        .addGap(188, 188, 188)
                                                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(GreeceOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(JapanOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(grpGOutrightLbl))))
                                                .addGap(35, 35, 35))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OutrightOddsPnlLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(IvoryCoastOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)))
                                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(grpCOdds1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                            .addComponent(grpCOdds2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(grpCOdds3Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(grpCOdds4Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(grpGOdds1Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(grpGOdds2Lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(grpEOdds4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(grpDOdds2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(grpDOdds3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RussiaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AlgeriaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(EnglandOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                        .addComponent(grpAOutrightLbl)
                        .addGap(124, 124, 124)
                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grpBOutrightLbl)
                            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SpainOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ChileOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpFOutrightLbl)
                                    .addComponent(ArgentinaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BosniaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IranOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NigeriaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NetherlandsOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AustraliaOutrightLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grpHOdds1Lbl)
                                    .addComponent(grpFOdds1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpHOdds2Lbl)
                                    .addComponent(grpHOdds3Lbl)
                                    .addComponent(grpHOdds4Lbl)
                                    .addComponent(grpFOdds3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(grpBOdds3Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(grpBOdds2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(grpBOdds1Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(grpBOdds4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpFOdds2Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grpFOdds4Lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ColombiaOutrightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grpCOutrightLbl))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        OutrightOddsPnlLayout.setVerticalGroup(
            OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OutrightOddsPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpCOutrightLbl)
                    .addComponent(grpBOutrightLbl)
                    .addComponent(grpAOutrightLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BrazilOutrightLbl)
                    .addComponent(grpAOdds1Lbl)
                    .addComponent(SpainOutrightLbl)
                    .addComponent(grpBOdds1Lbl)
                    .addComponent(ColombiaOutrightLbl)
                    .addComponent(grpCOdds1Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CroatiaOutrightLbl)
                    .addComponent(grpAOdds2Lbl)
                    .addComponent(NetherlandsOutrightLbl)
                    .addComponent(grpBOdds2Lbl)
                    .addComponent(GreeceOutrightLbl)
                    .addComponent(grpCOdds2Lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MexicoOutrightLbl)
                    .addComponent(grpAOdds3Lbl)
                    .addComponent(ChileOutrightLbl)
                    .addComponent(grpBOdds3Lbl)
                    .addComponent(IvoryCoastOutrightLbl)
                    .addComponent(grpCOdds3Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CameroonOutrightLbl)
                    .addComponent(grpAOdds4Lbl)
                    .addComponent(AustraliaOutrightLbl)
                    .addComponent(grpBOdds4Lbl)
                    .addComponent(JapanOutrightLbl)
                    .addComponent(grpCOdds4Lbl))
                .addGap(27, 27, 27)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpGOutrightLbl)
                    .addComponent(grpFOutrightLbl)
                    .addComponent(grpEOutrightLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SwitzerlandOutrightLbl)
                    .addComponent(ArgentinaOutrightLbl)
                    .addComponent(GermanyOutrightLbl)
                    .addComponent(grpEOdds1Lbl)
                    .addComponent(grpFOdds1Lbl)
                    .addComponent(grpGOdds1Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EcuadorOutrightLbl)
                    .addComponent(BosniaOutrightLbl)
                    .addComponent(PortugalOutrightLbl)
                    .addComponent(grpEOdds2Lbl)
                    .addComponent(grpFOdds2Lbl)
                    .addComponent(grpGOdds2Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FranceOutrightLbl)
                    .addComponent(IranOutrightLbl)
                    .addComponent(GhanaOutrightLbl)
                    .addComponent(grpEOdds3Lbl)
                    .addComponent(grpFOdds3Lbl)
                    .addComponent(grpGOdds3Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HondurasOutrightLbl)
                    .addComponent(USAOutrightLbl)
                    .addComponent(grpEOdds4Lbl)
                    .addComponent(grpFOdds4Lbl)
                    .addComponent(grpGOdds4Lbl)
                    .addComponent(NigeriaOutrightLbl))
                .addGap(37, 37, 37)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpHOutrightLbl)
                    .addComponent(grpDOutrightLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grpDOdds1Lbl)
                    .addComponent(BelgiumOutrightLbl)
                    .addComponent(grpHOdds1Lbl)
                    .addComponent(UruguayOutrightLbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CostaRicaOutrightLbl)
                    .addComponent(grpDOdds2Lbl)
                    .addComponent(AlgeriaOutrightLbl)
                    .addComponent(grpHOdds2Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnglandOutrightLbl)
                    .addComponent(grpDOdds3Lbl)
                    .addComponent(RussiaOutrightLbl)
                    .addComponent(grpHOdds3Lbl))
                .addGap(5, 5, 5)
                .addGroup(OutrightOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItalyOutrightLbl)
                    .addComponent(grpDOdds4Lbl)
                    .addComponent(SouthKoreaOutrightLbl)
                    .addComponent(grpHOdds4Lbl))
                .addGap(42, 42, 42))
        );

        FinalOddsPnl.setBackground(new java.awt.Color(204, 0, 204));

        javax.swing.GroupLayout FinalOddsPnlLayout = new javax.swing.GroupLayout(FinalOddsPnl);
        FinalOddsPnl.setLayout(FinalOddsPnlLayout);
        FinalOddsPnlLayout.setHorizontalGroup(
            FinalOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        FinalOddsPnlLayout.setVerticalGroup(
            FinalOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        SemiOddsPnl.setBackground(new java.awt.Color(255, 102, 51));

        javax.swing.GroupLayout SemiOddsPnlLayout = new javax.swing.GroupLayout(SemiOddsPnl);
        SemiOddsPnl.setLayout(SemiOddsPnlLayout);
        SemiOddsPnlLayout.setHorizontalGroup(
            SemiOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        SemiOddsPnlLayout.setVerticalGroup(
            SemiOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        QuarterOddsPnl.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout QuarterOddsPnlLayout = new javax.swing.GroupLayout(QuarterOddsPnl);
        QuarterOddsPnl.setLayout(QuarterOddsPnlLayout);
        QuarterOddsPnlLayout.setHorizontalGroup(
            QuarterOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        QuarterOddsPnlLayout.setVerticalGroup(
            QuarterOddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 285, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(OutrightOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(FinalOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SemiOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(QuarterOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(OutrightOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(FinalOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(SemiOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(QuarterOddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane4.setLayer(OutrightOddsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(FinalOddsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(SemiOddsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane4.setLayer(QuarterOddsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout oddsPnlLayout = new javax.swing.GroupLayout(oddsPnl);
        oddsPnl.setLayout(oddsPnlLayout);
        oddsPnlLayout.setHorizontalGroup(
            oddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oddsPnlLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(oddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLayeredPane4)
                    .addGroup(oddsPnlLayout.createSequentialGroup()
                        .addComponent(OddsOutrightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(FinalOddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(SemiOddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(QuarterOddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        oddsPnlLayout.setVerticalGroup(
            oddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oddsPnlLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(oddsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuarterOddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SemiOddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinalOddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OddsOutrightBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        mvpsPnl.setBackground(new java.awt.Color(255, 255, 255));
        mvpsPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel6.setText("MVPs coming soon!");

        javax.swing.GroupLayout mvpsPnlLayout = new javax.swing.GroupLayout(mvpsPnl);
        mvpsPnl.setLayout(mvpsPnlLayout);
        mvpsPnlLayout.setHorizontalGroup(
            mvpsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvpsPnlLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel6)
                .addContainerGap(266, Short.MAX_VALUE))
        );
        mvpsPnlLayout.setVerticalGroup(
            mvpsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mvpsPnlLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel6)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        teamsPnl.setBackground(new java.awt.Color(255, 255, 0));
        teamsPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel48.setForeground(new java.awt.Color(255, 0, 102));
        jLabel48.setText("jLabel16");

        jLabel49.setText("jLabel17");

        jLabel50.setText("jLabel18");

        jLabel51.setText("jLabel19");

        jLabel52.setText("jLabel20");

        jLabel53.setText("jLabel21");

        jLabel54.setText("jLabel21");

        jLabel55.setText("jLabel21");

        jLabel56.setText("jLabel21");

        jLabel57.setText("jLabel21");

        jLabel58.setText("jLabel21");

        jLabel59.setText("jLabel21");

        jLabel60.setText("jLabel21");

        jLabel61.setText("jLabel21");

        jLabel62.setText("jLabel21");

        jLabel63.setText("jLabel21");

        jLabel64.setText("jLabel21");

        jLabel65.setText("jLabel21");

        jLabel66.setText("jLabel21");

        jLabel67.setText("jLabel21");

        jLabel68.setText("jLabel21");

        jLabel69.setText("jLabel21");

        jLabel70.setText("jLabel21");

        jLabel71.setText("jLabel21");

        jLabel72.setText("jLabel21");

        jLabel73.setText("jLabel21");

        jLabel74.setText("jLabel21");

        jLabel75.setText("jLabel21");

        jLabel76.setText("jLabel21");

        jLabel77.setText("jLabel21");

        jLabel78.setText("jLabel21");

        jLabel79.setText("jLabel21");

        jLabel7.setText("Group A");

        jLabel8.setText("Group B");

        jLabel80.setText("Group C");

        jLabel81.setText("Group D ");

        jLabel82.setText("Group E");

        jLabel83.setText("Group F");

        jLabel84.setText("Group G");

        jLabel85.setText("Group H");

        javax.swing.GroupLayout teamsPnlLayout = new javax.swing.GroupLayout(teamsPnl);
        teamsPnl.setLayout(teamsPnlLayout);
        teamsPnlLayout.setHorizontalGroup(
            teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamsPnlLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel48)
                            .addComponent(jLabel53)
                            .addComponent(jLabel62)
                            .addComponent(jLabel59))
                        .addGap(102, 102, 102)
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel58)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel61)
                            .addComponent(jLabel63)
                            .addComponent(jLabel70)
                            .addComponent(jLabel83)))
                    .addComponent(jLabel82))
                .addGap(50, 50, 50)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel68)
                    .addComponent(jLabel67)
                    .addComponent(jLabel69)
                    .addComponent(jLabel71)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(jLabel76))
                .addGap(42, 42, 42)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77)
                    .addComponent(jLabel85)
                    .addComponent(jLabel79)
                    .addComponent(jLabel78)
                    .addComponent(jLabel75)
                    .addComponent(jLabel74)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        teamsPnlLayout.setVerticalGroup(
            teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teamsPnlLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel58)
                    .addComponent(jLabel68)
                    .addComponent(jLabel75))
                .addGap(12, 12, 12)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel64)
                    .addComponent(jLabel72)
                    .addComponent(jLabel49))
                .addGap(12, 12, 12)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel65)
                    .addComponent(jLabel73)
                    .addComponent(jLabel50))
                .addGap(12, 12, 12)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jLabel66)
                    .addComponent(jLabel74)
                    .addComponent(jLabel51))
                .addGap(38, 38, 38)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLabel83)
                    .addComponent(jLabel84)
                    .addComponent(jLabel85))
                .addGap(27, 27, 27)
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teamsPnlLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel52))
                            .addComponent(jLabel53)))
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(jLabel77))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel78))
                        .addGap(18, 18, 18)
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel79)))
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel61)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel63)))
                .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jLabel70))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(teamsPnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(teamsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel54))
                        .addContainerGap(145, Short.MAX_VALUE))))
        );

        playersPnl.setBackground(new java.awt.Color(255, 255, 255));
        playersPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jLabel21.setText("jLabel21");

        jLabel22.setText("jLabel21");

        jLabel23.setText("jLabel21");

        jLabel24.setText("jLabel21");

        jLabel25.setText("jLabel21");

        jLabel26.setText("jLabel21");

        jLabel27.setText("jLabel21");

        jLabel28.setText("jLabel21");

        jLabel29.setText("jLabel21");

        jLabel30.setText("jLabel21");

        jLabel31.setText("jLabel21");

        jLabel32.setText("jLabel21");

        jLabel33.setText("jLabel21");

        jLabel34.setText("jLabel21");

        jLabel35.setText("jLabel21");

        jLabel36.setText("jLabel21");

        jLabel37.setText("jLabel21");

        jLabel38.setText("jLabel21");

        jLabel39.setText("jLabel21");

        jLabel40.setText("jLabel21");

        jLabel41.setText("jLabel21");

        jLabel42.setText("jLabel21");

        jLabel43.setText("jLabel21");

        jLabel44.setText("jLabel21");

        jLabel45.setText("jLabel21");

        jLabel46.setText("jLabel21");

        jLabel47.setText("jLabel21");

        javax.swing.GroupLayout playersPnlLayout = new javax.swing.GroupLayout(playersPnl);
        playersPnl.setLayout(playersPnlLayout);
        playersPnlLayout.setHorizontalGroup(
            playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersPnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel22)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(80, 80, 80)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31))
                .addGap(68, 68, 68)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(59, 59, 59)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        playersPnlLayout.setVerticalGroup(
            playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersPnlLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel23)
                    .addComponent(jLabel32)
                    .addComponent(jLabel40))
                .addGap(18, 18, 18)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel24)
                    .addComponent(jLabel33)
                    .addComponent(jLabel41))
                .addGap(18, 18, 18)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel25)
                    .addComponent(jLabel34)
                    .addComponent(jLabel42))
                .addGap(18, 18, 18)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel26)
                    .addComponent(jLabel36)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel27)
                    .addComponent(jLabel35)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel28)
                    .addComponent(jLabel37)
                    .addComponent(jLabel45))
                .addGap(19, 19, 19)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel21)
                    .addComponent(jLabel38)
                    .addComponent(jLabel46))
                .addGap(18, 18, 18)
                .addGroup(playersPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel39)
                    .addComponent(jLabel47))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        stadiumsPnl.setBackground(new java.awt.Color(255, 255, 255));
        stadiumsPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        stadium0lbl.setText("Stadium:");

        city0lbl.setText("City:");

        cap0lbl.setText("Capacity:");

        cap1lbl.setText("jLabel1");

        cap2lbl.setText("jLabel9");

        cap3lbl.setText("jLabel86");

        cap4lbl.setText("jLabel87");

        cap5lbl.setText("jLabel88");

        cap6lbl.setText("jLabel89");

        cap7lbl.setText("jLabel90");

        cap8lbl.setText("jLabel91");

        cap9lbl.setText("jLabel92");

        cap10lbl.setText("jLabel93");

        cap11lbl.setText("jLabel94");

        cap12lbl.setText("jLabel95");

        javax.swing.GroupLayout stadiumsPnlLayout = new javax.swing.GroupLayout(stadiumsPnl);
        stadiumsPnl.setLayout(stadiumsPnlLayout);
        stadiumsPnlLayout.setHorizontalGroup(
            stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stadiumsPnlLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stadium0lbl)
                    .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(stadium1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(stadium2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium8lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium12lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium7lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium9lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium10lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium11lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stadium3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(61, 61, 61)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city0lbl)
                    .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(city1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(city2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city7lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city8lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city9lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city10lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(city11lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(city12lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap0lbl)
                    .addComponent(cap1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cap4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap7lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap8lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap9lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap10lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap11lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap12lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );
        stadiumsPnlLayout.setVerticalGroup(
            stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stadiumsPnlLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stadium0lbl)
                    .addComponent(city0lbl)
                    .addComponent(cap0lbl))
                .addGap(36, 36, 36)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium1lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium2lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium3lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium4lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium5lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap6lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city6lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium6lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap7lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city7lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium7lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap8lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city8lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium8lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap9lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city9lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium9lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cap10lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city10lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium10lbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(city11lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stadium11lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap11lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stadiumsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stadium12lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cap12lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(city12lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );

        brazilInfoPnl.setBackground(new java.awt.Color(255, 255, 255));
        brazilInfoPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel10.setText("brazil infor coming soon!");

        javax.swing.GroupLayout brazilInfoPnlLayout = new javax.swing.GroupLayout(brazilInfoPnl);
        brazilInfoPnl.setLayout(brazilInfoPnlLayout);
        brazilInfoPnlLayout.setHorizontalGroup(
            brazilInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brazilInfoPnlLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel10)
                .addContainerGap(230, Short.MAX_VALUE))
        );
        brazilInfoPnlLayout.setVerticalGroup(
            brazilInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(brazilInfoPnlLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel10)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        localAreaInfoPnl.setBackground(new java.awt.Color(255, 255, 255));
        localAreaInfoPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel11.setText("local area info coming soon!");

        javax.swing.GroupLayout localAreaInfoPnlLayout = new javax.swing.GroupLayout(localAreaInfoPnl);
        localAreaInfoPnl.setLayout(localAreaInfoPnlLayout);
        localAreaInfoPnlLayout.setHorizontalGroup(
            localAreaInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localAreaInfoPnlLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel11)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        localAreaInfoPnlLayout.setVerticalGroup(
            localAreaInfoPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(localAreaInfoPnlLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel11)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        rtwcPnl.setBackground(new java.awt.Color(255, 255, 255));
        rtwcPnl.setPreferredSize(new java.awt.Dimension(528, 562));

        jLabel12.setText("RTWC coming soon!");

        javax.swing.GroupLayout rtwcPnlLayout = new javax.swing.GroupLayout(rtwcPnl);
        rtwcPnl.setLayout(rtwcPnlLayout);
        rtwcPnlLayout.setHorizontalGroup(
            rtwcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rtwcPnlLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel12)
                .addContainerGap(263, Short.MAX_VALUE))
        );
        rtwcPnlLayout.setVerticalGroup(
            rtwcPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rtwcPnlLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel12)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(fixturesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(refereesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(tablesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(topScorersPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(oddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(mvpsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(teamsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(playersPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(stadiumsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(brazilInfoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(localAreaInfoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(rtwcPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(origPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fixturesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(refereesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tablesPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(topScorersPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(oddsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mvpsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(teamsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(playersPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(stadiumsPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(brazilInfoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(localAreaInfoPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(rtwcPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(origPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(origPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fixturesPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(refereesPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(tablesPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(topScorersPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(oddsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(mvpsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(teamsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(playersPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(stadiumsPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(brazilInfoPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(localAreaInfoPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(rtwcPnl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/worldcupapp/newpackage/World Cup Banner.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mvpsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oddsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topScorersBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tablesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refereesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fixturesBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(localAreaInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rtwcBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(brazilInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stadiumsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playersBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teamsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(teamsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(playersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(stadiumsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(brazilInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(localAreaInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(rtwcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(fixturesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(refereesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(tablesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(topScorersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(oddsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(mvpsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLayeredPane1)))))
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fixturesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixturesBtnActionPerformed

        close();
        fixturesPnl.setVisible(true);
        closefixtures();
        //Fixtures fixtures = new Fixtures();
        //String[] allTeams = fixtures.getAllTeams();
        
        
    }//GEN-LAST:event_fixturesBtnActionPerformed

    private void teamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsBtnActionPerformed
        // TODO add your handling code here:
        close();
        teamsPnl.setVisible(true);
        Teams teams = new Teams();
        String[] allTeams = teams.getAllTeams();
        jLabel48.setText(allTeams[0]);
        jLabel49.setText(allTeams[1]);
        jLabel50.setText(allTeams[2]);
        jLabel51.setText(allTeams[3]);
        jLabel52.setText(allTeams[4]);
        jLabel53.setText(allTeams[5]);
        jLabel54.setText(allTeams[6]);
        jLabel55.setText(allTeams[7]);
        jLabel56.setText(allTeams[8]);
        jLabel57.setText(allTeams[9]);
        jLabel58.setText(allTeams[10]);
        jLabel59.setText(allTeams[11]);
        jLabel60.setText(allTeams[12]);
        jLabel61.setText(allTeams[13]);
        jLabel62.setText(allTeams[14]);
        jLabel63.setText(allTeams[15]);
        jLabel64.setText(allTeams[16]);
        jLabel65.setText(allTeams[17]);
        jLabel66.setText(allTeams[18]);
        jLabel67.setText(allTeams[19]);
        jLabel68.setText(allTeams[20]);
        jLabel69.setText(allTeams[21]);
        jLabel70.setText(allTeams[22]);
        jLabel71.setText(allTeams[23]);
        jLabel72.setText(allTeams[24]);
        jLabel73.setText(allTeams[25]);
        jLabel74.setText(allTeams[26]);
        jLabel75.setText(allTeams[27]);
        jLabel76.setText(allTeams[28]);
        jLabel77.setText(allTeams[29]);
        jLabel78.setText(allTeams[30]);
        jLabel79.setText(allTeams[31]);
        
        
        
    }//GEN-LAST:event_teamsBtnActionPerformed

    private void stadiumsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stadiumsBtnActionPerformed
        // TODO add your handling code here:
        close();
        stadiumsPnl.setVisible(true);
        Stadiums stadium = new Stadiums();
        String [][] stadiums = stadium.getStadiums();
        stadium1lbl.setText(stadiums[0][0]);
        stadium2lbl.setText(stadiums[1][0]);
        stadium3lbl.setText(stadiums[2][0]);
        stadium4lbl.setText(stadiums[3][0]);
        stadium5lbl.setText(stadiums[4][0]);
        stadium6lbl.setText(stadiums[5][0]);
        stadium7lbl.setText(stadiums[6][0]);
        stadium8lbl.setText(stadiums[7][0]);
        stadium9lbl.setText(stadiums[8][0]);
        stadium10lbl.setText(stadiums[9][0]);
        stadium11lbl.setText(stadiums[10][0]);
        stadium12lbl.setText(stadiums[11][0]);
        city1lbl.setText(stadiums[0][1]);
        city2lbl.setText(stadiums[1][1]);
        city3lbl.setText(stadiums[2][1]);
        city4lbl.setText(stadiums[3][1]);
        city5lbl.setText(stadiums[4][1]);
        city6lbl.setText(stadiums[5][1]);
        city7lbl.setText(stadiums[6][1]);
        city8lbl.setText(stadiums[7][1]);
        city9lbl.setText(stadiums[8][1]);
        city10lbl.setText(stadiums[9][1]);
        city11lbl.setText(stadiums[10][1]);
        city12lbl.setText(stadiums[11][1]);
        cap1lbl.setText(stadiums[0][2]);
        cap2lbl.setText(stadiums[1][2]);
        cap3lbl.setText(stadiums[2][2]);
        cap4lbl.setText(stadiums[3][2]);
        cap5lbl.setText(stadiums[4][2]);
        cap6lbl.setText(stadiums[5][2]);
        cap7lbl.setText(stadiums[6][2]);
        cap8lbl.setText(stadiums[7][2]);
        cap9lbl.setText(stadiums[8][2]);
        cap10lbl.setText(stadiums[9][2]);
        cap11lbl.setText(stadiums[10][2]);
        cap12lbl.setText(stadiums[11][2]);
        
        
     
    }//GEN-LAST:event_stadiumsBtnActionPerformed

    private void refereesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refereesBtnActionPerformed
        // TODO add your handling code here:
        close();
        closeRefereesPanel();
        refereesPnl.setVisible(true);
        
        
    }//GEN-LAST:event_refereesBtnActionPerformed

    private void tablesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablesBtnActionPerformed
        // TODO add your handling code here:
        close();
        tablesPnl.setVisible(true);
        
    }//GEN-LAST:event_tablesBtnActionPerformed

    private void topScorersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topScorersBtnActionPerformed
        // TODO add your handling code here:
        close();
        topScorersPnl.setVisible(true);
                     
    }//GEN-LAST:event_topScorersBtnActionPerformed

    private void mvpsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mvpsBtnActionPerformed
        // TODO add your handling code here:
        close();
        mvpsPnl.setVisible(true);
        
    }//GEN-LAST:event_mvpsBtnActionPerformed

    private void playersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playersBtnActionPerformed
        close();
        playersPnl.setVisible(true);
    }//GEN-LAST:event_playersBtnActionPerformed

    private void brazilInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brazilInfoBtnActionPerformed
        // TODO add your handling code here:
        close();
        brazilInfoPnl.setVisible(true);
        
    }//GEN-LAST:event_brazilInfoBtnActionPerformed

    private void localAreaInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localAreaInfoBtnActionPerformed
 
        close();
        localAreaInfoPnl.setVisible(true);
        
    }//GEN-LAST:event_localAreaInfoBtnActionPerformed

    private void rtwcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtwcBtnActionPerformed

        close();
        rtwcPnl.setVisible(true);
        
    }//GEN-LAST:event_rtwcBtnActionPerformed

    private void oddsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddsBtnActionPerformed
        close();
        oddsPnl.setVisible(true);
        closeOddsPnls();
        
    }//GEN-LAST:event_oddsBtnActionPerformed

    private void groupAbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupAbtnActionPerformed
        closefixtures();
        groupApnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupAbtn.setText(groups[0]);
        grpAfixA1.setText(allTeams[0]);
        grpAfixA2.setText(allTeams[1]);
        grpAfixB1.setText(allTeams[2]);
        grpAfixB2.setText(allTeams[3]);
        grpAfixC1.setText(allTeams[0]);
        grpAfixC2.setText(allTeams[2]);
        grpAfixD1.setText(allTeams[3]);
        grpAfixD2.setText(allTeams[1]);
        grpAfixE1.setText(allTeams[3]);
        grpAfixE2.setText(allTeams[0]);
        grpAfixF1.setText(allTeams[1]);
        grpAfixF2.setText(allTeams[2]);
        
    }//GEN-LAST:event_groupAbtnActionPerformed

    private void groupBbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupBbtnActionPerformed
        closefixtures();
        groupBpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupBbtn.setText(groups[1]);
        grpBfixA1.setText(allTeams[4]);
        grpBfixA2.setText(allTeams[5]);
        grpBfixB1.setText(allTeams[6]);
        grpBfixB2.setText(allTeams[7]);
        grpBfixC1.setText(allTeams[4]);
        grpBfixC2.setText(allTeams[6]);
        grpBfixD1.setText(allTeams[7]);
        grpBfixD2.setText(allTeams[5]);
        grpBfixE1.setText(allTeams[7]);
        grpBfixE2.setText(allTeams[4]);
        grpBfixF1.setText(allTeams[5]);
        grpBfixF2.setText(allTeams[6]);
    }//GEN-LAST:event_groupBbtnActionPerformed

    private void groupCbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupCbtnActionPerformed
        // TODO add your handling code here:
        closefixtures();
        groupCpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupCbtn.setText(groups[2]);
        grpCfixA1.setText(allTeams[8]);
        grpCfixA2.setText(allTeams[9]);
        grpCfixB1.setText(allTeams[10]);
        grpCfixB2.setText(allTeams[11]);
        grpCfixC1.setText(allTeams[8]);
        grpCfixC2.setText(allTeams[10]);
        grpCfixD1.setText(allTeams[11]);
        grpCfixD2.setText(allTeams[9]);
        grpCfixE1.setText(allTeams[11]);
        grpCfixE2.setText(allTeams[8]);
        grpCfixF1.setText(allTeams[9]);
        grpCfixF2.setText(allTeams[10]);
        
    }//GEN-LAST:event_groupCbtnActionPerformed

    private void groupDbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupDbtnActionPerformed
        // TODO add your handling code here:
                closefixtures();
        groupDpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupDbtn.setText(groups[3]);
        grpDfixA1.setText(allTeams[12]);
        grpDfixA2.setText(allTeams[13]);
        grpDfixB1.setText(allTeams[14]);
        grpDfixB2.setText(allTeams[15]);
        grpDfixC1.setText(allTeams[12]);
        grpDfixC2.setText(allTeams[14]);
        grpDfixD1.setText(allTeams[15]);
        grpDfixD2.setText(allTeams[13]);
        grpDfixE1.setText(allTeams[15]);
        grpDfixE2.setText(allTeams[12]);
        grpDfixF1.setText(allTeams[13]);
        grpDfixF2.setText(allTeams[14]);
    }//GEN-LAST:event_groupDbtnActionPerformed

    private void groupEbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupEbtnActionPerformed
        // TODO add your handling code here:
                        closefixtures();
        groupEpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupEbtn.setText(groups[4]);
        grpEfixA1.setText(allTeams[16]);
        grpEfixA2.setText(allTeams[17]);
        grpEfixB1.setText(allTeams[18]);
        grpEfixB2.setText(allTeams[19]);
        grpEfixC1.setText(allTeams[16]);
        grpEfixC2.setText(allTeams[18]);
        grpEfixD1.setText(allTeams[19]);
        grpEfixD2.setText(allTeams[17]);
        grpEfixE1.setText(allTeams[19]);
        grpEfixE2.setText(allTeams[16]);
        grpEfixF1.setText(allTeams[17]);
        grpEfixF2.setText(allTeams[18]);
    }//GEN-LAST:event_groupEbtnActionPerformed

    private void groupFbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupFbtnActionPerformed
        // TODO add your handling code here:
                                closefixtures();
        groupFpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupFbtn.setText(groups[5]);
        grpFfixA1.setText(allTeams[20]);
        grpFfixA2.setText(allTeams[21]);
        grpFfixB1.setText(allTeams[22]);
        grpFfixB2.setText(allTeams[23]);
        grpFfixC1.setText(allTeams[20]);
        grpFfixC2.setText(allTeams[22]);
        grpFfixD1.setText(allTeams[23]);
        grpFfixD2.setText(allTeams[21]);
        grpFfixE1.setText(allTeams[23]);
        grpFfixE2.setText(allTeams[20]);
        grpFfixF1.setText(allTeams[21]);
        grpFfixF2.setText(allTeams[22]);
    }//GEN-LAST:event_groupFbtnActionPerformed

    private void groupGbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupGbtnActionPerformed
        // TODO add your handling code here:
            closefixtures();
        groupGpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupGbtn.setText(groups[6]);
        grpGfixA1.setText(allTeams[24]);
        grpGfixA2.setText(allTeams[25]);
        grpGfixB1.setText(allTeams[26]);
        grpGfixB2.setText(allTeams[27]);
        grpGfixC1.setText(allTeams[24]);
        grpGfixC2.setText(allTeams[26]);
        grpGfixD1.setText(allTeams[27]);
        grpGfixD2.setText(allTeams[25]);
        grpGfixE1.setText(allTeams[27]);
        grpGfixE2.setText(allTeams[24]);
        grpGfixF1.setText(allTeams[25]);
        grpGfixF2.setText(allTeams[26]);
    }//GEN-LAST:event_groupGbtnActionPerformed

    private void groupHbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupHbtnActionPerformed
        // TODO add your handling code here:
          closefixtures();
        groupHpnl.setVisible(true);
        Fixtures fixtures = new Fixtures();
        String[] allTeams = fixtures.getAllTeams();
        String[] groups = fixtures.getGroups();
        groupHbtn.setText(groups[7]);
        grpHfixA1.setText(allTeams[28]);
        grpHfixA2.setText(allTeams[29]);
        grpHfixB1.setText(allTeams[30]);
        grpHfixB2.setText(allTeams[31]);
        grpHfixC1.setText(allTeams[28]);
        grpHfixC2.setText(allTeams[30]);
        grpHfixD1.setText(allTeams[31]);
        grpHfixD2.setText(allTeams[29]);
        grpHfixE1.setText(allTeams[31]);
        grpHfixE2.setText(allTeams[28]);
        grpHfixF1.setText(allTeams[29]);
        grpHfixF2.setText(allTeams[30]);
        
    }//GEN-LAST:event_groupHbtnActionPerformed

    private void grpABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpABtnActionPerformed
        // TODO add your handling code here:
        //closeTablePanels();
        tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[0]);
        game1team2.setText(allTeams[1]);
        game2team1.setText(allTeams[2]);
        game2team2.setText(allTeams[3]);
        game3team1.setText(allTeams[0]);
        game3team2.setText(allTeams[2]);
        game4team1.setText(allTeams[3]);
        game4team2.setText(allTeams[1]);
        game5team1.setText(allTeams[3]);
        game5team2.setText(allTeams[0]);
        game6team1.setText(allTeams[1]);
        game6team2.setText(allTeams[2]);
        team1.setText(allTeams[0]);
        team2.setText(allTeams[1]);
        team3.setText(allTeams[2]);
        team4.setText(allTeams[3]);
    }//GEN-LAST:event_grpABtnActionPerformed

    private void grpBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpBBtnActionPerformed
        // TODO add your handling code here:
        tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[4]);
        game1team2.setText(allTeams[5]);
        game2team1.setText(allTeams[6]);
        game2team2.setText(allTeams[7]);
        game3team1.setText(allTeams[4]);
        game3team2.setText(allTeams[6]);
        game4team1.setText(allTeams[7]);
        game4team2.setText(allTeams[5]);
        game5team1.setText(allTeams[7]);
        game5team2.setText(allTeams[4]);
        game6team1.setText(allTeams[5]);
        game6team2.setText(allTeams[6]);
        team1.setText(allTeams[4]);
        team2.setText(allTeams[5]);
        team3.setText(allTeams[6]);
        team4.setText(allTeams[7]);
    }//GEN-LAST:event_grpBBtnActionPerformed

    private void grpCBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpCBtnActionPerformed
        // TODO add your handling code here:
        tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[8]);
        game1team2.setText(allTeams[9]);
        game2team1.setText(allTeams[10]);
        game2team2.setText(allTeams[11]);
        game3team1.setText(allTeams[8]);
        game3team2.setText(allTeams[10]);
        game4team1.setText(allTeams[11]);
        game4team2.setText(allTeams[9]);
        game5team1.setText(allTeams[11]);
        game5team2.setText(allTeams[8]);
        game6team1.setText(allTeams[9]);
        game6team2.setText(allTeams[10]);
        team1.setText(allTeams[8]);
        team2.setText(allTeams[9]);
        team3.setText(allTeams[10]);
        team4.setText(allTeams[11]);
    }//GEN-LAST:event_grpCBtnActionPerformed

    private void grpDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpDBtnActionPerformed
        // TODO add your handling code here:
        tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[12]);
        game1team2.setText(allTeams[13]);
        game2team1.setText(allTeams[14]);
        game2team2.setText(allTeams[15]);
        game3team1.setText(allTeams[12]);
        game3team2.setText(allTeams[14]);
        game4team1.setText(allTeams[15]);
        game4team2.setText(allTeams[13]);
        game5team1.setText(allTeams[15]);
        game5team2.setText(allTeams[12]);
        game6team1.setText(allTeams[13]);
        game6team2.setText(allTeams[14]);
        team1.setText(allTeams[12]);
        team2.setText(allTeams[13]);
        team3.setText(allTeams[14]);
        team4.setText(allTeams[15]);
    }//GEN-LAST:event_grpDBtnActionPerformed

    private void grpEBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpEBtnActionPerformed
        // TODO add your handling code here:
        tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[16]);
        game1team2.setText(allTeams[17]);
        game2team1.setText(allTeams[18]);
        game2team2.setText(allTeams[19]);
        game3team1.setText(allTeams[16]);
        game3team2.setText(allTeams[18]);
        game4team1.setText(allTeams[19]);
        game4team2.setText(allTeams[17]);
        game5team1.setText(allTeams[19]);
        game5team2.setText(allTeams[16]);
        game6team1.setText(allTeams[17]);
        game6team2.setText(allTeams[18]);
        team1.setText(allTeams[16]);
        team2.setText(allTeams[17]);
        team3.setText(allTeams[18]);
        team4.setText(allTeams[19]);
    }//GEN-LAST:event_grpEBtnActionPerformed

    private void grpFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpFBtnActionPerformed
       tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[20]);
        game1team2.setText(allTeams[21]);
        game2team1.setText(allTeams[22]);
        game2team2.setText(allTeams[23]);
        game3team1.setText(allTeams[20]);
        game3team2.setText(allTeams[22]);
        game4team1.setText(allTeams[23]);
        game4team2.setText(allTeams[21]);
        game5team1.setText(allTeams[23]);
        game5team2.setText(allTeams[20]);
        game6team1.setText(allTeams[21]);
        game6team2.setText(allTeams[22]);
        team1.setText(allTeams[20]);
        team2.setText(allTeams[21]);
        team3.setText(allTeams[22]);
        team4.setText(allTeams[23]);
    }//GEN-LAST:event_grpFBtnActionPerformed

    private void grpGBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpGBtnActionPerformed
        // TODO add your handling code here:
       tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[24]);
        game1team2.setText(allTeams[25]);
        game2team1.setText(allTeams[26]);
        game2team2.setText(allTeams[27]);
        game3team1.setText(allTeams[24]);
        game3team2.setText(allTeams[26]);
        game4team1.setText(allTeams[27]);
        game4team2.setText(allTeams[25]);
        game5team1.setText(allTeams[27]);
        game5team2.setText(allTeams[24]);
        game6team1.setText(allTeams[25]);
        game6team2.setText(allTeams[26]);
        team1.setText(allTeams[24]);
        team2.setText(allTeams[25]);
        team3.setText(allTeams[26]);
        team4.setText(allTeams[27]);
    }//GEN-LAST:event_grpGBtnActionPerformed

    private void grpHBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpHBtnActionPerformed
        // TODO add your handling code here:
       tablesPanel.setVisible(true);
        Tables tables = new Tables();
        String[] allTeams = tables.getAllTeams();
        resetTables();
        game1team1.setText(allTeams[28]);
        game1team2.setText(allTeams[29]);
        game2team1.setText(allTeams[30]);
        game2team2.setText(allTeams[31]);
        game3team1.setText(allTeams[28]);
        game3team2.setText(allTeams[30]);
        game4team1.setText(allTeams[31]);
        game4team2.setText(allTeams[29]);
        game5team1.setText(allTeams[31]);
        game5team2.setText(allTeams[28]);
        game6team1.setText(allTeams[29]);
        game6team2.setText(allTeams[30]);
        team1.setText(allTeams[28]);
        team2.setText(allTeams[29]);
        team3.setText(allTeams[30]);
        team4.setText(allTeams[31]);
    }//GEN-LAST:event_grpHBtnActionPerformed

    private void grpAgame1BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grpAgame1BtnActionPerformed
        // TODO add your handling code here:
        Tables tables = new Tables();
        sortTables mySorter = new sortTables();
        tables.calcPtsTeam1(score1.getText(), score2.getText());
        tables.calcWinsTeam1(score1.getText(), score2.getText());
        tables.calcDrawsTeam1(score1.getText(), score2.getText());
        tables.calcLossesTeam1(score1.getText(), score2.getText());
        tables.gamesPlayedTeam1();
        
        tables.calcPtsTeam2(score2.getText(), score1.getText());
        tables.calcWinsTeam2(score2.getText(), score1.getText());
        tables.calcDrawsTeam2(score2.getText(), score1.getText());
        tables.calcLossesTeam2(score2.getText(), score1.getText());
        tables.gamesPlayedTeam2();
        
        tables.calcPtsTeam3(score3.getText(), score4.getText());
        tables.calcWinsTeam3(score3.getText(), score4.getText());
        tables.calcDrawsTeam3(score3.getText(), score4.getText());
        tables.calcLossesTeam3(score3.getText(), score4.getText());
        tables.gamesPlayedTeam3();
        
        tables.calcPtsTeam4(score4.getText(), score3.getText());
        tables.calcWinsTeam4(score4.getText(), score3.getText());
        tables.calcDrawsTeam4(score4.getText(), score3.getText());
        tables.calcLossesTeam4(score4.getText(), score3.getText());
        tables.gamesPlayedTeam4();
        
        tables.calcPtsTeam1(score5.getText(), score6.getText());
        tables.calcWinsTeam1(score5.getText(), score6.getText());
        tables.calcDrawsTeam1(score5.getText(), score6.getText());
        tables.calcLossesTeam1(score5.getText(), score6.getText());
        tables.gamesPlayedTeam1();
        
        tables.calcPtsTeam3(score6.getText(), score5.getText());
        tables.calcWinsTeam3(score6.getText(), score5.getText());
        tables.calcDrawsTeam3(score6.getText(), score5.getText());
        tables.calcLossesTeam3(score6.getText(), score5.getText());
        tables.gamesPlayedTeam3();
        
        tables.calcPtsTeam4(score7.getText(), score8.getText());
        tables.calcWinsTeam4(score7.getText(), score8.getText());
        tables.calcDrawsTeam4(score7.getText(), score8.getText());
        tables.calcLossesTeam4(score7.getText(), score8.getText());
        tables.gamesPlayedTeam4();
        
        tables.calcPtsTeam2(score8.getText(), score7.getText());
        tables.calcWinsTeam2(score8.getText(), score7.getText());
        tables.calcDrawsTeam2(score8.getText(), score7.getText());
        tables.calcLossesTeam2(score8.getText(), score7.getText());
        tables.gamesPlayedTeam2();
        
        int points4 = tables.calcPtsTeam4(score9.getText(), score10.getText());
        int wins4 = tables.calcWinsTeam4(score9.getText(), score10.getText());
        int draws4 = tables.calcDrawsTeam4(score9.getText(), score10.getText());
        int losses4 = tables.calcLossesTeam4(score9.getText(), score10.getText());
        int gamesPlayed4 = tables.gamesPlayedTeam4();
        
        int points1 = tables.calcPtsTeam1(score10.getText(), score9.getText());
        int wins1 = tables.calcWinsTeam1(score10.getText(), score9.getText());
        int draws1 = tables.calcDrawsTeam1(score10.getText(), score9.getText());
        int losses1 = tables.calcLossesTeam1(score10.getText(), score9.getText());
        int gamesPlayed1 = tables.gamesPlayedTeam1();
        
        int points2 = tables.calcPtsTeam2(score11.getText(), score12.getText());
        int wins2 = tables.calcWinsTeam2(score11.getText(), score12.getText());
        int draws2 = tables.calcDrawsTeam2(score11.getText(), score12.getText());
        int losses2 = tables.calcLossesTeam2(score11.getText(), score12.getText());
        int gamesPlayed2 = tables.gamesPlayedTeam2();
        
        int points3 = tables.calcPtsTeam3(score12.getText(), score11.getText());
        int wins3 = tables.calcWinsTeam3(score12.getText(), score11.getText());
        int draws3 = tables.calcDrawsTeam3(score12.getText(), score11.getText());
        int losses3 = tables.calcLossesTeam3(score12.getText(), score11.getText());
        int gamesPlayed3 = tables.gamesPlayedTeam3();
        
        //int arrayPoints[] = {points1, points2, points3, points4};
        //Arrays.sort(arrayPoints);
        //sortTables mySortTables=new sortTables(points1, points2, points3, points4, wins1, wins2, wins3, wins4, draws1, draws2, draws3, draws4, losses1, losses2, losses3, losses4, gamesPlayed1, gamesPlayed2, gamesPlayed3, gamesPlayed4);
        //mySorter.sortPoints(points1, points2, points3, points4, wins1, wins2, wins3, wins4, draws1, draws2, draws3, draws4, losses1, losses2, losses3, losses4, gamesPlayed1, gamesPlayed2, gamesPlayed3, gamesPlayed4);
        
        //points1=mySorter.getPoints1();
        //points2=mySorter.getPoints2();
        //points3=mySorter.getPoints3();
        //points4=mySorter.getPoints4();
        //wins1=mySorter.getGamesWon1();
        //wins2=mySorter.getGamesWon2();
        //wins3=mySorter.getGamesWon3();
        //wins4=mySorter.getGamesWon4();
        //draws1=mySorter.getGamesDrew1();
        //draws2=mySorter.getGamesDrew2();
        //draws3=mySorter.getGamesDrew3();
        //draws4=mySorter.getGamesDrew4();
        //losses1=mySorter.getGamesLost1();
        //losses2=mySorter.getGamesLost2();
        //losses3=mySorter.getGamesLost3();
        //losses4=mySorter.getGamesLost4();
        //gamesPlayed1=mySorter.getGamesPlayed1();
        //gamesPlayed2=mySorter.getGamesPlayed2();
        //gamesPlayed3=mySorter.getGamesPlayed3();
        //gamesPlayed4=mySorter.getGamesPlayed4();
        
        team1points.setText(Integer.toString(points1));
        team1gamesPlayed.setText(Integer.toString(gamesPlayed1));
        team1gamesWon.setText(Integer.toString(wins1));
        team1gamesDrew.setText(Integer.toString(draws1));
        team1gamesLost.setText(Integer.toString(losses1));
        

        team2points.setText(Integer.toString(points2));
        team2gamesPlayed.setText(Integer.toString(gamesPlayed2));
        team2gamesWon.setText(Integer.toString(wins2));
        team2gamesDrew.setText(Integer.toString(draws2));
        team2gamesLost.setText(Integer.toString(losses2));
        

        team3points.setText(Integer.toString(points3));
        team3gamesPlayed.setText(Integer.toString(gamesPlayed3));
        team3gamesWon.setText(Integer.toString(wins3));
        team3gamesDrew.setText(Integer.toString(draws3));
        team3gamesLost.setText(Integer.toString(losses3));
        

        team4points.setText(Integer.toString(points4));
        team4gamesPlayed.setText(Integer.toString(gamesPlayed4));
        team4gamesWon.setText(Integer.toString(wins4));
        team4gamesDrew.setText(Integer.toString(draws4));
        team4gamesLost.setText(Integer.toString(losses4));
        

        team1points.setText(Integer.toString(points1));
        team1gamesPlayed.setText(Integer.toString(gamesPlayed1));
        team1gamesWon.setText(Integer.toString(wins1));
        team1gamesDrew.setText(Integer.toString(draws1));
        team1gamesLost.setText(Integer.toString(losses1));
        

        team3points.setText(Integer.toString(points3));
        team3gamesPlayed.setText(Integer.toString(gamesPlayed3));
        team3gamesWon.setText(Integer.toString(wins3));
        team3gamesDrew.setText(Integer.toString(draws3));
        team3gamesLost.setText(Integer.toString(losses3));
        

        team4points.setText(Integer.toString(points4));
        team4gamesPlayed.setText(Integer.toString(gamesPlayed4));
        team4gamesWon.setText(Integer.toString(wins4));
        team4gamesDrew.setText(Integer.toString(draws4));
        team4gamesLost.setText(Integer.toString(losses4));
        

        team2points.setText(Integer.toString(points2));
        team2gamesPlayed.setText(Integer.toString(gamesPlayed2));
        team2gamesWon.setText(Integer.toString(wins2));
        team2gamesDrew.setText(Integer.toString(draws2));
        team2gamesLost.setText(Integer.toString(losses2));
        

        team4points.setText(Integer.toString(points4));
        team4gamesPlayed.setText(Integer.toString(gamesPlayed4));
        team4gamesWon.setText(Integer.toString(wins4));
        team4gamesDrew.setText(Integer.toString(draws4));
        team4gamesLost.setText(Integer.toString(losses4));
        

        team1points.setText(Integer.toString(points1));
        team1gamesPlayed.setText(Integer.toString(gamesPlayed1));
        team1gamesWon.setText(Integer.toString(wins1));
        team1gamesDrew.setText(Integer.toString(draws1));
        team1gamesLost.setText(Integer.toString(losses1));
        

        team2points.setText(Integer.toString(points2));
        team2gamesPlayed.setText(Integer.toString(gamesPlayed2));
        team2gamesWon.setText(Integer.toString(wins2));
        team2gamesDrew.setText(Integer.toString(draws2));
        team2gamesLost.setText(Integer.toString(losses2));
        

        team3points.setText(Integer.toString(points3));
        team3gamesPlayed.setText(Integer.toString(gamesPlayed3));
        team3gamesWon.setText(Integer.toString(wins3));
        team3gamesDrew.setText(Integer.toString(draws3));
        team3gamesLost.setText(Integer.toString(losses3));
        

        
        
    }//GEN-LAST:event_grpAgame1BtnActionPerformed

    private void score1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score1ActionPerformed

    private void score3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score3ActionPerformed

    private void score4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score4ActionPerformed

    private void score5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score5ActionPerformed

    private void score6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score6ActionPerformed

    private void score7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score7ActionPerformed

    private void score8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score8ActionPerformed

    private void score9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score9ActionPerformed

    private void score10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score10ActionPerformed

    private void score11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score11ActionPerformed

    private void score12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_score12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_score12ActionPerformed

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //This section of code is giving the action performed methodsto each of the buttons on the odds panel.//
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void OddsOutrightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OddsOutrightBtnActionPerformed
closeOddsPnls();
OutrightOddsPnl.setVisible(true);
Odds odds = new Odds();
String[] allTeams = odds.getAllTeams();
String[] oddsOutright = odds.getoddsOutright();
     
     grpAOdds1Lbl.setText(oddsOutright[0]);
     grpAOdds2Lbl.setText(oddsOutright[1]);
     grpAOdds3Lbl.setText(oddsOutright[2]);
     grpAOdds4Lbl.setText(oddsOutright[3]);
     grpBOdds1Lbl.setText(oddsOutright[4]);
     grpBOdds2Lbl.setText(oddsOutright[5]);
     grpBOdds3Lbl.setText(oddsOutright[6]);
     grpBOdds4Lbl.setText(oddsOutright[7]);
     grpCOdds1Lbl.setText(oddsOutright[8]);
     grpCOdds2Lbl.setText(oddsOutright[9]);
     grpCOdds3Lbl.setText(oddsOutright[10]);
     grpCOdds4Lbl.setText(oddsOutright[11]);
     grpDOdds1Lbl.setText(oddsOutright[12]);
     grpDOdds2Lbl.setText(oddsOutright[13]);
     grpDOdds3Lbl.setText(oddsOutright[14]);
     grpDOdds4Lbl.setText(oddsOutright[15]);
     grpEOdds1Lbl.setText(oddsOutright[16]);
     grpEOdds2Lbl.setText(oddsOutright[17]);
     grpEOdds3Lbl.setText(oddsOutright[18]);
     grpEOdds4Lbl.setText(oddsOutright[19]);
     grpFOdds1Lbl.setText(oddsOutright[20]);
     grpFOdds2Lbl.setText(oddsOutright[21]);
     grpFOdds3Lbl.setText(oddsOutright[22]);
     grpFOdds4Lbl.setText(oddsOutright[23]);
     grpGOdds1Lbl.setText(oddsOutright[24]);
     grpGOdds2Lbl.setText(oddsOutright[25]);
     grpGOdds3Lbl.setText(oddsOutright[26]);
     grpGOdds4Lbl.setText(oddsOutright[27]);
     grpHOdds1Lbl.setText(oddsOutright[28]);
     grpHOdds2Lbl.setText(oddsOutright[29]);
     grpHOdds3Lbl.setText(oddsOutright[30]);
     grpHOdds4Lbl.setText(oddsOutright[31]);
     
     
     BrazilOutrightLbl.setText(allTeams[0]);
     CroatiaOutrightLbl.setText(allTeams[1]);  
     MexicoOutrightLbl.setText(allTeams[2]); 
     CameroonOutrightLbl.setText(allTeams[3]);  
     SpainOutrightLbl.setText(allTeams[4]); 
     NetherlandsOutrightLbl.setText(allTeams[5]); 
     ChileOutrightLbl.setText(allTeams[6]); 
     AustraliaOutrightLbl.setText(allTeams[7]); 
     ColombiaOutrightLbl.setText(allTeams[8]); 
     GreeceOutrightLbl.setText(allTeams[9]); 
     IvoryCoastOutrightLbl.setText(allTeams[10]); 
     JapanOutrightLbl.setText(allTeams[11]); 
     UruguayOutrightLbl.setText(allTeams[12]);
     CostaRicaOutrightLbl.setText(allTeams[13]);
     EnglandOutrightLbl.setText(allTeams[14]);
     ItalyOutrightLbl.setText(allTeams[15]);
     SwitzerlandOutrightLbl.setText(allTeams[16]);
     FranceOutrightLbl.setText(allTeams[17]);
     EcuadorOutrightLbl.setText(allTeams[18]);
     HondurasOutrightLbl.setText(allTeams[19]);
     ArgentinaOutrightLbl.setText(allTeams[20]);
     BosniaOutrightLbl.setText(allTeams[21]);
     IranOutrightLbl.setText(allTeams[22]);
     NigeriaOutrightLbl.setText(allTeams[23]);
     GermanyOutrightLbl.setText(allTeams[24]);
     PortugalOutrightLbl.setText(allTeams[25]);
     GhanaOutrightLbl.setText(allTeams[26]);
     USAOutrightLbl.setText(allTeams[27]);
     BelgiumOutrightLbl.setText(allTeams[28]);
     AlgeriaOutrightLbl.setText(allTeams[29]);
     RussiaOutrightLbl.setText(allTeams[30]);
     SouthKoreaOutrightLbl.setText(allTeams[31]);
     
    }//GEN-LAST:event_OddsOutrightBtnActionPerformed

    private void FinalOddsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalOddsBtnActionPerformed
closeOddsPnls();
FinalOddsPnl.setVisible(true);
    }//GEN-LAST:event_FinalOddsBtnActionPerformed

    private void SemiOddsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemiOddsBtnActionPerformed
closeOddsPnls();
SemiOddsPnl.setVisible(true);
    }//GEN-LAST:event_SemiOddsBtnActionPerformed

    private void QuarterOddsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuarterOddsBtnActionPerformed
closeOddsPnls();
QuarterOddsPnl.setVisible(true);
    }//GEN-LAST:event_QuarterOddsBtnActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int temp;
        
        if(evt.getSource() == jComboBox1)
        {
            temp = jComboBox1.getSelectedIndex();
            
            switch(temp){
            case 0: 
                closeRefereesPanel();
                ref1jPanel.setVisible(true);
                break;
            case 1:
                closeRefereesPanel();
                ref2jPanel.setVisible(true);
                break;
            case 2:
                closeRefereesPanel();
                ref3jPanel.setVisible(true);
                break;
            case 3:
                closeRefereesPanel();
                ref4jPanel.setVisible(true);
                break;
            case 4:
                closeRefereesPanel();
                ref5jPanel.setVisible(true);
                break;
            case 5:
                closeRefereesPanel();
                ref6jPanel.setVisible(true);
                break;
            case 6: 
                closeRefereesPanel();
                ref7jPanel.setVisible(true);
                break;
            case 7:
                closeRefereesPanel();
                ref8jPanel.setVisible(true);
                break;
            case 8:
                closeRefereesPanel();
                ref9jPanel.setVisible(true);
                break;
            case 9:
                closeRefereesPanel();
                ref10jPanel.setVisible(true);
                break;
            case 10:
                closeRefereesPanel();
                ref11jPanel.setVisible(true);
                break;
            case 11:
                closeRefereesPanel();
                ref12jPanel.setVisible(true);
                break;
           case 12: 
                closeRefereesPanel();
                ref13jPanel.setVisible(true);
                break;
            case 13:
                closeRefereesPanel();
                ref14jPanel.setVisible(true);
                break;
            case 14:
                closeRefereesPanel();
                ref15jPanel.setVisible(true);
                break;
            case 15:
                closeRefereesPanel();
                ref16jPanel.setVisible(true);
                break;
            case 16:
                closeRefereesPanel();
                ref17jPanel.setVisible(true);
                break;
            case 17:
                closeRefereesPanel();
                ref18jPanel.setVisible(true);
                break;
            case 18: 
                closeRefereesPanel();
                ref19jPanel.setVisible(true);
                break;
            case 19:
                closeRefereesPanel();
                ref20jPanel.setVisible(true);
                break;
            case 20:
                closeRefereesPanel();
                ref21jPanel.setVisible(true);
                break;
            case 21:
                closeRefereesPanel();
                ref22jPanel.setVisible(true);
                break;
            case 22:
                closeRefereesPanel();
                ref23jPanel.setVisible(true);
                break;
            case 23:
                closeRefereesPanel();
                ref24jPanel.setVisible(true);
                break;
            case 24:
                closeRefereesPanel();
                ref25jPanel.setVisible(true);
                break;    
            }
        }
    
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlgeriaOutrightLbl;
    private javax.swing.JLabel ArgentinaOutrightLbl;
    private javax.swing.JLabel AustraliaOutrightLbl;
    private javax.swing.JLabel BelgiumOutrightLbl;
    private javax.swing.JLabel BosniaOutrightLbl;
    private javax.swing.JLabel BrazilOutrightLbl;
    private javax.swing.JLabel CameroonOutrightLbl;
    private javax.swing.JLabel ChileOutrightLbl;
    private javax.swing.JLabel ColombiaOutrightLbl;
    private javax.swing.JLabel CostaRicaOutrightLbl;
    private javax.swing.JLabel CroatiaOutrightLbl;
    private javax.swing.JLabel EcuadorOutrightLbl;
    private javax.swing.JLabel EnglandOutrightLbl;
    private javax.swing.JButton FinalOddsBtn;
    private javax.swing.JPanel FinalOddsPnl;
    private javax.swing.JLabel FranceOutrightLbl;
    private javax.swing.JLabel GermanyOutrightLbl;
    private javax.swing.JLabel GhanaOutrightLbl;
    private javax.swing.JLabel GreeceOutrightLbl;
    private javax.swing.JLabel HondurasOutrightLbl;
    private javax.swing.JLabel IranOutrightLbl;
    private javax.swing.JLabel ItalyOutrightLbl;
    private javax.swing.JLabel IvoryCoastOutrightLbl;
    private javax.swing.JLabel JapanOutrightLbl;
    private javax.swing.JLabel MexicoOutrightLbl;
    private javax.swing.JLabel NetherlandsOutrightLbl;
    private javax.swing.JLabel NigeriaOutrightLbl;
    private javax.swing.JButton OddsOutrightBtn;
    private javax.swing.JPanel OutrightOddsPnl;
    private javax.swing.JLabel PortugalOutrightLbl;
    private javax.swing.JButton QuarterOddsBtn;
    private javax.swing.JPanel QuarterOddsPnl;
    private javax.swing.JLabel RussiaOutrightLbl;
    private javax.swing.JButton SemiOddsBtn;
    private javax.swing.JPanel SemiOddsPnl;
    private javax.swing.JLabel SouthKoreaOutrightLbl;
    private javax.swing.JLabel SpainOutrightLbl;
    private javax.swing.JLabel SwitzerlandOutrightLbl;
    private javax.swing.JLabel USAOutrightLbl;
    private javax.swing.JLabel UruguayOutrightLbl;
    private javax.swing.JButton brazilInfoBtn;
    private javax.swing.JPanel brazilInfoPnl;
    private javax.swing.JLabel cap0lbl;
    private javax.swing.JLabel cap10lbl;
    private javax.swing.JLabel cap11lbl;
    private javax.swing.JLabel cap12lbl;
    private javax.swing.JLabel cap1lbl;
    private javax.swing.JLabel cap2lbl;
    private javax.swing.JLabel cap3lbl;
    private javax.swing.JLabel cap4lbl;
    private javax.swing.JLabel cap5lbl;
    private javax.swing.JLabel cap6lbl;
    private javax.swing.JLabel cap7lbl;
    private javax.swing.JLabel cap8lbl;
    private javax.swing.JLabel cap9lbl;
    private javax.swing.JLabel city0lbl;
    private javax.swing.JLabel city10lbl;
    private javax.swing.JLabel city11lbl;
    private javax.swing.JLabel city12lbl;
    private javax.swing.JLabel city1lbl;
    private javax.swing.JLabel city2lbl;
    private javax.swing.JLabel city3lbl;
    private javax.swing.JLabel city4lbl;
    private javax.swing.JLabel city5lbl;
    private javax.swing.JLabel city6lbl;
    private javax.swing.JLabel city7lbl;
    private javax.swing.JLabel city8lbl;
    private javax.swing.JLabel city9lbl;
    private javax.swing.JButton fixturesBtn;
    private javax.swing.JPanel fixturesPnl;
    private javax.swing.JLabel game1team1;
    private javax.swing.JLabel game1team2;
    private javax.swing.JLabel game2team1;
    private javax.swing.JLabel game2team2;
    private javax.swing.JLabel game3team1;
    private javax.swing.JLabel game3team2;
    private javax.swing.JLabel game4team1;
    private javax.swing.JLabel game4team2;
    private javax.swing.JLabel game5team1;
    private javax.swing.JLabel game5team2;
    private javax.swing.JLabel game6team1;
    private javax.swing.JLabel game6team2;
    private javax.swing.JLabel gamesDrewHeading;
    private javax.swing.JLabel gamesLostHeading;
    private javax.swing.JLabel gamesPlayedHeading;
    private javax.swing.JLabel gamesWonHeading;
    private javax.swing.JButton groupAbtn;
    private javax.swing.JPanel groupApnl;
    private javax.swing.JButton groupBbtn;
    private javax.swing.JPanel groupBpnl;
    private javax.swing.JButton groupCbtn;
    private javax.swing.JPanel groupCpnl;
    private javax.swing.JButton groupDbtn;
    private javax.swing.JPanel groupDpnl;
    private javax.swing.JButton groupEbtn;
    private javax.swing.JPanel groupEpnl;
    private javax.swing.JButton groupFbtn;
    private javax.swing.JPanel groupFpnl;
    private javax.swing.JButton groupGbtn;
    private javax.swing.JPanel groupGpnl;
    private javax.swing.JButton groupHbtn;
    private javax.swing.JPanel groupHpnl;
    private javax.swing.JButton grpABtn;
    private javax.swing.JLabel grpAOdds1Lbl;
    private javax.swing.JLabel grpAOdds2Lbl;
    private javax.swing.JLabel grpAOdds3Lbl;
    private javax.swing.JLabel grpAOdds4Lbl;
    private javax.swing.JLabel grpAOutrightLbl;
    private javax.swing.JLabel grpAfixA1;
    private javax.swing.JLabel grpAfixA2;
    private javax.swing.JLabel grpAfixB1;
    private javax.swing.JLabel grpAfixB2;
    private javax.swing.JLabel grpAfixC1;
    private javax.swing.JLabel grpAfixC2;
    private javax.swing.JLabel grpAfixD1;
    private javax.swing.JLabel grpAfixD2;
    private javax.swing.JLabel grpAfixE1;
    private javax.swing.JLabel grpAfixE2;
    private javax.swing.JLabel grpAfixF1;
    private javax.swing.JLabel grpAfixF2;
    private javax.swing.JButton grpAgame1Btn;
    private javax.swing.JButton grpBBtn;
    private javax.swing.JLabel grpBOdds1Lbl;
    private javax.swing.JLabel grpBOdds2Lbl;
    private javax.swing.JLabel grpBOdds3Lbl;
    private javax.swing.JLabel grpBOdds4Lbl;
    private javax.swing.JLabel grpBOutrightLbl;
    private javax.swing.JLabel grpBVS1Lbl;
    private javax.swing.JLabel grpBVS2Lbl;
    private javax.swing.JLabel grpBVS3Lbl;
    private javax.swing.JLabel grpBVS4Lbl;
    private javax.swing.JLabel grpBVS5Lbl;
    private javax.swing.JLabel grpBVS6Lbl;
    private javax.swing.JLabel grpBfixA1;
    private javax.swing.JLabel grpBfixA2;
    private javax.swing.JLabel grpBfixB1;
    private javax.swing.JLabel grpBfixB2;
    private javax.swing.JLabel grpBfixC1;
    private javax.swing.JLabel grpBfixC2;
    private javax.swing.JLabel grpBfixD1;
    private javax.swing.JLabel grpBfixD2;
    private javax.swing.JLabel grpBfixE1;
    private javax.swing.JLabel grpBfixE2;
    private javax.swing.JLabel grpBfixF1;
    private javax.swing.JLabel grpBfixF2;
    private javax.swing.JPanel grpBgrpPnl;
    private javax.swing.JButton grpCBtn;
    private javax.swing.JLabel grpCOdds1Lbl;
    private javax.swing.JLabel grpCOdds2Lbl;
    private javax.swing.JLabel grpCOdds3Lbl;
    private javax.swing.JLabel grpCOdds4Lbl;
    private javax.swing.JLabel grpCOutrightLbl;
    private javax.swing.JLabel grpCVS1Lbl;
    private javax.swing.JLabel grpCVS2Lbl;
    private javax.swing.JLabel grpCVS3Lbl;
    private javax.swing.JLabel grpCVS4Lbl;
    private javax.swing.JLabel grpCVS5Lbl;
    private javax.swing.JLabel grpCVS6Lbl;
    private javax.swing.JLabel grpCfixA1;
    private javax.swing.JLabel grpCfixA2;
    private javax.swing.JLabel grpCfixB1;
    private javax.swing.JLabel grpCfixB2;
    private javax.swing.JLabel grpCfixC1;
    private javax.swing.JLabel grpCfixC2;
    private javax.swing.JLabel grpCfixD1;
    private javax.swing.JLabel grpCfixD2;
    private javax.swing.JLabel grpCfixE1;
    private javax.swing.JLabel grpCfixE2;
    private javax.swing.JLabel grpCfixF1;
    private javax.swing.JLabel grpCfixF2;
    private javax.swing.JPanel grpCgrpPnl;
    private javax.swing.JButton grpDBtn;
    private javax.swing.JLabel grpDOdds1Lbl;
    private javax.swing.JLabel grpDOdds2Lbl;
    private javax.swing.JLabel grpDOdds3Lbl;
    private javax.swing.JLabel grpDOdds4Lbl;
    private javax.swing.JLabel grpDOutrightLbl;
    private javax.swing.JLabel grpDVS1Lbl;
    private javax.swing.JLabel grpDVS2Lbl;
    private javax.swing.JLabel grpDVS3Lbl;
    private javax.swing.JLabel grpDVS4Lbl;
    private javax.swing.JLabel grpDVS5Lbl;
    private javax.swing.JLabel grpDVS6Lbl;
    private javax.swing.JLabel grpDfixA1;
    private javax.swing.JLabel grpDfixA2;
    private javax.swing.JLabel grpDfixB1;
    private javax.swing.JLabel grpDfixB2;
    private javax.swing.JLabel grpDfixC1;
    private javax.swing.JLabel grpDfixC2;
    private javax.swing.JLabel grpDfixD1;
    private javax.swing.JLabel grpDfixD2;
    private javax.swing.JLabel grpDfixE1;
    private javax.swing.JLabel grpDfixE2;
    private javax.swing.JLabel grpDfixF1;
    private javax.swing.JLabel grpDfixF2;
    private javax.swing.JPanel grpDgrpPnl;
    private javax.swing.JButton grpEBtn;
    private javax.swing.JLabel grpEOdds1Lbl;
    private javax.swing.JLabel grpEOdds2Lbl;
    private javax.swing.JLabel grpEOdds3Lbl;
    private javax.swing.JLabel grpEOdds4Lbl;
    private javax.swing.JLabel grpEOutrightLbl;
    private javax.swing.JLabel grpEVS1Lbl;
    private javax.swing.JLabel grpEVS2Lbl;
    private javax.swing.JLabel grpEVS3Lbl;
    private javax.swing.JLabel grpEVS4Lbl;
    private javax.swing.JLabel grpEVS5Lbl;
    private javax.swing.JLabel grpEVS6Lbl;
    private javax.swing.JLabel grpEfixA1;
    private javax.swing.JLabel grpEfixA2;
    private javax.swing.JLabel grpEfixB1;
    private javax.swing.JLabel grpEfixB2;
    private javax.swing.JLabel grpEfixC1;
    private javax.swing.JLabel grpEfixC2;
    private javax.swing.JLabel grpEfixD1;
    private javax.swing.JLabel grpEfixD2;
    private javax.swing.JLabel grpEfixE1;
    private javax.swing.JLabel grpEfixE2;
    private javax.swing.JLabel grpEfixF1;
    private javax.swing.JLabel grpEfixF2;
    private javax.swing.JPanel grpEgrpPnl;
    private javax.swing.JButton grpFBtn;
    private javax.swing.JLabel grpFOdds1Lbl;
    private javax.swing.JLabel grpFOdds2Lbl;
    private javax.swing.JLabel grpFOdds3Lbl;
    private javax.swing.JLabel grpFOdds4Lbl;
    private javax.swing.JLabel grpFOutrightLbl;
    private javax.swing.JLabel grpFVS1Lbl;
    private javax.swing.JLabel grpFVS2Lbl;
    private javax.swing.JLabel grpFVS3Lbl;
    private javax.swing.JLabel grpFVS4Lbl;
    private javax.swing.JLabel grpFVS5Lbl;
    private javax.swing.JLabel grpFVS6Lbl;
    private javax.swing.JLabel grpFfixA1;
    private javax.swing.JLabel grpFfixA2;
    private javax.swing.JLabel grpFfixB1;
    private javax.swing.JLabel grpFfixB2;
    private javax.swing.JLabel grpFfixC1;
    private javax.swing.JLabel grpFfixC2;
    private javax.swing.JLabel grpFfixD1;
    private javax.swing.JLabel grpFfixD2;
    private javax.swing.JLabel grpFfixE1;
    private javax.swing.JLabel grpFfixE2;
    private javax.swing.JLabel grpFfixF1;
    private javax.swing.JLabel grpFfixF2;
    private javax.swing.JPanel grpFgrpPnl;
    private javax.swing.JButton grpGBtn;
    private javax.swing.JLabel grpGOdds1Lbl;
    private javax.swing.JLabel grpGOdds2Lbl;
    private javax.swing.JLabel grpGOdds3Lbl;
    private javax.swing.JLabel grpGOdds4Lbl;
    private javax.swing.JLabel grpGOutrightLbl;
    private javax.swing.JLabel grpGVS1Lbl;
    private javax.swing.JLabel grpGVS2Lbl;
    private javax.swing.JLabel grpGVS3Lbl;
    private javax.swing.JLabel grpGVS4Lbl;
    private javax.swing.JLabel grpGVS5Lbl;
    private javax.swing.JLabel grpGVS6Lbl;
    private javax.swing.JLabel grpGfixA1;
    private javax.swing.JLabel grpGfixA2;
    private javax.swing.JLabel grpGfixB1;
    private javax.swing.JLabel grpGfixB2;
    private javax.swing.JLabel grpGfixC1;
    private javax.swing.JLabel grpGfixC2;
    private javax.swing.JLabel grpGfixD1;
    private javax.swing.JLabel grpGfixD2;
    private javax.swing.JLabel grpGfixE1;
    private javax.swing.JLabel grpGfixE2;
    private javax.swing.JLabel grpGfixF1;
    private javax.swing.JLabel grpGfixF2;
    private javax.swing.JPanel grpGgrpPnl;
    private javax.swing.JButton grpHBtn;
    private javax.swing.JLabel grpHOdds1Lbl;
    private javax.swing.JLabel grpHOdds2Lbl;
    private javax.swing.JLabel grpHOdds3Lbl;
    private javax.swing.JLabel grpHOdds4Lbl;
    private javax.swing.JLabel grpHOutrightLbl;
    private javax.swing.JLabel grpHVS1Lbl;
    private javax.swing.JLabel grpHVS2Lbl;
    private javax.swing.JLabel grpHVS3Lbl;
    private javax.swing.JLabel grpHVS4Lbl;
    private javax.swing.JLabel grpHVS5Lbl;
    private javax.swing.JLabel grpHVS6Lbl;
    private javax.swing.JLabel grpHfixA1;
    private javax.swing.JLabel grpHfixA2;
    private javax.swing.JLabel grpHfixB1;
    private javax.swing.JLabel grpHfixB2;
    private javax.swing.JLabel grpHfixC1;
    private javax.swing.JLabel grpHfixC2;
    private javax.swing.JLabel grpHfixD1;
    private javax.swing.JLabel grpHfixD2;
    private javax.swing.JLabel grpHfixE1;
    private javax.swing.JLabel grpHfixE2;
    private javax.swing.JLabel grpHfixF1;
    private javax.swing.JLabel grpHfixF2;
    private javax.swing.JPanel grpHgrpPnl;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton localAreaInfoBtn;
    private javax.swing.JPanel localAreaInfoPnl;
    private javax.swing.JButton mvpsBtn;
    private javax.swing.JPanel mvpsPnl;
    private javax.swing.JButton oddsBtn;
    private javax.swing.JPanel oddsPnl;
    private javax.swing.JPanel origPnl;
    private javax.swing.JButton playersBtn;
    private javax.swing.JPanel playersPnl;
    private javax.swing.JLabel pointsTotalHeading;
    private javax.swing.JPanel ref10jPanel;
    private javax.swing.JPanel ref11jPanel;
    private javax.swing.JPanel ref12jPanel;
    private javax.swing.JPanel ref13jPanel;
    private javax.swing.JPanel ref14jPanel;
    private javax.swing.JPanel ref15jPanel;
    private javax.swing.JPanel ref16jPanel;
    private javax.swing.JPanel ref17jPanel;
    private javax.swing.JPanel ref18jPanel;
    private javax.swing.JPanel ref19jPanel;
    private javax.swing.JPanel ref1jPanel;
    private javax.swing.JLabel ref1lbl;
    private javax.swing.JPanel ref20jPanel;
    private javax.swing.JPanel ref21jPanel;
    private javax.swing.JPanel ref22jPanel;
    private javax.swing.JPanel ref23jPanel;
    private javax.swing.JPanel ref24jPanel;
    private javax.swing.JPanel ref25jPanel;
    private javax.swing.JPanel ref2jPanel;
    private javax.swing.JLabel ref2lbl;
    private javax.swing.JPanel ref3jPanel;
    private javax.swing.JLabel ref3lbl;
    private javax.swing.JPanel ref4jPanel;
    private javax.swing.JLabel ref4lbl;
    private javax.swing.JPanel ref5jPanel;
    private javax.swing.JPanel ref6jPanel;
    private javax.swing.JPanel ref7jPanel;
    private javax.swing.JPanel ref8jPanel;
    private javax.swing.JPanel ref9jPanel;
    private javax.swing.JLabel refereeTextLbl;
    private javax.swing.JButton refereesBtn;
    private javax.swing.JLabel refereesHeadingLbl;
    private javax.swing.JPanel refereesPnl;
    private javax.swing.JButton rtwcBtn;
    private javax.swing.JPanel rtwcPnl;
    private javax.swing.JTextField score1;
    private javax.swing.JTextField score10;
    private javax.swing.JTextField score11;
    private javax.swing.JTextField score12;
    private javax.swing.JTextField score2;
    private javax.swing.JTextField score3;
    private javax.swing.JTextField score4;
    private javax.swing.JTextField score5;
    private javax.swing.JTextField score6;
    private javax.swing.JTextField score7;
    private javax.swing.JTextField score8;
    private javax.swing.JTextField score9;
    private javax.swing.JLabel stadium0lbl;
    private javax.swing.JLabel stadium10lbl;
    private javax.swing.JLabel stadium11lbl;
    private javax.swing.JLabel stadium12lbl;
    private javax.swing.JLabel stadium1lbl;
    private javax.swing.JLabel stadium2lbl;
    private javax.swing.JLabel stadium3lbl;
    private javax.swing.JLabel stadium4lbl;
    private javax.swing.JLabel stadium5lbl;
    private javax.swing.JLabel stadium6lbl;
    private javax.swing.JLabel stadium7lbl;
    private javax.swing.JLabel stadium8lbl;
    private javax.swing.JLabel stadium9lbl;
    private javax.swing.JButton stadiumsBtn;
    private javax.swing.JPanel stadiumsPnl;
    private javax.swing.JButton tablesBtn;
    private javax.swing.JPanel tablesPanel;
    private javax.swing.JPanel tablesPnl;
    private javax.swing.JLabel team1;
    private javax.swing.JLabel team1gamesDrew;
    private javax.swing.JLabel team1gamesLost;
    private javax.swing.JLabel team1gamesPlayed;
    private javax.swing.JLabel team1gamesWon;
    private javax.swing.JLabel team1points;
    private javax.swing.JLabel team2;
    private javax.swing.JLabel team2gamesDrew;
    private javax.swing.JLabel team2gamesLost;
    private javax.swing.JLabel team2gamesPlayed;
    private javax.swing.JLabel team2gamesWon;
    private javax.swing.JLabel team2points;
    private javax.swing.JLabel team3;
    private javax.swing.JLabel team3gamesDrew;
    private javax.swing.JLabel team3gamesLost;
    private javax.swing.JLabel team3gamesPlayed;
    private javax.swing.JLabel team3gamesWon;
    private javax.swing.JLabel team3points;
    private javax.swing.JLabel team4;
    private javax.swing.JLabel team4gamesDrew;
    private javax.swing.JLabel team4gamesLost;
    private javax.swing.JLabel team4gamesPlayed;
    private javax.swing.JLabel team4gamesWon;
    private javax.swing.JLabel team4points;
    private javax.swing.JButton teamsBtn;
    private javax.swing.JPanel teamsPnl;
    private javax.swing.JButton topScorersBtn;
    private javax.swing.JPanel topScorersPnl;
    // End of variables declaration//GEN-END:variables
}
