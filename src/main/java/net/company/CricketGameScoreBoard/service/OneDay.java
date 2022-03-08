package net.company.CricketGameScoreBoard.service;

import net.company.CricketGameScoreBoard.model.Result;
import org.springframework.stereotype.Component;

@Component
public class OneDay implements Match {

  @Override
  public Result play(Team team1, Team team2, long matchId) {
    Result result = new Result();
    result.setMatchId(matchId);
    Inning inning1 = new Inning();
    System.out.println(team1.name + " going to bat first");
    inning1.batting(team1, 366, team2);
    result.setFirstTeamName(team1.name);
    result.setFirstTeamScore(
        Integer.toString(inning1.getRun()) + "/" + Integer.toString(inning1.getWicket()));
    System.out.println(
        "Final Score of "
            + team1.name
            + " team is: "
            + inning1.getRun()
            + "/"
            + inning1.getWicket());
    Inning inning2 = new Inning();
    inning2.batting(team2, inning1.getRun() + 1, team1);
    result.setSecondTeamName(team2.name);
    result.setSecondTeamScore(
        Integer.toString(inning2.getRun()) + "/" + Integer.toString(inning2.getWicket()));
    System.out.println(
        "Final Score of "
            + team2.name
            + " team is: "
            + inning2.getRun()
            + "/"
            + inning2.getWicket());
    if (inning1.getRun() > inning2.getRun()) {
      result.setRun(inning1.getRun() - inning2.getRun());
      result.setWinnerTeam(team1.name);
    } else {
      result.setWinnerTeam(team2.name);
      result.setWicket(10 - inning2.getWicket());
    }
    return result;
  }
}
