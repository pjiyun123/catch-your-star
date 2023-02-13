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
    private Long scoreId;

    @Column(nullable = false)
    private Long first;

    @Column(nullable = true)
    private Long second;

    @Column(nullable = true)
    private Long third;

    @Column(nullable = true)
    private Long fourth;

    @Column(nullable = true)
    private Long fifth;

}
