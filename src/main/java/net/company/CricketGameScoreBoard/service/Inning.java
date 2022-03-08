package net.company.CricketGameScoreBoard.service;

public class Inning {
  private int wicket;
  private int run;
  static final int OVER = 10;
  static final int BALLS = 6;

  public int getWicket() {
    return wicket;
  }

  public int getRun() {
    return run;
  }

  public int randomFunction() {
    return (int) (Math.random() * 8);
  }

  public int selectBaller() {
    return 6 + (int) (Math.random() * 5);
  }

  public void batting(Team teamBatting, int target, Team teamBalling) {
    int striker = 0;
    int nonStriker = 1;

    for (int i = 0; i < OVER; i++) {
      int currentBaller = selectBaller();
      int currentOverRun = 0;
      for (int j = 0; j < BALLS; j++) {
        teamBatting.players.get(striker).incrementNoOfBall();
        int perBallHit = randomFunction();
        currentOverRun += perBallHit;
        teamBalling.players.get(currentBaller).incrementRunsGiven(perBallHit);
        if (perBallHit < 7) {
          teamBatting.players.get(striker).incrementNoOfRuns(perBallHit);
          run += perBallHit;
          if (perBallHit == 4 || perBallHit == 6) {
            teamBatting.players.get(striker).incrementNoOfBoundary();
          }
          if (perBallHit % 2 != 0) {
            int temp = striker;
            striker = nonStriker;
            nonStriker = temp;
          }
          if (run >= target) {
            return;
          }
          System.out.println(
              teamBatting.players.get(striker).getPlayerName() + " hit " + perBallHit);
        } else {
          teamBalling.players.get(currentBaller).incrementWicketTaken();
          System.out.println(
              teamBatting.players.get(striker).getPlayerName()
                  + " out on "
                  + teamBatting.players.get(striker).getNoOfRuns());
          wicket++;
          System.out.println(
              "Current scoreboard of " + teamBatting.name + " is: " + run + "/" + wicket);
          striker = Math.max(striker, nonStriker);
          striker++;

          if (wicket == 10) break;
        }
      }
      int temp = striker;
      striker = nonStriker;
      nonStriker = temp;
      if (wicket == 10) {
        System.out.println("All out " + teamBatting.name);
        break;
      }
      if (currentOverRun == 0) teamBalling.players.get(currentBaller).incrementNoOfMaidenOvers();
      teamBalling.players.get(currentBaller).incrementNoOfOvers();
    }
  }
}
