package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class MovesByRunning implements Movable{
    @Override
    public String move() {
        return "I can move by running";
    }
}
