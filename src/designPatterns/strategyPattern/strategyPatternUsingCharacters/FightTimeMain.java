package designPatterns.strategyPattern.strategyPatternUsingCharacters;

public class FightTimeMain {

    public static void main(String[] args) {

        Character segun = new Knight();
        Character williams = new Troll();

        String willy =williams.performfight();
        System.out.println("Troll has this to say: " + willy);

        System.out.println("Knight has this to say: " + segun.performfight());

        Character billy = new King();
        System.out.println("King has this to say: " + billy.performfight());

        billy.setMyWeapons(new SwordBehaviour());
        System.out.println("King has change his weapons:" + billy.performfight());
    }
}
