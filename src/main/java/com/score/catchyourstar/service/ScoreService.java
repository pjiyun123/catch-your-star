package com.score.catchyourstar.service;

import com.score.catchyourstar.domain.Score;
import com.score.catchyourstar.domain.ScoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ScoreService {

    private final ScoreRepository scoreRepo;

    // 점수 등록
    public Score addScore(Score score) {
        Score newScore = score.builder()
                .firstscore(score.getFirstscore())
                .secondscore(score.getSecondscore())
                .thirdscore(score.getThirdscore())
                .fourthscore(score.getFourthscore())
                .fifthscore(score.getFifthscore())
                .build();

        scoreRepo.save(newScore);
        return newScore;
    }

    // 점수 조회
    public List<Score> getScores() {
        List<Score> scoreList = scoreRepo.findAll();
        return scoreList;
    }

}
