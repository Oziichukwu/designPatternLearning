package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public class Knight extends Character{

    public Knight(){

        super();

        myWeapons = new AxeBehaviour();
    }
}
