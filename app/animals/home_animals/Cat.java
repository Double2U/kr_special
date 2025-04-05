package app.animals.home_animals;

import app.animals.home_animals.HomeAnimal;

public class Cat extends HomeAnimal
{
    public Cat(String name, String birthDate) {
        super(name, birthDate);
    }

    public String meow() {
        return "Meow!";
    }
}
