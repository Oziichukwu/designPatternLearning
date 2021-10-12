package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class Dog extends Animal{

    public Dog(){

        super();

        flyingType = new CantFly();
    }
}
