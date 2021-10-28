package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class MovesByCrawling implements Movable{
    @Override
    public String move() {
        return "I can move by crawling";
    }
}
