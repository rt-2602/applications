package com.rashmi;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team> {
    String name;

    public League(String name) {
        this.name = name;
    }

    ArrayList<T> teamList = new ArrayList<>();

    public boolean addTeam(T team) {
        if (team != null) {
            if (teamList.contains(team)) {
                System.out.println(team.getName() + " team already added ");
                return false;
            } else {
                teamList.add(team);
                return true;
            }
        } else {
            System.out.println("Null team not added");
            return false;

        }
    }

    public void listOfTeam(){
      Collections.sort(teamList);
        for(T t : teamList){
            System.out.println(t.getName() + " : " + t.ranking());
        }
    }
    }
