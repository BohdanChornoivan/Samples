package com.tetris.Game.logic.data;

public enum StatusBlock {

    BUSY("*"),
    VOID("0");

    private String status;

    StatusBlock(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
