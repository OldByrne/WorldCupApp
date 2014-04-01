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
public class Stadiums {
    
    //variables
    String [] stadium1 = {"Estadio do Maracana", "Rio de Janeiro", "76,935"};
    String [] stadium2 = {"Estádio Nacional Mané", "Brasilia", "70,042"};
    String [] stadium3 = {"Arena Corinthians", "Sao Paulo", "68,000"};
    String [] stadium4 = {"Estádio Castelão", "Fortaleza", "64,846"};
    String [] stadium5 = {"Estadio Beira-Rio", "Porto Alegre", "51,300"};
    String [] stadium6 = {"Arena Pernambuco", "Recife", "46,154"};
    String [] stadium7 = {"Arena da Baixada", "Curitiba", "43,981"};
    String [] stadium8 = {"Arena das Dunas", "Natal", "42,086"};
    String [] stadium9 = {"Arena da Amazonia", "Manaus", "42,374"};
    String [] stadium10 = {"Arena Pantanal", "Cuiaba", "42,968"};
    String [] stadium11 = {"Arena Fonte Nova", "Salvador", "56,000"};
    String [] stadium12 = {"Estadio Mineirao", "Belo Horizonte", "62,547"};
    String [][] stadiums = new String [][] {stadium1, stadium2, stadium3, stadium4, stadium5, stadium6, stadium7, stadium8, stadium9, stadium10, stadium11, stadium12};

    public Stadiums(){
    }

    
    public Stadiums(String[][] stadiums){
        this.stadiums=stadiums;
    }

    public String[][] getStadiums() {
        return stadiums;
    }            
}