package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class MovesByFlying implements Movable{
    @Override
    public String move() {
        return "I can move by flying";
    }
}
