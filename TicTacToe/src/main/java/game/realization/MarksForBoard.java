package game.realization;

public enum MarksForBoard {

    MARK_X("X"),
    MARK_0("0"),
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
