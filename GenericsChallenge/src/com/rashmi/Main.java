package com.rashmi;

public class Main {

    public static void main(String[] args) {

        // cricket team

        CricketPlayer joe = new CricketPlayer("Joe");
        Team<CricketPlayer> cricket1 = new Team<>("Cricket team 1");
        //CricketTeam cricketTeam1 = new CricketTeam("Cricket team 1");
        cricket1.addPlayer(joe);



        CricketPlayer tim = new CricketPlayer("Tim");
        Team<CricketPlayer> cricket2 = new Team<>("Cricket team 2");
        cricket2.addPlayer(tim);

        CricketPlayer bob = new CricketPlayer("Bob");
        Team<CricketPlayer> cricket3 = new Team<>("Cricket team 3");
        cricket3.addPlayer(bob);

        // Football team

        FootballPlayer jon = new FootballPlayer("Jon");
        Team<FootballPlayer>  football1 = new Team<>("Football 1");
        football1.addPlayer(jon);

        FootballPlayer ros = new FootballPlayer("Ros");
        Team<FootballPlayer> football2 = new Team("Football 2");
        football2.addPlayer(ros);

        // soccer team

        SoccerPlayer ted = new SoccerPlayer("Ted");
        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Soccer 1");
        soccerPlayerTeam.addPlayer(ted);


        SoccerPlayer robin = new SoccerPlayer("Robin");
        Team<SoccerPlayer> soccerPlayerTeam1 = new Team<>("Soccer 2");
        soccerPlayerTeam.addPlayer(robin);


        // match result
        cricket1.matchResult(cricket2,1,0);
        cricket2.matchResult(cricket3,0,1);
        cricket3.matchResult(cricket1,3,8);

        football1.matchResult(football2,2,2);
        football2.matchResult(football1,0,1);

        soccerPlayerTeam.matchResult(soccerPlayerTeam1,0,1);
        soccerPlayerTeam1.matchResult(soccerPlayerTeam,0,0);

        //Rankings

        System.out.println("Cricket team rankings \n 1. " +cricket1.ranking() + " \n 2. " + cricket2.ranking() + " \n 3. " +cricket1.ranking());

        System.out.println("Football team rankings \n 1. " +football1.ranking() +" \n 2. " + football2.ranking());

        System.out.println("Soccer team rankings \n 1. " +soccerPlayerTeam.ranking() + " \n 2. " +soccerPlayerTeam1.ranking());

        League<Team<FootballPlayer>> league = new League("Football league");
        league.addTeam(football1);
        league.addTeam(football2);
        league.listOfTeam();

        League<Team<CricketPlayer>> league1 = new League("Cricket league");
        league1.addTeam(cricket1);
        league1.addTeam(cricket2);
        league1.addTeam(cricket3);
        league1.listOfTeam();

        League<Team<SoccerPlayer>> league2 = new League("Football league");
        league2.addTeam(soccerPlayerTeam);
        league2.addTeam(soccerPlayerTeam1);
        league2.listOfTeam();


    }
}
