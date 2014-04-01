/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldcupapp;

/**
 *
 * @author Dave
 */
public class Teams {

    private String allTeams [] = {"Brazil","Croatia","Mexico","Cameroon","Spain","Netherlands","Chile","Australia","Colombia","Greece","Ivory Coast","Japan","Uruguay","Costa Rica","England","Italy","Switzerland","Ecuador","France","Honduras","Argentina","Bosnia","Iran","Nigeria","Germany","Portugal","Ghana","USA","Belgium","Algeria","Russia","South Korea"};;

    public Teams(){
        //allTeams = new String[31];
    }

    
    public Teams(String[] allTeams){
        this.allTeams=allTeams;
        }
        
    //getters for each array of teams by region
   

    public String[] getAllTeams() {
        return allTeams;
    }
    

        
}
