package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class Bird extends Animal{
    public Bird() {
        super();

        movingType = new MovesByFlying();
    }
}
