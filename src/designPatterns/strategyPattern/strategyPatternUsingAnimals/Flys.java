package designPatterns.strategyPattern;

public interface Flys {

    String fly();

}

class ItFlys implements Flys {

    @Override
    public String fly() {
        return "see how high i can fly";
    }
}
    class CantFly implements Flys{

        @Override
        public String fly() {
            return "i have tried my best but cant still fly";
        }
    }



