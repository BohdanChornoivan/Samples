package com.tetris.Game.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "PlayerId")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PlayerId {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "room_id", unique = true)
    @org.hibernate.annotations.Type(type="uuid-char")
    private UUID roomId;

    @Column(name = "record")
    private int record;
}
