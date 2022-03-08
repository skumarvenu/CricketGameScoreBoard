package net.company.CricketGameScoreBoard.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "battingScoreCards")
@IdClass(BatsmanScorePKId.class)
public class BatsmanScoreCard {
  @Id private String playerId;
  @Id private String teamName;

  @Id private long matchId;

  private int runs;

  private int boundary;

  private int balls;

  public int getRuns() {
    return runs;
  }

  public void setRuns(int runs) {
    this.runs = runs;
  }

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

  public int getBoundary() {
    return boundary;
  }

  public void setBoundary(int boundary) {
    this.boundary = boundary;
  }

  public int getBalls() {
    return balls;
  }

  public void setBalls(int balls) {
    this.balls = balls;
  }
}
