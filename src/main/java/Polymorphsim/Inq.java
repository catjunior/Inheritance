package Polymorphsim;

/**
 * Created by mattwu on 5/19/17.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Inq {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        ArrayList<Pets> petList = new ArrayList();


        System.out.println("How many pets they have?");
        int numberOfPets = userInput.nextInt();


        int i = 0;
        while (i < numberOfPets) {

            System.out.println("What is your pet's name?");
            String nameOfPets = userInput.next();

            System.out.println("What kind of pet is " + nameOfPets);
            String typeOfPets = userInput.next();


            if (typeOfPets.equalsIgnoreCase("dog")){

                Pets dog = new Dogs(nameOfPets);
                petList.add(dog);

            } else if (typeOfPets.equalsIgnoreCase("cat")) {

                Pets cat = new Cats(nameOfPets);
                petList.add(cat);

            } else if (typeOfPets.equalsIgnoreCase("bird")) {

                Pets bird = new Birds(nameOfPets);
                petList.add(bird);

            } else {

                petList.add(new Pets(nameOfPets));
            }

            i++;
        }


        for (Pets p : petList) {
            System.out.println(p.getName() + " says " + p.speak() + "\n");
        }

    }

}
