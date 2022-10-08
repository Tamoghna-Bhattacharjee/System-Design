package LLD_Problems.Snake_And_Ladder;

public class Player {
    private int id, curPos = 0;

    public Player(int id, int curPos) {
        this.id = id;
        this.curPos = curPos;
    }

    public int getId() {
        return id;
    }

    public int getCurPos() {
        return curPos;
    }

    public void setCurPos(int curPos) {
        this.curPos = curPos;
    }
}
