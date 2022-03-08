package net.company.CricketGameScoreBoard.service;

import net.company.CricketGameScoreBoard.model.BallerScoreCard;
import net.company.CricketGameScoreBoard.model.BatsmanScoreCard;
import net.company.CricketGameScoreBoard.model.Result;
import net.company.CricketGameScoreBoard.repository.BallingScoreCardRepository;
import net.company.CricketGameScoreBoard.repository.BattingScoreCardRepository;
import net.company.CricketGameScoreBoard.repository.WinnerAnnounce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCricketGameImpl implements ServiceCricketGame {
  @Autowired private WinnerAnnounce winnerAnnounce;
  @Autowired private BattingScoreCardRepository battingScoreCardRepository;

  @Autowired private BallingScoreCardRepository ballingScoreCardRepository;

  @Override
  public Result matchStart() {
    Team team1 = new Team("India");
    Team team2 = new Team("Pakistan");
    MatchController matchController = new MatchController(new OneDay());
    Result result =
        winnerAnnounce.save(matchController.start(team1, team2, matchController.getMatchId()));
    for (int i = 0; i < 11; i++) {
      BatsmanScoreCard temporary = new BatsmanScoreCard();
      temporary.setBalls(team1.players.get(i).getNoOfBall());
      temporary.setMatchId(matchController.getMatchId());
      temporary.setPlayerId(team1.players.get(i).getPlayerName());
      temporary.setTeamName(team1.name);
      temporary.setBoundary(team1.players.get(i).getNoOfBoundary());
      temporary.setRuns(team1.players.get(i).getNoOfRuns());
      battingScoreCardRepository.save(temporary);
    }
    for (int i = 0; i < 11; i++) {
      BallerScoreCard temporary = new BallerScoreCard();
      temporary.setNoOfOvers(team2.players.get(i).getNoOfOvers());
      temporary.setMatchId(matchController.getMatchId());
      temporary.setPlayerId(team2.players.get(i).getPlayerName());
      temporary.setTeamName(team2.name);
      temporary.setRunsGiven(team2.players.get(i).getRunsGiven());
      temporary.setWicketTaken(team2.players.get(i).getWicketTaken());
      temporary.setNoOfMaidenOvers(team2.players.get(i).getNoOfMaidenOvers());
      ballingScoreCardRepository.save(temporary);
    }
    return result;
  }

  @Override
  public Result getOldMatchResult(long matchId) {
    return winnerAnnounce.findById(matchId).get();
  }

  @Override
  public List<BatsmanScoreCard> getOneMatchBattingStatus(long matchId) {

    return battingScoreCardRepository.findByMatchId(matchId);
  }

  @Override
  public List<BallerScoreCard> getOneMatchBallingStatus(long matchId) {
    return ballingScoreCardRepository.findByMatchId(matchId);
  }
}
