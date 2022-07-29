package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: oh oh oh oh ohhhh!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be pluck!";
    }
}
