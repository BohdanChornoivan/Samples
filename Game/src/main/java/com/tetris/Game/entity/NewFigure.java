package com.tetris.Game.entity;

import com.tetris.Game.controller.data.Coordinates;
import lombok.*;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Start")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class NewFigure {

    @Id
    @Column(name = "pivot")
    private int pivot;


    @ElementCollection(targetClass = Coordinates.class, fetch = FetchType.EAGER)
    private List<Coordinates> form;


}
