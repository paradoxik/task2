package com.utm.task2;

import java.util.ArrayList;

public class Game {

private Goal goal=new Goal();


    public void setGoal(int team,int player,double time) {

        goal.setGoal(team,player,time);
    }

    public void setTeam(String tname, ArrayList<String> pnames){
        goal.
                setTeam(tname,pnames);

    }

    public void showTeams(){
        goal.Show_teams();

    }
public void ShowGame(){
        goal.ShowGoals();
}

public void findPlayer(String demoName){

        goal.findNameFromTeem(demoName);
}


}
