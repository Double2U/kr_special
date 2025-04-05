package app.animals.pack_animals;

public class Camel extends PackAnimal
{
    public Camel(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }

    public String chew() {
        return "Chewing grass!";
    }
}
