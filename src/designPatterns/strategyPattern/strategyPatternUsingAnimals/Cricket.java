package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class Cricket extends Animal{

    public Cricket() {
        super();

        movingType = new MovesByCrawling();
    }
}
