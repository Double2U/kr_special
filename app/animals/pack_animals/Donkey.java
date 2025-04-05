package app.animals.pack_animals;

import app.animals.pack_animals.PackAnimal;

public class Donkey extends PackAnimal 
{
    public Donkey(String name, String birthDate) {
        super(name, birthDate);
    }
    
    public String bray() {
        return "Bray!";
    }
}
