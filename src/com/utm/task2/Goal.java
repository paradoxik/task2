package com.utm.task2;

public class Goal {
    private int ngoal = 0;
    private Team[] teams = new Team[2];
    private double time[] = new double[3];
    private int i = 0, j = 0;

    public void setGoal(int team, int player, double time) {
        if (teams[team] == null) teams[team] = new Team();
        this.time[j] = time;
        j++;
        teams[team].set_scored(player);
        ngoal++;
    }

    public void setTeam(String tname, String[] pnames) {
        teams[i] = new Team();
        teams[i].setName(tname);

        for (int g = 0; g < pnames.length; g++) {
            teams[i].

                    add_Player(pnames[g]);
        }

        i++;
    }

    public void Show_teams() {
        teams[1].show_players();
        System.out.println();


        teams[0].show_players();
        System.out.println();

    }

    public void ShowGoals() {


        System.out.println("Goals: ");
        System.out.println("Goal scored afret " + time[0] + " mins by " + teams[1].getPlayerName(2) + " of the " + teams[1].getName());
        System.out.println("Goal scored afret " + time[1] + " mins by " + teams[1].getPlayerName(1) + " of the " + teams[1].getName());
        System.out.println("Goal scored afret " + time[2] + " mins by " + teams[0].getPlayerName(0) + " of the " + teams[0].getName());

    }


}
