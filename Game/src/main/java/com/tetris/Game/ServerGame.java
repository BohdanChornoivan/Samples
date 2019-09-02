package com.tetris.Game;

import com.tetris.Game.logic.Board;
import com.tetris.Game.logic.CreateFigure;
import com.tetris.Game.logic.InteractionFigure;
import com.tetris.Game.logic.data.Figure;
import org.springframework.stereotype.Service;

@Service
public class ServerGame {

        public Board board = new Board(20, 11);
        public CreateFigure createFigure = new CreateFigure();
        public Figure figure;
        public InteractionFigure interactionFigure;

}
