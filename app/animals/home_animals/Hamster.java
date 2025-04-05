package app.animals.home_animals;


public class Hamster extends HomeAnimal
{
    public Hamster(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }

    public String run() {
        return "Running on the wheel!";
    }
}
