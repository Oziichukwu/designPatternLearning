package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public interface WeaponBehaviour {

    String fight();
}

class SwordBehaviour implements WeaponBehaviour{

    @Override
    public String fight() {
        return "I can fight with a sword perfectly";
    }
}

class BowAndArrowBehaviour implements WeaponBehaviour{

    @Override
    public String fight() {
        return "The only weapon i can use very well is a bow and arrow";
    }
}

class KnifeBehaviour implements WeaponBehaviour{

    @Override
    public String fight() {
        return "you can only die by my hands with a knife";
    }
}

class AxeBehaviour implements WeaponBehaviour{

    @Override
    public String fight() {
        return "Axe is the surest way to kill";
    }
}