package app.animals.pack_animals;


public class Donkey extends PackAnimal 
{
    public Donkey(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }

    public String bray() {
        return "Bray!";
    }
}
