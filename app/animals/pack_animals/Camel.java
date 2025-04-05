package app.animals.pack_animals;

import app.animals.pack_animals.PackAnimal;

public class Camel extends PackAnimal
{
    public Camel(String name, String birthDate) {
        super(name, birthDate);
    }

    public String chew() {
        return "Chewing grass!";
    }
}
