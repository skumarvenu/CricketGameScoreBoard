package net.company.CricketGameScoreBoard.repository;

import net.company.CricketGameScoreBoard.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WinnerAnnounce extends JpaRepository<Result, Long> {}
