package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public class Troll extends Character{

    public Troll(){

        super();

        myWeapons = new SwordBehaviour();
    }
}
