package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public class King extends Character{

    public King(){
        super();

        myWeapons = new AxeBehaviour();
    }
}
