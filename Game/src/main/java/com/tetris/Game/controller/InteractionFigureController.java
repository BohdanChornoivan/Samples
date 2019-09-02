package com.tetris.Game.controller;

import com.tetris.Game.ServerGame;
import com.tetris.Game.entity.IN;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tetris/game")
public class InteractionFigureController {

    private final ServerGame serverGame;

    public InteractionFigureController(ServerGame serverGame) {
        this.serverGame = serverGame;
    }

    @PostMapping("/turn")
    public String turn(@RequestBody IN in) {

        if(in.getIn().equals("left")) {
            serverGame.interactionFigure.turn_left(serverGame.createFigure.START_X, serverGame.createFigure.START_Y);
        } else if (in.getIn().equals("right")) {
            serverGame.interactionFigure.turn_right(serverGame.createFigure.START_X, serverGame.createFigure.START_Y);
        }

        return "DONE!";
    }

    @PostMapping("/move")
    public String move(@RequestBody IN in) {

        if(in.getIn().equals("left")) {
            serverGame.interactionFigure.move_left(serverGame.createFigure.START_X, serverGame.createFigure.START_Y);
        } else if (in.getIn().equals("right")) {
            serverGame.interactionFigure.move_right(serverGame.createFigure.START_X, serverGame.createFigure.START_Y);
        }

        return "DONE!";
    }
}
