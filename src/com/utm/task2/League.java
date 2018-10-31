package com.utm.task2;

public class League {
private Game game =new Game();
private String[] tname=new String[2];
private String[] team_1_Players=new String[3];
private String[] team_2_Players=new String[3];
private double[] time=new double[3];


League(){
    this.tname[0]="Reds";
    this.tname[1]="Greens";
    this.team_1_Players[0]="Robert Service";
    this.team_1_Players[1]="Robbie Burns";
    this.team_1_Players[2]="Rafael Sabatini";

    this.team_2_Players[0]="George Eliot";
    this.team_2_Players[1]="Graham Greene";
    this.team_2_Players[2]="Geoffrey Chaucer";

    this.time[0]=12.0;
    this.time[1]=23.0;
    this.time[2]=55.0;
}

public  void instantiaza(){

    game.setTeam(this.tname[0],this.team_1_Players);
    game.setTeam(this.tname[1],this.team_2_Players);

    game.setGoal(1,2,this.time[0]);
    game.setGoal(1,1,this.time[1]);
    game.setGoal(0,0,this.time[2]);

    game.showTeams();
    game.ShowGame();
}


}
