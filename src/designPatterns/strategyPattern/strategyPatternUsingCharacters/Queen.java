package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public class Queen extends Character{

    public Queen (){

        super();

        myWeapons = new KnifeBehaviour();
    }
}
