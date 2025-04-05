package app.animals.home_animals;


public class Dog extends HomeAnimal 
{
    public Dog(String name, String command, String birthDate) {
        super(name, command, birthDate);
    }

    public String bark() {
        return "Woof!";
    }
}
