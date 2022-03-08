package net.company.CricketGameScoreBoard.service;

import net.company.CricketGameScoreBoard.model.BallerScoreCard;
import net.company.CricketGameScoreBoard.model.BatsmanScoreCard;
import net.company.CricketGameScoreBoard.model.Result;

import java.util.List;

public interface ServiceCricketGame {
  public Result matchStart();

  public Result getOldMatchResult(long matchId);

  List<BatsmanScoreCard> getOneMatchBattingStatus(long matchId);

  List<BallerScoreCard> getOneMatchBallingStatus(long matchId);
}
