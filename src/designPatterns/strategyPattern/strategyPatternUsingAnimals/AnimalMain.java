package designPatterns.strategyPattern.strategyPatternUsingAnimals;

public class AnimalMain {

    public static void main(String[] args) {

        Animal buddy = new Dog();

        Animal sweet = new Bird();

        Animal rankko = new Fish();

        System.out.println("Dog " + buddy.performMoving());
        System.out.println("Bird " + sweet.performMoving());
        System.out.println("Fish " + rankko.performMoving());

        Animal nancho = new Fish();
        nancho.setMovingAbility(new MovesByFlying());
        System.out.println("nancho the fish has this this to say: " + nancho.performMoving());

        Animal crikky = new Cricket();
        System.out.println("Cricket " + crikky.performMoving());
    }
}
