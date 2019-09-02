package com.tetris.Game.controller;

import com.tetris.Game.ServerGame;
import com.tetris.Game.entity.NewFigure;
import com.tetris.Game.logic.InteractionFigure;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tetris/board")
public class GameController {

    private final ServerGame serverGame;

    public GameController(ServerGame serverGame) {
        this.serverGame = serverGame;
    }

    @PostMapping("/create_figure")
    public String createFigure(@RequestBody NewFigure newFigure) {

        serverGame.figure = serverGame.createFigure.createRandom(serverGame.board.getBoard());
        serverGame.interactionFigure = new InteractionFigure(serverGame.board.getBoard(), serverGame.figure);
//        for (int j = newFigure.getPivot(); j < newFigure.getForm().size(); j++) {
//            for (int k = newFigure.getPivot(); k < j; k++) {
//                System.out.println(j + "     " + k);
//                serverGame.board.getBoard()[j][k] = StatusBlock.BUSY.getStatus();
//            }
//        }

        return "DONE!";
    }

    @GetMapping("/view")
    public void viewBoard() {
        for (int i = 0; i < serverGame.board.getBoard().length; i++)  {
            for (int j = 0; j < serverGame.board.getBoard()[i].length; j++) {
                System.out.print(serverGame.board.getBoard()[i][j]);
            }
            System.out.println();
        }
    }
}
