/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldcupapp;


public class sortTables {
    
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
    
    
    public void sortPoints(int points1, int points2, int points3, int points4, int gamesWon1, int gamesWon2, int gamesWon3, int gamesWon4, int gamesDrew1, int gamesDrew2, int gamesDrew3, int gamesDrew4, int gamesLost1, int gamesLost2, int gamesLost3, int gamesLost4, int gamesPlayed1, int gamesPlayed2, int gamesPlayed3, int gamesPlayed4){
        this.points1=points1;
        this.points2=points2;
        this.points3=points3;
        this.points4=points3;
        this.gamesWon1=gamesWon1;
        this.gamesWon2=gamesWon2;
        this.gamesWon3=gamesWon3;
        this.gamesWon4=gamesWon4;
        this.gamesDrew1=gamesDrew1;
        this.gamesDrew2=gamesDrew2;
        this.gamesDrew3=gamesDrew3;
        this.gamesDrew4=gamesDrew4;
        this.gamesLost1=gamesLost1;
        this.gamesLost2=gamesLost2;
        this.gamesLost3=gamesLost3;
        this.gamesLost4=gamesLost4;
        this.gamesPlayed1=gamesPlayed1;
        this.gamesPlayed2=gamesPlayed2;
        this.gamesPlayed3=gamesPlayed3;
        this.gamesPlayed4=gamesPlayed4;
        
        if(points1>=points2 && points1>=points3 && points1>=points4 && points2>=points3 && points2>=points4 && points4>points3){
            int tempPoints = points3;
            points3 = points4;
            points4 = tempPoints;
            int tempGamesWon = gamesWon3;
            gamesWon3 = gamesWon4;
            gamesWon4 = tempGamesWon;
            int tempGamesDrew = gamesDrew3;
            gamesDrew3 = gamesDrew4;
            gamesDrew4 = tempGamesDrew;
            int tempGamesLost = gamesLost3;
            gamesLost3 = gamesLost4;
            gamesLost4 = tempGamesLost;
            int tempGamesPlayed = gamesPlayed3;
            gamesPlayed3 = gamesPlayed4;
            gamesPlayed4 = tempGamesPlayed;
        }
    }

    public int getPoints1() {
        return points1;
    }

    public int getPoints2() {
        return points2;
    }

    public int getPoints3() {
        return points3;
    }

    public int getPoints4() {
        return points4;
    }

    public int getGamesWon1() {
        return gamesWon1;
    }

    public int getGamesWon2() {
        return gamesWon2;
    }

    public int getGamesWon3() {
        return gamesWon3;
    }

    public int getGamesWon4() {
        return gamesWon4;
    }

    public int getGamesDrew1() {
        return gamesDrew1;
    }

    public int getGamesDrew2() {
        return gamesDrew2;
    }

    public int getGamesDrew3() {
        return gamesDrew3;
    }

    public int getGamesDrew4() {
        return gamesDrew4;
    }

    public int getGamesLost1() {
        return gamesLost1;
    }

    public int getGamesLost2() {
        return gamesLost2;
    }

    public int getGamesLost3() {
        return gamesLost3;
    }

    public int getGamesLost4() {
        return gamesLost4;
    }

    public int getGamesPlayed1() {
        return gamesPlayed1;
    }

    public int getGamesPlayed2() {
        return gamesPlayed2;
    }

    public int getGamesPlayed3() {
        return gamesPlayed3;
    }

    public int getGamesPlayed4() {
        return gamesPlayed4;
    }
    
    
}
