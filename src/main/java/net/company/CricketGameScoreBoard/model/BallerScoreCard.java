package net.company.CricketGameScoreBoard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ballingScoreCards")
@IdClass(BallerScorePKid.class)
public class BallerScoreCard {

  @Id private String playerId;
  @Id private String teamName;

  @Id private long matchId;
  private int noOfOvers;
  private int runsGiven;
  private int wicketTaken;
  private int noOfMaidenOvers;

  public String getPlayerId() {
    return playerId;
  }

  public void setPlayerId(String playerId) {
    this.playerId = playerId;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public long getMatchId() {
    return matchId;
  }

  public void setMatchId(long matchId) {
    this.matchId = matchId;
  }

  public int getNoOfOvers() {
    return noOfOvers;
  }

  public void setNoOfOvers(int noOfOvers) {
    this.noOfOvers = noOfOvers;
  }

  public int getRunsGiven() {
    return runsGiven;
  }

  public void setRunsGiven(int runsGiven) {
    this.runsGiven = runsGiven;
  }

  public int getWicketTaken() {
    return wicketTaken;
  }

  public void setWicketTaken(int wicketTaken) {
    this.wicketTaken = wicketTaken;
  }

  public int getNoOfMaidenOvers() {
    return noOfMaidenOvers;
  }

  public void setNoOfMaidenOvers(int noOfMaidenOvers) {
    this.noOfMaidenOvers = noOfMaidenOvers;
  }
}
