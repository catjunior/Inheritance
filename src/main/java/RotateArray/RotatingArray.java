package RotateArray;

/**
 * Created by mattwu on 5/1/17.
 */

import java.util.*;

public class RotatingArray extends ArrayList {

        public void rotate(RotatingArray list, int k){

            for (int j = 0; j < k; j++){

                list.add(list.get(0)); //add first value to the end the array

                list.remove(list.get(0)); //then remove the first value

            }

            System.out.println("rotated array: " + list);

        }

}

