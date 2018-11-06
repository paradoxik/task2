package com.utm.task2;

import java.util.ArrayList;


public class Team {

    int i = 0;
    private String name;
    private ArrayList<Player> players = new ArrayList<>();


    Team() {
        this.name = "Unkown";
    }

    public void addPlayer(String name) {

        players.add(new Player());
        players.get(i).setname(name);

        i++;

    }

    public void set_scored(int j) {
        players.get(j).setScored();
    }

    public void getPlayerScored() {


    }

    public String getPlayerName(int j) {
        return players.get(j).getName();
    }

    public void show_players() {
        System.out.println(name + ":");
        for (int i = 0; i < this.i; i++) {
            System.out.println(players.get(i).getName());
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean findPlayer(String demoName){

        boolean k=false;
        int d=0,s=0;
        ArrayList<Integer> pozitiaDot =new ArrayList<Integer>(2);
        ArrayList<Integer> pozitiaSte =new ArrayList<Integer>(2);
        for (int i=0;i<demoName.length();i++) {
            if (demoName.charAt(i) == '.') {
                pozitiaDot.add(i);
                d++;
            }
            if (demoName.charAt(i) == '*') {
                pozitiaSte.add(i);
                s++;
            }

        }
//        ArrayList<PozitiaInLista> ppp = new ArrayList<>();
//        ppp.add(new PozitiaInLista(1, "d"));
//        System.out.println(ppp.get(0).getPozitia());



        System.out.println();


        for (int i = 0; i < this.i; i++) {
            if (d == 0)
                if(CheckName.checkAny(players.get(i).getName().toLowerCase(),demoName.toLowerCase()))
                {
                    System.out.println(players.get(i).getName()+" : from : "+name);
                k=true; }

            if (s == 0)
                if(CheckName.checkDot(players.get(i).getName().toLowerCase(),demoName.toLowerCase()))
                {
                    System.out.println(players.get(i).getName()+" : from : "+name);
                k=true;}
        }
        if(!k)
System.out.println("Nimic de la : "+name);
        return false;
    }



}
