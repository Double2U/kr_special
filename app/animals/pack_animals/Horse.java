package app.animals.pack_animals;

import app.animals.pack_animals.PackAnimal;

public class Horse extends PackAnimal
{
    public Horse(String name, String birthDate) {
        super(name, birthDate);
    }

    public String neigh() {
        return "Neigh!";
    }
}
