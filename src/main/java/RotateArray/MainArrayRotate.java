package RotateArray;

import SuperHumans.SuperHuman;

/**
 * Created by mattwu on 5/2/17.
 */
public class MainArrayRotate {

    public static void main(String[] args) {

        RotatingArray myList = new RotatingArray();

        //new arrayList [1-7]
        for (int i = 1; i < 7; i++) {
            myList.add(i);
        }

        System.out.println("origional array: " +  myList);

        myList.rotate(myList, 2);


    }
}
