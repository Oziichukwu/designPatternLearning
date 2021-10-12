package designPatterns.strategyPattern.strategyPatternUsingAnimals;

import designPatterns.strategyPattern.strategyPatternUsingAnimals.Flys;

public class Animal {

public Flys flyingType;

public String performFlying(){

    return flyingType.fly();
}

public void setFlyingType(Flys newFlyingType){
    flyingType = newFlyingType;
}
}
