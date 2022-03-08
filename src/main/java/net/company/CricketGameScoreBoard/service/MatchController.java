package net.company.CricketGameScoreBoard.service;

import net.company.CricketGameScoreBoard.model.Result;

public class MatchController {
  private final Match match;
  private long matchId = (long) (Math.random() * 10000000);

  public long getMatchId() {
    return matchId;
  }

  public MatchController(Match match) {
    this.match = match;
  }

  public Result start(Team team1, Team team2, long matchId) {

    Result result = match.play(team1, team2, matchId);

    return result;
  }
}
