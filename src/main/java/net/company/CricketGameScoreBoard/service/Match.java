package net.company.CricketGameScoreBoard.service;

import net.company.CricketGameScoreBoard.model.Result;

public interface Match {
  Result play(Team team1, Team team2, long matchId);
}
