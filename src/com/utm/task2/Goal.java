package com.utm.task2;

import java.util.ArrayList;

public class Goal {
    private int ngoal = 0;
    private ArrayList<Team> teams = new ArrayList<>();
    private double time[] = new double[3];
    private int i = 0, j = 0;

    public void setGoal(int team, int player, double time) {
        if (teams.get(team) == null) teams.add(new Team());
        this.time[j] = time;
        j++;
        teams.get(team).set_scored(player);
        ngoal++;
    }

    public void setTeam(String tname, ArrayList<String> pnames) {
        teams.add(new Team());
        teams.get(i).setName(tname);

        for (int g = 0; g < pnames.size(); g++) {
            teams.get(i). addPlayer(pnames.get(g));
        }

        i++;
    }

    public void Show_teams() {
        teams.get(1).show_players();
        System.out.println();


        teams.get(0).show_players();
        System.out.println();

    }

    public void ShowGoals() {


        System.out.println("Goals: ");
        System.out.println("Goal scored afret " + time[0] + " mins by " + teams.get(1).getPlayerName(2) + " of the " + teams.get(1).getName());
        System.out.println("Goal scored afret " + time[1] + " mins by " + teams.get(1).getPlayerName(1) + " of the " + teams.get(1).getName());
        System.out.println("Goal scored afret " + time[2] + " mins by " + teams.get(0).getPlayerName(0) + " of the " + teams.get(0).getName());

    }

public boolean findNameFromTeem(String demoName){

        boolean b1=false,b2;
        b1= teams.get(0).findPlayer(demoName);
        b2=teams.get(1).findPlayer(demoName);
        return b1&&b2;
}

}
