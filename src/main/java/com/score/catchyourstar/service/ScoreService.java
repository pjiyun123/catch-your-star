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
                .first(score.getFirst())
                .second(score.getSecond())
                .third(score.getThird())
                .fourth(score.getFourth())
                .fifth(score.getFifth())
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
