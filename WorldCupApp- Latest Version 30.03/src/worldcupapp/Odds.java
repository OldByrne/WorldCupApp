/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldcupapp;

/**
 *
 * @author KevinC
 */
public class Odds extends Teams {   
private String[] oddsOutright = {"3/1","125/1","125/1","500/1","7/1","22/1","40/1","500/1","25/1","200/1","100/1","150/1","25/1","2000/1","25/1","25/1","100/1","125/1","22/1","3000/1","5/1","150/1","1500/1","200/1","11/2","33/1","150/1","150/1","14/1","2000/1","66/1","300/1"};
private String[] oddsFinal = {"9/5","40/1","45/1","200/1","16/5","8/1","25/1","250/1","10/1","100/1","45/1","66/1","10/1","500/1","11/1","9/1","30/1","55/1","9/1","500/1","2/1","45/1","375/1","66/1","9/4","10/1","70/1","70/1","6/1","425/1","25/1","90/1"};
private String[] oddsSemi = {"5/6","14/1","14/1","55/1","6/4","7/2","10/1","66/1","9/2","30/1","14/1","20/1","9/2","200/1","5/1","4/1","10/1","16/1","7/2","125/1","5/6","13/1","Iran","Nigeria","Germany","Portugal","Ghana","USA","Belgium","Algeria","Russia","South Korea"};
private String [] oddsQuarter = {"Brazil","Croatia","Mexico","Cameroon","Spain","Netherlands","Chile","Australia","Colombia","Greece","Ivory Coast","Japan","Uruguay","Costa Rica","England","Italy","Switzerland","Ecuador","France","Honduras","Argentina","Bosnia","Iran","Nigeria","Germany","Portugal","Ghana","USA","Belgium","Algeria","Russia","South Korea"};
public Odds(){
         
    }

    
    public Odds(String[] allTeams, String[] groups){
     super(allTeams);  
     this.oddsOutright = oddsOutright;

    }
    
    
public String[] getoddsOutright() {
        return oddsOutright;
    }
    
    
   
public String[] getoddsFinal() {
        return oddsFinal;
    }

public String[] getoddsSemi() {
        return oddsSemi;
    }

public String[] getoddsQuarter() {
        return oddsQuarter;
    }
    
}




