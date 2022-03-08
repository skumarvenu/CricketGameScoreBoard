package net.company.CricketGameScoreBoard.repository;

import net.company.CricketGameScoreBoard.model.BatsmanScoreCard;
import net.company.CricketGameScoreBoard.model.BatsmanScorePKId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BattingScoreCardRepository
    extends JpaRepository<BatsmanScoreCard, BatsmanScorePKId> {
  public List<BatsmanScoreCard> findByMatchId(long matchId);
}
