package net.company.CricketGameScoreBoard.repository;

import net.company.CricketGameScoreBoard.model.BallerScoreCard;
import net.company.CricketGameScoreBoard.model.BallerScorePKid;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BallingScoreCardRepository
    extends JpaRepository<BallerScoreCard, BallerScorePKid> {

  public List<BallerScoreCard> findByMatchId(long matchId);
}
