package DA;

import PetObjects.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to Clinic Records!\nPlease navigate below");

        do {
            System.out.println("\n[1] Dog\n[2] Cat\n[3] Exit");
            System.out.print("\nChoose option number: ");
            choice = input.nextInt();

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3: System.exit(1);
            }

            System.out.println("Pet id is " + petFile.getPetId());
            System.out.println("Pet name is " + petFile.getPetName());
            System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
            System.out.println("Communication sound: "+ petFile.getPet().makeSound());
            System.out.println("Play mode: " + petFile.getPet().play());

            switch(petFile.getPet().getClass().getSimpleName())
            {
                case "Cat":
                    System.out.println("No. of Lives: " + ((Cat) petFile.getPet()).getNoOfLives());
                    break;
                case "Dog":
                    System.out.println("Breed: " + ((Dog) petFile.getPet()).getBreed());
                    break;
            }
        }while(true);
    }
}