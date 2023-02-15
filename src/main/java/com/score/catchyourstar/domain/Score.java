package com.score.catchyourstar.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long firstscore;

    @Column(nullable = true)
    private Long secondscore;

    @Column(nullable = true)
    private Long thirdscore;

    @Column(nullable = true)
    private Long fourthscore;

    @Column(nullable = true)
    private Long fifthscore;

}
