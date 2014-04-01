/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldcupapp;

/**
 *
 * @author Ciaran
 */
public class Fixtures extends Teams{
    
    private String[] groups = {"Group A", "Group B", "Group C", "Group D", "Group E", "Group F", "Group G", "Group H"};
    
    public Fixtures(){
         
    }

    
    public Fixtures(String[] allTeams, String[] groups){
     super(allTeams);  
     this.groups=groups;

    }
    
    public String[] getGroups() {
        return groups;
    }
}
