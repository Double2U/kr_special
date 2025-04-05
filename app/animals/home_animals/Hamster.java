package app.animals.home_animals;

import app.animals.home_animals.HomeAnimal;

public class Hamster extends HomeAnimal
{
    public Hamster(String name,  String birthDate) {
        super(name, birthDate);
    }

    public String run() {
        return "Running on the wheel!";
    }
}
