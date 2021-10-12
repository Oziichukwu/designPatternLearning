package designPatterns.strategyPattern;

public class AnimalMain {

    public static void main(String[] args) {

        Animal willy = new Dog();
        Animal ponky = new Bird();

        System.out.println("This dog says: " + willy.performFlying());
        System.out.println("This bird says: " + ponky.performFlying());

        Animal sponky = new Dog();
        sponky.setFlyingType(new ItFlys());
        System.out.println("This dog now says: " + sponky.performFlying());

        ponky.setFlyingType(new CantFly());
        System.out.println("This bird now says: " + ponky.performFlying());
    }
}
