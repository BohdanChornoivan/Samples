package game_X0.realization;

public enum MarksForBoard {

    MARK_X("X"),
    MARK_Y("Y"),
    EMPTY(" ")
    ;

    private String mark;

    MarksForBoard(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }
}
