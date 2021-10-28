package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class Animal {
    Movable movingType;

    public String performMoving(){

        return movingType.move();
    }

    public void setMovingAbility(Movable movingType){

        this.movingType = movingType;
    }
}
