package net.company.CricketGameScoreBoard.service;



public class Player {
  private final PlayerRole playerMatchRole;
  private int noOfOvers;
  private int runsGiven;
  private int wicketTaken;
  private int noOfMaidenOvers;
  private int noOfRuns;
  private int noOfBall;
  private int noOfBoundary;
  private String playerId;

  public Player(String playerId, PlayerRole playerMatchRole) {
    this.playerMatchRole = playerMatchRole;
    this.playerId = playerId;
  }

  public String getPlayerName() {
    return playerId;
  }

  public int getNoOfBall() {
    return noOfBall;
  }

  public int getNoOfRuns() {
    return noOfRuns;
  }

  public int getNoOfBoundary() {
    return noOfBoundary;
  }

  public void incrementNoOfBall() {
    noOfBall += 1;
  }

  public void incrementNoOfBoundary() {
    noOfBoundary += 1;
  }

  public void incrementNoOfRuns(int hitPerBall) {
    noOfRuns += hitPerBall;
  }

  public int getNoOfMaidenOvers() {
    return noOfMaidenOvers;
  }

  public int getNoOfOvers() {
    return noOfOvers;
  }

  public int getRunsGiven() {
    return runsGiven;
  }

  public int getWicketTaken() {
    return wicketTaken;
  }

  public void incrementNoOfMaidenOvers() {
    noOfMaidenOvers += 1;
  }

  public void incrementNoOfOvers() {
    noOfOvers += 1;
  }

  public void incrementRunsGiven(int hitPerBall) {
    runsGiven += hitPerBall;
  }

  public void incrementWicketTaken() {
    wicketTaken += 1;
  }
}
