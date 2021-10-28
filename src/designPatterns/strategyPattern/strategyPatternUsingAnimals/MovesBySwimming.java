package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class MovesBySwimming implements Movable{
    @Override
    public String move() {
        return "I can move by swimming";
    }
}
