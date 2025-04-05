package app.animals.home_animals;

import app.animals.home_animals.HomeAnimal;

public class Dog extends HomeAnimal 
{
    public Dog(String name, String birthDate) {
        super(name, birthDate);
    }

    public String bark() {
        return "Woof!";
    }
}
