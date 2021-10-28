package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class Fish extends Animal{
    public Fish() {
        super();

        movingType = new MovesBySwimming();
    }
}
