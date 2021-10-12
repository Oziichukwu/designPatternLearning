package designPatterns.strategyPattern;

public class Bird extends Animal{

    public Bird(){

        super();

        flyingType = new ItFlys();
    }
}
