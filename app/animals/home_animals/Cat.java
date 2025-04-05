package app.animals.home_animals;

public class Cat extends HomeAnimal
{
    public Cat(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }

    public String meow() {
        return "Meow!";
    }
}
