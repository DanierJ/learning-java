package com.danjerous;

import java.util.ArrayList;

/// Bounded type parameter  upper bound T extends ClassPlayer & ICoach & IManager
public class Team<T extends Player> implements Comparable<Team<T>>{
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;


    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer (T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + "is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println( player.getName() + " picked for team " + name);
            return true;
        }
    }

    public int numPlayer() {
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String msg;
        if (ourScore > theirScore){
            won++;
            msg = " beat ";
        } else if (ourScore == theirScore) {
            tied++;
            msg = " drew with ";
        } else {
            lost++;
            msg = " lost to ";
        }
        played++;

        if (opponent != null) {
            System.out.println(getName()  + msg + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
       if (this.ranking() > team.ranking()) {
           return -1;
       } else if (this.ranking() < team.ranking()) {
           return 1;
       } else {
           return 0;
       }
    }
}
