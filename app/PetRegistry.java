package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app.animals.Animal;
import app.animals.home_animals.Cat;
import app.animals.home_animals.Dog;
import app.animals.home_animals.Hamster;
import app.animals.pack_animals.Camel;
import app.animals.pack_animals.Donkey;
import app.animals.pack_animals.Horse;

class Counter implements AutoCloseable {
    private int count;

    public Counter() {
        this.count = 0;
    }

    public void add() {
        count++;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() throws Exception 
    {
    }
}

public class PetRegistry {
    private List<Animal> animals;
    private Scanner scanner;

    public PetRegistry() {
        animals = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void registerNewAnimal() {
        try (Counter counter = new Counter()) {
            System.out.print("Enter the animal's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter the command the animal can perform: ");
            String command = scanner.nextLine();
            System.out.print("Enter the animal's birth date (YYYY-MM-DD): ");
            String birthDate = scanner.nextLine();

            System.out.print("Is this a Home or Pack animal? (H/P): ");
            String animalType = scanner.nextLine().trim().toUpperCase();
            if (animalType.equals("D")) {
                System.out.print("Is this a Dog, Cat, or Hamster? (D/C/H): ");
                String species = scanner.nextLine().trim().toUpperCase();
                switch (species) {
                    case "D":
                        animals.add(new Dog(name, command, birthDate));
                        break;
                    case "C":
                        animals.add(new Cat(name, command, birthDate));
                        break;
                    case "H":
                        animals.add(new Hamster(name, command, birthDate));
                        break;
                    default:
                        System.out.println("Invalid species.");
                }
            } else if (animalType.equals("P")) {
                System.out.print("Is this a Horse, Camel, or Donkey? (H/C/D): ");
                String species = scanner.nextLine().trim().toUpperCase();
                switch (species) {
                    case "H":
                        animals.add(new Horse(name, command, birthDate));
                        break;
                    case "C":
                        animals.add(new Camel(name, command, birthDate));
                        break;
                    case "D":
                        animals.add(new Donkey(name, command, birthDate));
                        break;
                    default:
                        System.out.println("Invalid species.");
                }
            } else {
                System.out.println("Invalid animal type.");
            }

            counter.add();
            System.out.println("Total animals registered: " + counter.getCount());
        } catch (Exception e) {
            System.out.println("Error while registering: " + e.getMessage());
        }
    }

    public void showAnimalCommands() {
        System.out.print("Enter the animal's name to see its commands: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                animal.showCommands();
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    public void trainAnimal() {
        System.out.print("Enter the animal's name you want to train: ");
        String name = scanner.nextLine();
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter the new command: ");
                String newCommand = scanner.nextLine();
                animal.learnNewCommand(newCommand);
                System.out.printf("%s has learned the new command: %s%n", animal.getName(), newCommand);
                return;
            }
        }
        System.out.println("Animal not found.");
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n--- Pet Registry Menu ---");
            System.out.println("1. Register a new animal");
            System.out.println("2. See the list of commands an animal can perform");
            System.out.println("3. Train an animal with a new command");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    registerNewAnimal();
                    break;
                case "2":
                    showAnimalCommands();
                    break;
                case "3":
                    trainAnimal();
                    break;
                case "4":
                    System.out.println("Exiting the Pet Registry.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
