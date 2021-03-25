import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Turtle turtle = new Turtle("turtle breed");
        Dog dog = new Dog("corgi", "DoggyStyle");
        DigitalSnail digitalSnail = new DigitalSnail();



        IPet[] petArray = {dog, turtle, digitalSnail};
        printPets(petArray);

}

public static void printAnimals(Animal[] passMeAnArrayOfAnimals){
        for(Animal animal : passMeAnArrayOfAnimals){
            System.out.println("printing animal : " + animal);
        }
}

public static void printPets(IPet[] passMeAnArrayOfPets){
        for(IPet pet : passMeAnArrayOfPets){
            System.out.println("Printing Pet: " + pet.getClass().getSimpleName());
        }
}

}


