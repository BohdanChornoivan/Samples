package com.tetris.Game.controller.data;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="IN")
@Getter
@Setter
@NoArgsConstructor
public class Coordinates {


    @Column(name = "x")
    public int x;
    @Column(name = "y")
    public int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
