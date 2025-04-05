package app.animals.pack_animals;

public class Horse extends PackAnimal
{
    public Horse(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }

    public String neigh() {
        return "Neigh!";
    }
}
