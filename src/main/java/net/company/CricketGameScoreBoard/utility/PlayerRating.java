package net.company.CricketGameScoreBoard.utility;

import java.util.ArrayList;
import java.util.List;

public class PlayerRating {
  public void calculateRandomFunction() {
    List<Integer> helperArray = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      helperArray.add(0);
    }
    for (int i = 10; i < 20; i++) {
      helperArray.add(1);
    }
    for (int i = 20; i < 35; i++) {
      helperArray.add(2);
    }
    for (int i = 35; i < 50; i++) {
      helperArray.add(4);
    }
    for (int i = 50; i < 65; i++) {
      helperArray.add(6);
    }
    for (int i = 65; i < 80; i++) {
      helperArray.add(3);
    }
    for (int i = 90; i < 100; i++) {
      helperArray.add(7);
    }
  }
}
