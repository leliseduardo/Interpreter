package interpreter;

public class Player {

    private double gameScore1;
    private double gameScore2;
    private double gameScore3;

    public double getGameScore1() {
        return gameScore1;
    }

    public void setGameScore1(double gameScore1) {
        this.gameScore1 = gameScore1;
    }

    public double getGameScore2() {
        return gameScore2;
    }

    public void setGameScore2(double gameScore2) {
        this.gameScore2 = gameScore2;
    }

    public double getGameScore3() {
        return gameScore3;
    }

    public void setGameScore3(double gameScore3) {
        this.gameScore3 = gameScore3;
    }

    public double calculateTotalScore() {
        return Game.calculateTotalScore(this.gameScore1, this.gameScore2, this.gameScore3);
    }
}
