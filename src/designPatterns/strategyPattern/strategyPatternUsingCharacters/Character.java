package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public class Character {

    WeaponBehaviour myWeapons;


    public String performfight(){

        return myWeapons.fight();
    }

    public void setMyWeapons(WeaponBehaviour newWeaponBehaviour){
        myWeapons = newWeaponBehaviour;
    }
}
