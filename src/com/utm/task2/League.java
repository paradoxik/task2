package com.utm.task2;

import java.util.ArrayList;

public class League {
private Game game =new Game();
private ArrayList<String> tname=new ArrayList<>();
private ArrayList<String> team_1_Players=new ArrayList<>();
private ArrayList<String> team_2_Players=new ArrayList<>();
private ArrayList<Double> time=new ArrayList<>();


League(){

    this.tname.add("Reds");
    this.tname.add("Greens");
    this.team_1_Players.add("Robert Service");
    this.team_1_Players.add("Robbie Burns");
    this.team_1_Players.add("Rafael Sabatini");

    this.team_2_Players.add("George Eliot");
    this.team_2_Players.add("Graham Greene");
    this.team_2_Players.add("Geoffrey Chaucer");

    this.time.add(12.0);
    this.time.add(23.0);
    this.time.add( 55.0);
}

public  void instantiaza(){

    game.setTeam(this.tname.get(0),this.team_1_Players);
    game.setTeam(this.tname.get(1),this.team_2_Players);

    game.setGoal(1,2,this.time.get(0));
    game.setGoal(1,1,this.time.get(1));
    game.setGoal(0,0,this.time.get(2));

    game.showTeams();
    game.ShowGame();
String demoName ="*Green";
game.findPlayer(demoName);
}


}
