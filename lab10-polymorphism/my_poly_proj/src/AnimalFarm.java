import java.util.Scanner;

public class AnimalFarm {
    public static void main(String s[]) {
        // Animal animal1 = new Dog("Sami");
        // Animal animal2 = new Cat("Hershery");
        // Animal animal3 = new Cow("Molly");
        // System.out.println("animal1 sound " + animal1.sound());
        // System.out.println("animal2 sound " + animal2.sound());
        // System.out.println("animal3 sound " + animal3.sound());

        Scanner scanner = new Scanner(System.in);
        Animal[] animals = new Animal[10];
        int anmlIdx = 0;
        while (true) {
            System.out.println("Press 1 to view the animals, " +
                    "\n2 to add animals, " +
                    "\nany other key to exit");
            String userAction = scanner.nextLine();
            if (userAction.equals("1")) {
                for (int i = 0; i < animals.length; i++) {
                    if (animals[i] != null) {
                        System.out.println(animals[i]);
                    }
                }
            } else if (userAction.equals("2")) {
                if (anmlIdx == 10) {
                    System.out.println("10 animals added already. Cannot add any more animals!");
                    continue;
                }
                System.out.println("Which animal do you want to create? \nPress 1 for dog," +
                        "\n2 for cat " +
                        "\n3 for cow");
                String animalChoice = scanner.nextLine();
                if (animalChoice.equals("1")) {
                    System.out.println("Enter the name of the dog");
                    String dogName = scanner.nextLine();
                    Animal anmlTmp = new Dog(dogName);
                    System.out.println("What does the dog eat?");
                    String dogFood = scanner.nextLine();
                    anmlTmp.setFood(dogFood);
                    animals[anmlIdx++] = anmlTmp;
                } else if (animalChoice.equals("2")) {
                    System.out.println("Enter the name of the cat");
                    String catName = scanner.nextLine();
                    Animal anmlTmp = new Cat(catName);
                    System.out.println("What does the cat eat?");
                    String catFood = scanner.nextLine();
                    anmlTmp.setFood(catFood);
                    animals[anmlIdx++] = anmlTmp;
                } else if (animalChoice.equals("3")) {
                    System.out.println("Enter the name of the cow");
                    String cowName = scanner.nextLine();
                    Animal anmlTmp = new Cow(cowName);
                    System.out.println("What does the cow eat?");
                    String cowFood = scanner.nextLine();
                    anmlTmp.setFood(cowFood);
                    animals[anmlIdx++] = anmlTmp;
                }
            } else {
                break;
            }
        }
    }
}