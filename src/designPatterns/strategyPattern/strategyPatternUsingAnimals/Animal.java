package designPatterns.strategyPattern;

public class Animal {

public Flys flyingType;

public String performFlying(){

    return flyingType.fly();
}

public void setFlyingType(Flys newFlyingType){
    flyingType = newFlyingType;
}
}
