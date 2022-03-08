package net.company.CricketGameScoreBoard.controller;

import net.company.CricketGameScoreBoard.model.BallerScoreCard;
import net.company.CricketGameScoreBoard.model.BatsmanScoreCard;
import net.company.CricketGameScoreBoard.model.Result;
import net.company.CricketGameScoreBoard.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

  @Autowired public ServiceCricketGame serviceCricketGame;

  @GetMapping("/newMatchResult")
  public Result showNewMatchResult() {
    return this.serviceCricketGame.matchStart();
  }

  @GetMapping("/oldMatchResult/{matchId}")
  public Result olgMatchResult(@PathVariable String matchId) {
    return this.serviceCricketGame.getOldMatchResult(Long.parseLong(matchId));
  }

  @GetMapping("/BattingScoreBoard/{matchId}")
  public List<BatsmanScoreCard> OneMatchBattingStatus(@PathVariable String matchId) {
    return this.serviceCricketGame.getOneMatchBattingStatus(Long.parseLong(matchId));
  }

  @GetMapping("/BallingScoreBoard/{matchId}")
  public List<BallerScoreCard> OneMatchBallingStatus(@PathVariable String matchId) {
    return this.serviceCricketGame.getOneMatchBallingStatus(Long.parseLong(matchId));
  }
}
