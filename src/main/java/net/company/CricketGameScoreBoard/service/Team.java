package net.company.CricketGameScoreBoard.service;

import java.util.ArrayList;
import java.util.List;

public class Team {
  String name;
  public List<Player> players = new ArrayList<>();

  public Team(String name) {
    this.name = name;

    for (int i = 0; i < 11; i++) {
      Integer iWrap = new Integer(i);
      if (i < 6) players.add(new Player(Integer.toString(iWrap), PlayerRole.valueOf("BATSMAN")));
      else players.add(new Player(Integer.toString(iWrap), PlayerRole.valueOf("BALLER")));
    }
  }
}
