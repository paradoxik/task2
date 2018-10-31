package com.utm.task2;

public class Team {

    int i = 0;
    private String name;
    private Player[] players = new Player[3];


    Team() {
        this.name = "Unkown";
    }

    public void add_Player(String name) {

        players[i] = new Player();
        players[i].setname(name);

        i++;

    }

    public void set_scored(int j) {
        players[j].setScored();
    }

    public void getPlayerScored() {


    }

    public String getPlayerName(int j) {
        return players[j].getName();
    }

    public void show_players() {
        System.out.println(name + ":");
        for (int i = 0; i < this.i; i++) {
            System.out.println(players[i].getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
