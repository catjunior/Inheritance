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

                petList.add(new Dogs(nameOfPets));

            } else if (typeOfPets.equalsIgnoreCase("cat")) {

                petList.add(new Cats(nameOfPets));

            } else if (typeOfPets.equalsIgnoreCase("bird")) {

                petList.add(new Birds(nameOfPets));

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
