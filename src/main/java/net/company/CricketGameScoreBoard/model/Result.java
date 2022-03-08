package net.company.CricketGameScoreBoard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Result {
  @Id private long matchId;

  public long getMatchId() {
    return matchId;
  }

  public void setMatchId(long matchId) {
    this.matchId = matchId;
  }

  String firstTeamName;
  String SecondTeamName;
  String winnerTeam;
  String firstTeamScore;
  String secondTeamScore;

  private int run;

  private int wicket;

  public String getFirstTeamName() {
    return firstTeamName;
  }

  public void setFirstTeamName(String firstTeamName) {
    this.firstTeamName = firstTeamName;
  }

  public String getSecondTeamName() {
    return SecondTeamName;
  }

  public void setSecondTeamName(String secondTeamName) {
    SecondTeamName = secondTeamName;
  }

  public String getFirstTeamScore() {
    return firstTeamScore;
  }

  public void setFirstTeamScore(String firstTeamScore) {
    this.firstTeamScore = firstTeamScore;
  }

  public String getSecondTeamScore() {
    return secondTeamScore;
  }

  public void setSecondTeamScore(String secondTeamScore) {
    this.secondTeamScore = secondTeamScore;
  }

  public void setRun(int run) {
    this.run = run;
  }

  public int getRun() {
    return run;
  }

  public void setWicket(int wicket) {
    this.wicket = wicket;
  }

  public int getWicket() {
    return wicket;
  }

  public void setWinnerTeam(String winnerTeam) {
    this.winnerTeam = winnerTeam;
  }

  public String getWinnerTeam() {
    return winnerTeam;
  }
}
