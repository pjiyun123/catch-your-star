package com.score.catchyourstar.controller;

import com.score.catchyourstar.domain.Score;
import com.score.catchyourstar.service.ScoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ScoreController {

    private final ScoreService scoreServ;

    @PostMapping("/scores")
    public Score add(@RequestBody Score score) {
        return scoreServ.addScore(score);
    }

    @GetMapping("/scores/list")
    public List<Score> list() {
        return scoreServ.getScores();
    }
}
