/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldcupapp;

/**
 *
 * @author conor
 */
public class TablesTest extends Fixtures{
    private String topTeam, team1, team2, team3, team4;
    private int points1;
    private int points2;
    private int points3;
    private int points4;
    private int gamesWon1;
    private int gamesWon2;
    private int gamesWon3;
    private int gamesWon4;
    private int gamesDrew1;
    private int gamesDrew2;
    private int gamesDrew3;
    private int gamesDrew4;
    private int gamesLost1;
    private int gamesLost2;
    private int gamesLost3;
    private int gamesLost4;
    private int gamesPlayed1;
    private int gamesPlayed2;
    private int gamesPlayed3;
    private int gamesPlayed4;
    //private int goalsScored, goalsConceded, gamesWon, gamesDrew, gamesLost, gamesPlayed, points;
    
    public TablesTest(){
    }
    
    public TablesTest(String[] allTeams, String[] groups, String topTeam){
        super(allTeams, groups);
        this.topTeam=topTeam;
    }

    public String getTopTeam() {
        return topTeam;
    }
    
    public int calcPtsTeam1(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            points1=points1+3;
        }
        else if(x==y){
            points1++;
        }
        return points1;
    }
    
    public int calcPtsTeam2(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            points2=points2+3;
        }
        else if(x==y){
            points2++;
        }
        return points2;
    }
        
    public int calcPtsTeam3(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            points3=points3+3;
        }
        else if(x==y){
            points3++;
        }
        return points3;
    }
    
    public int calcPtsTeam4(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            points4=points4+3;
        }
        else if(x==y){
            points4++;
        }
        return points4;
    }
    
    public int calcWinsTeam1(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            gamesWon1++;
        }
        return gamesWon1;
    }
    
    public int calcWinsTeam2(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            gamesWon2++;
        }
        return gamesWon2;
    }
    
    public int calcWinsTeam3(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            gamesWon3++;
        }
        return gamesWon3;
    }
    
    public int calcWinsTeam4(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x>y){
            gamesWon4++;
        }
        return gamesWon4;
    }
    
    public int calcLossesTeam1(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x<y){
            gamesLost1++;
        }
        return gamesLost1;
    }
    
    public int calcLossesTeam2(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x<y){
            gamesLost2++;
        }
        return gamesLost2;
    }
    
    public int calcLossesTeam3(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x<y){
            gamesLost3++;
        }
        return gamesLost3;
    }
    
    public int calcLossesTeam4(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x<y){
            gamesLost4++;
        }
        return gamesLost4;
    }
    
    public int calcDrawsTeam1(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x==y){
            gamesDrew1++;
        }
        return gamesDrew1;
    }
    
    public int calcDrawsTeam2(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x==y){
            gamesDrew2++;
        }
        return gamesDrew2;
    }
    
    public int calcDrawsTeam3(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x==y){
            gamesDrew3++;
        }
        return gamesDrew3;
    }
    
    public int calcDrawsTeam4(String goalsScored, String goalsConceded){
        Integer x = Integer.valueOf(goalsScored);
        Integer y = Integer.valueOf(goalsConceded);
        if(x==y){
            gamesDrew4++;
        }
        return gamesDrew4;
    }
    
    public int gamesPlayedTeam1(){
        gamesPlayed1++;
        return gamesPlayed1;
    }
    
    public int gamesPlayedTeam2(){
        gamesPlayed2++;
        return gamesPlayed2;
    }
    
    public int gamesPlayedTeam3(){
        gamesPlayed3++;
        return gamesPlayed3;
    }
    
    public int gamesPlayedTeam4(){
        gamesPlayed4++;
        return gamesPlayed4;
    }
}
