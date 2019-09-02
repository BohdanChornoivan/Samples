package com.tetris.Game.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "IN")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class IN {

    private String in;
}
