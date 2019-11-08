package com.rashmi;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    String name;
    int won;
    int lost;
    int played;
    int ranking;
    int tied;


    ArrayList<T> team = new ArrayList<>();


    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player){
        if(team.contains(player)){
            System.out.println(player.getName() + " Player already in the team ");
            return false;
        }else{
            team.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }


    public int ranking(){
        //ranking = (won * 2) + tied;
        return (won * 2) + tied;
    }

    public int numOfplayers(){
        return this.team.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message = "";
        if(ourScore > theirScore){
            won++;
            message = "won to";
        }else if(ourScore < theirScore){
            lost++;
            message = "lost to";
        }else if(ourScore == theirScore){
            tied++;
            message = "tie to";
        }
        //ranking = (won * 2) + tied;
        played++;

        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }

    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else {
            return 0;
        }
    }
}
